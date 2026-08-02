package xsna;

import android.content.Context;
import android.net.Uri;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xbv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ xbv(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        q2h0 q2h0Var;
        String A;
        Uri g;
        JSONObject optJSONObject;
        String A2;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, context.getString(R.string.accessibility_navigation_drawer));
                qgi0.r(tgi0Var, "home_fragment_top_bar_tag_avatar");
                return s3q0.a;
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("bank_launch_extra")) != null && (A2 = f370.A("packageName", optJSONObject)) != null) {
                    String A3 = f370.A("activityName", optJSONObject);
                    String A4 = f370.A("deeplinkScheme", optJSONObject);
                    if (A3 != null) {
                        q2h0Var = new s2h0(A2, A3);
                    } else if (A4 != null) {
                        q2h0Var = new r2h0(A2, A4);
                    }
                    if (jSONObject != null || (A = f370.A("sbp_link", jSONObject)) == null || (g = jeq0.g(A)) == null) {
                        return null;
                    }
                    context.startActivity(a3h0.a(q2h0Var, g).setFlags(268435456));
                    w9y w9yVar = new w9y();
                    w9yVar.b(Boolean.TRUE, "result");
                    s3q0 s3q0Var = s3q0.a;
                    r3y.c("VKWebAppSelectSbpBank");
                    r3y.c("VKWebAppOpenSbpLinkBank");
                    return w9yVar.a;
                }
                q2h0Var = null;
                return jSONObject != null ? null : null;
            default:
                awt0.f((am) obj, context, R.string.vk_accessibility_scroll_to_top);
                return s3q0.a;
        }
    }
}
