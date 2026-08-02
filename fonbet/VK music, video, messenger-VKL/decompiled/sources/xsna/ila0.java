package xsna;

import org.json.JSONObject;

/* compiled from: PinCheckCode.kt */
/* loaded from: classes6.dex */
public final class ila0 extends v2c<jla0> {
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: PinCheckCode.kt */
    public static final class a extends a3c<jla0> {
        @Override // xsna.a3c
        public final jla0 c(JSONObject jSONObject) {
            return new jla0(jSONObject);
        }
    }

    public ila0(String str, String str2, cbv0 cbv0Var) {
        this.b = str;
        this.c = str2;
        this.d = cbv0Var.c.b;
    }

    @Override // xsna.v2c
    public final ara<jla0> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.d;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        return super.i().put("code", this.b).put("pin_forgot_id", this.c);
    }
}
