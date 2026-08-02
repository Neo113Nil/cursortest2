package defpackage;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.repository.api.model.mailingads.MailingAdsAgreement;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;

/* loaded from: classes2.dex */
public final class pdd0 {
    public final gdd0 a;

    public pdd0(gdd0 gdd0Var) {
        this.a = gdd0Var;
    }

    public final PlusPayMailingAdsAgreement a(MailingAdsAgreement mailingAdsAgreement) {
        PlusPayMailingAdsAgreement.Status status;
        PlusPayMailingAdsAgreement.TextLogic textLogic;
        if (mailingAdsAgreement != null) {
            LegalInfo agreementText = mailingAdsAgreement.getAgreementText();
            this.a.getClass();
            PlusPayLegalInfo a = gdd0.a(agreementText);
            if (a != null) {
                MailingAdsAgreement.Status defaultAgreementStatus = mailingAdsAgreement.getDefaultAgreementStatus();
                MailingAdsAgreement.TextLogic textLogic2 = mailingAdsAgreement.getTextLogic();
                boolean z = (defaultAgreementStatus == MailingAdsAgreement.Status.ALLOW && textLogic2 == MailingAdsAgreement.TextLogic.DIRECT) || (defaultAgreementStatus == MailingAdsAgreement.Status.REFUSE && textLogic2 == MailingAdsAgreement.TextLogic.INVERTED);
                int i = odd0.a[mailingAdsAgreement.getDefaultAgreementStatus().ordinal()];
                if (i == 1) {
                    status = PlusPayMailingAdsAgreement.Status.ALLOW;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    status = PlusPayMailingAdsAgreement.Status.REFUSE;
                }
                int i2 = odd0.b[mailingAdsAgreement.getTextLogic().ordinal()];
                if (i2 == 1) {
                    textLogic = PlusPayMailingAdsAgreement.TextLogic.DIRECT;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    textLogic = PlusPayMailingAdsAgreement.TextLogic.INVERTED;
                }
                return new PlusPayMailingAdsAgreement(a, z, status, textLogic);
            }
        }
        return null;
    }
}
