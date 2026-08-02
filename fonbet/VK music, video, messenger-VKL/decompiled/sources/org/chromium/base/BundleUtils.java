package org.chromium.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import internal.org.jni_zero.CalledByNative;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.metrics.RecordHistogram;
import xsna.gv2;

/* loaded from: classes8.dex */
public class BundleUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOADED_SPLITS_KEY = "split_compat_loaded_splits";
    private static final String TAG = "BundleUtils";
    private static Boolean sHasSplits;
    private static SplitCompatClassLoader sSplitCompatClassLoaderInstance;
    private static ArrayList<String> sSplitsToRestore;
    private static final ArrayMap<String, ClassLoader> sCachedClassLoaders = new ArrayMap<>();
    private static final Map<String, ClassLoader> sInflationClassLoaders = Collections.synchronizedMap(new ArrayMap());

    public static class SplitCompatClassLoader extends ClassLoader {
        private static final String TAG = "SplitCompatClassLoader";

        public SplitCompatClassLoader() {
            super(ContextUtils.getApplicationContext().getClassLoader());
            Log.i(TAG, "Splits: %s", BundleUtils.sSplitsToRestore);
        }

        private Class<?> checkSplitsClassLoaders(String str) throws ClassNotFoundException {
            Iterator it = BundleUtils.sInflationClassLoaders.values().iterator();
            while (it.hasNext()) {
                try {
                    return ((ClassLoader) it.next()).loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
            }
            return null;
        }

        private void restoreSplitsClassLoaders() {
            Iterator it = BundleUtils.sSplitsToRestore.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!BundleUtils.sInflationClassLoaders.containsKey(str)) {
                    BundleUtils.registerSplitClassLoaderForInflation(str);
                }
            }
            BundleUtils.sSplitsToRestore = null;
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String str) throws ClassNotFoundException {
            Class<?> checkSplitsClassLoaders = checkSplitsClassLoaders(str);
            if (checkSplitsClassLoaders != null) {
                return checkSplitsClassLoaders;
            }
            if (!str.startsWith("android.")) {
                if (BundleUtils.sSplitsToRestore != null) {
                    restoreSplitsClassLoaders();
                    Class<?> checkSplitsClassLoaders2 = checkSplitsClassLoaders(str);
                    if (checkSplitsClassLoaders2 != null) {
                        return checkSplitsClassLoaders2;
                    }
                }
                Log.w(TAG, "No class %s amongst %s", str, TextUtils.join("\n", BundleUtils.sInflationClassLoaders.keySet()));
            }
            throw new ClassNotFoundException(str);
        }
    }

    public static void cacheAndValidateSplitClassLoader(Context context, String str) {
        ClassLoader parent = context.getClassLoader().getParent();
        Context applicationContext = ContextUtils.getApplicationContext();
        boolean z = true;
        boolean z2 = (parent.equals(BundleUtils.class.getClassLoader()) || applicationContext == null || parent.equals(applicationContext.getClassLoader())) ? false : true;
        ArrayMap<String, ClassLoader> arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            if (z2) {
                try {
                    if (!arrayMap.containsKey(str)) {
                        arrayMap.put(str, new PathClassLoader(getSplitApkPath(str), applicationContext.getClassLoader()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ClassLoader classLoader = arrayMap.get(str);
            if (classLoader == null) {
                arrayMap.put(str, context.getClassLoader());
            } else if (!classLoader.equals(context.getClassLoader())) {
                replaceClassLoader(context, classLoader);
            }
            z = z2;
        }
        RecordHistogram.recordBooleanHistogram("Android.IsolatedSplits.ClassLoaderReplaced." + str, z);
    }

    public static boolean canLoadClass(ClassLoader classLoader, String str) {
        try {
            Class.forName(str, false, classLoader);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void checkContextClassLoader(Context context, Activity activity) {
        Bundle extras;
        ClassLoader classLoader = activity.getClass().getClassLoader();
        if (classLoader != context.getClassLoader()) {
            Log.w(TAG, "Mismatched ClassLoaders between Activity and context (fixing): %s", activity.getClass());
            replaceClassLoader(context, classLoader);
            Intent intent = activity.getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            extras.setClassLoader(classLoader);
        }
    }

    public static Context createContextForInflation(Context context, String str) {
        if (!isIsolatedSplitInstalled(str)) {
            return context;
        }
        final ClassLoader registerSplitClassLoaderForInflation = registerSplitClassLoaderForInflation(str);
        return new ContextWrapper(context) { // from class: org.chromium.base.BundleUtils.1
            @Override // android.content.ContextWrapper, android.content.Context
            public ClassLoader getClassLoader() {
                return registerSplitClassLoaderForInflation;
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public Object getSystemService(String str2) {
                Object systemService = super.getSystemService(str2);
                return "layout_inflater".equals(str2) ? ((LayoutInflater) systemService).cloneInContext(this) : systemService;
            }
        };
    }

    public static Context createIsolatedSplitContext(String str) {
        if (!isIsolatedSplitInstalled(str)) {
            return ContextUtils.getApplicationContext();
        }
        try {
            StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
            try {
                Context createContextForSplit = ContextUtils.getApplicationContext().createContextForSplit(str);
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                cacheAndValidateSplitClassLoader(createContextForSplit, str);
                return createContextForSplit;
            } finally {
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static String getInstalledSplitNamesForLogging() {
        return !hasAnyInstalledSplits() ? "<none>" : TextUtils.join(StringUtils.COMMA, ContextUtils.getApplicationContext().getApplicationInfo().splitNames);
    }

    @CalledByNative
    public static String getNativeLibraryPath(String str, String str2) {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            ClassLoader classLoader = ContextUtils.getApplicationContext().getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof WrappedClassLoader) {
                findLibrary = ((WrappedClassLoader) classLoader).findLibrary(str);
            }
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            String splitApkLibraryPath = getSplitApkLibraryPath(str, str2);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return splitApkLibraryPath;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ClassLoader getOrCreateSplitClassLoader(String str) {
        ClassLoader classLoader;
        ClassLoader classLoader2;
        if (!isIsolatedSplitInstalled(str)) {
            return BundleUtils.class.getClassLoader();
        }
        ArrayMap<String, ClassLoader> arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            classLoader = arrayMap.get(str);
        }
        if (classLoader != null) {
            return classLoader;
        }
        createIsolatedSplitContext(str);
        synchronized (arrayMap) {
            classLoader2 = arrayMap.get(str);
        }
        return classLoader2;
    }

    private static String getSplitApkLibraryPath(String str, String str2) {
        String splitApkPath = getSplitApkPath(str2);
        if (splitApkPath == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
            return splitApkPath + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + DomExceptionUtils.SEPARATOR + System.mapLibraryName(str);
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    private static String getSplitApkPath(String str) {
        int binarySearch;
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    public static ClassLoader getSplitCompatClassLoader() {
        if (sSplitCompatClassLoaderInstance == null) {
            sSplitCompatClassLoaderInstance = new SplitCompatClassLoader();
        }
        return sSplitCompatClassLoaderInstance;
    }

    @CalledByNative
    public static boolean hasAnyInstalledSplits() {
        if (sHasSplits == null) {
            String[] strArr = ContextUtils.getApplicationContext().getApplicationInfo().splitNames;
            sHasSplits = Boolean.valueOf(strArr != null && strArr.length > 0);
        }
        return sHasSplits.booleanValue();
    }

    public static boolean isIsolatedSplitInstalled(String str) {
        return hasAnyInstalledSplits() && getSplitApkPath(str) != null;
    }

    public static Object newInstance(String str, String str2) {
        try {
            return getOrCreateSplitClassLoader(str2).loadClass(str).newInstance();
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static ClassLoader registerSplitClassLoaderForInflation(String str) {
        ClassLoader orCreateSplitClassLoader = getOrCreateSplitClassLoader(str);
        sInflationClassLoaders.put(str, orCreateSplitClassLoader);
        return orCreateSplitClassLoader;
    }

    public static void replaceClassLoader(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static void resetForTesting() {
        sCachedClassLoaders.clear();
        sInflationClassLoaders.clear();
        sSplitCompatClassLoaderInstance = null;
        sSplitsToRestore = null;
    }

    public static void restoreLoadedSplits(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(LOADED_SPLITS_KEY);
        sSplitsToRestore = stringArrayList;
        if (stringArrayList == null || !stringArrayList.contains("google3")) {
            return;
        }
        sSplitsToRestore.add("on_demand");
        sSplitsToRestore.remove("google3");
    }

    public static void saveLoadedSplits(Bundle bundle) {
        bundle.putStringArrayList(LOADED_SPLITS_KEY, new ArrayList<>(sInflationClassLoaders.keySet()));
    }

    public static void setHasSplitsForTesting(boolean z) {
        Boolean bool = sHasSplits;
        sHasSplits = Boolean.valueOf(z);
        ResettersForTesting.register(new gv2(bool, 3));
    }
}
