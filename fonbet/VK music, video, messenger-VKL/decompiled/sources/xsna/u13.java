package xsna;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: AppCache.kt */
/* loaded from: classes6.dex */
public final class u13 {
    public final WebView a;
    public final zxx b;
    public String c;
    public upn0 d;
    public Boolean e;
    public a f;
    public t93 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;
    public final Integer m;

    /* compiled from: AppCache.kt */
    public static final class a {
        public final View a;
        public final WebChromeClient.CustomViewCallback b;

        public a() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            View view = this.a;
            int hashCode = (view == null ? 0 : view.hashCode()) * 31;
            WebChromeClient.CustomViewCallback customViewCallback = this.b;
            return hashCode + (customViewCallback != null ? customViewCallback.hashCode() : 0);
        }

        public final String toString() {
            return "ChromeSettings(fullScreenView=" + this.a + ", customViewCallback=" + this.b + ')';
        }

        public a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.a = view;
            this.b = customViewCallback;
        }
    }

    public u13(WebView webView, zxx zxxVar) {
        a aVar = new a(null, null);
        this.a = webView;
        this.b = zxxVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = aVar;
        this.g = null;
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.m = webView != null ? Integer.valueOf(webView.getLayerType()) : null;
    }

    public final zxx a() {
        return this.b;
    }

    public final WebView b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u13)) {
            return false;
        }
        u13 u13Var = (u13) obj;
        return epx.f(this.a, u13Var.a) && epx.f(this.b, u13Var.b) && epx.f(this.c, u13Var.c) && epx.f(this.d, u13Var.d) && epx.f(this.e, u13Var.e) && this.f.equals(u13Var.f) && epx.f(this.g, u13Var.g) && this.h == u13Var.h && this.i == u13Var.i && this.j == u13Var.j && epx.f(this.k, u13Var.k) && this.l == u13Var.l;
    }

    public final int hashCode() {
        WebView webView = this.a;
        int hashCode = (this.b.hashCode() + ((webView == null ? 0 : webView.hashCode()) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        upn0 upn0Var = this.d;
        int hashCode3 = (hashCode2 + (upn0Var == null ? 0 : upn0Var.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        t93 t93Var = this.g;
        int b = qoy.b(qoy.b(qoy.b((hashCode4 + (t93Var == null ? 0 : t93Var.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str2 = this.k;
        return Boolean.hashCode(this.l) + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppCache(webView=");
        sb.append(this.a);
        sb.append(", js=");
        sb.append(this.b);
        sb.append(", lastLoadedUrl=");
        sb.append(this.c);
        sb.append(", systemBarsConfig=");
        sb.append(this.d);
        sb.append(", fullScreenMode=");
        sb.append(this.e);
        sb.append(", chromeSettings=");
        sb.append(this.f);
        sb.append(", recycler=");
        sb.append(this.g);
        sb.append(", isSwipeToCloseEnabled=");
        sb.append(this.h);
        sb.append(", isDevConsoleShowed=");
        sb.append(this.i);
        sb.append(", isBannerAdShowed=");
        sb.append(this.j);
        sb.append(", fragment=");
        sb.append(this.k);
        sb.append(", cached=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
