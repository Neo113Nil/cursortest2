package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType", "", "LPayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Network", "NetworkUnknown", "Ssl", "Http", "Unknown", "InvalidConfiguration", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType[] $VALUES;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType Http;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType InvalidConfiguration;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType Network;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType NetworkUnknown;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType Ssl;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType Unknown;
    private final String eventValue;

    static {
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType("Network", 0, "network");
        Network = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType2 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType("NetworkUnknown", 1, "networkUnknown");
        NetworkUnknown = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType2;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType3 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType("Ssl", 2, "ssl");
        Ssl = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType3;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType4 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType("Http", 3, "http");
        Http = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType4;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType5 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType("Unknown", 4, "unknown");
        Unknown = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType5;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType6 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType("InvalidConfiguration", 5, "invalidConfiguration");
        InvalidConfiguration = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType6;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType[] payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorTypeArr = {payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType, payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType2, payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType3, payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType4, payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType5, payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType6};
        $VALUES = payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorTypeArr;
        $ENTRIES = a.a(payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorTypeArr);
    }

    public PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType valueOf(String str) {
        return (PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType) Enum.valueOf(PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.class, str);
    }

    public static PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType[] values() {
        return (PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
