package xsna;

/* compiled from: VoipParticipantSettingsPatch.kt */
/* loaded from: classes7.dex */
public interface ytw0 extends xl50 {

    /* compiled from: VoipParticipantSettingsPatch.kt */
    public static final class a implements ytw0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 824008365;
        }

        public final String toString() {
            return "ClearError";
        }
    }

    /* compiled from: VoipParticipantSettingsPatch.kt */
    public static final class b implements ytw0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("SetError(error="), this.b, ')');
        }
    }

    /* compiled from: VoipParticipantSettingsPatch.kt */
    public static final class c implements ytw0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetLoading(isLoading="), this.b, ')');
        }
    }

    /* compiled from: VoipParticipantSettingsPatch.kt */
    public static final class d implements ytw0 {
        public final buw0 b;

        public d(buw0 buw0Var) {
            this.b = buw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetState(state=" + this.b + ')';
        }
    }
}
