package xsna;

import kotlin.Pair;
import kotlin.text.Regex;

/* compiled from: HighlightedTextInfo.kt */
/* loaded from: classes17.dex */
public final class v5v {
    public static final bpn0 c = new bpn0(new fn4(17));
    public final String a;
    public final Pair<Integer, Integer> b;

    /* compiled from: HighlightedTextInfo.kt */
    public static final class a {
        public static v5v a(String str) {
            int K = drm0.K(0, 6, str, "<u>", false);
            int K2 = drm0.K(0, 6, str, "</u>", false);
            if (K == -1 || K2 == -1) {
                return new v5v(str, new Pair(-1, -1));
            }
            String g = ((Regex) v5v.c.getValue()).g(str, "");
            return new v5v(g, new Pair(Integer.valueOf(K), Integer.valueOf(Math.min(K2 - 3, g.length()))));
        }
    }

    public v5v(String str, Pair<Integer, Integer> pair) {
        this.a = str;
        this.b = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5v)) {
            return false;
        }
        v5v v5vVar = (v5v) obj;
        return epx.f(this.a, v5vVar.a) && epx.f(this.b, v5vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HighlightedTextInfo(cleanText=" + this.a + ", tokenPosition=" + this.b + ')';
    }
}
