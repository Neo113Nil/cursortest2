package defpackage;

import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mcb0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PfmResponse.PfmMoney.LoyaltyCurrencyType.values().length];
        try {
            iArr[PfmResponse.PfmMoney.LoyaltyCurrencyType.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmResponse.PfmMoney.LoyaltyCurrencyType.X5.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PfmResponse.PfmMoney.LoyaltyCurrencyType.S7.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PfmResponse.PfmMoney.SignType.values().length];
        try {
            iArr2[PfmResponse.PfmMoney.SignType.CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PfmResponse.PfmMoney.SignType.DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PfmResponse.PfmMoney.SignType.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
