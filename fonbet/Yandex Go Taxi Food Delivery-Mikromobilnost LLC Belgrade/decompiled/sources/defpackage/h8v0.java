package defpackage;

import com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class h8v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeTariffsApi.ChangeTariffDto.StatusDto.values().length];
        try {
            iArr[ChangeTariffsApi.ChangeTariffDto.StatusDto.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeTariffsApi.ChangeTariffDto.StatusDto.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangeTariffsApi.ChangeTariffDto.StatusDto.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChangeTariffsApi.ChangeTariffDto.StatusDto.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
