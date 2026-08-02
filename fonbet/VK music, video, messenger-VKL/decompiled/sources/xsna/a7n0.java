package xsna;

/* compiled from: SuperAppAction.kt */
/* loaded from: classes6.dex */
public abstract class a7n0 {

    /* compiled from: SuperAppAction.kt */
    public static final class a extends a7n0 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("ShowSettings(text="), this.a, ')');
        }
    }
}
