package androidx.media3.common;

import defpackage.oyr;
import java.io.IOException;

/* loaded from: classes10.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(int i, String str, Throwable th, boolean z) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(1, str, runtimeException, true);
    }

    public static ParserException b(Exception exc, String str) {
        return new ParserException(4, str, exc, true);
    }

    public static ParserException c(String str) {
        return new ParserException(1, str, null, false);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        return oyr.m(this.dataType, "}", sb);
    }
}
