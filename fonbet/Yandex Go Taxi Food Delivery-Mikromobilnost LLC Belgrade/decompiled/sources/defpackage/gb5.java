package defpackage;

import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gb5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryTooltipAlignment.values().length];
        try {
            iArr[SummaryTooltipAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryTooltipAlignment.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
