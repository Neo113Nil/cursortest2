package ru.ok.android.commons.app;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import com.vk.metrics.performance.appstart.content_provider.a;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.cd3;
import xsna.zcl;

/* compiled from: ApplicationProvider.kt */
/* loaded from: classes11.dex */
public final class ApplicationProvider extends ContentProvider {
    public static final Companion Companion;
    private static final Lazy<String> installerPackageName$delegate;
    private static Application mApplication;
    private static Boolean mDebuggable;
    private static Integer mVersionCode;
    private static String mVersionName;

    /* compiled from: ApplicationProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Application getApplication() {
            Application application = ApplicationProvider.mApplication;
            if (application != null) {
                return application;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String getInstallerPackageName() {
            return (String) ApplicationProvider.installerPackageName$delegate.getValue();
        }

        public final String getPackageName() {
            return getApplication().getPackageName();
        }

        public final int getVersionCode() {
            Integer num = ApplicationProvider.mVersionCode;
            if (num != null) {
                return num.intValue();
            }
            PackageInfo packageInfo = getApplication().getPackageManager().getPackageInfo(getPackageName(), 0);
            int i = packageInfo.versionCode;
            ApplicationProvider.mVersionCode = Integer.valueOf(i);
            if (ApplicationProvider.mVersionName == null) {
                ApplicationProvider.mVersionName = packageInfo.versionName;
            }
            return i;
        }

        public final String getVersionName() {
            String str = ApplicationProvider.mVersionName;
            if (str != null) {
                return str;
            }
            PackageInfo packageInfo = ApplicationKt.getPackageInfo(getApplication(), 0);
            String str2 = packageInfo.versionName;
            ApplicationProvider.mVersionName = str2;
            if (ApplicationProvider.mVersionCode == null) {
                ApplicationProvider.mVersionCode = Integer.valueOf(packageInfo.versionCode);
            }
            return str2 == null ? "" : str2;
        }

        public final boolean isDebuggable() {
            Boolean bool = ApplicationProvider.mDebuggable;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean isDebuggable = ApplicationKt.isDebuggable(getApplication());
            ApplicationProvider.mDebuggable = Boolean.valueOf(isDebuggable);
            return isDebuggable;
        }

        public final void setApplication(Application application) {
            ApplicationProvider.mApplication = application;
            ApplicationProvider.mDebuggable = null;
        }

        public final void setDebuggable(boolean z) {
            ApplicationProvider.mDebuggable = Boolean.valueOf(z);
        }

        public final void setVersionCode(int i) {
            ApplicationProvider.mVersionCode = Integer.valueOf(i);
        }

        public final void setVersionName(String str) {
            ApplicationProvider.mVersionName = str;
        }

        private Companion() {
        }

        public static /* synthetic */ void getApplication$annotations() {
        }

        public static /* synthetic */ void getInstallerPackageName$annotations() {
        }

        public static /* synthetic */ void getPackageName$annotations() {
        }

        public static /* synthetic */ void getVersionCode$annotations() {
        }

        public static /* synthetic */ void getVersionName$annotations() {
        }

        public static /* synthetic */ void isDebuggable$annotations() {
        }
    }

    static {
        a.b("ru.ok.android.commons.app.ApplicationProvider.<clinit>(ApplicationProvider.kt:73)");
        try {
            Companion = new Companion(null);
            installerPackageName$delegate = new bpn0(new cd3(0));
        } finally {
            a.a("ru.ok.android.commons.app.ApplicationProvider.<clinit>(ApplicationProvider.kt:73)");
        }
    }

    public ApplicationProvider() {
        a.b("ru.ok.android.commons.app.ApplicationProvider.<init>(ApplicationProvider.kt:9)");
        try {
        } finally {
            a.a("ru.ok.android.commons.app.ApplicationProvider.<init>(ApplicationProvider.kt:9)");
        }
    }

    public static final Application getApplication() {
        return Companion.getApplication();
    }

    public static final String getInstallerPackageName() {
        return Companion.getInstallerPackageName();
    }

    public static final String getPackageName() {
        return Companion.getPackageName();
    }

    public static final int getVersionCode() {
        return Companion.getVersionCode();
    }

    public static final String getVersionName() {
        return Companion.getVersionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String installerPackageName_delegate$lambda$0() {
        return ApplicationKt.getInstallerPackageName(Companion.getApplication());
    }

    public static final boolean isDebuggable() {
        return Companion.isDebuggable();
    }

    public static final void setApplication(Application application) {
        Companion.setApplication(application);
    }

    public static final void setDebuggable(boolean z) {
        Companion.setDebuggable(z);
    }

    public static final void setVersionCode(int i) {
        Companion.setVersionCode(i);
    }

    public static final void setVersionName(String str) {
        Companion.setVersionName(str);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("ru.ok.android.commons.app.ApplicationProvider.onCreate(ApplicationProvider.kt:11)");
        try {
            mApplication = (Application) getContext();
            return true;
        } finally {
            a.a("ru.ok.android.commons.app.ApplicationProvider.onCreate(ApplicationProvider.kt:11)");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("ru.ok.android.commons.app.ApplicationProvider.query(ApplicationProvider.kt:96)");
        try {
            throw new UnsupportedOperationException();
        } catch (Throwable th) {
            a.a("ru.ok.android.commons.app.ApplicationProvider.query(ApplicationProvider.kt:96)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
