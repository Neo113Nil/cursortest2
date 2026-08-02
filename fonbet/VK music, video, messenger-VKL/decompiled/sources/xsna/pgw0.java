package xsna;

/* compiled from: VoipCallByPhonePatch.kt */
/* loaded from: classes7.dex */
public abstract class pgw0 implements xl50 {

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class a extends pgw0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1542084013;
        }

        public final String toString() {
            return "CallToSelf";
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class b extends pgw0 {
        public final qtd0 b;

        public b(qtd0 qtd0Var) {
            this.b = qtd0Var;
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
            return qq.f(new StringBuilder("CallToUser(profile="), this.b, ')');
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class c extends pgw0 {
        public final rgw0 b;

        public c(rgw0 rgw0Var) {
            this.b = rgw0Var;
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
            return "CallUrlCreation(previousState=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class d extends pgw0 {
        public final qtd0 b;

        public d(qtd0 qtd0Var) {
            this.b = qtd0Var;
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
            return qq.f(new StringBuilder("CallsDisabled(profile="), this.b, ')');
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class e extends pgw0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2122119181;
        }

        public final String toString() {
            return "CheckingUser";
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class f extends pgw0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2095385688;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class g extends pgw0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -535695635;
        }

        public final String toString() {
            return "UnknownUser";
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class h extends pgw0 {
        public final String b;
        public final boolean c;
        public final boolean d;

        public h(String str, boolean z, boolean z2) {
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserInputChanged(userInput=");
            sb.append(this.b);
            sb.append(", isActionButtonEnabled=");
            sb.append(this.c);
            sb.append(", clearInput=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipCallByPhonePatch.kt */
    public static final class i extends pgw0 {
        public final qtd0 b;

        public i(qtd0 qtd0Var) {
            this.b = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return qq.f(new StringBuilder("WasOfflineTooLong(profile="), this.b, ')');
        }
    }
}
