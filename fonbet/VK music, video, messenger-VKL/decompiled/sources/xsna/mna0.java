package xsna;

import org.json.JSONObject;

/* compiled from: PinSetRequest.kt */
/* loaded from: classes6.dex */
public final class mna0 extends v2c<nna0> {
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: PinSetRequest.kt */
    public static final class a extends a3c<nna0> {
        @Override // xsna.a3c
        public final nna0 c(JSONObject jSONObject) {
            return new nna0(jSONObject);
        }
    }

    public mna0(String str, String str2, String str3, cbv0 cbv0Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cbv0Var.c.f;
    }

    @Override // xsna.v2c
    public final ara<nna0> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.e;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        return super.i().put("code", this.b).put("pin", this.c).put("pin_forgot_id", this.d);
    }
}
