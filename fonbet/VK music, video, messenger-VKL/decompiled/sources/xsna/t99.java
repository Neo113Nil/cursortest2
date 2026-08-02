package xsna;

/* compiled from: CallSounds.kt */
/* loaded from: classes7.dex */
public interface t99 {

    /* compiled from: CallSounds.kt */
    public static final class a {
        public a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Params(callConnectingSound=null, callWaitingForAcceptSound=null, callConnectedSound=null, callFinishedSound=null, callIncomingSound=null)";
        }

        public a(int i) {
        }
    }

    /* compiled from: CallSounds.kt */
    public interface b {

        /* compiled from: CallSounds.kt */
        public static final class a implements b {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("RawResource(resourceId="), this.a, ')');
            }
        }

        /* compiled from: CallSounds.kt */
        /* renamed from: xsna.t99$b$b, reason: collision with other inner class name */
        public static final class C3728b implements b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3728b)) {
                    return false;
                }
                ((C3728b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ResourceUri(uri=null)";
            }
        }
    }

    b a();

    b b();

    b c();

    b d();

    b e();
}
