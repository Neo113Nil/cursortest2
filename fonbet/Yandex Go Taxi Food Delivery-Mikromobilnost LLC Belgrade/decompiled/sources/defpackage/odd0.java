package defpackage;

import com.yandex.plus.pay.repository.api.model.mailingads.MailingAdsAgreement;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class odd0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MailingAdsAgreement.Status.values().length];
        try {
            iArr[MailingAdsAgreement.Status.ALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MailingAdsAgreement.Status.REFUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MailingAdsAgreement.TextLogic.values().length];
        try {
            iArr2[MailingAdsAgreement.TextLogic.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MailingAdsAgreement.TextLogic.INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
