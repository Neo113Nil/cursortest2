package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LPayUIEvgenSubscriptionState;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NotLoggedIn", "NoSubscription", CA20Status.STATUS_USER_DESCRIPTION_A, "Unknown", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenSubscriptionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenSubscriptionState[] $VALUES;
    public static final PayUIEvgenSubscriptionState Active;
    public static final PayUIEvgenSubscriptionState NoSubscription;
    public static final PayUIEvgenSubscriptionState NotLoggedIn;
    public static final PayUIEvgenSubscriptionState Unknown;
    private final String eventValue;

    static {
        PayUIEvgenSubscriptionState payUIEvgenSubscriptionState = new PayUIEvgenSubscriptionState("NotLoggedIn", 0, "not_logged_in");
        NotLoggedIn = payUIEvgenSubscriptionState;
        PayUIEvgenSubscriptionState payUIEvgenSubscriptionState2 = new PayUIEvgenSubscriptionState("NoSubscription", 1, "no_subscription");
        NoSubscription = payUIEvgenSubscriptionState2;
        PayUIEvgenSubscriptionState payUIEvgenSubscriptionState3 = new PayUIEvgenSubscriptionState(CA20Status.STATUS_USER_DESCRIPTION_A, 2, ClidProvider.APP_ACTIVE);
        Active = payUIEvgenSubscriptionState3;
        PayUIEvgenSubscriptionState payUIEvgenSubscriptionState4 = new PayUIEvgenSubscriptionState("Unknown", 3, "unknown");
        Unknown = payUIEvgenSubscriptionState4;
        PayUIEvgenSubscriptionState[] payUIEvgenSubscriptionStateArr = {payUIEvgenSubscriptionState, payUIEvgenSubscriptionState2, payUIEvgenSubscriptionState3, payUIEvgenSubscriptionState4};
        $VALUES = payUIEvgenSubscriptionStateArr;
        $ENTRIES = a.a(payUIEvgenSubscriptionStateArr);
    }

    public PayUIEvgenSubscriptionState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenSubscriptionState valueOf(String str) {
        return (PayUIEvgenSubscriptionState) Enum.valueOf(PayUIEvgenSubscriptionState.class, str);
    }

    public static PayUIEvgenSubscriptionState[] values() {
        return (PayUIEvgenSubscriptionState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
