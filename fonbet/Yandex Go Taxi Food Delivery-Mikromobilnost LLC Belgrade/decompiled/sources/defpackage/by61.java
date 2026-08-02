package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class by61 implements vh81 {
    @Override // defpackage.vh81
    public final String a(String str, JSONObject jSONObject) {
        String str2;
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        Charset charset = uza.a;
        try {
            str2 = new String(Base64.decode(optString.getBytes(charset), 0), charset);
        } catch (Exception unused) {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        yx61.e("Native Ad json has attribute with broken base64 encoding");
        return null;
    }
}
