package com.vungle.ads.internal.ui.view;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import xsna.epx;
import xsna.oh;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class g implements Runnable {
    public final k a;

    public g(k kVar) {
        this.a = kVar;
    }

    public static final void a(g gVar) {
        gVar.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        webView = this.a.b;
        if (webView == null) {
            return;
        }
        if (!epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new oh(this, 17));
            return;
        }
        try {
            webView.onPause();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        try {
            webView.stopLoading();
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable unused2) {
        }
        try {
            webView.setWebChromeClient(null);
            s3q0 s3q0Var3 = s3q0.a;
        } catch (Throwable unused3) {
        }
        try {
            webView.setWebViewClient(new WebViewClient());
            s3q0 s3q0Var4 = s3q0.a;
        } catch (Throwable unused4) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    webView.setWebViewRenderProcessClient(null);
                    s3q0 s3q0Var5 = s3q0.a;
                } catch (Throwable unused5) {
                }
            }
            try {
                webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                s3q0 s3q0Var6 = s3q0.a;
            } catch (Throwable unused6) {
            }
            try {
                webView.clearHistory();
                s3q0 s3q0Var7 = s3q0.a;
            } catch (Throwable unused7) {
            }
            try {
                webView.removeAllViews();
                s3q0 s3q0Var8 = s3q0.a;
            } catch (Throwable unused8) {
            }
            try {
                this.a.removeAllViews();
                s3q0 s3q0Var9 = s3q0.a;
            } catch (Throwable unused9) {
            }
            try {
                String eventId = this.a.getEventId();
                if (eventId != null) {
                    e0.a(eventId);
                    s3q0 s3q0Var10 = s3q0.a;
                }
            } catch (Throwable unused10) {
            }
            try {
                webView.destroy();
                s3q0 s3q0Var11 = s3q0.a;
            } catch (Throwable unused11) {
            }
            this.a.b = null;
        } catch (Throwable th) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Destroy webview: ");
            a.append(th.getMessage());
            t.b("MRAIDAdWidget", a.toString());
        }
    }
}
