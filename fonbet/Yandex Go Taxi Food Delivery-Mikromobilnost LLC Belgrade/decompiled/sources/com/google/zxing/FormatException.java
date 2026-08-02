package com.google.zxing;

/* loaded from: classes11.dex */
public final class FormatException extends ReaderException {
    public static final FormatException c;

    static {
        FormatException formatException = new FormatException();
        c = formatException;
        formatException.setStackTrace(ReaderException.b);
    }

    public static FormatException a() {
        return ReaderException.a ? new FormatException() : c;
    }
}
