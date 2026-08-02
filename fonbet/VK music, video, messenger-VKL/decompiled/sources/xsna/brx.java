package xsna;

/* compiled from: InviteFriendsEvent.kt */
/* loaded from: classes14.dex */
public interface brx {

    /* compiled from: InviteFriendsEvent.kt */
    public static final class a implements brx {
        public static final a a = new a();
    }

    /* compiled from: InviteFriendsEvent.kt */
    public static final class b implements brx {
        public static final b a = new b();
    }

    /* compiled from: InviteFriendsEvent.kt */
    public static final class c implements brx {
        public final tlo0 a;

        public c(tlo0 tlo0Var) {
            this.a = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return bt.a(new StringBuilder("ShowError(message="), this.a, ')');
        }
    }

    /* compiled from: InviteFriendsEvent.kt */
    public static final class d implements brx {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowInviteRevoked(userPhotoUrl=");
            sb.append(this.a);
            sb.append(", userName=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: InviteFriendsEvent.kt */
    public static final class e implements brx {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowInvitesSent(count="), this.a, ')');
        }
    }
}
