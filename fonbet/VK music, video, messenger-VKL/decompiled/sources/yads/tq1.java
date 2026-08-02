package yads;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.brm0;
import xsna.drm0;
import xsna.e43;

/* loaded from: classes10.dex */
public final class tq1 {
    public final List a;

    public /* synthetic */ tq1() {
        this(e43.l("AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native"));
    }

    public final e00 a(rr1 rr1Var) {
        Object obj;
        String str = rr1Var.b;
        String W = drm0.W(drm0.i0(JwtParser.SEPARATOR_CHAR, str, str), "Adapter");
        if (W.length() <= 0) {
            W = null;
        }
        if (W != null) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (brm0.v(W, (String) obj, false)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                d00 d00Var = e00.c;
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                d00Var.getClass();
                return d00.a(lowerCase);
            }
        }
        return null;
    }

    public final String b(rr1 rr1Var) {
        Object obj;
        String str = rr1Var.b;
        String W = drm0.W(drm0.i0(JwtParser.SEPARATOR_CHAR, str, str), "Adapter");
        if (W.length() <= 0) {
            W = null;
        }
        if (W != null) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (brm0.v(W, (String) obj, false)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                String W2 = drm0.W(W, str2);
                if (W2.length() > 0) {
                    return W2;
                }
            }
        }
        return null;
    }

    public tq1(List list) {
        this.a = list;
    }
}
