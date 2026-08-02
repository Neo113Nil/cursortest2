package xsna;

/* compiled from: MotionAnimationState.kt */
/* loaded from: classes7.dex */
public interface aa30 {

    /* compiled from: MotionAnimationState.kt */
    public static final class a implements aa30 {
        public final nb30 a;

        public a(nb30 nb30Var) {
            this.a = nb30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Final(stateId=" + this.a + ')';
        }
    }

    /* compiled from: MotionAnimationState.kt */
    public static final class b implements aa30 {
        public final ei a;
        public final float b;
        public final boolean c;
        public final nb30 d;

        public /* synthetic */ b(ei eiVar, float f, nb30 nb30Var, int i) {
            this(eiVar, f, (i & 4) == 0, (i & 8) != 0 ? null : nb30Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0 && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
            nb30 nb30Var = this.d;
            return b + (nb30Var == null ? 0 : nb30Var.hashCode());
        }

        public final String toString() {
            return "InProgress(transition=" + this.a + ", progress=" + this.b + ", isTouchAnimation=" + this.c + ", targetState=" + this.d + ')';
        }

        public b(ei eiVar, float f, boolean z, nb30 nb30Var) {
            this.a = eiVar;
            this.b = f;
            this.c = z;
            this.d = nb30Var;
        }
    }
}
