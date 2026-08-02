package xsna;

/* compiled from: FloatingButton.kt */
/* loaded from: classes16.dex */
public interface srr {

    /* compiled from: FloatingButton.kt */
    public static final class a implements srr {
        public final tlo0 a;

        public a(tlo0 tlo0Var) {
            this.a = tlo0Var;
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
            return bt.a(new StringBuilder("Text(text="), this.a, ')');
        }
    }
}
