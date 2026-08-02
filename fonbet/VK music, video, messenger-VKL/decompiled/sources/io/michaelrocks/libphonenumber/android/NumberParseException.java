package io.michaelrocks.libphonenumber.android;

/* loaded from: classes8.dex */
public class NumberParseException extends Exception {
    private ErrorType errorType;
    private String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType INVALID_COUNTRY_CODE;
        public static final ErrorType NOT_A_NUMBER;
        public static final ErrorType TOO_LONG;
        public static final ErrorType TOO_SHORT_AFTER_IDD;
        public static final ErrorType TOO_SHORT_NSN;

        static {
            ErrorType errorType = new ErrorType("INVALID_COUNTRY_CODE", 0);
            INVALID_COUNTRY_CODE = errorType;
            ErrorType errorType2 = new ErrorType("NOT_A_NUMBER", 1);
            NOT_A_NUMBER = errorType2;
            ErrorType errorType3 = new ErrorType("TOO_SHORT_AFTER_IDD", 2);
            TOO_SHORT_AFTER_IDD = errorType3;
            ErrorType errorType4 = new ErrorType("TOO_SHORT_NSN", 3);
            TOO_SHORT_NSN = errorType4;
            ErrorType errorType5 = new ErrorType("TOO_LONG", 4);
            TOO_LONG = errorType5;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5};
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public NumberParseException(ErrorType errorType, String str) {
        super(str);
        this.message = str;
        this.errorType = errorType;
    }

    public final ErrorType d() {
        return this.errorType;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.errorType + ". " + this.message;
    }
}
