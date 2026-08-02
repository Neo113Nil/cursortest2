package xsna;

import org.json.JSONObject;

/* compiled from: ApiMethodExtension.kt */
/* loaded from: classes2.dex */
public final class ez2 extends rsg0<Object> {
    public final mom0<Object, Object> s;
    public final String t;
    public final /* synthetic */ xy2<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(xy2 xy2Var, String str) {
        super(str);
        this.u = xy2Var;
        this.s = new mom0<>(xy2Var.e(), new yp1(1, this, ez2.class, "parse", "parse(Lorg/json/JSONObject;)Ljava/lang/Object;", 0, 1), new bod(2));
        this.t = "5.208";
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.u.a().e(new wwx(jSONObject));
    }

    @Override // xsna.oer0, xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return this.s.a(qrj0Var, qrj0Var2);
    }

    @Override // xsna.xz2
    public final String k() {
        return this.t;
    }
}
