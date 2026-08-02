package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"EvgenDiagnostic$SubscriptionPaymentType", "", "LEvgenDiagnostic$SubscriptionPaymentType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Tarifficator", "OldPayment", "Host", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EvgenDiagnostic$SubscriptionPaymentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenDiagnostic$SubscriptionPaymentType[] $VALUES;
    public static final EvgenDiagnostic$SubscriptionPaymentType Host;
    public static final EvgenDiagnostic$SubscriptionPaymentType OldPayment;
    public static final EvgenDiagnostic$SubscriptionPaymentType Tarifficator;
    private final String eventValue;

    static {
        EvgenDiagnostic$SubscriptionPaymentType evgenDiagnostic$SubscriptionPaymentType = new EvgenDiagnostic$SubscriptionPaymentType("Tarifficator", 0, "tarifficator");
        Tarifficator = evgenDiagnostic$SubscriptionPaymentType;
        EvgenDiagnostic$SubscriptionPaymentType evgenDiagnostic$SubscriptionPaymentType2 = new EvgenDiagnostic$SubscriptionPaymentType("OldPayment", 1, "old_payment");
        OldPayment = evgenDiagnostic$SubscriptionPaymentType2;
        EvgenDiagnostic$SubscriptionPaymentType evgenDiagnostic$SubscriptionPaymentType3 = new EvgenDiagnostic$SubscriptionPaymentType("Host", 2, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        Host = evgenDiagnostic$SubscriptionPaymentType3;
        EvgenDiagnostic$SubscriptionPaymentType[] evgenDiagnostic$SubscriptionPaymentTypeArr = {evgenDiagnostic$SubscriptionPaymentType, evgenDiagnostic$SubscriptionPaymentType2, evgenDiagnostic$SubscriptionPaymentType3};
        $VALUES = evgenDiagnostic$SubscriptionPaymentTypeArr;
        $ENTRIES = a.a(evgenDiagnostic$SubscriptionPaymentTypeArr);
    }

    public EvgenDiagnostic$SubscriptionPaymentType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenDiagnostic$SubscriptionPaymentType valueOf(String str) {
        return (EvgenDiagnostic$SubscriptionPaymentType) Enum.valueOf(EvgenDiagnostic$SubscriptionPaymentType.class, str);
    }

    public static EvgenDiagnostic$SubscriptionPaymentType[] values() {
        return (EvgenDiagnostic$SubscriptionPaymentType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
