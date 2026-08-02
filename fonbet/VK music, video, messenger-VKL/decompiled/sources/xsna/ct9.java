package xsna;

import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import org.json.JSONObject;

/* compiled from: CardDeleteRequest.kt */
/* loaded from: classes6.dex */
public final class ct9 extends v2c<dt9> {
    public final String b;
    public final String c;

    /* compiled from: CardDeleteRequest.kt */
    public static final class a extends a3c<dt9> {
        @Override // xsna.a3c
        public final dt9 c(JSONObject jSONObject) {
            return new dt9(jSONObject);
        }
    }

    public ct9(String str, cbv0 cbv0Var) {
        this.b = str;
        this.c = cbv0Var.c.e;
    }

    @Override // xsna.v2c
    public final ara<dt9> g(alv alvVar, l7r0 l7r0Var) {
        return new a(alvVar, l7r0Var);
    }

    @Override // xsna.v2c
    public final String getUrl() {
        return this.c;
    }

    @Override // xsna.v2c
    public final JSONObject i() {
        return super.i().put(DomainCampaignEx.KEY_BIND_ID, this.b);
    }
}
