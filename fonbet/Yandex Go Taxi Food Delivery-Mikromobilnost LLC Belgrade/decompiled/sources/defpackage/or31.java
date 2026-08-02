package defpackage;

import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class or31 {
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
        try {
            iArr[SummaryTooltipAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
