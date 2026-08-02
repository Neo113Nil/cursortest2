package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"EvgenDiagnostic$NetworkErrorType", "", "LEvgenDiagnostic$NetworkErrorType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Http", "Ssl", "Connection", "Backend", "Parsing", "Unknown", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EvgenDiagnostic$NetworkErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenDiagnostic$NetworkErrorType[] $VALUES;
    public static final EvgenDiagnostic$NetworkErrorType Backend;
    public static final EvgenDiagnostic$NetworkErrorType Connection;
    public static final EvgenDiagnostic$NetworkErrorType Http;
    public static final EvgenDiagnostic$NetworkErrorType Parsing;
    public static final EvgenDiagnostic$NetworkErrorType Ssl;
    public static final EvgenDiagnostic$NetworkErrorType Unknown;
    private final String eventValue;

    static {
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType = new EvgenDiagnostic$NetworkErrorType("Http", 0, "http");
        Http = evgenDiagnostic$NetworkErrorType;
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType2 = new EvgenDiagnostic$NetworkErrorType("Ssl", 1, "ssl");
        Ssl = evgenDiagnostic$NetworkErrorType2;
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType3 = new EvgenDiagnostic$NetworkErrorType("Connection", 2, "connection");
        Connection = evgenDiagnostic$NetworkErrorType3;
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType4 = new EvgenDiagnostic$NetworkErrorType("Backend", 3, "backend");
        Backend = evgenDiagnostic$NetworkErrorType4;
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType5 = new EvgenDiagnostic$NetworkErrorType("Parsing", 4, "parsing");
        Parsing = evgenDiagnostic$NetworkErrorType5;
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType6 = new EvgenDiagnostic$NetworkErrorType("Unknown", 5, "unknown");
        Unknown = evgenDiagnostic$NetworkErrorType6;
        EvgenDiagnostic$NetworkErrorType[] evgenDiagnostic$NetworkErrorTypeArr = {evgenDiagnostic$NetworkErrorType, evgenDiagnostic$NetworkErrorType2, evgenDiagnostic$NetworkErrorType3, evgenDiagnostic$NetworkErrorType4, evgenDiagnostic$NetworkErrorType5, evgenDiagnostic$NetworkErrorType6};
        $VALUES = evgenDiagnostic$NetworkErrorTypeArr;
        $ENTRIES = a.a(evgenDiagnostic$NetworkErrorTypeArr);
    }

    public EvgenDiagnostic$NetworkErrorType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenDiagnostic$NetworkErrorType valueOf(String str) {
        return (EvgenDiagnostic$NetworkErrorType) Enum.valueOf(EvgenDiagnostic$NetworkErrorType.class, str);
    }

    public static EvgenDiagnostic$NetworkErrorType[] values() {
        return (EvgenDiagnostic$NetworkErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
