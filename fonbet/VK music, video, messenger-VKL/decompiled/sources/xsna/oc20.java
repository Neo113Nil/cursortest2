package xsna;

/* compiled from: MessageViewsNavigationEvent.kt */
/* loaded from: classes2.dex */
public abstract class oc20 implements vl50 {

    /* compiled from: MessageViewsNavigationEvent.kt */
    public static final class a extends oc20 {
        public static final a a = new a();
    }

    /* compiled from: MessageViewsNavigationEvent.kt */
    public static final class b extends oc20 {
        public final qtd0 a;

        public b(qtd0 qtd0Var) {
            this.a = qtd0Var;
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
            return qq.f(new StringBuilder("OpenProfile(profile="), this.a, ')');
        }
    }
}
