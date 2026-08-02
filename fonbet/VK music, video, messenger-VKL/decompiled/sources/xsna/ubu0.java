package xsna;

import android.os.Bundle;
import android.view.View;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;
import xsna.lvv0;

/* compiled from: VkAuthBrowserFragment.kt */
/* loaded from: classes15.dex */
public class ubu0 extends com.vk.superapp.browser.ui.a {
    public izs<? super lvv0, s3q0> S = new bjm0(this, 15);
    public final bpn0 T = new bpn0(new h6m0(this, 20));

    @Override // com.vk.superapp.browser.ui.a
    public final r6y Dn() {
        return new i7y(yn(), new egt0(this, 2), new mdm0(this, 21), new n3b0(this, 25));
    }

    @Override // com.vk.superapp.browser.ui.a
    public final void Hn(VkBrowserActivity.b bVar) {
        this.S = bVar;
    }

    @Override // com.vk.superapp.browser.ui.a, com.vk.superapp.base.js.bridge.VkUiView
    public final izs<lvv0, s3q0> ke() {
        return new mcj0(this, 25);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        a aVar = (a) this.T.getValue();
        if (z) {
            aVar.getClass();
        } else {
            aVar.f(aVar.a.getView());
        }
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((a) this.T.getValue()).b();
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((a) this.T.getValue()).c(view, false);
        mhy.d(view);
    }

    @Override // com.vk.superapp.browser.ui.a
    public final void tn() {
        mcj0 mcj0Var = new mcj0(this, 25);
        JSONObject jSONObject = new JSONObject();
        String optString = jSONObject.optString("text");
        String optString2 = jSONObject.optString("status");
        JSONObject optJSONObject = jSONObject.optJSONObject("payload");
        mcj0Var.invoke(new lvv0.c(optString, optString2, optJSONObject != null ? optJSONObject.toString() : null, jSONObject.optString(CommonUrlParts.REQUEST_ID)));
    }

    /* compiled from: VkAuthBrowserFragment.kt */
    public static final class a extends ecu0 {
        @Override // xsna.ecu0
        public final void g(boolean z) {
            super.g(z);
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            d(!dhr0.M());
        }

        @Override // xsna.ecu0
        public final void e(boolean z) {
        }
    }
}
