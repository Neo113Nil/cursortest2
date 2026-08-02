package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"PayEvgenDiagnostic$PlusPayEvgenResponseErrorType", "", "LPayEvgenDiagnostic$PlusPayEvgenResponseErrorType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Network", "NetworkUnknown", "Ssl", "Http", "Parse", "Unknown", "pay-sdk-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PayEvgenDiagnostic$PlusPayEvgenResponseErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayEvgenDiagnostic$PlusPayEvgenResponseErrorType[] $VALUES;
    public static final PayEvgenDiagnostic$PlusPayEvgenResponseErrorType Http;
    public static final PayEvgenDiagnostic$PlusPayEvgenResponseErrorType Network;
    public static final PayEvgenDiagnostic$PlusPayEvgenResponseErrorType NetworkUnknown;
    public static final PayEvgenDiagnostic$PlusPayEvgenResponseErrorType Parse;
    public static final PayEvgenDiagnostic$PlusPayEvgenResponseErrorType Ssl;
    public static final PayEvgenDiagnostic$PlusPayEvgenResponseErrorType Unknown;
    private final String eventValue;

    static {
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType = new PayEvgenDiagnostic$PlusPayEvgenResponseErrorType("Network", 0, "network");
        Network = payEvgenDiagnostic$PlusPayEvgenResponseErrorType;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType2 = new PayEvgenDiagnostic$PlusPayEvgenResponseErrorType("NetworkUnknown", 1, "networkUnknown");
        NetworkUnknown = payEvgenDiagnostic$PlusPayEvgenResponseErrorType2;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType3 = new PayEvgenDiagnostic$PlusPayEvgenResponseErrorType("Ssl", 2, "ssl");
        Ssl = payEvgenDiagnostic$PlusPayEvgenResponseErrorType3;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType4 = new PayEvgenDiagnostic$PlusPayEvgenResponseErrorType("Http", 3, "http");
        Http = payEvgenDiagnostic$PlusPayEvgenResponseErrorType4;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType5 = new PayEvgenDiagnostic$PlusPayEvgenResponseErrorType("Parse", 4, "parse");
        Parse = payEvgenDiagnostic$PlusPayEvgenResponseErrorType5;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType6 = new PayEvgenDiagnostic$PlusPayEvgenResponseErrorType("Unknown", 5, "unknown");
        Unknown = payEvgenDiagnostic$PlusPayEvgenResponseErrorType6;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType[] payEvgenDiagnostic$PlusPayEvgenResponseErrorTypeArr = {payEvgenDiagnostic$PlusPayEvgenResponseErrorType, payEvgenDiagnostic$PlusPayEvgenResponseErrorType2, payEvgenDiagnostic$PlusPayEvgenResponseErrorType3, payEvgenDiagnostic$PlusPayEvgenResponseErrorType4, payEvgenDiagnostic$PlusPayEvgenResponseErrorType5, payEvgenDiagnostic$PlusPayEvgenResponseErrorType6};
        $VALUES = payEvgenDiagnostic$PlusPayEvgenResponseErrorTypeArr;
        $ENTRIES = a.a(payEvgenDiagnostic$PlusPayEvgenResponseErrorTypeArr);
    }

    public PayEvgenDiagnostic$PlusPayEvgenResponseErrorType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayEvgenDiagnostic$PlusPayEvgenResponseErrorType valueOf(String str) {
        return (PayEvgenDiagnostic$PlusPayEvgenResponseErrorType) Enum.valueOf(PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.class, str);
    }

    public static PayEvgenDiagnostic$PlusPayEvgenResponseErrorType[] values() {
        return (PayEvgenDiagnostic$PlusPayEvgenResponseErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
