package xsna;

/* compiled from: VoipCallByPhoneState.kt */
/* loaded from: classes7.dex */
public abstract class rgw0 implements km50 {

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class a extends rgw0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1475257916;
        }

        public final String toString() {
            return "CallToSelf";
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class b extends rgw0 {
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

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class c extends rgw0 {
        public final qtd0 b;

        public c(qtd0 qtd0Var) {
            this.b = qtd0Var;
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
            return qq.f(new StringBuilder("CallsDisabled(profile="), this.b, ')');
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class d extends rgw0 {
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public d(String str, boolean z, boolean z2, boolean z3) {
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnterData(phone=");
            sb.append(this.b);
            sb.append(", actionButtonEnabled=");
            sb.append(this.c);
            sb.append(", clearInput=");
            sb.append(this.d);
            sb.append(", showKeyboard=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class e extends rgw0 {
        public final rgw0 b;

        public e(rgw0 rgw0Var) {
            this.b = rgw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoadingShare(previousState=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class f extends rgw0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1435575896;
        }

        public final String toString() {
            return "LoadingUser";
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class g extends rgw0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 592246743;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class h extends rgw0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 8457044;
        }

        public final String toString() {
            return "UnknownShare";
        }
    }

    /* compiled from: VoipCallByPhoneState.kt */
    public static final class i extends rgw0 {
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
