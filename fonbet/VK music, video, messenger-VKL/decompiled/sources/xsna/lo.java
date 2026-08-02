package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: AccountHasMessagesInLastTwoWeekCmd.kt */
/* loaded from: classes2.dex */
public final class lo extends le6<Boolean> {

    /* compiled from: AccountHasMessagesInLastTwoWeekCmd.kt */
    public static final class a implements k7r0<Boolean> {
        public static final a b = new a();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return Boolean.valueOf(optJSONObject != null ? optJSONObject.optBoolean("has_messages_in_last_two_week", false) : false);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.c = "account.getInfo";
        aVar.b("fields", "has_messages_in_last_two_week");
        return (Boolean) bz2.f(new ij20(aVar), a.b);
    }

    public final boolean equals(Object obj) {
        return obj instanceof lo;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AccountHasMessagesInLastTwoWeekCmd";
    }
}
