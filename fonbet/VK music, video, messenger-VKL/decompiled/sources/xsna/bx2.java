package xsna;

import org.json.JSONObject;

/* compiled from: ApiCallExt.kt */
/* loaded from: classes11.dex */
public final class bx2 extends rdx0<Object> {
    public final String u;
    public final /* synthetic */ jj90<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(String str, jj90<Object> jj90Var, String str2) {
        super(str2);
        this.v = jj90Var;
        this.u = str;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.v.a(jSONObject);
    }

    @Override // xsna.rdx0
    public final String n() {
        return this.u;
    }
}
