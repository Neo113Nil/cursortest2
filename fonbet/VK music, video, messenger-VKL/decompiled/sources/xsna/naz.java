package xsna;

import android.net.Uri;
import android.webkit.URLUtil;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.apps.BuildInfo;
import java.util.Locale;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* compiled from: LinkScheme.kt */
/* loaded from: classes17.dex */
public final class naz {
    public static final Object a;
    public static final Object b;

    static {
        cu1 cu1Var = new cu1(19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, cu1Var);
        b = msy.a(lazyThreadSafetyMode, new bu0(16));
    }

    public static final boolean A(String str) {
        Uri parse = Uri.parse(a(str));
        return s(parse) || n(parse);
    }

    public static final boolean B(Uri uri) {
        return m(uri) && jh.h("/w2a", new peq0(uri), null, null, 14);
    }

    public static final boolean C(String str) {
        Uri parse = Uri.parse(a(str));
        return v(parse) || l(parse);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean D(Uri uri) {
        String queryParameter;
        String host = uri.getHost();
        if (host != null) {
            return (!((Regex) laz.n.getValue()).f(cqm0.m(host)) || (queryParameter = uri.getQueryParameter("sat")) == null || queryParameter.length() == 0) ? false : true;
        }
        return false;
    }

    public static final String a(String str) {
        if (!URLUtil.isNetworkUrl(str)) {
            String[] strArr = {"vkontakte://", "vk://", "vkclips://", "vkme://", "vkvideo://", "vkdating://", "okdating://"};
            for (int i = 0; i < 7; i++) {
                if (!brm0.B(str, strArr[i], true)) {
                }
            }
            return "https://".concat(str);
        }
        if (!brm0.B(str, "http", false) && !brm0.B(str, HttpRequest.DEFAULT_SCHEME, false)) {
            int K = drm0.K(0, 6, str, "://", false);
            return str.substring(0, K).toLowerCase(Locale.ROOT).concat(str.substring(K));
        }
        return str;
    }

    public static String b() {
        return i5s.a(new StringBuilder("https://"), a0a.d, "/support");
    }

    public static String c() {
        return "dating.".concat(a0a.d);
    }

    public static String d() {
        return "games.".concat(a0a.d);
    }

    public static String e() {
        return "static.".concat(a0a.d);
    }

    public static final boolean f(String str) {
        return URLUtil.isNetworkUrl(str);
    }

    public static final boolean g(String str) {
        return drm0.D(str, "://", false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean h(String str) {
        String host = jeq0.g(a(str)).getHost();
        String m = host != null ? cqm0.m(host) : null;
        if (m == null || m.length() == 0) {
            return false;
        }
        return ((Regex) laz.M.getValue()).f(m);
    }

    public static final boolean i(Uri uri) {
        return s(uri) && epx.f(uri.getPath(), "/email.php");
    }

    public static final boolean j(Uri uri) {
        return u(uri) || q(uri) || p(uri) || s(uri) || v(uri) || l(uri);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean k(Uri uri) {
        return j5g.P((Set) b.getValue(), uri.getHost());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean l(Uri uri) {
        String path;
        String host = uri.getHost();
        return (host == null || host.length() == 0 || !((Regex) laz.f.getValue()).f(cqm0.m(String.valueOf(uri.getHost()))) || (path = uri.getPath()) == null || !((Regex) laz.g.getValue()).a(path)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean m(Uri uri) {
        return j5g.P((Set) a.getValue(), uri.getHost());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean n(Uri uri) {
        String host = uri.getHost();
        if (host == null || host.length() == 0) {
            return false;
        }
        String m = cqm0.m(String.valueOf(uri.getHost()));
        if (((Regex) laz.G.getValue()).f(m)) {
            return true;
        }
        return BuildInfo.t() && ((Regex) laz.H.getValue()).f(m);
    }

    public static final boolean o(Uri uri) {
        return (uri == null || !s(uri) || !epx.f(uri.getPath(), "/feed") || uri.getQueryParameter("target_url") == null || uri.getQueryParameter("unauth_id") == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean p(Uri uri) {
        String authority = uri.getAuthority();
        String m = authority != null ? cqm0.m(authority) : null;
        return m != null && ((Regex) laz.a.getValue()).f(m);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean q(Uri uri) {
        String path;
        String path2;
        String host = uri.getHost();
        return host != null && host.length() != 0 && ((Regex) laz.a.getValue()).f(cqm0.m(String.valueOf(uri.getHost()))) && (((path = uri.getPath()) != null && brm0.v(path, "away.php", false)) || ((path2 = uri.getPath()) != null && brm0.v(path2, "away", false)));
    }

    public static final boolean r(Uri uri) {
        return epx.f(uri.getHost(), "dev.".concat(a0a.d));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean s(Uri uri) {
        String host = uri.getHost();
        if (host == null || host.length() == 0) {
            return false;
        }
        String m = cqm0.m(String.valueOf(uri.getHost()));
        return ((Regex) laz.a.getValue()).f(m) && !((Regex) laz.b.getValue()).f(m);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean t(Uri uri) {
        String host = uri.getHost();
        if (host == null || host.length() == 0) {
            return false;
        }
        return ((Regex) laz.h.getValue()).f(cqm0.m(String.valueOf(uri.getHost())));
    }

    public static final boolean u(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        int hashCode = scheme.hashCode();
        return hashCode != 3765 ? hashCode != 3621645 ? hashCode == 1958875067 && scheme.equals("vkontakte") : scheme.equals("vkme") : scheme.equals("vk");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean v(Uri uri) {
        String host = uri.getHost();
        if (host == null || host.length() == 0) {
            return false;
        }
        return ((Regex) laz.e.getValue()).f(cqm0.m(String.valueOf(uri.getHost())));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean w(Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            return ((Regex) laz.n.getValue()).f(cqm0.m(host)) && epx.f(uri.getQueryParameter("act"), "auth_web_by_app");
        }
        return false;
    }

    public static final boolean x(Uri uri) {
        return epx.f(uri.getHost(), "connect.".concat(a0a.d)) || epx.f(uri.getHost(), "id.".concat(a0a.d)) || epx.f(uri.getHost(), "oauth.".concat(a0a.d)) || m(uri) || k(uri);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean y(Uri uri) {
        return ((Regex) laz.N.getValue()).f(cqm0.m(String.valueOf(uri.getHost())));
    }

    public static final boolean z(Uri uri) {
        return epx.f(uri.getHost(), "id.".concat(a0a.d)) && jh.h("^/business($|(/.*))", new peq0(uri), null, null, 14);
    }
}
