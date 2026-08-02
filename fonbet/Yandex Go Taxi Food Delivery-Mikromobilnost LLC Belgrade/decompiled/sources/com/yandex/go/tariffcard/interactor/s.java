package com.yandex.go.tariffcard.interactor;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffCardScrollButtonInteractor$TariffCardExpandState.values().length];
        try {
            iArr[TariffCardScrollButtonInteractor$TariffCardExpandState.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffCardScrollButtonInteractor$TariffCardExpandState.EXPANDED_AT_LEAST_ONCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
