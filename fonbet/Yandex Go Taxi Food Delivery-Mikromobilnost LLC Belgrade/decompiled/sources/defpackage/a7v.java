package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.a;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.Cipher.GostCipher;

/* loaded from: classes11.dex */
public final class a7v {
    public static final String[] c = {"*", "FCM", GostCipher.STR_GCM_MODE, ""};
    public final SharedPreferences a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a7v(a aVar) {
        aVar.a();
        this.a = aVar.a.getSharedPreferences("com.google.android.gms.appid", 0);
        aVar.a();
        lcr lcrVar = aVar.c;
        String str = lcrVar.e;
        if (str == null) {
            aVar.a();
            str = lcrVar.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.b = str;
    }

    public final String a() {
        String string;
        synchronized (this.a) {
            try {
                synchronized (this.a) {
                    string = this.a.getString("|S|id", null);
                }
                if (string != null) {
                    return string;
                }
                return b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.a) {
            String str = null;
            String string = this.a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance(JCP.DIGEST_SHA1).digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & PKIBody._CCP) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return str;
        }
    }

    public final String c() {
        synchronized (this.a) {
            try {
                String[] strArr = c;
                int i = 0;
                while (true) {
                    String str = null;
                    if (i >= 4) {
                        return null;
                    }
                    String str2 = strArr[i];
                    String string = this.a.getString("|T|" + this.b + "|" + str2, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str = new JSONObject(string).getString(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
                            } catch (JSONException unused) {
                            }
                            string = str;
                        }
                        return string;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
