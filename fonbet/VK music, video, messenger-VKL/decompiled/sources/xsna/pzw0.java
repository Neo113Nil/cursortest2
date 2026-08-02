package xsna;

import java.util.List;

/* compiled from: VoipSelectMovieViewState.kt */
/* loaded from: classes7.dex */
public final class pzw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipSelectMovieViewState.kt */
    public static final class a implements fm50<nzw0> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: VoipSelectMovieViewState.kt */
    public static abstract class b {

        /* compiled from: VoipSelectMovieViewState.kt */
        public static final class a extends b {
            public final p3x0 a;
            public final boolean b;

            public a(p3x0 p3x0Var, boolean z) {
                this.a = p3x0Var;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                p3x0 p3x0Var = this.a;
                return Boolean.hashCode(this.b) + ((p3x0Var == null ? 0 : p3x0Var.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MovieTabs(activeVideo=");
                sb.append(this.a);
                sb.append(", canControlVideo=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: VoipSelectMovieViewState.kt */
        /* renamed from: xsna.pzw0$b$b, reason: collision with other inner class name */
        public static final class C3539b extends b {
            public final List<zzw0> a;
            public final boolean b;
            public final set0 c;
            public final long d;
            public final p3x0 e;
            public final boolean f;

            public C3539b() {
                throw null;
            }

            public C3539b(List list, boolean z, set0 set0Var, p3x0 p3x0Var, boolean z2) {
                long currentTimeMillis = System.currentTimeMillis();
                this.a = list;
                this.b = z;
                this.c = set0Var;
                this.d = currentTimeMillis;
                this.e = p3x0Var;
                this.f = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3539b)) {
                    return false;
                }
                C3539b c3539b = (C3539b) obj;
                return epx.f(this.a, c3539b.a) && this.b == c3539b.b && epx.f(this.c, c3539b.c) && this.d == c3539b.d && epx.f(this.e, c3539b.e) && this.f == c3539b.f;
            }

            public final int hashCode() {
                int a = bh10.a((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
                p3x0 p3x0Var = this.e;
                return Boolean.hashCode(this.f) + ((a + (p3x0Var == null ? 0 : p3x0Var.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SearchContent(items=");
                sb.append(this.a);
                sb.append(", showFilters=");
                sb.append(this.b);
                sb.append(", filters=");
                sb.append(this.c);
                sb.append(", timeStamp=");
                sb.append(this.d);
                sb.append(", activeVideo=");
                sb.append(this.e);
                sb.append(", canControlVideo=");
                return defpackage.q0.a(sb, this.f, ')');
            }
        }
    }

    public pzw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
