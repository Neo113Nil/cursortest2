package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"PayEvgenAnalytics$OffersSource", "", "LPayEvgenAnalytics$OffersSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Billing", "PaySdk", "pay-sdk-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayEvgenAnalytics$OffersSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayEvgenAnalytics$OffersSource[] $VALUES;
    public static final PayEvgenAnalytics$OffersSource Billing;
    public static final PayEvgenAnalytics$OffersSource PaySdk;
    private final String eventValue;

    static {
        PayEvgenAnalytics$OffersSource payEvgenAnalytics$OffersSource = new PayEvgenAnalytics$OffersSource("Billing", 0, "billing");
        Billing = payEvgenAnalytics$OffersSource;
        PayEvgenAnalytics$OffersSource payEvgenAnalytics$OffersSource2 = new PayEvgenAnalytics$OffersSource("PaySdk", 1, "pay_sdk");
        PaySdk = payEvgenAnalytics$OffersSource2;
        PayEvgenAnalytics$OffersSource[] payEvgenAnalytics$OffersSourceArr = {payEvgenAnalytics$OffersSource, payEvgenAnalytics$OffersSource2};
        $VALUES = payEvgenAnalytics$OffersSourceArr;
        $ENTRIES = a.a(payEvgenAnalytics$OffersSourceArr);
    }

    public PayEvgenAnalytics$OffersSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayEvgenAnalytics$OffersSource valueOf(String str) {
        return (PayEvgenAnalytics$OffersSource) Enum.valueOf(PayEvgenAnalytics$OffersSource.class, str);
    }

    public static PayEvgenAnalytics$OffersSource[] values() {
        return (PayEvgenAnalytics$OffersSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
