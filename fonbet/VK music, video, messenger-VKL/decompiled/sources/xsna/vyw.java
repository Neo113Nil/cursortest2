package xsna;

import org.json.JSONObject;

/* compiled from: InitRequest.kt */
/* loaded from: classes6.dex */
public final class vyw extends v2c<wyw> {
    public final String b;

    /* compiled from: InitRequest.kt */
    public static final class a extends a3c<wyw> {
        @Override // xsna.a3c
        public final wyw c(JSONObject jSONObject) {
            return new wyw(jSONObject);
        }
    }

    public vyw(cbv0 cbv0Var) {
        this.b = cbv0Var.c.d;
    }

    @Override // xsna.v2c
    public final ara<wyw> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.b;
    }
}
