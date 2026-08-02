package defpackage;

import com.yandex.go.zone.dto.objects.BrandingCashbackStyle;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class obx0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SummaryUiDelegate$TariffCardStyle.values().length];
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.WIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[ServiceLevel.Branding.Type.values().length];
        try {
            iArr2[ServiceLevel.Branding.Type.CASH_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ServiceLevel.Branding.Type.BADGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[BrandingCashbackStyle.Style.values().length];
        try {
            iArr3[BrandingCashbackStyle.Style.DARK_GRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[BrandingCashbackStyle.Style.LIGHT_GRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[BrandingCashbackStyle.Style.LIGHT_GRADIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[BrandingCashbackStyle.Style.DARK_GRADIENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[BrandingCashbackStyle.Style.DISABLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
