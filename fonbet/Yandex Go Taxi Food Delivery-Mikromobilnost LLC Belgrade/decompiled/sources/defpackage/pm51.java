package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.mt.antirobot.ServerException;
import ru.yandex.mt.antirobot.ServerNonFunctionalException;

/* loaded from: classes9.dex */
public final class pm51 {
    public final String a;
    public final pt51 b;
    public final d9 c;
    public final ktq0 d;
    public final Context e;
    public final Uri f = Uri.parse("https://narwhal.yandex.net");
    public final List g = scc.g(500, 502, 503, 504);

    public pm51(Context context, String str, pt51 pt51Var, d9 d9Var, ktq0 ktq0Var) {
        this.a = str;
        this.b = pt51Var;
        this.c = d9Var;
        this.d = ktq0Var;
        this.e = context.getApplicationContext();
    }

    public static long d(String str) {
        List W;
        W = evu0.W(str, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        int size = W.size();
        if (size == 3) {
            JSONObject jSONObject = new JSONObject(cvu0.q(Base64.decode((String) W.get(1), 10)));
            return jSONObject.getLong("expires_at_ms") - jSONObject.getLong("timestamp_ms");
        }
        w511.f(oyr.j(size, "Token chunks size is invalid (", Extension.C_BRAKE));
        return 0L;
    }

    public final void a(utq0 utq0Var) {
        if (utq0Var.a() == 200) {
            return;
        }
        int a = utq0Var.a();
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(utq0Var.b(), uza.a), 8192));
        try {
            jsonReader.beginObject();
            String str = null;
            while (jsonReader.hasNext()) {
                if (jl40.l(jsonReader.nextName(), "error")) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (str == null) {
                str = "Unknown error";
            }
            jsonReader.close();
            String str2 = a + Extension.COLON_SPACE + str;
            if (!this.g.contains(Integer.valueOf(utq0Var.a()))) {
                throw new ServerException(str2);
            }
            throw new ServerNonFunctionalException(str2);
        } finally {
        }
    }

    public final String b() {
        Uri build = this.f.buildUpon().path("android/playintegrity/generate_nonce").build();
        JSONObject jSONObject = new JSONObject(lza1.e(new Pair(CommonUrlParts.APP_ID, this.a), new Pair("uuid", ((kb20) this.b.b).b())));
        utq0 a = this.d.a(build.toString(), jSONObject.toString());
        a(a);
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(a.b(), uza.a), 8192));
        try {
            jsonReader.beginObject();
            String str = null;
            while (jsonReader.hasNext()) {
                if (jl40.l(jsonReader.nextName(), "nonce")) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Server nonce is not found");
            }
            jsonReader.close();
            return str;
        } finally {
        }
    }

    public final wtq0 c(String str) {
        utq0 a = this.d.a(this.f.buildUpon().path("android/playintegrity/authenticate").build().toString(), new JSONObject(lza1.e(new Pair(CommonUrlParts.APP_ID, this.a), new Pair("attestation", str), new Pair("uuid", ((kb20) this.b.b).b()))).toString());
        a(a);
        InputStream b = a.b();
        d9 d9Var = this.c;
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(b, uza.a), 8192));
        try {
            jsonReader.beginObject();
            String str2 = null;
            while (jsonReader.hasNext()) {
                if (jl40.l(jsonReader.nextName(), AuthSdkActivity.RESPONSE_TYPE_TOKEN)) {
                    str2 = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (str2 == null || str2.length() == 0) {
                throw new IllegalArgumentException("Server token is not found");
            }
            wtq0 wtq0Var = new wtq0(str2, ((Number) d9Var.invoke()).longValue(), d(str2));
            jsonReader.close();
            return wtq0Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(jsonReader, th);
                throw th2;
            }
        }
    }
}
