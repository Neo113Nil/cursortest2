package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.vk.uxpolls.presentation.js.model.Detail;
import com.vk.uxpolls.presentation.js.model.VKWebAppEvent;
import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;

/* compiled from: WebViewExt.kt */
/* loaded from: classes6.dex */
public final class nix0 {
    public static final void a(WebView webView, VKWebAppEventData.VKWebAppUXPollsConfig vKWebAppUXPollsConfig) {
        u6g0 u6g0Var = znk0.n;
        if (u6g0Var == null) {
            u6g0Var = null;
        }
        webView.post(new l96(4, webView, zr.a("window.dispatchEvent(new CustomEvent('VKWebAppEvent', ", ((Gson) u6g0Var.f.getValue()).toJson(new VKWebAppEvent(new Detail(vKWebAppUXPollsConfig.a, vKWebAppUXPollsConfig))), "));")));
    }

    public static final void b(WebView webView, Integer num) {
        if (num != null) {
            if (webView.getMeasuredHeight() == 0) {
                int intValue = num.intValue();
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                layoutParams.height = intValue;
                webView.setLayoutParams(layoutParams);
                return;
            }
            if (webView.getMeasuredHeight() < num.intValue()) {
                ValueAnimator ofInt = ValueAnimator.ofInt(webView.getMeasuredHeight(), num.intValue());
                ofInt.addUpdateListener(new ys5(webView, 5));
                ofInt.setDuration(500L);
                ofInt.start();
            }
        }
    }
}
