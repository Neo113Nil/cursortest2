package sg.bigo.ads.controller.landing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import sg.bigo.ads.al.a;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.dm.e;

/* loaded from: classes9.dex */
public final class a {

    @NonNull
    final sg.bigo.ads.api.core.b a;

    @NonNull
    public final b.InterfaceC2428b b;
    public final int c;
    boolean d = false;
    String e = "";
    e f;
    long g;

    /* renamed from: sg.bigo.ads.controller.landing.a$a, reason: collision with other inner class name */
    public interface InterfaceC2462a {
        void a(String str);

        void a(String str, long j, boolean z, int i);
    }

    public a(@NonNull sg.bigo.ads.api.core.b bVar) {
        this.a = bVar;
        b.InterfaceC2428b O = bVar.O();
        this.b = O;
        this.c = O.g();
    }

    public final void a() {
        e eVar = this.f;
        if (eVar != null) {
            eVar.destroy();
            this.f = null;
        }
    }

    public final boolean b() {
        int i = this.c;
        return i == 3 || i == 4;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context, final String str, @NonNull final InterfaceC2462a interfaceC2462a) {
        this.g = SystemClock.elapsedRealtime();
        interfaceC2462a.a(str);
        e a = e.a(context);
        this.f = a;
        if (a == null) {
            return;
        }
        a.setWebChromeClient(new sg.bigo.ads.dm.c());
        this.f.setWebViewClient(new sg.bigo.ads.dm.d() { // from class: sg.bigo.ads.controller.landing.a.2
            @Override // sg.bigo.ads.dm.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                a.this.f = null;
                interfaceC2462a.a(str, SystemClock.elapsedRealtime() - a.this.g, false, 0);
            }

            @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                webView.getUrl();
                interfaceC2462a.a(str2, SystemClock.elapsedRealtime() - a.this.g, true, 0);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str2, String str3) {
                super.onReceivedError(webView, i, str2, str3);
                sg.bigo.ads.bn.a.a("Preload", "onReceivedError: " + i + " " + str2);
                interfaceC2462a.a(str, SystemClock.elapsedRealtime() - a.this.g, false, 0);
            }

            @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
            @TargetApi(23)
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
                }
            }

            @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
            @TargetApi(23)
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
                }
            }
        });
        this.f.setLeft(0);
        this.f.setTop(0);
        this.f.setRight(f.b(context));
        this.f.setBottom(f.c(context) - f.a(context, 55));
        this.f.loadUrl(str);
    }

    public static /* synthetic */ void a(a aVar, Context context, final String str, int i, final InterfaceC2462a interfaceC2462a) {
        if (i == 0) {
            aVar.a(context, str, interfaceC2462a);
            return;
        }
        if (i != 2) {
            sg.bigo.ads.bn.a.a(0, "Preload", "PreloadLand: error open type.");
            return;
        }
        aVar.g = SystemClock.elapsedRealtime();
        a.C2426a c2426a = new a.C2426a();
        c2426a.a = str;
        sg.bigo.ads.al.a a = c2426a.a();
        sg.bigo.ads.al.c.a(context, a.a, new a.b() { // from class: sg.bigo.ads.controller.landing.a.1
            @Override // sg.bigo.ads.al.a.b
            public final void a(Context context2, String str2, final int i2, String str3) {
                a.this.a(context2, str2, new InterfaceC2462a() { // from class: sg.bigo.ads.controller.landing.a.1.1
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC2462a
                    public final void a(String str4) {
                        InterfaceC2462a interfaceC2462a2 = interfaceC2462a;
                        if (interfaceC2462a2 != null) {
                            interfaceC2462a2.a(str4);
                        }
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC2462a
                    public final void a(String str4, long j, boolean z, int i3) {
                        InterfaceC2462a interfaceC2462a2 = interfaceC2462a;
                        if (interfaceC2462a2 != null) {
                            interfaceC2462a2.a(str4, j, z, d.a(i2));
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.al.a.b
            public final void a(String str2, String str3, String str4) {
                InterfaceC2462a interfaceC2462a2 = interfaceC2462a;
                if (interfaceC2462a2 != null) {
                    interfaceC2462a2.a(str, SystemClock.elapsedRealtime() - a.this.g, true, 2);
                }
            }
        });
    }
}
