package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"PayUIEvgenAnalytics$YbCardActionScenario", "", "LPayUIEvgenAnalytics$YbCardActionScenario;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Opening", "Topup", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenAnalytics$YbCardActionScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenAnalytics$YbCardActionScenario[] $VALUES;
    public static final PayUIEvgenAnalytics$YbCardActionScenario Opening;
    public static final PayUIEvgenAnalytics$YbCardActionScenario Topup;
    private final String eventValue;

    static {
        PayUIEvgenAnalytics$YbCardActionScenario payUIEvgenAnalytics$YbCardActionScenario = new PayUIEvgenAnalytics$YbCardActionScenario("Opening", 0, "opening");
        Opening = payUIEvgenAnalytics$YbCardActionScenario;
        PayUIEvgenAnalytics$YbCardActionScenario payUIEvgenAnalytics$YbCardActionScenario2 = new PayUIEvgenAnalytics$YbCardActionScenario("Topup", 1, TopupFragment.WEBVIEW_NAME);
        Topup = payUIEvgenAnalytics$YbCardActionScenario2;
        PayUIEvgenAnalytics$YbCardActionScenario[] payUIEvgenAnalytics$YbCardActionScenarioArr = {payUIEvgenAnalytics$YbCardActionScenario, payUIEvgenAnalytics$YbCardActionScenario2};
        $VALUES = payUIEvgenAnalytics$YbCardActionScenarioArr;
        $ENTRIES = a.a(payUIEvgenAnalytics$YbCardActionScenarioArr);
    }

    public PayUIEvgenAnalytics$YbCardActionScenario(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenAnalytics$YbCardActionScenario valueOf(String str) {
        return (PayUIEvgenAnalytics$YbCardActionScenario) Enum.valueOf(PayUIEvgenAnalytics$YbCardActionScenario.class, str);
    }

    public static PayUIEvgenAnalytics$YbCardActionScenario[] values() {
        return (PayUIEvgenAnalytics$YbCardActionScenario[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
