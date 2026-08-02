package defpackage;

import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class a2b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CacheStatus.values().length];
        try {
            iArr[CacheStatus.NO_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CacheStatus.UPDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CacheStatus.NOT_MODIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
