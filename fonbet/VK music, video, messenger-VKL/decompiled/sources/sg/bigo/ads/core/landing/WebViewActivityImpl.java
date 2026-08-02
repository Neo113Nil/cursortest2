package sg.bigo.ads.core.landing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.as.a;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.dm.c;
import sg.bigo.ads.dm.d;
import sg.bigo.ads.dm.e;

/* loaded from: classes9.dex */
public class WebViewActivityImpl extends BaseAdActivityImpl implements View.OnClickListener {

    @Nullable
    protected ProgressBar A;

    @Nullable
    public ImageView B;

    @Nullable
    protected ImageView C;

    @Nullable
    public WebView D;
    protected String E;
    protected long F;
    protected e G;
    public boolean H;
    private boolean a;
    private boolean b;
    private AtomicBoolean c;
    private boolean d;
    private String e;
    private boolean f;

    @Nullable
    private FileChooser g;
    private a.AbstractC2430a h;
    private final b i;

    @Nullable
    protected TextView z;

    public class CustomWebChromeClient extends c {
        private CustomWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.A != null && !webViewActivityImpl.d()) {
                WebViewActivityImpl.this.A.setProgress(i);
            }
            WebViewActivityImpl.this.c(i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            WebViewActivityImpl.this.b(str);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (WebViewActivityImpl.this.g == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.g = new FileChooser(webViewActivityImpl.N);
            }
            FileChooser fileChooser = WebViewActivityImpl.this.g;
            ValueCallback<Uri[]> valueCallback2 = fileChooser.c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            fileChooser.c = valueCallback;
            fileChooser.a(fileChooserParams.getAcceptTypes());
            return true;
        }

        @Keep
        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            if (WebViewActivityImpl.this.g == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.g = new FileChooser(webViewActivityImpl.N);
            }
            WebViewActivityImpl.this.g.openFileChooser(valueCallback, str, str2);
        }

        public /* synthetic */ CustomWebChromeClient(WebViewActivityImpl webViewActivityImpl, byte b) {
            this();
        }
    }

    public class a extends d {
        private int b;

        private a() {
        }

        @Override // sg.bigo.ads.dm.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.da.b.a(3002, 10105, "The render process was gone.");
            WebViewActivityImpl.this.d(0);
        }

        @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ProgressBar progressBar = WebViewActivityImpl.this.A;
            if (progressBar != null) {
                progressBar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            WebViewActivityImpl.this.a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            ProgressBar progressBar = WebViewActivityImpl.this.A;
            boolean z = false;
            if (progressBar != null) {
                progressBar.animate().alpha(1.0f).setDuration(100L).setListener(null);
                WebViewActivityImpl.this.A.setProgress(0);
            }
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.F < 0) {
                webViewActivityImpl.F = SystemClock.elapsedRealtime();
                z = true;
            }
            WebViewActivityImpl.this.a(str, z);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            sg.bigo.ads.bn.a.a("WebView", "onReceivedError: " + i + " " + str);
            WebViewActivityImpl.this.a(i, str, str2);
        }

        @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.b++;
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            webViewActivityImpl.H = webViewActivityImpl.F >= 0 && webViewActivityImpl.b;
            return a(webView, str, !WebViewActivityImpl.this.H);
        }

        public /* synthetic */ a(WebViewActivityImpl webViewActivityImpl, byte b) {
            this();
        }

        private void a(WebView webView, String str, int i) {
            WebViewActivityImpl.this.a(str, i);
            onPageFinished(webView, str);
            WebViewActivityImpl.this.d(0);
        }

        @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        private boolean a(WebView webView, String str, boolean z) {
            boolean z2;
            if (WebViewActivityImpl.this.a) {
                return true;
            }
            WebViewActivityImpl.this.c(str);
            if (z && this.b > 1) {
                WebViewActivityImpl.this.d(str);
            }
            if (sg.bigo.ads.core.landing.a.a(str)) {
                boolean a = a(str);
                if (a && z) {
                    a(webView, str, 2);
                }
                return a;
            }
            if (str.startsWith("intent://")) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    Uri data = parseUri.getData();
                    if (data != null && WebViewActivityImpl.a(WebViewActivityImpl.this, data)) {
                        if (z) {
                            a(webView, str, 3);
                        }
                        return true;
                    }
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent(null);
                    parseUri.setSelector(null);
                    try {
                        z2 = WebViewActivityImpl.this.N.startActivityIfNeeded(parseUri, -1);
                    } catch (Exception unused) {
                        z2 = false;
                    }
                    if (z2) {
                        if (z) {
                            a(webView, str, 3);
                        }
                        return true;
                    }
                    sg.bigo.ads.bn.a.a("WebView", "queryIntentActivities: null");
                    String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        boolean a2 = sg.bigo.ads.core.landing.a.a(stringExtra) ? a(stringExtra) : false;
                        if (!a2) {
                            a2 = WebViewActivityImpl.this.b(stringExtra, true);
                        }
                        if (a2 && z) {
                            a(webView, stringExtra, 3);
                        }
                        if (!a2) {
                            webView.loadUrl(stringExtra);
                        }
                        e eVar = new e();
                        eVar.p = stringExtra;
                        WebViewActivityImpl.this.a(eVar);
                        return true;
                    }
                } catch (Exception e) {
                    sg.bigo.ads.bn.a.a(0, "WebView", "shouldOverrideUrlLoading: " + e.getMessage());
                }
            } else if (!URLUtil.isValidUrl(str)) {
                if (WebViewActivityImpl.this.b(str, false) && z) {
                    a(webView, str, 3);
                }
                return true;
            }
            String e2 = WebViewActivityImpl.this.e(str);
            if (str.equals(e2)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(e2);
            return true;
        }

        private boolean a(String str) {
            WebViewActivityImpl.this.G = new e();
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            webViewActivityImpl.G.e = webViewActivityImpl.f;
            Uri parse = Uri.parse(str);
            Activity activity = WebViewActivityImpl.this.N;
            Activity activity2 = WebViewActivityImpl.this.N;
            WebViewActivityImpl webViewActivityImpl2 = WebViewActivityImpl.this;
            boolean a = sg.bigo.ads.core.landing.a.a(parse, activity, activity2, webViewActivityImpl2.G, webViewActivityImpl2.d, WebViewActivityImpl.this.e, 1, WebViewActivityImpl.this.f);
            WebViewActivityImpl webViewActivityImpl3 = WebViewActivityImpl.this;
            webViewActivityImpl3.a(webViewActivityImpl3.G);
            return a;
        }
    }

    public class b implements View.OnTouchListener, e.a {
        private b() {
        }

        @Override // sg.bigo.ads.dm.e.a
        public final void a(MotionEvent motionEvent) {
            onTouch(WebViewActivityImpl.this.D, motionEvent);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                WebViewActivityImpl.a(WebViewActivityImpl.this);
            }
            return WebViewActivityImpl.this.a(motionEvent);
        }

        public /* synthetic */ b(WebViewActivityImpl webViewActivityImpl, byte b) {
            this();
        }
    }

    public WebViewActivityImpl(@NonNull Activity activity) {
        super(activity);
        this.F = -1L;
        this.a = false;
        this.b = false;
        this.c = new AtomicBoolean(true);
        this.d = false;
        this.e = null;
        this.h = new a.AbstractC2430a() { // from class: sg.bigo.ads.core.landing.WebViewActivityImpl.1
            @Override // sg.bigo.ads.as.a.AbstractC2430a
            public final void a(boolean z) {
                if (z) {
                    WebViewActivityImpl.this.ag();
                } else {
                    WebViewActivityImpl.this.ai();
                }
            }
        };
        this.i = new b(this, (byte) 0);
        Intent intent = this.N.getIntent();
        if (intent == null) {
            this.E = "";
            return;
        }
        this.E = intent.getStringExtra("url");
        this.d = intent.getBooleanExtra("try_gp_inline", false);
        this.e = intent.getStringExtra("gp_inline_ad_bundle");
        this.f = intent.getBooleanExtra("gp_inline_real_launch", false);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        WebView webView = this.D;
        if (webView != null) {
            sg.bigo.ads.as.a.b(webView, this.h);
            WebView webView2 = this.D;
            if (webView2 instanceof sg.bigo.ads.dm.e) {
                ((sg.bigo.ads.dm.e) webView2).setOnWebViewTouchListener(null);
            } else {
                webView2.setOnTouchListener(null);
            }
            this.D.destroy();
            this.D = null;
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
        if (TextUtils.isEmpty(this.E)) {
            sg.bigo.ads.bn.a.a(0, "WebView", "url is null.");
            d(0);
            return;
        }
        aL();
        p(a());
        try {
            b();
        } catch (RuntimeException unused) {
        }
        u();
        c();
        if (r.a((CharSequence) this.E) || b(this.E, false)) {
            d(0);
        } else {
            v();
        }
    }

    public int a() {
        return R.layout.bigo_ad_activity_webview;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @Deprecated
    public final void aM() {
        f(0);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.c.compareAndSet(true, false)) {
            e();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ai() {
        if (this.c.compareAndSet(false, true)) {
            f();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ak() {
        a(1);
    }

    public void d(int i) {
        this.a = true;
        g(i);
        WebView webView = this.D;
        if (webView != null) {
            webView.stopLoading();
        }
        super.aM();
    }

    public String e(String str) {
        return str;
    }

    public void g(int i) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            if (tag.equals(sg.bigo.ads.common.utils.a.a(this.N, R.string.bigo_ad_tag_close, new Object[0]))) {
                f(3);
            } else if (tag.equals(sg.bigo.ads.common.utils.a.a(this.N, R.string.bigo_ad_tag_back, new Object[0]))) {
                a(2);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    public void s() {
        WebView t = t();
        this.D = t;
        if (t == null) {
            return;
        }
        byte b2 = 0;
        t.setWebViewClient(new a(this, b2));
        this.D.setWebChromeClient(new CustomWebChromeClient(this, b2));
        v.a(this.D, (ViewGroup) q(R.id.inter_webview_container), new ViewGroup.LayoutParams(-1, -1), -1);
        WebView webView = this.D;
        if (webView instanceof sg.bigo.ads.dm.e) {
            ((sg.bigo.ads.dm.e) webView).setOnWebViewTouchListener(this.i);
        } else {
            webView.setOnTouchListener(this.i);
        }
        sg.bigo.ads.as.a.a(this.D, this.h);
    }

    @Nullable
    public WebView t() {
        return sg.bigo.ads.dm.e.a(this.N);
    }

    public void v() {
        WebView webView = this.D;
        if (webView != null) {
            webView.loadUrl(this.E);
        }
    }

    public boolean x() {
        WebView webView = this.D;
        return webView != null && webView.canGoBack();
    }

    public void b() {
        this.A = (ProgressBar) q(R.id.inter_webview_progress_bar);
        this.z = (TextView) q(R.id.inter_webview_title);
        this.C = (ImageView) q(R.id.inter_webview_back);
        this.B = (ImageView) q(R.id.inter_webview_close);
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        s();
    }

    public void c() {
        final View q = q(R.id.inter_webview_back);
        v.a(q, new v.a() { // from class: sg.bigo.ads.core.landing.WebViewActivityImpl.2
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                if (WebViewActivityImpl.this.P != null) {
                    WebViewActivityImpl.this.P.a(q, 1);
                }
            }
        });
    }

    public void d(String str) {
    }

    public void e() {
        WebView webView = this.D;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void f() {
        WebView webView = this.D;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void g(boolean z) {
    }

    private void a(int i) {
        if (this.D == null || !x()) {
            f(i);
        } else {
            this.D.goBack();
        }
    }

    public void b(String str) {
        TextView textView = this.z;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void c(int i) {
    }

    public boolean d() {
        return false;
    }

    public void f(int i) {
        d(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str, boolean z) {
        return a(Uri.parse(str), z);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i, int i2, Intent intent) {
        String dataString;
        FileChooser fileChooser = this.g;
        if (fileChooser != null) {
            Uri[] uriArr = (i2 != -1 || i != 101 || intent == null || intent.getData() == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)};
            ValueCallback<Uri[]> valueCallback = fileChooser.c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                fileChooser.c = null;
            }
        }
    }

    public void c(String str) {
    }

    public void a(int i, String str, String str2) {
    }

    public void a(String str) {
    }

    public void a(String str, int i) {
    }

    public void a(String str, boolean z) {
    }

    public void a(@NonNull sg.bigo.ads.api.core.e eVar) {
    }

    private boolean a(Uri uri, boolean z) {
        sg.bigo.ads.api.core.e eVar = new sg.bigo.ads.api.core.e();
        this.G = eVar;
        boolean z2 = this.f;
        eVar.e = z2;
        Activity activity = this.N;
        boolean a2 = sg.bigo.ads.core.landing.a.a(uri, activity, activity, eVar, "", this.d, this.e, 1, z2);
        sg.bigo.ads.api.core.e eVar2 = this.G;
        boolean z3 = (eVar2.b == 0 && eVar2.c == 0 && eVar2.b() < 0) ? false : true;
        if (z) {
            this.G.p = uri.toString();
        }
        if (z3) {
            a(this.G);
        }
        return a2;
    }

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public static /* synthetic */ boolean a(WebViewActivityImpl webViewActivityImpl) {
        webViewActivityImpl.b = true;
        return true;
    }

    public static /* synthetic */ boolean a(WebViewActivityImpl webViewActivityImpl, Uri uri) {
        return webViewActivityImpl.a(uri, false);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void al() {
    }

    public void u() {
    }
}
