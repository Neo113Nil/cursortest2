package xsna;

import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import xsna.duy0;
import xsna.jpy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mxy0 implements duy0.b {
    public final bjy0 a;
    public final jpy0.a b;
    public final ocz0 c;
    public izy0 d;
    public suy0 e;
    public fvy0 f;
    public int g = 0;
    public final a h = new a(new mhz0(this, 1), new hkc0(this, 13), new oq80(this, 17));
    public final a i = new a(new hv1(this, 25), null, null);

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final Runnable a;
        public final t8z0 b;
        public final t8z0 c;
        public int d = 0;
        public tnf e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [xsna.uga0] */
        public a(Runnable runnable, hkc0 hkc0Var, oq80 oq80Var) {
            this.a = runnable;
            ?? uga0Var = new uga0(10);
            this.b = hkc0Var == null ? uga0Var : hkc0Var;
            this.c = oq80Var == null ? uga0Var : oq80Var;
        }

        public final void a(String str) {
            int i = this.d;
            if (i == 3) {
                return;
            }
            if (i == 2 || i == 1) {
                this.d = 3;
                this.c.accept(str);
                return;
            }
            this.d = 3;
            tnf tnfVar = this.e;
            if (tnfVar != null) {
                o8z0.g.removeCallbacks(tnfVar);
                this.e = null;
            }
            this.b.accept(str);
        }
    }

    public mxy0(ocz0 ocz0Var, jpy0.a aVar, Context context) {
        this.c = ocz0Var;
        this.b = aVar;
        this.a = new bjy0(context, this, this, new b(this, ocz0Var.S));
    }

    public final void a() {
        ocz0 ocz0Var = this.c;
        fiz0 d = wn4.d(ocz0Var.T.c ? new viy0(64, new y9z0()) : new akz0());
        Context context = this.a.getContext();
        jpy0 jpy0Var = jpy0.this;
        mxy0 mxy0Var = jpy0Var.c;
        if (mxy0Var != null && mxy0Var.g == 1) {
            jpy0Var.e = true;
        }
        jpy0Var.d.c(jpy0Var.a, 2, d, context);
        int i = this.g;
        xey0 xey0Var = i != 1 ? i != 2 ? null : ocz0Var.Z : ocz0Var.W;
        if (xey0Var != null) {
            e5z0 e5z0Var = xey0Var.a;
            if (h8z0.a != null) {
                b6z0 j = e5z0Var.j("ctaClick");
                if (j.c.isEmpty()) {
                    return;
                }
                h8z0.a.a(j, null, 2, null);
            }
        }
    }

    public final void b() {
        if (this.g != 1) {
            return;
        }
        izy0 izy0Var = this.d;
        if (izy0Var != null) {
            izy0Var.h();
        }
        suy0 suy0Var = this.e;
        if (suy0Var != null) {
            suy0Var.d();
        }
        ipy0 ipy0Var = this.c.Z;
        if (ipy0Var == null) {
            return;
        }
        e5z0 e5z0Var = ipy0Var.a;
        this.g = 2;
        a aVar = this.i;
        if (aVar.d == 0) {
            aVar.d = 3;
        }
        tnf tnfVar = aVar.e;
        if (tnfVar != null) {
            o8z0.g.removeCallbacks(tnfVar);
            aVar.e = null;
        }
        bjy0 bjy0Var = this.a;
        bjy0Var.f.setVisibility(8);
        bjy0Var.e.setVisibility(0);
        zvy0 postView = bjy0Var.getPostView();
        ImageView iconView = postView.getIconView();
        TextView titleView = postView.getTitleView();
        Button ctaButton = postView.getCtaButton();
        kiw kiwVar = ipy0Var.u;
        if (kiwVar != null) {
            o2z0.e(kiwVar, iconView, null);
        }
        titleView.setText(ipy0Var.f);
        titleView.setMaxLines(5);
        titleView.setGravity(17);
        ctaButton.setText(ipy0Var.n());
        ctaButton.setOnClickListener(new v01(this, 15));
        zvy0 zvy0Var = bjy0Var.c;
        if (zvy0Var.getParent() == null) {
            bjy0Var.b.setInteractionEnabled(false);
            bjy0Var.g.addView(zvy0Var, -1, -1);
        }
        izy0 b2 = izy0.b(ipy0Var.b, e5z0Var, null);
        this.d = b2;
        b2.f(postView);
        suy0 a2 = suy0.a(e5z0Var, null);
        this.e = a2;
        a2.b(postView);
        this.e.c();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b extends uxy0 {
        public final mxy0 a;
        public final wey0 b;

        public b(mxy0 mxy0Var, wey0 wey0Var) {
            this.a = mxy0Var;
            this.b = wey0Var;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.a.a.getInteractiveView().b.evaluateJavascript("(function(){if(window.__mtPlayableReadyHooked){return;}window.__mtPlayableReadyHooked=true;function n(){if(window.myTargetPlayableAds&&window.myTargetPlayableAds.onWindowLoaded){window.myTargetPlayableAds.onWindowLoaded();}}if(document.readyState==='complete'){n();}else{window.addEventListener('load',n);}})();", null);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.a.h.a(str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!this.b.c) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            this.a.a();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.a.h.a(webResourceError.getDescription().toString());
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (this.b.c) {
                this.a.a();
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
