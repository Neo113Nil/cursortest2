package xsna;

import org.json.JSONException;
import org.json.JSONObject;
import xsna.ql5;

/* compiled from: RolloutAssignment.java */
/* loaded from: classes13.dex */
public abstract class rlg0 {
    public static final u8y a;

    static {
        v8y v8yVar = new v8y();
        gj5 gj5Var = gj5.a;
        v8yVar.registerEncoder(rlg0.class, gj5Var);
        v8yVar.registerEncoder(rn5.class, gj5Var);
        a = new u8y(v8yVar);
    }

    public static rn5 a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new rn5(string, string2, string3, string4, j);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();

    public final ql5 g() {
        ql5.a aVar = new ql5.a();
        String f = f();
        if (f == null) {
            throw new NullPointerException("Null variantId");
        }
        String d = d();
        if (d == null) {
            throw new NullPointerException("Null rolloutId");
        }
        aVar.a = new rl5(d, f);
        aVar.b(b());
        aVar.c(c());
        aVar.d(e());
        return aVar.a();
    }
}
