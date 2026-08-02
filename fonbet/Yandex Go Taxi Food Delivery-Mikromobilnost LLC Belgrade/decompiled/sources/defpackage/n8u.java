package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes11.dex */
public abstract class n8u {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final n6e0 b = new n6e0(4);

    public static String a(Object... objArr) {
        n6e0 n6e0Var = b;
        try {
            MessageDigest messageDigest = (MessageDigest) n6e0Var.a();
            if (messageDigest == null) {
                messageDigest = MessageDigest.getInstance("MD5");
            }
            for (Object obj : objArr) {
                if (obj != null) {
                    messageDigest.update(obj.toString().getBytes());
                }
            }
            byte[] digest = messageDigest.digest();
            n6e0Var.a0(messageDigest);
            if (digest == null) {
                return "";
            }
            char[] cArr = new char[digest.length * 2];
            for (int i = 0; i < digest.length; i++) {
                byte b2 = digest[i];
                int i2 = i * 2;
                char[] cArr2 = a;
                cArr[i2] = cArr2[(b2 & 255) >>> 4];
                cArr[i2 + 1] = cArr2[b2 & PKIBody._CCP];
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
