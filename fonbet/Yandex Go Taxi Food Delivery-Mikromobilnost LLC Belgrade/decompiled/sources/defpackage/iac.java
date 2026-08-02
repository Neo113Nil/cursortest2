package defpackage;

import coil3.graphics.EnumC0136DataSource;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class iac {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0136DataSource.values().length];
        try {
            iArr[EnumC0136DataSource.MEMORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0136DataSource.MEMORY_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0136DataSource.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0136DataSource.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
