package xsna;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessageStringCodingException;

/* compiled from: AbstractImmutableRawValue.java */
/* loaded from: classes8.dex */
public abstract class qe extends re implements qye0 {
    public static final char[] e = "0123456789ABCDEF".toCharArray();
    public final byte[] b;
    public volatile String c;
    public volatile CharacterCodingException d;

    public qe(String str) {
        this.c = str;
        this.b = str.getBytes(org.msgpack.core.b.a);
    }

    public static void N(String str, StringBuilder sb) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case 11:
                    default:
                        Q(charAt, sb);
                        break;
                    case '\f':
                        sb.append("\\f");
                        break;
                    case '\r':
                        sb.append("\\r");
                        break;
                }
            } else if (charAt <= 127) {
                if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt != '\\') {
                    sb.append(charAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (charAt < 55296 || charAt > 57343) {
                sb.append(charAt);
            } else {
                Q(charAt, sb);
            }
        }
        sb.append("\"");
    }

    public static void Q(int i, StringBuilder sb) {
        sb.append("\\u");
        char[] cArr = e;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public final byte[] O() {
        byte[] bArr = this.b;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void P() {
        synchronized (this.b) {
            if (this.c != null) {
                return;
            }
            try {
                CharsetDecoder newDecoder = org.msgpack.core.b.a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.c = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(t()).toString();
            } catch (CharacterCodingException e2) {
                try {
                    CharsetDecoder newDecoder2 = org.msgpack.core.b.a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.c = newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(t()).toString();
                    this.d = e2;
                } catch (CharacterCodingException e3) {
                    throw new MessageStringCodingException(e3);
                }
            }
        }
    }

    @Override // xsna.qye0
    public final String f() {
        if (this.c == null) {
            P();
        }
        if (this.d == null) {
            return this.c;
        }
        throw new MessageStringCodingException(this.d);
    }

    @Override // xsna.qye0
    public final ByteBuffer t() {
        return ByteBuffer.wrap(this.b).asReadOnlyBuffer();
    }

    @Override // xsna.kjr0
    public final String toJson() {
        StringBuilder sb = new StringBuilder();
        N(toString(), sb);
        return sb.toString();
    }

    public final String toString() {
        if (this.c == null) {
            P();
        }
        return this.c;
    }

    public qe(byte[] bArr) {
        this.b = bArr;
    }
}
