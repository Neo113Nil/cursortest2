package xsna;

/* compiled from: NavigationEventTransitionState.kt */
/* loaded from: classes.dex */
public abstract class qy50 {

    /* compiled from: NavigationEventTransitionState.kt */
    public static final class a extends qy50 {
        public static final a a = new a();

        public final String toString() {
            return "Idle()";
        }
    }

    /* compiled from: NavigationEventTransitionState.kt */
    /* loaded from: classes12.dex */
    public static final class b extends qy50 {
        public final hy50 a;
        public final int b;

        public b(hy50 hy50Var, int i) {
            this.a = hy50Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.a, bVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + (this.b * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
            sb.append(this.a);
            sb.append(", direction=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
