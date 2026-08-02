package xsna;

import android.net.Uri;
import android.webkit.WebView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Locale;
import kotlin.text.Regex;

/* compiled from: WebviewAccessTokenWrapperImpl.kt */
/* loaded from: classes15.dex */
public class ujx0 implements sjx0 {
    public static final Regex g = new Regex("(^|[a-z0-9.\\-]*\\.)m\\.([a-z0-9.\\-]+\\.)?(vk|vkontakte)\\.(com|ru|me)");
    public final WebView a;
    public final String b;
    public String c;
    public izs<? super Throwable, s3q0> d;
    public final b25 e;
    public final bpn0 f;

    /* compiled from: WebviewAccessTokenWrapperImpl.kt */
    public static final class a {
        public static String a() {
            return i5s.a(new StringBuilder("https://"), a0a.d, "/client_auth");
        }
    }

    public ujx0(WebView webView, String str) {
        this.a = webView;
        this.b = str;
        this.c = "";
        this.e = o25.a();
        this.f = new bpn0(new k5f0(17));
    }

    @Override // xsna.sjx0
    public final void a() {
        String str = this.c;
        ver0.c(this.a.getContext(), io.reactivex.rxjava3.kotlin.c.d(this.e.W(dgn0.c()).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), new fgu0(3, this, str), new ntw0(this, 4)));
    }

    public final String b() {
        return this.b;
    }

    public final void c(String str, boolean z) {
        this.c = str;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"loadUrl: url=" + str + ", useWebviewAccessToken=" + z});
        }
        if (z) {
            d(str);
        } else {
            this.a.loadUrl(e(str));
        }
    }

    public final void d(final String str) {
        boolean z;
        final String e = e(str);
        final String h = this.e.h();
        WebView webView = this.a;
        final String b = b6m.b(webView.getContext());
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null || host.length() == 0) {
            z = false;
        } else {
            z = g.f(String.valueOf(parse.getHost()).toLowerCase(Locale.ROOT));
        }
        final boolean z2 = z;
        L.d(new gzs(str, e, this, h, b, z2) { // from class: xsna.tjx0
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;

            {
                this.d = h;
                this.e = b;
                this.f = z2;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                String host2;
                String str2 = this.b;
                StringBuilder a2 = xe9.a("\n            getClientAuthQueries:\n                sourceUrl: ", str2, "\n                preparedUrl: ", this.c, "\n                accessToken: ");
                a2.append(erm0.D0(4, this.d).concat("..."));
                a2.append("\n                deviceId: ");
                a2.append(this.e);
                a2.append("\n                mobile: ");
                boolean z3 = this.f;
                a2.append(z3);
                a2.append("\n                isPayments: ");
                boolean z4 = false;
                if (z3 && (host2 = Uri.parse(str2).getHost()) != null && drm0.D(host2, "vk.ru", false)) {
                    z4 = true;
                }
                a2.append(z4);
                a2.append("\n            ");
                return xqm0.g(a2.toString());
            }
        });
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("wat", h).appendQueryParameter("wto", e).appendQueryParameter("device_id", b);
        if (z2) {
            appendQueryParameter.appendQueryParameter("mobile", "1");
        }
        Uri build = appendQueryParameter.build();
        L.d(new fnw0(build, 1));
        String substring = build.toString().substring(1);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"preparePostDataAndLoad success: ".concat(((p2i0) this.f.getValue()).a(substring))});
        }
        webView.postUrl(this.b, substring.getBytes(emb.b));
    }

    public final void f(jan0 jan0Var) {
        this.d = jan0Var;
    }

    public /* synthetic */ ujx0(WebView webView) {
        this(webView, a.a());
    }

    public String e(String str) {
        return str;
    }
}
