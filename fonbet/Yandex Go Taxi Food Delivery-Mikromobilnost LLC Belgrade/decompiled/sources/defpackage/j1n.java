package defpackage;

import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class j1n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PriceUpdate$PriceLoadingState.values().length];
        try {
            iArr[PriceUpdate$PriceLoadingState.LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PriceUpdate$PriceLoadingState.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PriceUpdate$PriceLoadingState.LOADING_INTERRUPTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PriceUpdate$PriceLoadingState.LOADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
