package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import okhttp3.t;
import org.json.JSONObject;

/* compiled from: GetMerchantSignature.kt */
/* loaded from: classes6.dex */
public final class qst extends nx2<String> {
    public final wr90 b;
    public final cbv0 c;

    public qst(wr90 wr90Var, cbv0 cbv0Var) {
        this.b = wr90Var;
        this.c = cbv0Var;
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        String jSONObject = this.b.a().toString();
        String str = this.c.c.a;
        t.a aVar = okhttp3.t.Companion;
        okhttp3.m mVar = hbv0.a;
        aVar.getClass();
        JSONObject jSONObject2 = uu2.a(l7r0Var.i(), new alv(str, 0L, 0, 0, t.a.a(jSONObject, mVar), null, 46), null).a;
        if (jSONObject2 == null) {
            throw new VKApiException("Response returned null instead of valid string response");
        }
        String optString = jSONObject2.optString("root_response");
        return optString == null ? jSONObject2.toString() : optString;
    }
}
