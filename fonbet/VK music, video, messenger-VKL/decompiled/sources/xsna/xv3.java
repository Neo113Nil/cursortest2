package xsna;

/* compiled from: AsrRecordFeatureEvent.kt */
/* loaded from: classes7.dex */
public abstract class xv3 {

    /* compiled from: AsrRecordFeatureEvent.kt */
    public static final class a extends xv3 {
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
            return oq.c(new StringBuilder("StopError(throwable="), this.a, ')');
        }
    }
}
