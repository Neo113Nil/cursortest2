package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: BaseVkViewComponentProviderDelegate.kt */
/* loaded from: classes6.dex */
public abstract class ps6 implements qxv0 {
    public final fvv0 a;
    public final mfu0 b;
    public final xbt0 c;
    public final vg3 d;
    public final ykt0 e;
    public final mxv0 f;
    public ConstraintLayout g;
    public FrameLayout h;

    public ps6(fvv0 fvv0Var, mfu0 mfu0Var, xbt0 xbt0Var, vg3 vg3Var, ykt0 ykt0Var, mxv0 mxv0Var) {
        this.a = fvv0Var;
        this.b = mfu0Var;
        this.c = xbt0Var;
        this.d = vg3Var;
        this.e = ykt0Var;
        this.f = mxv0Var;
    }

    @Override // xsna.qxv0
    public final ViewGroup a() {
        return this.g;
    }

    @Override // xsna.qxv0
    public final View f(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.vk_ui_fragment_with_ad, viewGroup, false);
        this.h = (FrameLayout) constraintLayout.findViewById(R.id.browserView);
        FrameLayout frameLayout = (FrameLayout) constraintLayout.findViewById(R.id.video_fullscreen_container);
        g680 g680Var = (g680) this.e.invoke(frameLayout);
        mfu0 mfu0Var = this.b;
        ViewGroup p = mfu0Var.p(frameLayout, bundle, g680Var);
        if (p == null) {
            p = ((o0w0) this).h(layoutInflater, viewGroup, new i9(4));
            View findViewById = p.findViewById(R.id.vk_apps_error_retry);
            if (findViewById != null) {
                f4m.j(findViewById);
            }
        }
        ViewGroup viewGroup2 = p;
        this.f.te(bundle);
        ViewParent parent = viewGroup2.getParent();
        ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup3 != null) {
            viewGroup3.removeView(viewGroup2);
            Object obj = ((ggu0) this.c.c).b;
            String obj2 = obj instanceof f5z ? ((f5z) obj).getLifecycle().getCurrentState().toString() : DeviceInfo.STR_TYPE_UNKNOWN;
            boolean q = mfu0Var.getState().q();
            udx0 udx0Var = e370.i;
            (udx0Var != null ? udx0Var : null).c("BrowserViewNotDetached", pn00.m(new Pair("parent", qjg.a(viewGroup3)), new Pair("appId", String.valueOf(this.a.getAppId())), new Pair("lifecycleState", obj2), new Pair("fromCache", String.valueOf(q))));
        }
        ViewGroup viewGroup4 = this.h;
        if (viewGroup4 != null || (viewGroup4 = this.g) != null) {
            viewGroup4.addView(viewGroup2, 0);
        }
        s93 state = mfu0Var.getState();
        if (state.p() && !state.k()) {
            d3m.c(viewGroup2, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? new LinearInterpolator() : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.g = constraintLayout;
        return (View) this.d.invoke(constraintLayout, Boolean.FALSE);
    }

    @Override // xsna.qxv0
    public final void j(WebView webView) {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.addView(webView, 0);
            return;
        }
        ConstraintLayout constraintLayout = this.g;
        if (constraintLayout != null) {
            constraintLayout.addView(webView, 0);
        }
    }
}
