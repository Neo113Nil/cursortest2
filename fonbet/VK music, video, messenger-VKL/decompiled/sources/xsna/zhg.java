package xsna;

/* compiled from: CommonCallListToastEvent.kt */
/* loaded from: classes7.dex */
public abstract class zhg {

    /* compiled from: CommonCallListToastEvent.kt */
    public static final class a extends zhg {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }
}
