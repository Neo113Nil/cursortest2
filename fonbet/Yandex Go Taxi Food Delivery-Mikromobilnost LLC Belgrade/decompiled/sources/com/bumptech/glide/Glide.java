package com.bumptech.glide;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.manager.RequestManagerRetriever;
import defpackage.aib1;
import defpackage.b16;
import defpackage.b6e;
import defpackage.c16;
import defpackage.e16;
import defpackage.e9h;
import defpackage.f7u;
import defpackage.g63;
import defpackage.i30;
import defpackage.i4u;
import defpackage.i7j0;
import defpackage.iax0;
import defpackage.izz;
import defpackage.kb;
import defpackage.kge0;
import defpackage.kzo;
import defpackage.kzz;
import defpackage.li10;
import defpackage.mht;
import defpackage.my01;
import defpackage.ny61;
import defpackage.o501;
import defpackage.oht;
import defpackage.pw21;
import defpackage.pzz;
import defpackage.r7j0;
import defpackage.tgv;
import defpackage.u30;
import defpackage.ui10;
import defpackage.v9u;
import defpackage.xht;
import defpackage.yht;
import defpackage.yt2;
import defpackage.z2a1;
import defpackage.zht;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public class Glide implements ComponentCallbacks2 {
    private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    private static final String DESTROYED_ACTIVITY_WARNING = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";
    private static final String TAG = "Glide";
    private static volatile Glide glide;
    private static volatile boolean isInitializing;
    private final g63 arrayPool;
    private final b16 bitmapPool;
    private e16 bitmapPreFiller;
    private final b6e connectivityMonitorFactory;
    private final mht defaultRequestOptionsFactory;
    private final c engine;
    private final GlideContext glideContext;
    private final li10 memoryCache;
    private final RequestManagerRetriever requestManagerRetriever;
    private final List<RequestManager> managers = new ArrayList();
    private MemoryCategory memoryCategory = MemoryCategory.NORMAL;

    public Glide(Context context, c cVar, li10 li10Var, b16 b16Var, g63 g63Var, RequestManagerRetriever requestManagerRetriever, b6e b6eVar, int i, mht mhtVar, Map<Class<?>, my01> map, List<i7j0> list, List<OkHttpGlideModule> list2, yt2 yt2Var, zht zhtVar) {
        this.engine = cVar;
        this.bitmapPool = b16Var;
        this.arrayPool = g63Var;
        this.memoryCache = li10Var;
        this.requestManagerRetriever = requestManagerRetriever;
        this.connectivityMonitorFactory = b6eVar;
        this.defaultRequestOptionsFactory = mhtVar;
        this.glideContext = new GlideContext(context, g63Var, new kzo(this, list2, yt2Var), new tgv(), mhtVar, map, list, cVar, zhtVar, i);
    }

    public static void checkAndInitializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (isInitializing) {
            ny61.r("Glide has been called recursively, this is probably an internal library error!");
            return;
        }
        isInitializing = true;
        try {
            initializeGlide(context, generatedAppGlideModule);
        } finally {
            isInitializing = false;
        }
    }

    public static void enableHardwareBitmaps() {
        f7u a = f7u.a();
        a.getClass();
        pw21.a();
        a.d.set(true);
    }

    public static Glide get(Context context) {
        if (glide == null) {
            GeneratedAppGlideModule annotationGeneratedGlideModules = getAnnotationGeneratedGlideModules(context.getApplicationContext());
            synchronized (Glide.class) {
                try {
                    if (glide == null) {
                        checkAndInitializeGlide(context, annotationGeneratedGlideModules);
                    }
                } finally {
                }
            }
        }
        return glide;
    }

    private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable(TAG, 5);
            return null;
        } catch (IllegalAccessException e) {
            throwIncorrectGlideModule(e);
            return null;
        } catch (InstantiationException e2) {
            throwIncorrectGlideModule(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            throwIncorrectGlideModule(e3);
            return null;
        } catch (InvocationTargetException e4) {
            throwIncorrectGlideModule(e4);
            return null;
        }
    }

    public static File getPhotoCacheDir(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    private static RequestManagerRetriever getRetriever(Context context) {
        z2a1.e(context, DESTROYED_ACTIVITY_WARNING);
        return get(context).getRequestManagerRetriever();
    }

    public static void init(Context context, oht ohtVar) {
        GeneratedAppGlideModule annotationGeneratedGlideModules = getAnnotationGeneratedGlideModules(context);
        synchronized (Glide.class) {
            try {
                if (glide != null) {
                    tearDown();
                }
                initializeGlide(context, ohtVar, annotationGeneratedGlideModules);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void initializeGlide(Context context, oht ohtVar, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        ApplicationInfo applicationInfo;
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            Log.isLoggable("ManifestParser", 3);
            ArrayList arrayList = new ArrayList();
            try {
                applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e);
                }
            }
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(aib1.d(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
                list = arrayList;
            }
            Log.isLoggable("ManifestParser", 3);
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
                if (hashSet.contains(okHttpGlideModule.getClass())) {
                    if (Log.isLoggable(TAG, 3)) {
                        okHttpGlideModule.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(TAG, 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((OkHttpGlideModule) it2.next()).getClass().toString();
            }
        }
        ohtVar.getClass();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((OkHttpGlideModule) it3.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b();
        }
        if (ohtVar.g == null) {
            i30 i30Var = new i30(1);
            if (yht.b == 0) {
                yht.b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = yht.b;
            if (TextUtils.isEmpty("source")) {
                ny61.g("Name must be non-null and non-empty, but given: source");
                return;
            }
            ohtVar.g = new yht(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new xht(i30Var, "source", false)));
        }
        if (ohtVar.h == null) {
            i30 i30Var2 = new i30(1);
            if (TextUtils.isEmpty("disk-cache")) {
                ny61.g("Name must be non-null and non-empty, but given: disk-cache");
                return;
            }
            ohtVar.h = new yht(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new xht(i30Var2, "disk-cache", true)));
        }
        if (ohtVar.n == null) {
            if (yht.b == 0) {
                yht.b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = yht.b >= 4 ? 2 : 1;
            i30 i30Var3 = new i30(1);
            if (TextUtils.isEmpty("animation")) {
                ny61.g("Name must be non-null and non-empty, but given: animation");
                return;
            }
            ohtVar.n = new yht(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new xht(i30Var3, "animation", true)));
        }
        if (ohtVar.j == null) {
            ui10 ui10Var = new ui10(applicationContext);
            kb kbVar = new kb();
            Context context2 = ui10Var.c;
            float f = ui10Var.b;
            ActivityManager activityManager = (ActivityManager) ui10Var.w;
            int i3 = activityManager.isLowRamDevice() ? 2097152 : SelfTester_JCP.ENCRYPT_CBC;
            kbVar.c = i3;
            int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) ((i4u) ui10Var.x).a;
            float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            int round2 = Math.round(f2 * f);
            int round3 = Math.round(f2 * 2.0f);
            int i4 = round - i3;
            if (round3 + round2 <= i4) {
                kbVar.b = round3;
                kbVar.a = round2;
            } else {
                float f3 = i4 / (f + 2.0f);
                kbVar.b = Math.round(f3 * 2.0f);
                kbVar.a = Math.round(f3 * f);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                Formatter.formatFileSize(context2, kbVar.b);
                Formatter.formatFileSize(context2, kbVar.a);
                Formatter.formatFileSize(context2, i3);
                Formatter.formatFileSize(context2, round);
                activityManager.getMemoryClass();
                activityManager.isLowRamDevice();
            }
            ohtVar.j = kbVar;
        }
        if (ohtVar.k == null) {
            ohtVar.k = new e9h();
        }
        if (ohtVar.d == null) {
            int i5 = ohtVar.j.a;
            if (i5 > 0) {
                ohtVar.d = new kzz(i5);
            } else {
                ohtVar.d = new c16();
            }
        }
        if (ohtVar.e == null) {
            ohtVar.e = new izz(ohtVar.j.c);
        }
        if (ohtVar.f == null) {
            ohtVar.f = new pzz(ohtVar.j.b);
        }
        if (ohtVar.i == null) {
            ohtVar.i = new i4u(applicationContext);
        }
        if (ohtVar.c == null) {
            ohtVar.c = new c(ohtVar.f, ohtVar.i, ohtVar.h, ohtVar.g, new yht(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new xht(new i30(1), "source-unlimited", false))), ohtVar.n);
        }
        List list3 = ohtVar.o;
        if (list3 == null) {
            ohtVar.o = Collections.EMPTY_LIST;
        } else {
            ohtVar.o = Collections.unmodifiableList(list3);
        }
        u30 u30Var = ohtVar.b;
        u30Var.getClass();
        Glide glide2 = new Glide(applicationContext, ohtVar.c, ohtVar.f, ohtVar.d, ohtVar.e, new RequestManagerRetriever(null), ohtVar.k, ohtVar.l, ohtVar.m, ohtVar.a, ohtVar.o, list, generatedAppGlideModule, new zht(u30Var));
        applicationContext.registerComponentCallbacks(glide2);
        glide = glide2;
    }

    public static synchronized boolean isInitialized() {
        boolean z;
        synchronized (Glide.class) {
            z = glide != null;
        }
        return z;
    }

    public static void tearDown() {
        synchronized (Glide.class) {
            try {
                if (glide != null) {
                    glide.getContext().getApplicationContext().unregisterComponentCallbacks(glide);
                    glide.engine.f();
                }
                glide = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void throwIncorrectGlideModule(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @Deprecated
    public static RequestManager with(Fragment fragment) {
        Activity activity = fragment.getActivity();
        z2a1.e(activity, DESTROYED_ACTIVITY_WARNING);
        return with(activity.getApplicationContext());
    }

    public void clearDiskCache() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.engine.f.a().clear();
        } else {
            ny61.g("You must call this method on a background thread");
        }
    }

    public void clearMemory() {
        pw21.a();
        ((v9u) this.memoryCache).h(0L);
        this.bitmapPool.e();
        izz izzVar = (izz) this.arrayPool;
        synchronized (izzVar) {
            izzVar.b(0);
        }
    }

    public g63 getArrayPool() {
        return this.arrayPool;
    }

    public b16 getBitmapPool() {
        return this.bitmapPool;
    }

    public b6e getConnectivityMonitorFactory() {
        return this.connectivityMonitorFactory;
    }

    public Context getContext() {
        return this.glideContext.getBaseContext();
    }

    public GlideContext getGlideContext() {
        return this.glideContext;
    }

    public Registry getRegistry() {
        return this.glideContext.getRegistry();
    }

    public RequestManagerRetriever getRequestManagerRetriever() {
        return this.requestManagerRetriever;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        clearMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        trimMemory(i);
    }

    public synchronized void preFillBitmapPool(kge0... kge0VarArr) {
        try {
            if (this.bitmapPreFiller == null) {
                ((o501) this.defaultRequestOptionsFactory).getClass();
                this.bitmapPreFiller = new e16(this.memoryCache, this.bitmapPool, (DecodeFormat) new r7j0().G.c(g.f));
            }
            this.bitmapPreFiller.a(kge0VarArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void registerRequestManager(RequestManager requestManager) {
        synchronized (this.managers) {
            try {
                if (this.managers.contains(requestManager)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.managers.add(requestManager);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean removeFromManagers(iax0 iax0Var) {
        synchronized (this.managers) {
            try {
                Iterator<RequestManager> it = this.managers.iterator();
                while (it.hasNext()) {
                    if (it.next().untrack(iax0Var)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MemoryCategory setMemoryCategory(MemoryCategory memoryCategory) {
        pw21.a();
        Object obj = this.memoryCache;
        float a = memoryCategory.a();
        v9u v9uVar = (v9u) obj;
        synchronized (v9uVar) {
            if (a < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            long round = Math.round(v9uVar.b * a);
            v9uVar.c = round;
            v9uVar.h(round);
        }
        this.bitmapPool.b(memoryCategory.a());
        MemoryCategory memoryCategory2 = this.memoryCategory;
        this.memoryCategory = memoryCategory;
        return memoryCategory2;
    }

    public void trimMemory(int i) {
        long j;
        pw21.a();
        synchronized (this.managers) {
            try {
                Iterator<RequestManager> it = this.managers.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pzz pzzVar = (pzz) this.memoryCache;
        pzzVar.getClass();
        if (i >= 40) {
            pzzVar.h(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (pzzVar) {
                j = pzzVar.c;
            }
            pzzVar.h(j / 2);
        }
        this.bitmapPool.a(i);
        izz izzVar = (izz) this.arrayPool;
        synchronized (izzVar) {
            if (i >= 40) {
                synchronized (izzVar) {
                    izzVar.b(0);
                }
            } else if (i >= 20 || i == 15) {
                izzVar.b(izzVar.e / 2);
            }
        }
    }

    public void unregisterRequestManager(RequestManager requestManager) {
        synchronized (this.managers) {
            try {
                if (!this.managers.contains(requestManager)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.managers.remove(requestManager);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static RequestManager with(Activity activity) {
        return with(activity.getApplicationContext());
    }

    public static RequestManager with(FragmentActivity fragmentActivity) {
        return getRetriever(fragmentActivity).get(fragmentActivity);
    }

    public static RequestManager with(androidx.fragment.app.Fragment fragment) {
        return getRetriever(fragment.getContext()).get(fragment);
    }

    public static RequestManager with(Context context) {
        return getRetriever(context).get(context);
    }

    public static RequestManager with(View view) {
        return getRetriever(view.getContext()).get(view);
    }

    @Deprecated
    public static synchronized void init(Glide glide2) {
        synchronized (Glide.class) {
            try {
                if (glide != null) {
                    tearDown();
                }
                glide = glide2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File getPhotoCacheDir(Context context) {
        return getPhotoCacheDir(context, DEFAULT_DISK_CACHE_DIR);
    }

    private static void initializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        initializeGlide(context, new oht(), generatedAppGlideModule);
    }
}
