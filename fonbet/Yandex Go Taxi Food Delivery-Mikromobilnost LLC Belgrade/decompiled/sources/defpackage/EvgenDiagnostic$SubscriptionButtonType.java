package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"EvgenDiagnostic$SubscriptionButtonType", "", "LEvgenDiagnostic$SubscriptionButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Web", "NativeSdk", "NativeHost", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EvgenDiagnostic$SubscriptionButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenDiagnostic$SubscriptionButtonType[] $VALUES;
    public static final EvgenDiagnostic$SubscriptionButtonType NativeHost;
    public static final EvgenDiagnostic$SubscriptionButtonType NativeSdk;
    public static final EvgenDiagnostic$SubscriptionButtonType Web;
    private final String eventValue;

    static {
        EvgenDiagnostic$SubscriptionButtonType evgenDiagnostic$SubscriptionButtonType = new EvgenDiagnostic$SubscriptionButtonType("Web", 0, "web");
        Web = evgenDiagnostic$SubscriptionButtonType;
        EvgenDiagnostic$SubscriptionButtonType evgenDiagnostic$SubscriptionButtonType2 = new EvgenDiagnostic$SubscriptionButtonType("NativeSdk", 1, "native_sdk");
        NativeSdk = evgenDiagnostic$SubscriptionButtonType2;
        EvgenDiagnostic$SubscriptionButtonType evgenDiagnostic$SubscriptionButtonType3 = new EvgenDiagnostic$SubscriptionButtonType("NativeHost", 2, "native_host");
        NativeHost = evgenDiagnostic$SubscriptionButtonType3;
        EvgenDiagnostic$SubscriptionButtonType[] evgenDiagnostic$SubscriptionButtonTypeArr = {evgenDiagnostic$SubscriptionButtonType, evgenDiagnostic$SubscriptionButtonType2, evgenDiagnostic$SubscriptionButtonType3};
        $VALUES = evgenDiagnostic$SubscriptionButtonTypeArr;
        $ENTRIES = a.a(evgenDiagnostic$SubscriptionButtonTypeArr);
    }

    public EvgenDiagnostic$SubscriptionButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenDiagnostic$SubscriptionButtonType valueOf(String str) {
        return (EvgenDiagnostic$SubscriptionButtonType) Enum.valueOf(EvgenDiagnostic$SubscriptionButtonType.class, str);
    }

    public static EvgenDiagnostic$SubscriptionButtonType[] values() {
        return (EvgenDiagnostic$SubscriptionButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
