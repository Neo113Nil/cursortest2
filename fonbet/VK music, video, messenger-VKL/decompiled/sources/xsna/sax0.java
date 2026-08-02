package xsna;

import org.json.JSONObject;

/* compiled from: WalletCreateRequest.kt */
/* loaded from: classes6.dex */
public final class sax0 extends v2c<fku0> {
    public final String b;
    public final String c;

    /* compiled from: WalletCreateRequest.kt */
    public static final class a extends a3c<fku0> {
        @Override // xsna.a3c
        public final fku0 c(JSONObject jSONObject) {
            return new fku0(jSONObject);
        }
    }

    public sax0(String str, cbv0 cbv0Var) {
        this.b = str;
        this.c = cbv0Var.c.j;
    }

    @Override // xsna.v2c
    public final ara<fku0> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.c;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        return super.i().put("pin", this.b);
    }
}
