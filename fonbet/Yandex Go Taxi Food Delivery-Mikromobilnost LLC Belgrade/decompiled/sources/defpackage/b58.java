package defpackage;

import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class b58 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryUiDelegate$TariffCardStyle.values().length];
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.HIGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.WIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
