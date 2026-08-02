package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelNotifyConfigGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class i7b extends nx2<Boolean> {

    /* compiled from: ChannelNotifyConfigGetApiCmd.kt */
    public static final class a implements k7r0<Boolean> {
        public static final a b = new a();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return Boolean.valueOf(optJSONObject != null ? optJSONObject.optBoolean("include_channel_notifications", true) : true);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "account.getInfo";
        aVar.b("fields", "include_channel_notifications");
        aVar.i = false;
        return (Boolean) l7r0Var.d(new ij20(aVar), a.b);
    }
}
