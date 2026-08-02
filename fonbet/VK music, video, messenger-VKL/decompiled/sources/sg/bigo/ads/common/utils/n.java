package sg.bigo.ads.common.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.ImageSizeKey;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* loaded from: classes9.dex */
public final class n {
    public static String a(String str) {
        byte[] bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str.getBytes(C.UTF8_NAME));
            bArr = messageDigest.digest();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArr = null;
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (i <= 15) {
                sb.append(0);
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString().toLowerCase();
    }

    public static String b(String str) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append(random.nextInt(99999999));
        sb.append(random.nextInt(99999999));
        while (sb.length() < 16) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        if (sb.length() > 16) {
            sb.delete(16, sb.length());
        }
        String a = a(str + ((Object) sb));
        if (r.a((CharSequence) a)) {
            sg.bigo.ads.bn.a.a(0, SameMD5.TAG, "md5WithSalt is empty!");
            return a;
        }
        char[] cArr = new char[48];
        for (int i = 0; i < 48; i++) {
            int i2 = i / 3;
            int i3 = i % 3;
            if (i3 == 0) {
                cArr[i] = a.charAt(i2 * 2);
            } else if (i3 != 1) {
                cArr[i] = a.charAt((i2 * 2) + 1);
            } else {
                cArr[i] = sb.charAt(i2);
            }
        }
        return new String(cArr);
    }
}
