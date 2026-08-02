package xsna;

/* compiled from: VoipCallsJoinToCallByPasswordPatch.kt */
/* loaded from: classes7.dex */
public interface flw0 extends xl50 {

    /* compiled from: VoipCallsJoinToCallByPasswordPatch.kt */
    public static final class a implements flw0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 256587079;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordPatch.kt */
    public static final class b implements flw0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetButtonEnabled(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordPatch.kt */
    public static final class c implements flw0 {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SetTextForLink(text="), this.b, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordPatch.kt */
    public static final class d implements flw0 {
        public final String b;

        public d(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("SetTextForPassword(text="), this.b, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordPatch.kt */
    public static final class e implements flw0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "SetVisiblePasswordField(isVisible=true)";
        }
    }
}
