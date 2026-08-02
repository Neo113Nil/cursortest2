package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;
import xsna.pn9;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class k extends RelativeLayout {
    public final String a;
    public WebView b;
    public final Lazy c;
    public h d;
    public f e;
    public i f;

    public /* synthetic */ k(Context context) {
        this(context, null);
    }

    private final com.vungle.ads.internal.platform.f getPlatform() {
        return (com.vungle.ads.internal.platform.f) this.c.getValue();
    }

    public final void c() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setLayerType(((com.vungle.ads.internal.platform.c) getPlatform()).m() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void d() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.b;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final f getCloseDelegate$vungle_ads_release() {
        return this.e;
    }

    public final String getEventId() {
        return this.a;
    }

    public final h getOnViewTouchListener$vungle_ads_release() {
        return this.d;
    }

    public final i getOrientationDelegate$vungle_ads_release() {
        return this.f;
    }

    public final String getUrl() {
        WebView webView = this.b;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.b;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void setCloseDelegate(f fVar) {
        this.e = fVar;
    }

    public final void setCloseDelegate$vungle_ads_release(f fVar) {
        this.e = fVar;
    }

    public final void setOnViewTouchListener(h hVar) {
        this.d = hVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(h hVar) {
        this.d = hVar;
    }

    public final void setOrientation(int i) {
        i iVar = this.f;
        if (iVar != null) {
            ((com.vungle.ads.internal.ui.j) iVar).a.setRequestedOrientation(i);
        }
    }

    public final void setOrientationDelegate(i iVar) {
        this.f = iVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(i iVar) {
        this.f = iVar;
    }

    public k(Context context, String str) {
        super(context);
        this.a = str;
        this.c = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new j(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView a = a0.a(context, str);
        this.b = a;
        if (a != null) {
            a.setLayoutParams(layoutParams);
        }
        WebView webView = this.b;
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(this.b, layoutParams);
        a();
        c();
    }

    public final void a() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setOnTouchListener(new pn9(this, 2));
        }
    }

    public final void b() {
        WebView webView = this.b;
        if (webView != null) {
            webView.onPause();
        }
    }

    public static final boolean a(k kVar, View view, MotionEvent motionEvent) {
        h hVar = kVar.d;
        if (hVar != null) {
            return hVar.onTouch(motionEvent);
        }
        return false;
    }

    public final void a(z zVar, f0 f0Var) {
        WebView webView = this.b;
        if (webView != null) {
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            webView.setWebViewClient(zVar);
        }
    }

    public final void a(String str) {
        boolean z = u.a;
        t.a("MRAIDAdWidget", "loadUrl: ".concat(str));
        WebView webView = this.b;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public final void a(long j) {
        try {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        try {
            removeAllViews();
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable unused2) {
        }
        if (j <= 0) {
            new g(this).run();
        } else {
            new com.vungle.ads.internal.util.o().a(new g(this), j);
        }
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}
