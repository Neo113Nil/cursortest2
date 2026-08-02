package xsna;

/* compiled from: JoinCallToastEvent.kt */
/* loaded from: classes7.dex */
public interface vzx {

    /* compiled from: JoinCallToastEvent.kt */
    public static final class a implements vzx {
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
            return oq.c(new StringBuilder("ShowCommonError(throwable="), this.a, ')');
        }
    }
}
