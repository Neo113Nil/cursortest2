package defpackage;

import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class kot {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GoApiName.values().length];
        try {
            iArr[GoApiName.TaxiV3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GoApiName.TaxiV4.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GoApiName.Billing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GoApiName.BillingInternational.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GoApiName.Plus.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GoApiName.Payments.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
