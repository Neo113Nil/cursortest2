package xsna;

/* compiled from: VoipCallByPhoneAction.kt */
/* loaded from: classes7.dex */
public abstract class lgw0 implements kj50 {

    /* compiled from: VoipCallByPhoneAction.kt */
    public static final class a extends lgw0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1191828329;
        }

        public final String toString() {
            return "ActionButtonClicked";
        }
    }

    /* compiled from: VoipCallByPhoneAction.kt */
    public static final class b extends lgw0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -864460098;
        }

        public final String toString() {
            return "AlternativeButtonClicked";
        }
    }

    /* compiled from: VoipCallByPhoneAction.kt */
    public static final class c extends lgw0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -777293666;
        }

        public final String toString() {
            return "ClearButtonClicked";
        }
    }

    /* compiled from: VoipCallByPhoneAction.kt */
    public static final class d extends lgw0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1675329306;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VoipCallByPhoneAction.kt */
    public static final class e extends lgw0 {
        public final String b;

        public e(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("PhoneChanged(phone="), this.b, ')');
        }
    }
}
