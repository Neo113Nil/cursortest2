package xsna;

import java.util.List;

/* compiled from: CommunityRepliesViewState.kt */
/* loaded from: classes18.dex */
public final class wwh implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: CommunityRepliesViewState.kt */
    public static final class a implements fm50<vwh> {
        public final yzt0<List<hfz>> a;
        public final yzt0<Boolean> b;
        public final yzt0<f4g0> c;
        public final yzt0<o4g0> d;
        public final yzt0<Boolean> e;
        public final yzt0<Boolean> f;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(items=");
            sb.append(this.a);
            sb.append(", isCommentBarVisible=");
            sb.append(this.b);
            sb.append(", replyBarFrom=");
            sb.append(this.c);
            sb.append(", replyBarToName=");
            sb.append(this.d);
            sb.append(", isReplyBarFromVisible=");
            sb.append(this.e);
            sb.append(", isScreenSpinnerVisible=");
            return tr.c(sb, this.f, ')');
        }
    }

    /* compiled from: CommunityRepliesViewState.kt */
    public static final class b implements fm50<vwh> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 226409362;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CommunityRepliesViewState.kt */
    public static final class c implements fm50<vwh> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 351703110;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public wwh(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }

    public final n0u0<a> a() {
        return this.a;
    }

    public final n0u0<b> b() {
        return this.b;
    }

    public final n0u0<c> c() {
        return this.c;
    }
}
