package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.ImageSizeKey;
import java.security.SecureRandom;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: XSRFTokenUtil.java */
/* loaded from: classes7.dex */
public final class e4y0 {
    public static final /* synthetic */ int a = 0;

    static {
        if (Preference.l().contains("xsrf_secret")) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            sb.append("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".charAt(secureRandom.nextInt(62)));
        }
        Preference.l().edit().putString("xsrf_secret", sb.toString()).commit();
    }

    public static String a(byte[] bArr) {
        String str = new String();
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            StringBuilder e = fw3.e(str);
            e.append(String.valueOf(cArr[(bArr[i] & 240) >> 4]));
            StringBuilder e2 = fw3.e(e.toString());
            e2.append(String.valueOf(cArr[bArr[i] & AmfConstants.TYPE_XML_DOCUMENT_MARKER]));
            str = e2.toString();
        }
        return str;
    }
}
