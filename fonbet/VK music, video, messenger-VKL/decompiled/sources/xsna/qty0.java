package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.target.common.views.Html5View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.commons.http.Http;
import xsna.qty0;
import xsna.shv;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qty0 extends lyy0 {
    public static final /* synthetic */ int j = 0;
    public final f d;
    public a e;
    public h f;
    public g g;
    public boolean h;
    public boolean i;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a(WebView webView);

        void a(String str);

        void b();

        void f(String str);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            gu8.c(null, "BannerWebView$MyWebChromeClient: JS console message " + consoleMessage.message() + " at line " + consoleMessage.lineNumber());
            return false;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface d {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface e {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class f extends GestureDetector {
        public final qty0 a;
        public pu50 b;
        public e c;

        public f(Context context, qty0 qty0Var) {
            super(context, new GestureDetector.SimpleOnGestureListener());
            this.a = qty0Var;
            setIsLongpressEnabled(false);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface g {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface h {
    }

    public qty0(Context context) {
        super(context);
        f fVar = new f(getContext(), this);
        this.d = fVar;
        b bVar = new b();
        c cVar = new c();
        fVar.b = new pu50(this, 21);
        setOnTouchListener(new View.OnTouchListener() { // from class: xsna.pty0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                qty0 qty0Var;
                qty0.f fVar2 = qty0.this.d;
                fVar2.getClass();
                int action = motionEvent.getAction();
                if (action == 0) {
                    qty0.e eVar = fVar2.c;
                    if (eVar != null) {
                        ((Html5View.d) eVar).a.a();
                    }
                    fVar2.onTouchEvent(motionEvent);
                    return false;
                }
                if (action == 1) {
                    qty0.e eVar2 = fVar2.c;
                    if (eVar2 != null) {
                        ((Html5View.d) eVar2).a.b();
                    }
                    if (fVar2.b == null) {
                        gu8.c(null, "BannerWebView$ViewGestureDetector: View's onUserClick() is not registered");
                        return false;
                    }
                    gu8.c(null, "BannerWebView$ViewGestureDetector: Gestures - user clicked");
                    ((qty0) fVar2.b.c).i = true;
                    return false;
                }
                if (action != 2 || (qty0Var = fVar2.a) == null) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || x > qty0Var.getWidth() || y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || y > qty0Var.getHeight()) {
                    return false;
                }
                fVar2.onTouchEvent(motionEvent);
                return false;
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    public void setBannerWebViewListener(@Nullable a aVar) {
        this.e = aVar;
    }

    public void setData(@NonNull String str) {
        this.h = false;
        this.i = false;
        WebView webView = this.b;
        if (webView == null) {
            return;
        }
        try {
            webView.loadDataWithBaseURL("https://ad.mail.ru/", str, "text/html", C.UTF8_NAME, null);
        } catch (Throwable th) {
            lyy0.c(th);
        }
    }

    public void setForceMediaPlayback(boolean z) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.getSettings().setMediaPlaybackRequiresUserGesture(!z);
    }

    public void setUserMotionEventListener(@NonNull e eVar) {
        this.d.c = eVar;
    }

    public void setWebViewLoadingErrorListener(@NonNull g gVar) {
        this.g = gVar;
    }

    public void setWebViewLoadingStartListener(@NonNull h hVar) {
        this.f = hVar;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class c extends uxy0 {
        public final List a = Arrays.asList(-2, -6);

        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            qty0 qty0Var = qty0.this;
            if (qty0Var.h) {
                return;
            }
            qty0Var.h = true;
            gu8.c(null, "BannerWebView$MyWebViewClient: Page loaded");
            super.onPageFinished(webView, str);
            a aVar = qty0Var.e;
            if (aVar != null) {
                aVar.a(webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            gu8.c(null, "BannerWebView$MyWebViewClient: Load page started");
            super.onPageStarted(webView, str, bitmap);
            h hVar = qty0.this.f;
            if (hVar != null) {
                Html5View.g gVar = (Html5View.g) hVar;
                Html5View.this.e = 1;
                gVar.a.c(webView, str, bitmap);
                Html5View.e eVar = gVar.b;
                hhv hhvVar = new hhv(gVar, webView, str, 0);
                eVar.c = hhvVar;
                eVar.b.postDelayed(hhvVar, eVar.a);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            qjk0.a(kh10.a(i, "BannerWebView$MyWebViewClient: Load failed. Error - ", ", description - ", str, ", url - "), str2, null);
            super.onReceivedError(webView, i, str, str2);
            qty0 qty0Var = qty0.this;
            a aVar = qty0Var.e;
            if (aVar != null) {
                aVar.f(str != null ? str : "unknown JS error");
            }
            g gVar = qty0Var.g;
            if (gVar != null) {
                if (str == null) {
                    str = "Unknown loading error";
                }
                Html5View.f fVar = (Html5View.f) gVar;
                Html5View html5View = Html5View.this;
                if (html5View.e != 3) {
                    html5View.e = 3;
                    fVar.a.a(webView, new shv.a(i, str), str2);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            String reasonPhrase = webResourceResponse.getReasonPhrase();
            String str = reasonPhrase != null ? reasonPhrase.toString() : null;
            int statusCode = webResourceResponse.getStatusCode();
            String uri = webResourceRequest.getUrl().toString();
            qty0 qty0Var = qty0.this;
            if (qty0Var.g == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            g gVar = qty0Var.g;
            if (str == null) {
                str = "Unknown HTTP error";
            }
            Html5View.f fVar = (Html5View.f) gVar;
            Html5View html5View = Html5View.this;
            if (html5View.e != 3) {
                html5View.e = 3;
                fVar.a.a(webView, new shv.a(statusCode, str), uri);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            gu8.e(null, "WebView crashed");
            a aVar = qty0.this.e;
            if (aVar == null) {
                return true;
            }
            aVar.b();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            gu8.c(null, "BannerWebView$MyWebViewClient: Scale new - " + f2 + ", old - " + f);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            qty0 qty0Var = qty0.this;
            if (qty0Var.i && str != null) {
                a aVar = qty0Var.e;
                if (aVar != null) {
                    aVar.a(str);
                }
                qty0Var.i = false;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            qty0 qty0Var = qty0.this;
            if (!qty0Var.i || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            String uri = url.toString();
            a aVar = qty0Var.e;
            if (aVar != null) {
                aVar.a(uri);
            }
            qty0Var.i = false;
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            qjk0.a(kh10.a(errorCode, "BannerWebView$MyWebViewClient: Load failed. Error - ", ", description - ", charSequence, ", url - "), uri, null);
            qty0 qty0Var = qty0.this;
            a aVar = qty0Var.e;
            if (aVar != null) {
                aVar.f(charSequence != null ? charSequence : "Unknown JS error");
            }
            if (qty0Var.g != null) {
                if (!webResourceRequest.isForMainFrame()) {
                    String lastPathSegment = webResourceRequest.getUrl().getLastPathSegment();
                    boolean z = lastPathSegment != null && lastPathSegment.endsWith(".html");
                    String str = webResourceRequest.getRequestHeaders().get(Http.Header.ACCEPT);
                    boolean z2 = str != null && str.contains("text/html");
                    if (!z && !z2 && !this.a.contains(Integer.valueOf(errorCode))) {
                        return;
                    }
                }
                g gVar = qty0Var.g;
                if (charSequence == null) {
                    charSequence = "Unknown loading error";
                }
                Html5View.f fVar = (Html5View.f) gVar;
                Html5View html5View = Html5View.this;
                if (html5View.e != 3) {
                    html5View.e = 3;
                    fVar.a.a(webView, new shv.a(errorCode, charSequence), uri);
                }
            }
        }
    }

    public void setOnLayoutListener(@Nullable d dVar) {
    }
}
