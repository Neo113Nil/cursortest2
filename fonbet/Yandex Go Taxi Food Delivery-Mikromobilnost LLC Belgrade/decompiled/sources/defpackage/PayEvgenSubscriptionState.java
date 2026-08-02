package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LPayEvgenSubscriptionState;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NotLoggedIn", "NoSubscription", CA20Status.STATUS_USER_DESCRIPTION_A, "Unknown", "pay-sdk-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PayEvgenSubscriptionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayEvgenSubscriptionState[] $VALUES;
    public static final PayEvgenSubscriptionState Active;
    public static final PayEvgenSubscriptionState NoSubscription;
    public static final PayEvgenSubscriptionState NotLoggedIn;
    public static final PayEvgenSubscriptionState Unknown;
    private final String eventValue;

    static {
        PayEvgenSubscriptionState payEvgenSubscriptionState = new PayEvgenSubscriptionState("NotLoggedIn", 0, "not_logged_in");
        NotLoggedIn = payEvgenSubscriptionState;
        PayEvgenSubscriptionState payEvgenSubscriptionState2 = new PayEvgenSubscriptionState("NoSubscription", 1, "no_subscription");
        NoSubscription = payEvgenSubscriptionState2;
        PayEvgenSubscriptionState payEvgenSubscriptionState3 = new PayEvgenSubscriptionState(CA20Status.STATUS_USER_DESCRIPTION_A, 2, ClidProvider.APP_ACTIVE);
        Active = payEvgenSubscriptionState3;
        PayEvgenSubscriptionState payEvgenSubscriptionState4 = new PayEvgenSubscriptionState("Unknown", 3, "unknown");
        Unknown = payEvgenSubscriptionState4;
        PayEvgenSubscriptionState[] payEvgenSubscriptionStateArr = {payEvgenSubscriptionState, payEvgenSubscriptionState2, payEvgenSubscriptionState3, payEvgenSubscriptionState4};
        $VALUES = payEvgenSubscriptionStateArr;
        $ENTRIES = a.a(payEvgenSubscriptionStateArr);
    }

    public PayEvgenSubscriptionState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayEvgenSubscriptionState valueOf(String str) {
        return (PayEvgenSubscriptionState) Enum.valueOf(PayEvgenSubscriptionState.class, str);
    }

    public static PayEvgenSubscriptionState[] values() {
        return (PayEvgenSubscriptionState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
