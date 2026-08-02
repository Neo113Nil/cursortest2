package sg.bigo.ads.g;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.lang.ref.WeakReference;
import sg.bigo.ads.ad.banner.b;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.utils.d;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.mraid.c;
import sg.bigo.ads.core.mraid.e;
import sg.bigo.ads.core.mraid.n;
import sg.bigo.ads.cv.c;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.h.b;
import xsna.fo8;

/* loaded from: classes9.dex */
public final class b implements b.InterfaceC2413b, sg.bigo.ads.h.b {

    @NonNull
    final sg.bigo.ads.api.core.b a;
    long e;
    sg.bigo.ads.cv.b g;
    public h h;
    public e i;
    WebView j;
    public View k;
    boolean l;
    boolean m;

    @Nullable
    final b.a p;
    private final boolean q;
    private final String r;
    private final a.C2478a s;

    @Nullable
    private final sg.bigo.ads.core.player.c t;

    @Nullable
    private final p u;

    @NonNull
    private final Ad v;
    private volatile boolean w;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    public int f = 0;
    boolean n = false;
    final C2485b o = new C2485b(0);

    public final class a {
        private a() {
        }

        @JavascriptInterface
        public final void gameEnd(String str) {
            b.a aVar = b.this.p;
            if (aVar != null) {
                aVar.d();
            }
        }

        @JavascriptInterface
        public final String getPlayableJsonStr() {
            return b.this.a.aC();
        }

        @JavascriptInterface
        public final void onBGNDomContentLoaded() {
            b bVar = b.this;
            bVar.m = true;
            b.a aVar = bVar.p;
            if (aVar != null) {
                aVar.c(bVar.a, SystemClock.elapsedRealtime() - b.this.e);
            }
        }

        @JavascriptInterface
        public final void onBGNLoaded() {
            b bVar = b.this;
            bVar.l = true;
            b.a aVar = bVar.p;
            if (aVar != null) {
                aVar.b(bVar.a, SystemClock.elapsedRealtime() - b.this.e);
            }
        }

        @JavascriptInterface
        public final void onGameStart() {
            b bVar = b.this;
            b.a aVar = bVar.p;
            if (aVar != null) {
                aVar.c(bVar.a);
            }
        }

        @JavascriptInterface
        public final void onJsClick() {
            b bVar = b.this;
            b.a aVar = bVar.p;
            if (aVar != null) {
                aVar.e(bVar.a);
            }
        }

        @JavascriptInterface
        public final void onJsImpression() {
            b bVar = b.this;
            b.a aVar = bVar.p;
            if (aVar != null) {
                aVar.d(bVar.a);
            }
        }

        @JavascriptInterface
        public final void onJsStartLoad() {
            b bVar = b.this;
            b.a aVar = bVar.p;
            if (aVar != null) {
                aVar.b(bVar.a);
            }
        }

        public /* synthetic */ a(b bVar, byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.g.b$b, reason: collision with other inner class name */
    public static final class C2485b {
        private boolean a;
        private int b;
        private WeakReference<Activity> c;

        private C2485b() {
            this.a = false;
            this.b = -1;
        }

        private void b() {
            if (this.a) {
                int i = this.b;
                this.b = -1;
                if (i == 0 || i == 1) {
                    WeakReference<Activity> weakReference = this.c;
                    Activity activity = weakReference == null ? null : weakReference.get();
                    if (activity == null) {
                        return;
                    }
                    activity.setRequestedOrientation(i);
                }
            }
        }

        public final void a() {
            this.a = true;
            b();
        }

        public /* synthetic */ C2485b(byte b) {
            this();
        }

        public final void a(Activity activity, int i) {
            this.b = i;
            this.c = new WeakReference<>(activity);
            b();
        }
    }

    public b(@NonNull Ad ad, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable a.C2478a c2478a, @Nullable b.a aVar) {
        this.s = c2478a;
        this.r = c2478a == null ? null : c2478a.b;
        this.t = cVar;
        this.u = pVar;
        this.v = ad;
        this.a = bVar;
        this.p = aVar;
        this.q = !TextUtils.isEmpty(r7);
    }

    private void b(int i, int i2) {
        int i3;
        WebView webView = this.j;
        if (webView != null) {
            Object parent = webView.getParent();
            if (parent instanceof FrameLayout) {
                this.k = (View) parent;
                sg.bigo.ads.ad.banner.b.a(this);
                Context context = webView.getContext();
                int i4 = context.getResources().getDisplayMetrics().widthPixels;
                int c = f.c(context);
                if (f.a(context, i) > i4 || f.a(context, i2) > c) {
                    i = 0;
                    i2 = 0;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                if (i <= 0 || i2 <= 0) {
                    i3 = -1;
                    layoutParams.width = -1;
                } else {
                    layoutParams.gravity = 17;
                    layoutParams.width = f.a(context, i);
                    i3 = f.a(context, i2);
                }
                layoutParams.height = i3;
            }
        }
    }

    @Override // sg.bigo.ads.h.a
    @Nullable
    public final View a() {
        return this.k;
    }

    @Override // sg.bigo.ads.h.a
    public final void c() {
        e eVar = this.i;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void d() {
        e eVar = this.i;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void e() {
        sg.bigo.ads.ad.banner.b.h(this);
        sg.bigo.ads.cv.b bVar = this.g;
        if (bVar != null) {
            bVar.b();
        }
        e eVar = this.i;
        if (eVar != null) {
            eVar.e();
            this.i = null;
        }
        WebView webView = this.j;
        if (webView != null) {
            v.b(webView);
            this.j = null;
        }
        this.h = null;
    }

    @Override // sg.bigo.ads.h.a
    public final void f() {
        b.a aVar;
        if (this.l || this.m || this.n || (aVar = this.p) == null || this.e <= 0) {
            return;
        }
        aVar.d(this.a, SystemClock.elapsedRealtime() - this.e);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void g() {
        int i;
        int i2;
        if (this.i == null || this.w) {
            return;
        }
        this.w = true;
        c.C2465c b = this.i.b();
        this.j = b;
        if (b != null) {
            b.setOverScrollMode(2);
            byte b2 = 0;
            this.j.setHorizontalScrollBarEnabled(false);
            this.j.setHorizontalScrollbarOverlay(false);
            this.j.setVerticalScrollBarEnabled(false);
            this.j.setVerticalScrollbarOverlay(false);
            this.j.getSettings().setSupportZoom(false);
            this.j.setBackgroundColor(-1);
            a.C2478a c2478a = this.s;
            if (c2478a != null) {
                i2 = c2478a.c;
                i = c2478a.d;
            } else {
                i = 0;
                i2 = 0;
            }
            b(i2, i);
            this.j.addJavascriptInterface(new a(this, b2), "BGN_PLAYABLE");
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i) {
        if (i == 1) {
            this.o.a();
            sg.bigo.ads.core.player.c cVar = this.t;
            if (cVar != null) {
                cVar.a();
            }
            if (this.i == null || this.a.az() <= 0) {
                return;
            }
            this.i.l();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final boolean b() {
        if (this.q) {
            return this.c;
        }
        return false;
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i, int i2) {
        int i3;
        int i4;
        WebView webView = this.j;
        if (webView == null) {
            return;
        }
        Context context = webView.getContext();
        a.C2478a c2478a = this.s;
        int i5 = 0;
        if (c2478a != null) {
            i4 = c2478a.c;
            i3 = c2478a.d;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (f.a(context, i4) <= i && f.a(context, i3) <= i2) {
            i5 = i4;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        if (i5 <= 0 || i3 <= 0) {
            layoutParams.width = i;
            layoutParams.height = i2;
        } else {
            layoutParams.gravity = 17;
            layoutParams.width = f.a(context, i5);
            layoutParams.height = f.a(context, i3);
        }
    }

    public final boolean b(final Context context) {
        try {
            this.i = new e(context, n.INTERSTITIAL);
        } catch (NoClassDefFoundError unused) {
            sg.bigo.ads.bn.a.a(0, "HtmlVastCompanion", "Banner webview is not support");
        }
        e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        eVar.g = new e.b() { // from class: sg.bigo.ads.g.b.3
            @Override // sg.bigo.ads.core.mraid.e.b
            public final void a() {
                sg.bigo.ads.cv.c cVar;
                b bVar = b.this;
                bVar.c = true;
                bVar.d = false;
                cVar = c.a.a;
                bVar.g = cVar.a(b.this.j, new View[0]);
                b bVar2 = b.this;
                if (bVar2.b) {
                    WebView webView = bVar2.j;
                    if (webView != null) {
                        webView.loadUrl("javascript:onViewImpression()");
                    }
                    sg.bigo.ads.cv.b bVar3 = b.this.g;
                    if (bVar3 != null) {
                        bVar3.a();
                    }
                }
                sg.bigo.ads.ad.banner.b.b(b.this);
                b.a aVar = b.this.p;
                if (aVar != null) {
                    aVar.c();
                }
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final void b() {
                b bVar = b.this;
                bVar.d = false;
                bVar.n = true;
                sg.bigo.ads.ad.banner.b.c(bVar);
                b bVar2 = b.this;
                b.a aVar = bVar2.p;
                if (aVar != null) {
                    aVar.a(bVar2.a, SystemClock.elapsedRealtime() - b.this.e);
                }
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final void c() {
                sg.bigo.ads.bn.a.a(0, "HtmlVastCompanion", "onRenderProcessGone");
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final void d() {
                h hVar = b.this.h;
                if (hVar != null) {
                    hVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final void e() {
                h hVar = b.this.h;
                if (hVar != null) {
                    hVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final void a(WebView webView, int i) {
                b bVar = b.this;
                bVar.f = i;
                b.a aVar = bVar.p;
                if (aVar != null) {
                    aVar.a(webView, i);
                }
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final boolean b(Activity activity, int i) {
                b.this.o.a(activity, i);
                return true;
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final void a(@NonNull String str, @Nullable i iVar) {
                b.this.a(context, str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.e.b
            public final boolean a(Activity activity, int i) {
                b.this.o.a(activity, i);
                return true;
            }
        };
        u.a();
        return true;
    }

    public final void a(Context context, String str, i iVar) {
        sg.bigo.ads.api.core.e a2;
        int i;
        Ad ad = this.v;
        if (ad instanceof sg.bigo.ads.aj.f) {
            ((sg.bigo.ads.aj.f) ad).M();
        }
        b.a aVar = this.p;
        if (aVar == null || !aVar.e()) {
            str = null;
        }
        String str2 = str;
        if (this.a.g().c() == 0 || !(this.v instanceof sg.bigo.ads.d.c)) {
            boolean a3 = this.a.a(16);
            Activity a4 = d.a(this.k);
            Ad ad2 = this.v;
            sg.bigo.ads.api.core.b bVar = this.a;
            a2 = sg.bigo.ads.g.a.a(context, a4, ad2, bVar, str2, this.u, this.s, a3, bVar.a(64));
            i = 0;
        } else {
            Context context2 = this.k.getContext();
            Ad ad3 = this.v;
            sg.bigo.ads.controller.landing.d.a(context2, (sg.bigo.ads.d.c<?, ?>) (ad3 instanceof sg.bigo.ads.aa.c ? (sg.bigo.ads.aa.c) ad3 : ad3 instanceof sg.bigo.ads.aa.d ? (sg.bigo.ads.aa.d) ad3 : ad3 instanceof t ? ((t) ad3).K() : (sg.bigo.ads.d.c) ad3));
            a2 = new sg.bigo.ads.api.core.e();
            i = 1;
        }
        a2.m = i;
        sg.bigo.ads.core.player.c cVar = this.t;
        if (cVar != null && !cVar.a(this.a)) {
            this.t.a(this.a, 6, 13);
        }
        h hVar = this.h;
        if (hVar != null) {
            hVar.a(iVar, a2);
        }
    }

    @Override // sg.bigo.ads.h.a
    @SuppressLint({"AddJavascriptInterface"})
    public final boolean a(Context context) {
        sg.bigo.ads.cv.c cVar;
        if (!this.q) {
            return false;
        }
        if (this.i == null) {
            if (!b(context)) {
                return false;
            }
            String str = this.r;
            cVar = c.a.a;
            String a2 = fo8.a(fo8.a(cVar.c(str), "\n<script>document.addEventListener('DOMContentLoaded',function(){BGN_PLAYABLE.onBGNDomContentLoaded()});\nwindow.addEventListener('load',function(){BGN_PLAYABLE.onBGNLoaded()});</script>"), "\n<script type=\"text/javascript\">\n    document.body.style.margin = '0px';\n</script>");
            this.e = SystemClock.elapsedRealtime();
            b.a aVar = this.p;
            if (aVar != null) {
                aVar.a(this.a);
            }
            this.i.a(a2, new e.d() { // from class: sg.bigo.ads.g.b.1
                @Override // sg.bigo.ads.core.mraid.e.d
                public final void a() {
                }
            });
            this.d = true;
        }
        g();
        return true;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final boolean a(@NonNull Context context, @NonNull File file) {
        if (this.i == null && !b(context)) {
            return false;
        }
        this.e = SystemClock.elapsedRealtime();
        b.a aVar = this.p;
        if (aVar != null) {
            aVar.a(this.a);
        }
        if (!this.i.a(file, new e.d() { // from class: sg.bigo.ads.g.b.2
            @Override // sg.bigo.ads.core.mraid.e.d
            public final void a() {
            }
        })) {
            sg.bigo.ads.bn.a.a(0, 5, "HtmlVastCompanion", "loadLocalZipRes: fillLocalFolder returned false");
            return false;
        }
        this.d = true;
        g();
        return true;
    }
}
