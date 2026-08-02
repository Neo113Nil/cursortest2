package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class gnd0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusPayMailingAdsAgreement.Status.values().length];
        try {
            iArr[PlusPayMailingAdsAgreement.Status.ALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayMailingAdsAgreement.Status.REFUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPayMailingAdsAgreement.TextLogic.values().length];
        try {
            iArr2[PlusPayMailingAdsAgreement.TextLogic.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PlusPayMailingAdsAgreement.TextLogic.INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
