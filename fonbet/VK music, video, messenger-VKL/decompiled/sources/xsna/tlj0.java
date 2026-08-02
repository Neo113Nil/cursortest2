package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import org.json.JSONObject;

/* compiled from: SignAnonymousTokenRequest.kt */
/* loaded from: classes14.dex */
public final class tlj0 extends ara<String> {
    public final /* synthetic */ l7r0 b;
    public final /* synthetic */ alv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlj0(alv alvVar, l7r0 l7r0Var) {
        super(l7r0Var);
        this.b = l7r0Var;
        this.c = alvVar;
    }

    @Override // xsna.ara
    public final String a(zqa zqaVar) {
        JSONObject jSONObject = uu2.a(this.b.i(), this.c, zqaVar).a;
        if (jSONObject != null) {
            return jSONObject.isNull("signed_token") ? "" : jSONObject.optString("signed_token");
        }
        throw new VKApiException("Response returned null instead of valid signed token response");
    }
}
