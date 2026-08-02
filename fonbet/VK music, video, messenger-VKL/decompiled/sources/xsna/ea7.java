package xsna;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public abstract class ea7 {

    /* compiled from: FriendsBirthdayModalPage.kt */
    public static final class b extends ea7 {
        public final ba7 a;

        public b(ba7 ba7Var) {
            this.a = ba7Var;
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
            return "BirthdayModalItemUser(user=" + this.a + ')';
        }
    }

    /* compiled from: FriendsBirthdayModalPage.kt */
    public static final class a extends ea7 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("BirthdayModalItemHeader(title="), this.a, ')');
        }

        public a() {
            this(null);
        }
    }
}
