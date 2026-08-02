package xsna;

import android.webkit.JavascriptInterface;
import com.vk.webapp.fragments.CommunityManageFragment;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CommunityManageFragment.kt */
/* loaded from: classes7.dex */
public final class u5h extends onx {
    public final h3j0 i0;
    public final gzs<s3q0> j0;
    public final Object k0;

    public u5h(CommunityManageFragment communityManageFragment, fvv0 fvv0Var, qnx qnxVar, CommunityManageFragment.d dVar) {
        super(fvv0Var, qnxVar);
        this.i0 = communityManageFragment;
        this.j0 = dVar;
        this.k0 = msy.a(LazyThreadSafetyMode.NONE, new te0(11));
    }

    @Override // xsna.r6y, xsna.x6y, xsna.q2y
    @JavascriptInterface
    public void VKWebAppClose(String str) {
        g3j0 f5;
        JSONObject jSONObject = new JSONObject(str);
        boolean f = epx.f(jSONObject.optString("status"), "error");
        h3j0 h3j0Var = this.i0;
        if (!f && h3j0Var.K7()) {
            jSONObject.put("status", "success");
        }
        if (h3j0Var.If() && (f5 = h3j0Var.f5()) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", f5.a);
            jSONObject2.put("isSuccess", f5.b);
            jSONObject2.put("shouldShowSnackBar", true);
            s3q0 s3q0Var = s3q0.a;
            jSONObject.put("payload", jSONObject2);
        }
        super.VKWebAppClose(jSONObject.toString());
        this.j0.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @JavascriptInterface
    public final void VkWebAppGroupMenuPatch(String str) {
        if (((Boolean) this.k0.getValue()).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean optBoolean = jSONObject.optBoolean("is_success");
                String optString = jSONObject.optString("type");
                h3j0 h3j0Var = this.i0;
                if (optBoolean) {
                    h3j0Var.p7();
                }
                if (jSONObject.optBoolean("is_direct_link") && myc0.f(optString)) {
                    h3j0Var.ld(true);
                    h3j0Var.N9(new g3j0(optString, optBoolean));
                } else {
                    h3j0Var.N9(null);
                    h3j0Var.ld(false);
                }
            } catch (JSONException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
    }
}
