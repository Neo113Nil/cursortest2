package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"PayUIEvgenAnalytics$PaymentOption", "", "LPayUIEvgenAnalytics$PaymentOption;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "InApp", "Native", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenAnalytics$PaymentOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenAnalytics$PaymentOption[] $VALUES;
    public static final PayUIEvgenAnalytics$PaymentOption InApp;
    public static final PayUIEvgenAnalytics$PaymentOption Native;
    private final String eventValue;

    static {
        PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption = new PayUIEvgenAnalytics$PaymentOption("InApp", 0, "in_app");
        InApp = payUIEvgenAnalytics$PaymentOption;
        PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption2 = new PayUIEvgenAnalytics$PaymentOption("Native", 1, "native");
        Native = payUIEvgenAnalytics$PaymentOption2;
        PayUIEvgenAnalytics$PaymentOption[] payUIEvgenAnalytics$PaymentOptionArr = {payUIEvgenAnalytics$PaymentOption, payUIEvgenAnalytics$PaymentOption2};
        $VALUES = payUIEvgenAnalytics$PaymentOptionArr;
        $ENTRIES = a.a(payUIEvgenAnalytics$PaymentOptionArr);
    }

    public PayUIEvgenAnalytics$PaymentOption(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenAnalytics$PaymentOption valueOf(String str) {
        return (PayUIEvgenAnalytics$PaymentOption) Enum.valueOf(PayUIEvgenAnalytics$PaymentOption.class, str);
    }

    public static PayUIEvgenAnalytics$PaymentOption[] values() {
        return (PayUIEvgenAnalytics$PaymentOption[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
