package defpackage;

import com.bumptech.glide.load.DataSource;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ccq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataSource.values().length];
        try {
            iArr[DataSource.REMOTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataSource.DATA_DISK_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataSource.RESOURCE_DISK_CACHE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DataSource.LOCAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
