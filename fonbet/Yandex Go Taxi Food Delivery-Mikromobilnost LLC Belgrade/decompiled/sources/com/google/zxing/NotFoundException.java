package com.google.zxing;

/* loaded from: classes11.dex */
public final class NotFoundException extends ReaderException {
    public static final NotFoundException c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        c = notFoundException;
        notFoundException.setStackTrace(ReaderException.b);
    }

    public static NotFoundException a() {
        return ReaderException.a ? new NotFoundException() : c;
    }
}
