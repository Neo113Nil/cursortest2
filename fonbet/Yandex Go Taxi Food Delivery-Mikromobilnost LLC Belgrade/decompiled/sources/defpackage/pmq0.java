package defpackage;

import com.yandex.go.zone.dto.objects.VerticalMode;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pmq0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VerticalMode.values().length];
        try {
            iArr[VerticalMode.WITHOUT_SELECTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerticalMode.SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SummaryTooltipAlignment.values().length];
        try {
            iArr2[SummaryTooltipAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SummaryTooltipAlignment.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SummaryTooltipAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
