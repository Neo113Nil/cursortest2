package defpackage;

import com.yandex.messenger.websdk.api.MessengerParams;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nax {
    public final hdu a;

    public nax(String str, MessengerParams messengerParams, e48 e48Var) {
        this.a = new hdu(e48Var, str);
    }

    public static String a(String[] strArr) {
        return strArr.length == 0 ? "" : oyr.p("console.log(", j73.L(strArr, Extension.FIX_SPACE, null, null, 62), ");");
    }

    public static String b(JSONObject jSONObject) {
        return "\n            var message = " + jSONObject + ";\n            " + a(new String[]{Constants.KEY_MESSAGE, "androidMessengerChannel"}) + "\n            androidMessengerChannel.port1.postMessage(message);\n        ";
    }
}
