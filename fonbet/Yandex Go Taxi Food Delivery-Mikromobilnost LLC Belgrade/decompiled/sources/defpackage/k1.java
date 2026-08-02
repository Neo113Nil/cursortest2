package defpackage;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class k1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ArCoreApk.InstallStatus.values().length];
        try {
            iArr[ArCoreApk.InstallStatus.INSTALL_REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ArCoreApk.InstallStatus.INSTALLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
