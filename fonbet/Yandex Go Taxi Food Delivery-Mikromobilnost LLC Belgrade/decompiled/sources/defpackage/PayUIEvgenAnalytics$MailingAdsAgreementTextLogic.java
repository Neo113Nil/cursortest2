package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"PayUIEvgenAnalytics$MailingAdsAgreementTextLogic", "", "LPayUIEvgenAnalytics$MailingAdsAgreementTextLogic;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Direct", "Inverted", "Unknown", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenAnalytics$MailingAdsAgreementTextLogic {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenAnalytics$MailingAdsAgreementTextLogic[] $VALUES;
    public static final PayUIEvgenAnalytics$MailingAdsAgreementTextLogic Direct;
    public static final PayUIEvgenAnalytics$MailingAdsAgreementTextLogic Inverted;
    public static final PayUIEvgenAnalytics$MailingAdsAgreementTextLogic Unknown;
    private final String eventValue;

    static {
        PayUIEvgenAnalytics$MailingAdsAgreementTextLogic payUIEvgenAnalytics$MailingAdsAgreementTextLogic = new PayUIEvgenAnalytics$MailingAdsAgreementTextLogic("Direct", 0, "direct");
        Direct = payUIEvgenAnalytics$MailingAdsAgreementTextLogic;
        PayUIEvgenAnalytics$MailingAdsAgreementTextLogic payUIEvgenAnalytics$MailingAdsAgreementTextLogic2 = new PayUIEvgenAnalytics$MailingAdsAgreementTextLogic("Inverted", 1, "inverted");
        Inverted = payUIEvgenAnalytics$MailingAdsAgreementTextLogic2;
        PayUIEvgenAnalytics$MailingAdsAgreementTextLogic payUIEvgenAnalytics$MailingAdsAgreementTextLogic3 = new PayUIEvgenAnalytics$MailingAdsAgreementTextLogic("Unknown", 2, "unknown");
        Unknown = payUIEvgenAnalytics$MailingAdsAgreementTextLogic3;
        PayUIEvgenAnalytics$MailingAdsAgreementTextLogic[] payUIEvgenAnalytics$MailingAdsAgreementTextLogicArr = {payUIEvgenAnalytics$MailingAdsAgreementTextLogic, payUIEvgenAnalytics$MailingAdsAgreementTextLogic2, payUIEvgenAnalytics$MailingAdsAgreementTextLogic3};
        $VALUES = payUIEvgenAnalytics$MailingAdsAgreementTextLogicArr;
        $ENTRIES = a.a(payUIEvgenAnalytics$MailingAdsAgreementTextLogicArr);
    }

    public PayUIEvgenAnalytics$MailingAdsAgreementTextLogic(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenAnalytics$MailingAdsAgreementTextLogic valueOf(String str) {
        return (PayUIEvgenAnalytics$MailingAdsAgreementTextLogic) Enum.valueOf(PayUIEvgenAnalytics$MailingAdsAgreementTextLogic.class, str);
    }

    public static PayUIEvgenAnalytics$MailingAdsAgreementTextLogic[] values() {
        return (PayUIEvgenAnalytics$MailingAdsAgreementTextLogic[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
