package xsna;

/* compiled from: FinishedBroadcastInfo.kt */
/* loaded from: classes7.dex */
public abstract class mhr {

    /* compiled from: FinishedBroadcastInfo.kt */
    public static final class a extends mhr {
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
            return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n23.b(new StringBuilder("AdminBroadcastInfo(canFinish="), this.a, ", canViewStats=false)");
        }
    }

    /* compiled from: FinishedBroadcastInfo.kt */
    public static final class b extends mhr {
        public final dfw0 a;

        public b(dfw0 dfw0Var) {
            this.a = dfw0Var;
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
            return "AuthorBroadcastInfo(broadcastInfo=" + this.a + ')';
        }
    }
}
