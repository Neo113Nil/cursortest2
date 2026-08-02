package xsna;

import xsna.d4c0;

/* compiled from: ActionWithOfflineSupport.kt */
/* loaded from: classes4.dex */
public interface du {

    /* compiled from: ActionWithOfflineSupport.kt */
    public static final class a implements du {
        public final x60 a;

        public a(x60 x60Var) {
            this.a = x60Var;
        }

        public final x60 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return shy.a(7, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "RecoverableError(action=" + this.a + ", maxAllowedAttemptCount=7, errorData=null)";
        }
    }

    /* compiled from: ActionWithOfflineSupport.kt */
    public static final class b implements du {
        public final x60 a;
        public final d4c0.a b;

        public b(x60 x60Var, d4c0.a aVar) {
            this.a = x60Var;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(action=" + this.a + ", resultData=" + this.b + ')';
        }
    }

    /* compiled from: ActionWithOfflineSupport.kt */
    public static final class c implements du {
        public final x60 a;

        public c(x60 x60Var) {
            this.a = x60Var;
        }

        public final x60 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UnrecoverableError(action=" + this.a + ')';
        }
    }
}
