package xsna;

import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.vl8;

/* compiled from: Util.kt */
/* loaded from: classes11.dex */
public final class e {
    public static final vl8.c a = new vl8.c();
    public static final int b = -1234567890;

    public static final boolean a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder b2 = fp.b(j, "size=", " offset=");
            b2.append(j2);
            throw new ArrayIndexOutOfBoundsException(xy6.a(j3, " byteCount=", b2));
        }
    }

    public static final int c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long d(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final String e(byte b2) {
        char[] cArr = c.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER]});
    }
}
