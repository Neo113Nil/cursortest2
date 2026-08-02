package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.mob.api.model.MobEnvironment;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class lsu {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[HostMobSupportedApiNames.values().length];
        try {
            iArr[HostMobSupportedApiNames.BILLING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HostMobSupportedApiNames.BILLING_INTERNATIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HostMobSupportedApiNames.LEGAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HostMobSupportedApiNames.TAXI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HostMobSupportedApiNames.TAXI_V4.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HostMobSupportedApiNames.WEBAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[HostMobSupportedApiNames.AM_MOBILEPROXY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[HostMobSupportedApiNames.METRICA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[HostMobSupportedApiNames.PLUS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[HostMobSupportedApiNames.WEB_MSNGR.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[HostMobSupportedApiNames.WEB_MSNGR_YNDX.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[HostMobSupportedApiNames.WEB_MSNGR_WEB.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[HostMobSupportedApiNames.NATIVE_MSNGR_REGISTRY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[HostMobSupportedApiNames.NATIVE_MSNGR_FANOUT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[HostMobSupportedApiNames.NATIVE_MSNGR_FILES.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[HostMobSupportedApiNames.NATIVE_MSNGR_IMAGES.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[HostMobSupportedApiNames.NATIVE_MSNGR_PUSH.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[HostMobSupportedApiNames.NATIVE_MSNGR_TOOLS.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[HostMobSupportedApiNames.TC.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[HostMobSupportedApiNames.MEDIAADV.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[HostMobSupportedApiNames.YX_MOBILE_ADS.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[HostMobSupportedApiNames.XIVA_PUSH.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[HostMobSupportedApiNames.EATS_AUTHPROXY.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[HostMobSupportedApiNames.WEB_FINTECH_BNPL.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[HostMobSupportedApiNames.WEB_FINTECH_SHOP.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        a = iArr;
        int[] iArr2 = new int[MobEnvironment.values().length];
        try {
            iArr2[MobEnvironment.PROD.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[MobEnvironment.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        b = iArr2;
        int[] iArr3 = new int[GoApiName.values().length];
        try {
            iArr3[GoApiName.TaxiV3.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[GoApiName.TaxiV4.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[GoApiName.Billing.ordinal()] = 3;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr3[GoApiName.BillingInternational.ordinal()] = 4;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr3[GoApiName.Plus.ordinal()] = 5;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr3[GoApiName.Payments.ordinal()] = 6;
        } catch (NoSuchFieldError unused33) {
        }
        c = iArr3;
    }
}
