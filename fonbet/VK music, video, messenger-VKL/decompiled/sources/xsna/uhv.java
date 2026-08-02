package xsna;

import com.vk.dto.common.ImageSizeKey;
import okio.ByteString;

/* compiled from: Http2.kt */
/* loaded from: classes11.dex */
public final class uhv {
    public static final uhv a = new uhv();
    public static final ByteString b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    static {
        ByteString byteString = new ByteString("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(emb.b));
        byteString.c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        b = byteString;
        c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        d = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = x2r0.h("%8s", Integer.toBinaryString(i)).replace(' ', ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = i5s.a(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = d;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = i5s.a(sb, strArr3[i4], "|PADDED");
        }
        int length = d.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = d;
            if (strArr4[i7] == null) {
                strArr4[i7] = e[i7];
            }
        }
    }

    public static String a(int i, int i2, int i3, int i4, boolean z) {
        String str;
        String[] strArr = c;
        String h = i3 < strArr.length ? strArr[i3] : x2r0.h("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr2 = e;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr2[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr3 = d;
                    String str2 = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : brm0.y(str2, "PRIORITY", "COMPRESSED") : brm0.y(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i4];
        }
        return x2r0.h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), h, str);
    }
}
