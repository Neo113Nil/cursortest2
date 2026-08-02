package xsna;

/* compiled from: StaticAdsItemState.kt */
/* loaded from: classes17.dex */
public interface mwk0 extends km50 {

    /* compiled from: StaticAdsItemState.kt */
    public static final class a implements mwk0 {
        public final jxk0 b;
        public final boolean c;
        public final dv d;
        public final ixp0 e;
        public final boolean f;

        public a(jxk0 jxk0Var, boolean z, dv dvVar, ixp0 ixp0Var, boolean z2) {
            this.b = jxk0Var;
            this.c = z;
            this.d = dvVar;
            this.e = ixp0Var;
            this.f = z2;
        }

        public static a a(a aVar, jxk0 jxk0Var, boolean z, dv dvVar, ixp0 ixp0Var, boolean z2, int i) {
            if ((i & 1) != 0) {
                jxk0Var = aVar.b;
            }
            jxk0 jxk0Var2 = jxk0Var;
            if ((i & 2) != 0) {
                z = aVar.c;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                dvVar = aVar.d;
            }
            dv dvVar2 = dvVar;
            if ((i & 8) != 0) {
                ixp0Var = aVar.e;
            }
            ixp0 ixp0Var2 = ixp0Var;
            if ((i & 16) != 0) {
                z2 = aVar.f;
            }
            boolean z4 = z2;
            return (jxk0Var2.equals(aVar.b) && z3 == aVar.c && dvVar2.equals(aVar.d) && ixp0Var2.equals(aVar.e) && z4 == aVar.f) ? aVar : new a(jxk0Var2, z3, dvVar2, ixp0Var2, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(staticAdsState=");
            sb.append(this.b);
            sb.append(", descriptionExpanded=");
            sb.append(this.c);
            sb.append(", actionButtonState=");
            sb.append(this.d);
            sb.append(", uiVisibilityConfig=");
            sb.append(this.e);
            sb.append(", isStaticAdFocused=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: StaticAdsItemState.kt */
    public static final class b implements mwk0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1463962514;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
