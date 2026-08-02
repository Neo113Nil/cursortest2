package defpackage;

import ru.yandex.taxi.widget.image.BitmapRequest$ForceCacheType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hac {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BitmapRequest$ForceCacheType.values().length];
        try {
            iArr[BitmapRequest$ForceCacheType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BitmapRequest$ForceCacheType.DISK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BitmapRequest$ForceCacheType.MEMORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
