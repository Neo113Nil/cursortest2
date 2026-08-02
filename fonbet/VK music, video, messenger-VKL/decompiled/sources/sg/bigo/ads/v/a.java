package sg.bigo.ads.v;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.i;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.dh.n;
import sg.bigo.ads.dm.c;
import sg.bigo.ads.dm.d;
import sg.bigo.ads.dm.e;

/* loaded from: classes9.dex */
public class a extends i<t> {
    static boolean c = true;
    ProgressBar a;
    o b;
    sg.bigo.ads.cd.a d;
    private e e;
    private View f;
    private boolean g;
    private o h;
    private int i;
    private Runnable j;

    /* renamed from: sg.bigo.ads.v.a$a, reason: collision with other inner class name */
    public static class C2507a extends c {
        private final a a;

        public C2507a(a aVar) {
            this.a = aVar;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            ProgressBar progressBar = this.a.a;
            if (progressBar == null || i <= 5) {
                return;
            }
            if (i > 95) {
                i = 95;
            }
            progressBar.setProgress(i);
        }
    }

    public static class b extends d {
        private final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // sg.bigo.ads.dm.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.da.b.a(3002, 10105, "The render process was gone.");
            this.a.aM();
        }

        @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.a.c() <= 1) {
                a.d(this.a);
            }
            if (!a.c) {
                ViewGroup viewGroup = (ViewGroup) this.a.q(R.id.bigo_ad_bottom_privacy_content);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else if (2 == this.a.o()) {
                this.a.d();
            }
            a.l();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            int i;
            sg.bigo.ads.cd.a aVar;
            this.a.a();
            this.a.b();
            a aVar2 = this.a;
            if (aVar2.Q != 0 && (aVar = aVar2.d) != null && aVar.a()) {
                sg.bigo.ads.api.core.e eVar = new sg.bigo.ads.api.core.e();
                eVar.m = 2;
                ((t) aVar2.Q).K().a(aVar2.d.b, eVar);
            }
            super.onPageStarted(webView, str, bitmap);
            final a aVar3 = this.a;
            int i2 = 3;
            if (a.c) {
                int a = aVar3.b.a("video_play_page.webview_force_time");
                i = (a == 5 || a == 6 || a == 7 || a == 8) ? a - 3 : 0;
            } else {
                int a2 = aVar3.b.a("video_play_page.webview2_force_time");
                if (a2 == 0) {
                    i2 = 0;
                } else if (a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4) {
                    i2 = a2 + 1;
                }
                i = i2;
            }
            AdCountDownButton adCountDownButton = aVar3.C;
            if (adCountDownButton != null) {
                if (i > 0) {
                    adCountDownButton.postDelayed(new Runnable() { // from class: sg.bigo.ads.v.a.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) a.this.A)) {
                                return;
                            }
                            a.this.C.setVisibility(0);
                        }
                    }, i * 1000);
                } else {
                    adCountDownButton.setVisibility(0);
                }
            }
        }

        @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public a(@NonNull Activity activity) {
        super(activity);
        this.g = false;
        this.i = -1;
    }

    public static /* synthetic */ boolean l() {
        c = false;
        return false;
    }

    private boolean n() {
        return 1 == this.b.a("video_play_page.is_loading");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        o oVar = this.b;
        if (oVar == null) {
            return 1;
        }
        int a = oVar.a("video_play_page.imp_timing", 1);
        if (1 == a || 2 == a) {
            return a;
        }
        return 1;
    }

    @NonNull
    private u p() {
        u a = sg.bigo.ads.k.a.a(((t) this.A).K());
        a.a(this.P);
        return a;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        e eVar = this.e;
        if (eVar != null) {
            eVar.destroy();
            this.e = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
        T t;
        AdCountDownButton adCountDownButton;
        super.X();
        T t2 = this.Q;
        if (t2 == 0) {
            aM();
            return;
        }
        o e = ((t) t2).f().e();
        this.b = e;
        if (e == null) {
            aM();
            return;
        }
        e a = e.a(this.N);
        this.e = a;
        if (a == null) {
            aM();
            return;
        }
        ((t) this.Q).K().x = false;
        c = true;
        this.f = q(R.id.bigo_web_loading_container);
        int a2 = this.b.a("video_play_page.webview_layout", 7);
        if (a2 != 7 && a2 != 8) {
            a2 = 7;
        }
        if (7 == a2 && (adCountDownButton = this.C) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) adCountDownButton.getLayoutParams();
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = f.a(this.N, 20);
            layoutParams.topMargin = f.a(this.N, 10);
        }
        b();
        a();
        e eVar = this.e;
        if (eVar != null) {
            eVar.setWebViewClient(new b(this));
            this.e.setWebChromeClient(new C2507a(this));
            ViewGroup viewGroup = (ViewGroup) q(R.id.inter_webview_container);
            if (viewGroup != null) {
                v.a(this.e, viewGroup, new FrameLayout.LayoutParams(-1, -1), -1);
                if (1 == o()) {
                    d();
                }
                if (this.Q != 0) {
                    this.e.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.v.a.2
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (a.this.d == null) {
                                a.this.d = new sg.bigo.ads.cd.a(a.this.N);
                            }
                            a.this.d.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) q(R.id.inter_native_ad_view);
            if (viewGroup2 != null && (t = this.Q) != 0 && ((t) t).K() != null) {
                TextView textView = (TextView) viewGroup2.findViewById(R.id.inter_advertiser);
                TextView textView2 = (TextView) viewGroup2.findViewById(R.id.inter_ad_label);
                String advertiser = ((t) this.Q).K().getAdvertiser();
                if (textView != null && textView2 != null) {
                    boolean isEmpty = TextUtils.isEmpty(advertiser);
                    textView.setVisibility(isEmpty ? 8 : 0);
                    if (!isEmpty) {
                        textView.setText(advertiser);
                        textView2.setText(sg.bigo.ads.common.utils.a.a(this.N.getApplicationContext(), R.string.bigo_ad_tag, new Object[0]));
                    }
                }
            }
        }
        this.e.loadUrl(((t) this.Q).f().O().a());
        o f = ((t) this.Q).f().f();
        this.h = f;
        this.i = f != null ? f.a("tracker_attr.web_auto_clk_tracker", -1) : -1;
        if (this.j == null) {
            this.j = new Runnable() { // from class: sg.bigo.ads.v.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    sg.bigo.ads.core.player.c cVar;
                    T t3 = a.this.Q;
                    sg.bigo.ads.y.b K = t3 != 0 ? ((t) t3).K() : null;
                    if ((K instanceof sg.bigo.ads.y.c) && (cVar = ((sg.bigo.ads.y.c) K).I) != null) {
                        for (n nVar : cVar.a.j) {
                            if (nVar != null) {
                                nVar.e = true;
                            }
                        }
                    }
                    if (K != null) {
                        Iterator<sg.bigo.ads.df.e> it = K.d.c.iterator();
                        while (it.hasNext()) {
                            sg.bigo.ads.df.e next = it.next();
                            if (next != null && next.c()) {
                                next.e = true;
                            }
                        }
                        K.b(new Point(0, 0), 37, 15, new sg.bigo.ads.api.core.e());
                    }
                }
            };
        }
        int i = this.i;
        if (i >= 0) {
            sg.bigo.ads.bh.d.a(3, this.j, i * 1000);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        return R.layout.bigo_ad_activity_interstitial_sab;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final sg.bigo.ads.d.c aj() {
        return ((t) this.A).K();
    }

    public final int c() {
        int a = this.b.a("video_play_page.loading_timing");
        if (a == 2) {
            return 3;
        }
        if (a != 3) {
            return a != 4 ? 1 : 10;
        }
        return 5;
    }

    public final void d() {
        ViewGroup viewGroup = (ViewGroup) q(R.id.inter_native_ad_view);
        if (viewGroup != null) {
            p().a(viewGroup, viewGroup, 1, 1, 0, null);
        }
    }

    public static /* synthetic */ void d(a aVar) {
        View view = aVar.f;
        if (view != null) {
            aVar.g = false;
            view.setVisibility(8);
        }
    }

    public final void b() {
        if (this.C != null) {
            if (!e() || f()) {
                this.C.setVisibility(8);
            }
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void g(int i) {
    }

    public final void a() {
        View view;
        if (!this.g && n()) {
            if (this.f == null || this.a == null) {
                View q = q(R.id.bigo_web_loading_container);
                this.f = q;
                if (q != null) {
                    this.a = (ProgressBar) q.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.f;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.a;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int c2 = c();
            if (c2 > 1 && (view = this.f) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.v.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) a.this.A)) {
                            return;
                        }
                        a.d(a.this);
                    }
                }, c2 * 1000);
            }
            this.g = true;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void d(boolean z) {
        sg.bigo.ads.bh.d.a(this.j);
        super.d(z);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void m() {
    }
}
