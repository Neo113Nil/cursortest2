package xsna;

/* compiled from: VideoBaseImmediateState.kt */
/* loaded from: classes17.dex */
public interface m5s0 {

    /* compiled from: VideoBaseImmediateState.kt */
    public static final class a implements m5s0 {
        public final f5s0 a;
        public final kih0 b;
        public final j4b0 c;
        public final rlh0 d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public a(f5s0 f5s0Var, kih0 kih0Var, j4b0 j4b0Var, rlh0 rlh0Var, boolean z, boolean z2, boolean z3) {
            this.a = f5s0Var;
            this.b = kih0Var;
            this.c = j4b0Var;
            this.d = rlh0Var;
            this.e = z;
            this.f = z2;
            this.g = z3;
        }

        public static a a(a aVar, j4b0 j4b0Var, rlh0 rlh0Var, boolean z, boolean z2, boolean z3, int i) {
            f5s0 f5s0Var = aVar.a;
            kih0 kih0Var = aVar.b;
            if ((i & 4) != 0) {
                j4b0Var = aVar.c;
            }
            j4b0 j4b0Var2 = j4b0Var;
            if ((i & 8) != 0) {
                rlh0Var = aVar.d;
            }
            rlh0 rlh0Var2 = rlh0Var;
            if ((i & 16) != 0) {
                z = aVar.e;
            }
            boolean z4 = z;
            if ((i & 32) != 0) {
                z2 = aVar.f;
            }
            boolean z5 = z2;
            if ((i & 64) != 0) {
                z3 = aVar.g;
            }
            boolean z6 = z3;
            return (f5s0Var.equals(f5s0Var) && kih0Var.equals(aVar.b) && j4b0Var2.equals(aVar.c) && rlh0Var2.equals(aVar.d) && z4 == aVar.e && z5 == aVar.f && z6 == aVar.g) ? aVar : new a(f5s0Var, kih0Var, j4b0Var2, rlh0Var2, z4, z5, z6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bound(clipState=");
            sb.append(this.a);
            sb.append(", autoPlay=");
            sb.append(this.b);
            sb.append(", playerState=");
            sb.append(this.c);
            sb.append(", playerVideoSize=");
            sb.append(this.d);
            sb.append(", videoFocused=");
            sb.append(this.e);
            sb.append(", transitioningCurrentAutoPlay=");
            sb.append(this.f);
            sb.append(", frameWasRenderedOnItemVideoTexture=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: VideoBaseImmediateState.kt */
    public static final class b implements m5s0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1526508631;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
