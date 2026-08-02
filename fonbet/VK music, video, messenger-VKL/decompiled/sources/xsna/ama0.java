package xsna;

import org.json.JSONObject;

/* compiled from: PinForgotRequest.kt */
/* loaded from: classes6.dex */
public final class ama0 extends v2c<bma0> {
    public final String b;

    /* compiled from: PinForgotRequest.kt */
    public static final class a extends a3c<bma0> {
        @Override // xsna.a3c
        public final bma0 c(JSONObject jSONObject) {
            return new bma0(jSONObject);
        }
    }

    public ama0(cbv0 cbv0Var) {
        this.b = cbv0Var.c.h;
    }

    @Override // xsna.v2c
    public final ara<bma0> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.b;
    }
}
