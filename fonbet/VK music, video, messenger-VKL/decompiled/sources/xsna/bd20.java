package xsna;

/* compiled from: MessageViewsViewAction.kt */
/* loaded from: classes2.dex */
public abstract class bd20 implements kj50 {

    /* compiled from: MessageViewsViewAction.kt */
    public static final class a extends bd20 {
        public static final a b = new a();
    }

    /* compiled from: MessageViewsViewAction.kt */
    public static final class b extends bd20 {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LastVisiblePositionChanged(position="), this.b, ')');
        }
    }

    /* compiled from: MessageViewsViewAction.kt */
    public static final class c extends bd20 {
        public final qtd0 b;

        public c(qtd0 qtd0Var) {
            this.b = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return qq.f(new StringBuilder("OpenProfile(profile="), this.b, ')');
        }
    }

    /* compiled from: MessageViewsViewAction.kt */
    public static final class d extends bd20 {
        public static final d b = new d();
    }
}
