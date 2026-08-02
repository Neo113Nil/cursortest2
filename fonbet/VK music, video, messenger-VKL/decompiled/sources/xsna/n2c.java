package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PaymentData3DS;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PostData3DS;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PostParams3DS;
import com.vkontakte.android.R;
import java.io.Serializable;
import org.chromium.support_lib_boundary.util.Features;
import xsna.bbv0;

/* compiled from: Checkout3dsPaymentFragment.kt */
/* loaded from: classes6.dex */
public final class n2c extends bb6<k2c> implements iv5 {
    public ProgressBar i;

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        k2c k2cVar = (k2c) this.h;
        if (k2cVar != null) {
            return k2cVar.a0();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = requireArguments().getString("backstack_tag");
        bbv0.g.getClass();
        this.h = new o2c(this, string, bbv0.a.f().d);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_3ds_payment_fragment, viewGroup, false);
        this.i = (ProgressBar) inflate.findViewById(R.id.browser_loader_3ds);
        return inflate;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.i = null;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data") : null;
        PaymentData3DS paymentData3DS = serializable instanceof PaymentData3DS ? (PaymentData3DS) serializable : null;
        if (paymentData3DS == null) {
            throw new IllegalStateException("payment data cannot be null");
        }
        String d = paymentData3DS.d();
        VkCheckoutPayMethod g = paymentData3DS.g();
        PostData3DS h = paymentData3DS.h();
        if (h == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String d2 = h.d();
        View view2 = getView();
        final WebView webView = view2 != null ? (WebView) view2.findViewById(R.id.checkoutBrowserFragmentWebView) : null;
        if (webView == null) {
            throw new IllegalArgumentException("webview has not been initialized");
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebChromeClient(new m2c(this, webView));
        webView.setWebViewClient(new WebViewClient());
        gfx0 gfx0Var = e370.b;
        (gfx0Var != null ? gfx0Var : null).getClass();
        boolean M = dhr0.M();
        if (zq70.C(Features.FORCE_DARK)) {
            ohx0.a(webView.getSettings(), M ? 2 : 0);
        }
        PostParams3DS g2 = h.g();
        webView.postUrl(d2, new Uri.Builder().appendQueryParameter("MD", g2.d()).appendQueryParameter("PaReq", g2.g()).appendQueryParameter("TermUrl", g2.h()).toString().substring(1).getBytes(emb.b));
        webView.setOnKeyListener(new View.OnKeyListener() { // from class: xsna.l2c
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view3, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 4) {
                    return false;
                }
                WebView webView2 = webView;
                if (!webView2.canGoBack()) {
                    return false;
                }
                webView2.goBack();
                return true;
            }
        });
        k2c k2cVar = (k2c) this.h;
        if (k2cVar != null) {
            k2cVar.I1(g, d);
        }
    }
}
