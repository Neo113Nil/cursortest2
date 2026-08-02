package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"PayUIEvgenAnalytics$MailingAdsAgreementStatus", "", "LPayUIEvgenAnalytics$MailingAdsAgreementStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Allow", "Refuse", "NotShown", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenAnalytics$MailingAdsAgreementStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenAnalytics$MailingAdsAgreementStatus[] $VALUES;
    public static final PayUIEvgenAnalytics$MailingAdsAgreementStatus Allow;
    public static final PayUIEvgenAnalytics$MailingAdsAgreementStatus NotShown;
    public static final PayUIEvgenAnalytics$MailingAdsAgreementStatus Refuse;
    private final String eventValue;

    static {
        PayUIEvgenAnalytics$MailingAdsAgreementStatus payUIEvgenAnalytics$MailingAdsAgreementStatus = new PayUIEvgenAnalytics$MailingAdsAgreementStatus("Allow", 0, "allow");
        Allow = payUIEvgenAnalytics$MailingAdsAgreementStatus;
        PayUIEvgenAnalytics$MailingAdsAgreementStatus payUIEvgenAnalytics$MailingAdsAgreementStatus2 = new PayUIEvgenAnalytics$MailingAdsAgreementStatus("Refuse", 1, "refuse");
        Refuse = payUIEvgenAnalytics$MailingAdsAgreementStatus2;
        PayUIEvgenAnalytics$MailingAdsAgreementStatus payUIEvgenAnalytics$MailingAdsAgreementStatus3 = new PayUIEvgenAnalytics$MailingAdsAgreementStatus("NotShown", 2, "not_shown");
        NotShown = payUIEvgenAnalytics$MailingAdsAgreementStatus3;
        PayUIEvgenAnalytics$MailingAdsAgreementStatus[] payUIEvgenAnalytics$MailingAdsAgreementStatusArr = {payUIEvgenAnalytics$MailingAdsAgreementStatus, payUIEvgenAnalytics$MailingAdsAgreementStatus2, payUIEvgenAnalytics$MailingAdsAgreementStatus3};
        $VALUES = payUIEvgenAnalytics$MailingAdsAgreementStatusArr;
        $ENTRIES = a.a(payUIEvgenAnalytics$MailingAdsAgreementStatusArr);
    }

    public PayUIEvgenAnalytics$MailingAdsAgreementStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenAnalytics$MailingAdsAgreementStatus valueOf(String str) {
        return (PayUIEvgenAnalytics$MailingAdsAgreementStatus) Enum.valueOf(PayUIEvgenAnalytics$MailingAdsAgreementStatus.class, str);
    }

    public static PayUIEvgenAnalytics$MailingAdsAgreementStatus[] values() {
        return (PayUIEvgenAnalytics$MailingAdsAgreementStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
