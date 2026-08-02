package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import defpackage.cr2;
import defpackage.fr2;
import defpackage.gr2;
import defpackage.hr2;
import defpackage.ir2;
import defpackage.j63;
import defpackage.m5z;
import defpackage.r53;
import defpackage.rr;
import defpackage.uw;
import defpackage.vw;
import defpackage.ykj;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b {
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final String TAG = "AppCompatDelegate";
    static ir2 sSerialExecutorForLocalesStorage = new ir2(new ykj(3));
    private static int sDefaultNightMode = -100;
    private static m5z sRequestedAppLocales = null;
    private static m5z sStoredAppLocales = null;
    private static Boolean sIsAutoStoreLocalesOptedIn = null;
    private static boolean sIsFrameworkSyncChecked = false;
    private static final j63 sActivityDelegates = new j63();
    private static final Object sActivityDelegatesLock = new Object();
    private static final Object sAppLocalesStorageSyncLock = new Object();

    public static /* synthetic */ void a(Context context) {
        syncLocalesToFramework(context);
        sIsFrameworkSyncChecked = true;
    }

    public static void addActiveDelegate(b bVar) {
        synchronized (sActivityDelegatesLock) {
            b(bVar);
            sActivityDelegates.add(new WeakReference(bVar));
        }
    }

    public static void b(b bVar) {
        synchronized (sActivityDelegatesLock) {
            try {
                j63 j63Var = sActivityDelegates;
                j63Var.getClass();
                r53 r53Var = new r53(j63Var);
                while (r53Var.hasNext()) {
                    b bVar2 = (b) ((WeakReference) r53Var.next()).get();
                    if (bVar2 == bVar || bVar2 == null) {
                        r53Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static b create(Activity activity, cr2 cr2Var) {
        return new AppCompatDelegateImpl(activity, cr2Var);
    }

    public static m5z getApplicationLocales() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                return m5z.e(hr2.a(localeManagerForApplication));
            }
        } else {
            m5z m5zVar = sRequestedAppLocales;
            if (m5zVar != null) {
                return m5zVar;
            }
        }
        return m5z.b;
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    public static Object getLocaleManagerForApplication() {
        Context contextForDelegate;
        j63 j63Var = sActivityDelegates;
        j63Var.getClass();
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            b bVar = (b) ((WeakReference) r53Var.next()).get();
            if (bVar != null && (contextForDelegate = bVar.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    public static m5z getRequestedAppLocales() {
        return sRequestedAppLocales;
    }

    public static m5z getStoredAppLocales() {
        return sStoredAppLocales;
    }

    public static boolean isAutoStorageOptedIn(Context context) {
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.getServiceInfo(context).metaData;
                if (bundle != null) {
                    sIsAutoStoreLocalesOptedIn = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                sIsAutoStoreLocalesOptedIn = Boolean.FALSE;
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    public static void removeActivityDelegate(b bVar) {
        synchronized (sActivityDelegatesLock) {
            b(bVar);
        }
    }

    public static void resetStaticRequestedAndStoredLocales() {
        sRequestedAppLocales = null;
        sStoredAppLocales = null;
    }

    public static void setApplicationLocales(m5z m5zVar) {
        Objects.requireNonNull(m5zVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                hr2.b(localeManagerForApplication, gr2.a(m5zVar.a.a.toLanguageTags()));
                return;
            }
            return;
        }
        if (m5zVar.equals(sRequestedAppLocales)) {
            return;
        }
        synchronized (sActivityDelegatesLock) {
            sRequestedAppLocales = m5zVar;
            j63 j63Var = sActivityDelegates;
            j63Var.getClass();
            r53 r53Var = new r53(j63Var);
            while (r53Var.hasNext()) {
                b bVar = (b) ((WeakReference) r53Var.next()).get();
                if (bVar != null) {
                    bVar.applyAppLocales();
                }
            }
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public static void setDefaultNightMode(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && sDefaultNightMode != i) {
            sDefaultNightMode = i;
            synchronized (sActivityDelegatesLock) {
                try {
                    j63 j63Var = sActivityDelegates;
                    j63Var.getClass();
                    r53 r53Var = new r53(j63Var);
                    while (r53Var.hasNext()) {
                        b bVar = (b) ((WeakReference) r53Var.next()).get();
                        if (bVar != null) {
                            bVar.applyDayNight();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void setIsAutoStoreLocalesOptedIn(boolean z) {
        sIsAutoStoreLocalesOptedIn = Boolean.valueOf(z);
    }

    public static void syncLocalesToFramework(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (getApplicationLocales().c()) {
                    String f = androidx.core.app.e.f(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        hr2.b(systemService, gr2.a(f));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void syncRequestedAndStoredLocales(Context context) {
        if (isAutoStorageOptedIn(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (sIsFrameworkSyncChecked) {
                    return;
                }
                sSerialExecutorForLocalesStorage.execute(new fr2(context, 0));
                return;
            }
            synchronized (sAppLocalesStorageSyncLock) {
                try {
                    m5z m5zVar = sRequestedAppLocales;
                    if (m5zVar == null) {
                        if (sStoredAppLocales == null) {
                            sStoredAppLocales = m5z.a(androidx.core.app.e.f(context));
                        }
                        if (sStoredAppLocales.c()) {
                        } else {
                            sRequestedAppLocales = sStoredAppLocales;
                        }
                    } else if (!m5zVar.equals(sStoredAppLocales)) {
                        m5z m5zVar2 = sRequestedAppLocales;
                        sStoredAppLocales = m5zVar2;
                        androidx.core.app.e.d(context, m5zVar2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyAppLocales();

    public abstract boolean applyDayNight();

    public void asyncExecuteSyncRequestedAndStoredLocales(Context context) {
        sSerialExecutorForLocalesStorage.execute(new fr2(context, 1));
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public abstract Context attachBaseContext2(Context context);

    public abstract View findViewById(int i);

    public abstract Context getContextForDelegate();

    public abstract rr getDrawerToggleDelegate();

    public abstract int getLocalNightMode();

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setLocalNightMode(int i);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public abstract void setTheme(int i);

    public abstract void setTitle(CharSequence charSequence);

    public abstract vw startSupportActionMode(uw uwVar);

    public static b create(Dialog dialog, cr2 cr2Var) {
        return new AppCompatDelegateImpl(dialog, cr2Var);
    }

    public static b create(Context context, Window window, cr2 cr2Var) {
        return new AppCompatDelegateImpl(context, window, cr2Var);
    }

    public static b create(Context context, Activity activity, cr2 cr2Var) {
        return new AppCompatDelegateImpl(context, activity, cr2Var);
    }
}
