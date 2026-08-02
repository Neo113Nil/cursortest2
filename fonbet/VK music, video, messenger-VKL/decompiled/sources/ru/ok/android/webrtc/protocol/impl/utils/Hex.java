package ru.ok.android.webrtc.protocol.impl.utils;

import java.nio.charset.StandardCharsets;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes9.dex */
public class Hex {
    public static final byte[] a = "0123456789ABCDEF".getBytes(StandardCharsets.US_ASCII);

    public static byte[] toBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static String toString(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            byte[] bArr3 = a;
            bArr2[i2] = bArr3[(b & 255) >>> 4];
            bArr2[i2 + 1] = bArr3[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }
}
