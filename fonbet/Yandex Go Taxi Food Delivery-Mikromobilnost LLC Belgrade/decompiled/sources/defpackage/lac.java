package defpackage;

import coil.graphics.DataSource;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class lac {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataSource.values().length];
        try {
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataSource.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataSource.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataSource.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
