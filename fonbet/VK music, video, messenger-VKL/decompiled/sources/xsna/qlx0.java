package xsna;

/* compiled from: WhiteboardFeatureState.kt */
/* loaded from: classes7.dex */
public final class qlx0 implements km50 {
    public final jlx0 b;
    public final boolean c;
    public final boolean d;
    public final a e;

    /* compiled from: WhiteboardFeatureState.kt */
    public interface a {

        /* compiled from: WhiteboardFeatureState.kt */
        /* renamed from: xsna.qlx0$a$a, reason: collision with other inner class name */
        public static final class C3565a implements a {
            public static final C3565a a = new C3565a();
        }

        /* compiled from: WhiteboardFeatureState.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("WhiteboardByHash(whiteboardHash="), this.a, ')');
            }
        }

        /* compiled from: WhiteboardFeatureState.kt */
        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("WhiteboardByLink(whiteboardLink="), this.a, ')');
            }
        }
    }

    public qlx0() {
        this(0);
    }

    public static qlx0 a(qlx0 qlx0Var, jlx0 jlx0Var, boolean z, boolean z2, a aVar, int i) {
        if ((i & 1) != 0) {
            jlx0Var = qlx0Var.b;
        }
        if ((i & 2) != 0) {
            z = qlx0Var.c;
        }
        if ((i & 4) != 0) {
            z2 = qlx0Var.d;
        }
        if ((i & 8) != 0) {
            aVar = qlx0Var.e;
        }
        qlx0Var.getClass();
        return new qlx0(jlx0Var, z, z2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlx0)) {
            return false;
        }
        qlx0 qlx0Var = (qlx0) obj;
        return epx.f(this.b, qlx0Var.b) && this.c == qlx0Var.c && this.d == qlx0Var.d && epx.f(this.e, qlx0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "WhiteboardFeatureState(actions=" + this.b + ", isCallMenuExpanded=" + this.c + ", isWhiteboardMenuOpened=" + this.d + ", whiteboardState=" + this.e + ')';
    }

    public qlx0(jlx0 jlx0Var, boolean z, boolean z2, a aVar) {
        this.b = jlx0Var;
        this.c = z;
        this.d = z2;
        this.e = aVar;
    }

    public /* synthetic */ qlx0(int i) {
        this(new jlx0(0), false, false, a.C3565a.a);
    }
}
