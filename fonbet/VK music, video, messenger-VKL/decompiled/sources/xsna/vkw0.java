package xsna;

/* compiled from: VoipCallsJoinToCallByPasswordAction.kt */
/* loaded from: classes7.dex */
public interface vkw0 extends kj50 {

    /* compiled from: VoipCallsJoinToCallByPasswordAction.kt */
    public static final class a implements vkw0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1071183693;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordAction.kt */
    public static final class b implements vkw0 {
        public final String b;

        public b(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("OnChangeTextForLink(text="), this.b, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordAction.kt */
    public static final class c implements vkw0 {
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
            return ho8.a(new StringBuilder("OnChangeTextForPassword(text="), this.b, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordAction.kt */
    public static final class d implements vkw0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1148084134;
        }

        public final String toString() {
            return "OnClickJoinBtn";
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordAction.kt */
    public static final class e implements vkw0 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SwitchAccount(isShouldBeEdu="), this.b, ')');
        }
    }
}
