package xsna;

import android.os.Build;
import org.json.JSONObject;

/* compiled from: TokenCreateRequest.kt */
/* loaded from: classes6.dex */
public final class x1p0 extends v2c<y1p0> {
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: TokenCreateRequest.kt */
    public static final class a extends a3c<y1p0> {
        @Override // xsna.a3c
        public final y1p0 c(JSONObject jSONObject) {
            return new y1p0(jSONObject);
        }
    }

    public x1p0(String str, String str2, cbv0 cbv0Var) {
        this.b = str;
        this.c = str2;
        this.d = cbv0Var.c.i;
    }

    @Override // xsna.v2c
    public final ara<y1p0> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.d;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        return super.i().put("platform", "android").put("pin", this.b).put("device_name", Build.MODEL).put("device_id", this.c);
    }
}
