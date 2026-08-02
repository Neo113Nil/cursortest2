package yads;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.ac20;
import xsna.azy0;
import xsna.on00;

/* loaded from: classes10.dex */
public final class xw1 implements lb2 {
    public final ic2 a;
    public final rw1 b;
    public final ex1 c;
    public final rm3 d;
    public final fc3 e;
    public final dq0 f;
    public final qu2 g;
    public String h;
    public boolean i;
    public final gq0 j;
    public final String k;
    public jx1 l;
    public wv1 m;
    public vv1 n;
    public kb2 o;
    public aj3 p;
    public km3 q;
    public cq0 r;

    public /* synthetic */ xw1(ix1 ix1Var) {
        this(ix1Var, new rw1(ix1Var), new ex1(), new rm3(), new fc3(), new dq0(), gx2.a().a(ix1Var.f()));
    }

    public final void a(cx1 cx1Var, LinkedHashMap linkedHashMap) {
        if (this.l == null) {
            throw new uw1("Invalid state to execute this command");
        }
        switch (cx1Var) {
            case EF0:
                aj3 aj3Var = this.p;
                if (aj3Var != null) {
                    ((pi3) aj3Var).a();
                    return;
                }
                return;
            case EF1:
                vv1 vv1Var = this.n;
                if (vv1Var != null) {
                    vv1Var.e();
                    return;
                }
                return;
            case EF2:
                vv1 vv1Var2 = this.n;
                if (vv1Var2 != null) {
                    vv1Var2.b();
                    return;
                }
                return;
            case EF3:
                if (km3.c == this.q) {
                    km3 km3Var = km3.e;
                    this.q = km3Var;
                    this.b.a(km3Var);
                    kb2 kb2Var = this.o;
                    if (kb2Var != null) {
                        kb2Var.c();
                        return;
                    }
                    return;
                }
                return;
            case EF4:
                a(linkedHashMap);
                return;
            case EF5:
                wv1 wv1Var = this.m;
                if (wv1Var != null) {
                    wv1Var.a();
                    return;
                }
                return;
            case EF6:
                boolean parseBoolean = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                kb2 kb2Var2 = this.o;
                if (kb2Var2 != null) {
                    kb2Var2.a(parseBoolean);
                    return;
                }
                return;
            case d:
            default:
                throw new uw1("Unspecified MRAID Javascript command");
            case EF90:
                qu2 qu2Var = this.g;
                if (qu2Var == null || !qu2Var.C0) {
                    return;
                }
                this.a.a();
                return;
        }
    }

    public final void b(String str) {
        this.e.getClass();
        if (!fc3.a(str)) {
            this.b.a(cx1.d, "Mraid command sent an invalid URL");
            return;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (!CampaignEx.JSON_KEY_MRAID.equals(scheme) && !"mobileads".equals(scheme)) {
            a(on00.f(new Pair("url", str)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : parse.getQueryParameterNames()) {
            linkedHashMap.put(str2, parse.getQueryParameter(str2));
        }
        cx1.c.getClass();
        cx1 a = bx1.a(host);
        try {
            a(a, linkedHashMap);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.b.a(a, message);
        }
        this.b.a(a);
    }

    public final void c(yw1 yw1Var) {
        this.o = yw1Var;
    }

    public xw1(ix1 ix1Var, rw1 rw1Var, ex1 ex1Var, rm3 rm3Var, fc3 fc3Var, dq0 dq0Var, qu2 qu2Var) {
        this.a = ix1Var;
        this.b = rw1Var;
        this.c = ex1Var;
        this.d = rm3Var;
        this.e = fc3Var;
        this.f = dq0Var;
        this.g = qu2Var;
        n11 n11Var = new n11(new ww1(this));
        n11Var.a(new vt2("mraid.js", new ac20(this, 28)));
        this.q = km3.d;
        ix1Var.setWebViewClient(n11Var);
        this.j = new gq0(ix1Var, dq0Var, this);
        this.k = tb.a(this);
    }

    public final void a(Map map) {
        q11 q11Var;
        if (this.l != null) {
            qu2 qu2Var = this.g;
            if (qu2Var == null || !qu2Var.E0 || this.i) {
                String str = (String) map.get("url");
                if (str != null && str.length() > 0) {
                    jx1 jx1Var = this.l;
                    if (jx1Var == null || (q11Var = (q11) jx1Var.a.get()) == null) {
                        return;
                    }
                    q11Var.a(str);
                    return;
                }
                throw new uw1(String.format("Mraid open command sent an invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1)));
            }
        }
    }

    public final void b(yw1 yw1Var) {
        this.m = yw1Var;
    }

    public final void a(String str) {
        Context context = this.a.getContext();
        ex1 ex1Var = this.c;
        String str2 = this.k;
        azy0 azy0Var = new azy0(this, str);
        ex1Var.getClass();
        qu2 a = gx2.a().a(context);
        String str3 = a != null ? a.S : null;
        if (str3 != null && str3.length() > 0) {
            l53 a2 = ex1.a(str3, str2, azy0Var);
            synchronized (xp2.a()) {
                t92.a(context).a(a2);
            }
            return;
        }
        azy0Var.a(ex1.a);
    }

    public static final void a(xw1 xw1Var, String str, String str2) {
        xw1Var.h = str2;
        ic2 ic2Var = xw1Var.b.a;
        ic2Var.loadDataWithBaseURL("https://yandex.ru", ic2Var.a(str), "text/html", C.UTF8_NAME, null);
    }

    public static final String a(xw1 xw1Var) {
        return xw1Var.h;
    }

    public final void a() {
        q11 q11Var;
        this.i = true;
        jx1 jx1Var = this.l;
        if (jx1Var == null || (q11Var = (q11) jx1Var.a.get()) == null) {
            return;
        }
        q11Var.a();
    }

    public final void a(yw1 yw1Var) {
        this.n = yw1Var;
    }

    public final void a(pi3 pi3Var) {
        this.p = pi3Var;
    }
}
