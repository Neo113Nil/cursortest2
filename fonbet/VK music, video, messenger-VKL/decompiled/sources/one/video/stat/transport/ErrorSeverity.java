package one.video.stat.transport;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorSeverity.kt */
/* loaded from: classes8.dex */
public final class ErrorSeverity {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ErrorSeverity[] $VALUES;
    public static final ErrorSeverity CRITICAL;
    public static final ErrorSeverity INFORMATIVE;
    private final String value;

    static {
        ErrorSeverity errorSeverity = new ErrorSeverity("INFORMATIVE", 0, "informative");
        INFORMATIVE = errorSeverity;
        ErrorSeverity errorSeverity2 = new ErrorSeverity("CRITICAL", 1, "critical");
        CRITICAL = errorSeverity2;
        ErrorSeverity[] errorSeverityArr = {errorSeverity, errorSeverity2};
        $VALUES = errorSeverityArr;
        $ENTRIES = new asp(errorSeverityArr);
    }

    public ErrorSeverity(String str, int i, String str2) {
        this.value = str2;
    }

    public static ErrorSeverity valueOf(String str) {
        return (ErrorSeverity) Enum.valueOf(ErrorSeverity.class, str);
    }

    public static ErrorSeverity[] values() {
        return (ErrorSeverity[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
