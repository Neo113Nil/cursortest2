package defpackage;

import defpackage.c3f;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class cwk0 {
    public static final vit a;

    static {
        mcx mcxVar = new mcx();
        nt3 nt3Var = nt3.a;
        mcxVar.a(cwk0.class, nt3Var);
        mcxVar.a(e84.class, nt3Var);
        a = new vit(24, mcxVar);
    }

    public static e84 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new e84(string, string2, string3, string4, j);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();

    public final c3f.e.d.AbstractC0026e g() {
        o54 o54Var = new o54();
        q54 q54Var = new q54();
        q54Var.c(f());
        q54Var.b(d());
        o54Var.a = q54Var.a();
        o54Var.b(b());
        o54Var.c(c());
        o54Var.d(e());
        return o54Var.a();
    }
}
