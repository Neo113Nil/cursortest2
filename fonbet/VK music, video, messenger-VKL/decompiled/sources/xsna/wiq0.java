package xsna;

/* compiled from: UserEditProfilePatch.kt */
/* loaded from: classes5.dex */
public interface wiq0 extends xl50 {

    /* compiled from: UserEditProfilePatch.kt */
    public interface a extends wiq0 {
    }

    /* compiled from: UserEditProfilePatch.kt */
    public interface b extends wiq0 {

        /* compiled from: UserEditProfilePatch.kt */
        public static final class a implements b {
            public final e4s b;

            public a(e4s e4sVar) {
                this.b = e4sVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UpdateSettingsData(settingsData=" + this.b + ')';
            }
        }
    }

    /* compiled from: UserEditProfilePatch.kt */
    public interface c extends wiq0 {

        /* compiled from: UserEditProfilePatch.kt */
        public static final class a implements c {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ChangeClosedState(isClosed="), this.b, ')');
            }
        }
    }

    /* compiled from: UserEditProfilePatch.kt */
    public interface d extends wiq0 {

        /* compiled from: UserEditProfilePatch.kt */
        public static final class a implements d {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ChangeEnabledState(isEnabled="), this.b, ')');
            }
        }
    }

    /* compiled from: UserEditProfilePatch.kt */
    public static final class e implements wiq0 {
        public final akq0 b;

        public e(akq0 akq0Var) {
            this.b = akq0Var;
        }
    }

    /* compiled from: UserEditProfilePatch.kt */
    public interface f extends wiq0 {

        /* compiled from: UserEditProfilePatch.kt */
        public static final class a implements f {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 24962546;
            }

            public final String toString() {
                return "Close";
            }
        }
    }
}
