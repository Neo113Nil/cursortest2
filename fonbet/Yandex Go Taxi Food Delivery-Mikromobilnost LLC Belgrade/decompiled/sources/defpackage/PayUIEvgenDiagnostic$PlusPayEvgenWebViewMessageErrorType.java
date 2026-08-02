package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType", "", "LPayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CriticalError", "Unhandled", "ResponseUnhandled", "Parse", "Serialize", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType[] $VALUES;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType CriticalError;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType Parse;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType ResponseUnhandled;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType Serialize;
    public static final PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType Unhandled;
    private final String eventValue;

    static {
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType("CriticalError", 0, "criticalError");
        CriticalError = payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType2 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType("Unhandled", 1, "unhandled");
        Unhandled = payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType2;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType3 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType("ResponseUnhandled", 2, "responseUnhandled");
        ResponseUnhandled = payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType3;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType4 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType("Parse", 3, "parse");
        Parse = payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType4;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType5 = new PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType("Serialize", 4, "serialize");
        Serialize = payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType5;
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType[] payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorTypeArr = {payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType, payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType2, payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType3, payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType4, payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType5};
        $VALUES = payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorTypeArr;
        $ENTRIES = a.a(payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorTypeArr);
    }

    public PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType valueOf(String str) {
        return (PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType) Enum.valueOf(PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType.class, str);
    }

    public static PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType[] values() {
        return (PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
