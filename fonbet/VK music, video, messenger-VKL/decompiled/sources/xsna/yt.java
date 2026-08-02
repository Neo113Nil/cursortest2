package xsna;

/* compiled from: Action.kt */
/* loaded from: classes16.dex */
public interface yt {

    /* compiled from: Action.kt */
    public static final class a implements yt {
        public static final a a = new a();
    }

    /* compiled from: Action.kt */
    public static final class b implements yt {
        public static final b a = new b();
    }

    /* compiled from: Action.kt */
    public static final class c implements yt {
        public static final c a = new c();
    }

    /* compiled from: Action.kt */
    public static final class d implements yt {
        public final ikr0 a;

        public d(ikr0 ikr0Var) {
            this.a = ikr0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectVariant(variant=" + this.a + ')';
        }
    }
}
