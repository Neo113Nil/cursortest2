package defpackage;

import com.yandex.go.external_service.preloader.data.models.RepositoryConfiguration$BundleStrategy;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c7u0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RepositoryConfiguration$BundleStrategy.values().length];
        try {
            iArr[RepositoryConfiguration$BundleStrategy.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RepositoryConfiguration$BundleStrategy.PRELOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RepositoryConfiguration$BundleStrategy.IGNORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
