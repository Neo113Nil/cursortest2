package xsna;

import com.coremedia.iso.boxes.AuthorBox;
import org.json.JSONObject;

/* compiled from: PayOperationRequest.kt */
/* loaded from: classes6.dex */
public final class vr90 extends v2c<ur90> {
    public final wr90 b;
    public final String c;

    /* compiled from: PayOperationRequest.kt */
    public static final class a extends a3c<ur90> {
        @Override // xsna.a3c
        public final ur90 c(JSONObject jSONObject) {
            return new ur90(jSONObject);
        }
    }

    public vr90(wr90 wr90Var, cbv0 cbv0Var) {
        this.b = wr90Var;
        this.c = cbv0Var.c.g;
    }

    @Override // xsna.v2c
    public final ara<ur90> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.c;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        JSONObject a2 = this.b.a();
        x25 x25Var = r490.b;
        x25Var.getClass();
        return a2.put(AuthorBox.TYPE, new JSONObject().put("auth_data", x25Var.a).put("auth_sign", x25Var.b));
    }
}
