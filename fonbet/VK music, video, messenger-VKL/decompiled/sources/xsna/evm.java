package xsna;

import com.vk.api.sdk.a;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.i5e0;
import xsna.k7r0;

/* compiled from: DialogsPromoLinkGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class evm extends nx2<i5e0> {

    /* compiled from: DialogsPromoLinkGetApiCmd.kt */
    public static final class a implements k7r0<i5e0> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.getJSONObject("response").optJSONObject(DatabaseHelper.ITEM_COLUMN_NAME);
            return optJSONObject != null ? new i5e0.a(optJSONObject.getString("feature_onboarding_id"), optJSONObject.getString("title"), optJSONObject.getString("text"), optJSONObject.getString("icon"), optJSONObject.getString("deeplink"), optJSONObject.getBoolean("is_new")) : i5e0.b.a;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    @Override // xsna.nx2
    public final i5e0 f(l7r0 l7r0Var) {
        a.C0374a c0374a = new a.C0374a();
        c0374a.c = "messages.getFeatureOnboarding";
        c0374a.d = l7r0Var.a.g;
        return (i5e0) l7r0Var.d(new com.vk.api.sdk.a(c0374a), new a());
    }
}
