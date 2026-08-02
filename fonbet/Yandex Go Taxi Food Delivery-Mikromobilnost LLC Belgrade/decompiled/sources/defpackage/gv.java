package defpackage;

import com.yandex.go.shortcuts.dto.response.Shape;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class gv {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SummaryUiDelegate$TariffCardStyle.values().length];
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.WIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Shape.values().length];
        try {
            iArr2[Shape.CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
    }
}
