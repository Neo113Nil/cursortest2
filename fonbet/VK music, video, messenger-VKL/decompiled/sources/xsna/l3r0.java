package xsna;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public final class l3r0 {
    public static boolean a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.limit() - byteBuffer.position() >= bArr.length) {
            for (int i = 0; i < bArr.length; i++) {
                if (byteBuffer.get(byteBuffer.position() + i) == bArr[i]) {
                }
            }
            byteBuffer.position(byteBuffer.position() + bArr.length);
            return true;
        }
        return false;
    }

    public static String b(int i, int i2, byte[] bArr) {
        if (i >= bArr.length) {
            return "";
        }
        if (i2 > bArr.length - i) {
            i2 = bArr.length - i;
        }
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = i; i3 < i + i2; i3++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i3])));
        }
        return sb.toString();
    }

    public static String c(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        messageDigest.update(str.getBytes(C.ASCII_NAME));
        byte[] digest = messageDigest.digest();
        return b(0, digest.length, digest);
    }
}
