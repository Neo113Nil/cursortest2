package ru.ok.tracer.base.http;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.OutputStream;
import java.nio.charset.Charset;
import xsna.emb;

/* compiled from: HttpMultipartBody.kt */
/* loaded from: classes9.dex */
public final class HttpMultipartBodyKt {
    private static final byte[] CRLF;
    private static final byte[] DASHDASH;

    static {
        Charset charset = emb.b;
        CRLF = "\r\n".getBytes(charset);
        DASHDASH = "--".getBytes(charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendQuoted(StringBuilder sb, String str) {
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == '\\' || charAt == '\r') {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == '\"' || charAt2 == '\\' || charAt2 == '\r') {
                        sb.append('\\');
                    }
                    sb.append(charAt2);
                }
                sb.append('\"');
            }
        }
        sb.append(str);
        sb.append('\"');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getUtf8Length(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            i += charAt <= 127 ? 1 : charAt <= 2047 ? 2 : 3;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeUtf8(OutputStream outputStream, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt <= 2047) {
                outputStream.write((charAt >> 6) | PsExtractor.AUDIO_STREAM);
                outputStream.write((charAt & '?') | 128);
            } else {
                outputStream.write((charAt >> '\f') | 224);
                outputStream.write(((charAt >> 6) & 63) | 128);
                outputStream.write((charAt & '?') | 128);
            }
        }
    }
}
