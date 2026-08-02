package xsna;

/* compiled from: CanCallInfo.kt */
/* loaded from: classes7.dex */
public abstract class ap9 {

    /* compiled from: CanCallInfo.kt */
    public static final class a extends ap9 {
        public static final a a = new a();
    }

    /* compiled from: CanCallInfo.kt */
    public static final class b extends ap9 {
        public final gp9 a;

        public b(gp9 gp9Var) {
            this.a = gp9Var;
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
            return "CanNotCall(userInfo=" + this.a + ')';
        }
    }
}
