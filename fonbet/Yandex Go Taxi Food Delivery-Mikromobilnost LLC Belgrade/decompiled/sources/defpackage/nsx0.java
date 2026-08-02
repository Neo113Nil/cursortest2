package defpackage;

import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorViewType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class nsx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffsSelectorView$SelectorViewType.values().length];
        try {
            iArr[TariffsSelectorView$SelectorViewType.DOUBLE_SELECTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffsSelectorView$SelectorViewType.USUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
