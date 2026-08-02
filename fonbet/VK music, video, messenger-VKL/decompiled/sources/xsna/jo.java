package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.im.engine.models.account.PrivacySetting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: AccountGetPrivacySettingsApiCmd.kt */
/* loaded from: classes2.dex */
public final class jo extends nx2<List<? extends PrivacySetting>> {
    public final List<String> b;
    public final boolean c;

    /* compiled from: AccountGetPrivacySettingsApiCmd.kt */
    public static final class a implements k7r0<List<? extends PrivacySetting>> {
        public static final a b = new a();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return sp.q(jSONObject.getJSONObject("response").getJSONArray("settings"));
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public jo(List list, boolean z) {
        this.b = list;
        this.c = z;
    }

    @Override // xsna.nx2
    public final List<? extends PrivacySetting> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "account.getPrivacySettings";
        aVar.b("privacy_keys", p4g.k(this.b, StringUtils.COMMA, null));
        aVar.b("need_default", "0");
        aVar.i = this.c;
        return (List) l7r0Var.d(new ij20(aVar), a.b);
    }
}
