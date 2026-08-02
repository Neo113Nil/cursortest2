package xsna;

/* compiled from: ModerationConfirmAdultMVI.kt */
/* loaded from: classes18.dex */
public interface u430 {

    /* compiled from: ModerationConfirmAdultMVI.kt */
    public static final class a implements u430 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Close(canceled="), this.a, ')');
        }
    }

    /* compiled from: ModerationConfirmAdultMVI.kt */
    public static final class b implements u430 {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }
}
