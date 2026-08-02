package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vkontakte.android.data.b;
import java.util.LinkedList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* compiled from: Html5WebView.kt */
/* loaded from: classes4.dex */
public final class khv extends l6v0 {
    public final LinkedList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public Html5Entry l;
    public long m;
    public long n;
    public a o;

    /* compiled from: Html5WebView.kt */
    public interface a {
        void a();

        void b(String str, String str2);
    }

    /* compiled from: Html5WebView.kt */
    public final class b extends c3y {
        public final Context c;

        public b(Context context) {
            this.c = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.String] */
        @JavascriptInterface
        public final void VKClientWebAppActionDispatch(String str) {
            if (str == null) {
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            try {
                ref$ObjectRef.element = new JSONObject(str).optString("name");
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
            if (((String) ref$ObjectRef.element) == null) {
                return;
            }
            pro0.f(new j5q(this, ref$ObjectRef, khv.this, 2));
        }

        @JavascriptInterface
        public final void VKClientWebAppTrackEvent(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Html5Entry html5Entry = khv.this.l;
                if (html5Entry == null) {
                    return;
                }
                com.vk.newsfeed.common.util.k.g(html5Entry, jSONObject);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
    }

    public khv(Context context) {
        super(context);
        LinkedList linkedList = new LinkedList();
        this.d = linkedList;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        nr2.k(this, new c(), new b(context));
        setWebChromeClient(new bir0());
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setAllowFileAccess(true);
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setCacheMode(1);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setSupportZoom(false);
        }
        linkedList.clear();
        setPageLoaded(false);
        this.g = false;
        this.f = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = null;
        this.l = null;
    }

    public static final void b(khv khvVar, String str, String str2) {
        khvVar.d.clear();
        khvVar.g = false;
        khvVar.setPageLoaded(false);
        khvVar.f = true;
        khvVar.h = false;
        khvVar.i = false;
        khvVar.k = null;
        khvVar.l = null;
        a aVar = khvVar.o;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void c() {
        this.j = true;
        this.h = true;
        this.i = false;
        d("client_message_launch();");
        this.m = 0L;
        xuo0.a.getClass();
        this.n = xuo0.c();
        com.vk.newsfeed.common.util.k.j(this.l);
    }

    public final void d(String str) {
        if (this.e) {
            nr2.J(this, str);
        } else {
            this.d.offer(str);
        }
    }

    public final a getListener() {
        return this.o;
    }

    public final void setListener(a aVar) {
        this.o = aVar;
    }

    public final void setPageLoaded(boolean z) {
        this.e = z;
        if (!z) {
            return;
        }
        while (true) {
            LinkedList linkedList = this.d;
            if (linkedList.isEmpty()) {
                return;
            } else {
                d((String) linkedList.poll());
            }
        }
    }

    /* compiled from: Html5WebView.kt */
    public static final class c extends dir0 {
        public c() {
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            khv khvVar = khv.this;
            if (!epx.f(str, khvVar.k) || webView == null) {
                return;
            }
            khvVar.setPageLoaded(true);
            khvVar.g = false;
            Html5Entry html5Entry = khvVar.l;
            String str2 = com.vk.newsfeed.common.util.k.a;
            if (html5Entry != null) {
                b.d dVar = new b.d("ads/html5_onload");
                dVar.b(html5Entry.w.b, "track_code");
                xuo0.a.getClass();
                dVar.b(Long.valueOf(xuo0.c()), "at");
                dVar.e();
            }
            a listener = khvVar.getListener();
            if (listener != null) {
                listener.a();
            }
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            khv.this.k = str;
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            khv khvVar = khv.this;
            if (!epx.f(str2, khvVar.k) || webView == null) {
                return;
            }
            com.vk.newsfeed.common.util.k.i(khvVar.l);
            khv.b(khvVar, str2, i + ' ' + str + ' ' + str2);
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (webResourceRequest == null || webResourceResponse == null) {
                return;
            }
            String uri = webResourceRequest.getUrl().toString();
            khv khvVar = khv.this;
            if (uri.equals(khvVar.k)) {
                com.vk.newsfeed.common.util.k.i(khvVar.l);
                khv.b(khvVar, uri, webResourceResponse.getStatusCode() + ' ' + webResourceResponse.getReasonPhrase() + ' ' + uri);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                khv khvVar = khv.this;
                if (valueOf.equals(khvVar.k)) {
                    com.vk.newsfeed.common.util.k.i(khvVar.l);
                    khv.b(khvVar, valueOf, valueOf);
                }
            }
        }
    }
}
