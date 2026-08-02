package xsna;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.core.preference.Preference;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: IidStore.java */
/* loaded from: classes13.dex */
public final class gwv {
    public static final String[] c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gwv(@NonNull vhr vhrVar) {
        vhrVar.a();
        this.a = Preference.h(vhrVar.a, 0, "com.google.android.gms.appid");
        vhrVar.a();
        ejr ejrVar = vhrVar.c;
        String str = ejrVar.e;
        if (str == null) {
            vhrVar.a();
            str = ejrVar.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.b = str;
    }

    @Nullable
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

    @Nullable
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
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & AmfConstants.TYPE_XML_DOCUMENT_MARKER) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return str;
        }
    }

    @Nullable
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
                    String string = this.a.getString("|T|" + this.b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str = new JSONObject(string).getString("token");
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
