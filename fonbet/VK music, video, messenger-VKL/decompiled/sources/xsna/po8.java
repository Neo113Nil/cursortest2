package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: BusinessNotifyConfigGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class po8 extends nx2<Boolean> {
    public final boolean b;

    /* compiled from: BusinessNotifyConfigGetApiCmd.kt */
    public static final class a implements k7r0<Boolean> {
        public static final a b = new a();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return Boolean.valueOf((optJSONObject != null ? optJSONObject.optInt("business_notify_enabled", 0) : 0) == 1);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public po8(boolean z) {
        this.b = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "account.getInfo";
        aVar.b("fields", "business_notify");
        aVar.i = this.b;
        return (Boolean) l7r0Var.d(new ij20(aVar), a.b);
    }
}
