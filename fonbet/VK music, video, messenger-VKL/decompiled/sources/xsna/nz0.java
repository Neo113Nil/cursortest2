package xsna;

/* compiled from: AdsItemState.kt */
/* loaded from: classes17.dex */
public interface nz0 extends km50 {

    /* compiled from: AdsItemState.kt */
    public static final class a implements nz0 {
        public final hw0 b;
        public final nlh0 c;
        public final kih0 d;
        public final j4b0 e;
        public final ixp0 f;
        public final gvp g;
        public final boolean h;
        public final ev i;
        public final boolean j;
        public final boolean k;
        public final wp50 l;

        public a(hw0 hw0Var, nlh0 nlh0Var, kih0 kih0Var, j4b0 j4b0Var, ixp0 ixp0Var, gvp gvpVar, boolean z, ev evVar, boolean z2, boolean z3, wp50 wp50Var) {
            this.b = hw0Var;
            this.c = nlh0Var;
            this.d = kih0Var;
            this.e = j4b0Var;
            this.f = ixp0Var;
            this.g = gvpVar;
            this.h = z;
            this.i = evVar;
            this.j = z2;
            this.k = z3;
            this.l = wp50Var;
        }

        public static a a(a aVar, hw0 hw0Var, j4b0 j4b0Var, ixp0 ixp0Var, gvp gvpVar, boolean z, ev evVar, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                hw0Var = aVar.b;
            }
            hw0 hw0Var2 = hw0Var;
            nlh0 nlh0Var = aVar.c;
            kih0 kih0Var = aVar.d;
            j4b0 j4b0Var2 = (i & 8) != 0 ? aVar.e : j4b0Var;
            ixp0 ixp0Var2 = (i & 16) != 0 ? aVar.f : ixp0Var;
            gvp gvpVar2 = (i & 32) != 0 ? aVar.g : gvpVar;
            boolean z4 = (i & 64) != 0 ? aVar.h : z;
            ev evVar2 = (i & 128) != 0 ? aVar.i : evVar;
            boolean z5 = (i & 256) != 0 ? aVar.j : z2;
            boolean z6 = (i & 512) != 0 ? aVar.k : z3;
            return (hw0Var2.equals(aVar.b) && nlh0Var.equals(aVar.c) && kih0Var.equals(aVar.d) && j4b0Var2.equals(aVar.e) && ixp0Var2.equals(aVar.f) && gvpVar2.equals(aVar.g) && z4 == aVar.h && evVar2.equals(aVar.i) && z5 == aVar.j && z6 == aVar.k) ? aVar : new a(hw0Var2, nlh0Var, kih0Var, j4b0Var2, ixp0Var2, gvpVar2, z4, evVar2, z5, z6, aVar.l);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h && epx.f(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k && epx.f(this.l, aVar.l);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b((this.i.hashCode() + qoy.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h)) * 31, 31, this.j), 31, this.k);
            wp50 wp50Var = this.l;
            return b + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(clipState=");
            sb.append(this.b);
            sb.append(", videoFileController=");
            sb.append(this.c);
            sb.append(", autoPlay=");
            sb.append(this.d);
            sb.append(", playerState=");
            sb.append(this.e);
            sb.append(", uiVisibilityConfig=");
            sb.append(this.f);
            sb.append(", errorData=");
            sb.append(this.g);
            sb.append(", descriptionExpanded=");
            sb.append(this.h);
            sb.append(", actionButtonState=");
            sb.append(this.i);
            sb.append(", isVideoFocused=");
            sb.append(this.j);
            sb.append(", muteInClipFeed=");
            sb.append(this.k);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.l, ')');
        }
    }

    /* compiled from: AdsItemState.kt */
    public static final class b implements nz0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -18753037;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
