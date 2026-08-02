package xsna;

/* compiled from: InviteFriendsMviState.kt */
/* loaded from: classes14.dex */
public interface erx extends km50 {

    /* compiled from: InviteFriendsMviState.kt */
    public static final class a implements erx {
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
            throw null;
        }

        public final String toString() {
            return "Error(exception=null)";
        }
    }

    /* compiled from: InviteFriendsMviState.kt */
    public static final class b implements erx {
        public static final b b = new b();
    }

    /* compiled from: InviteFriendsMviState.kt */
    public static final class c implements erx {
        public final isx b;
        public final lps c;
        public final uyh0 d;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this((isx) null, (lps) (0 == true ? 1 : 0), 7);
        }

        public static c a(c cVar, isx isxVar, uyh0 uyh0Var, int i) {
            if ((i & 1) != 0) {
                isxVar = cVar.b;
            }
            lps lpsVar = cVar.c;
            if ((i & 4) != 0) {
                uyh0Var = cVar.d;
            }
            cVar.getClass();
            return new c(isxVar, lpsVar, uyh0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Main(tabsState=" + this.b + ", invitationState=" + this.c + ", search=" + this.d + ')';
        }

        public c(isx isxVar, lps lpsVar, uyh0 uyh0Var) {
            this.b = isxVar;
            this.c = lpsVar;
            this.d = uyh0Var;
        }

        public /* synthetic */ c(isx isxVar, lps lpsVar, int i) {
            this((i & 1) != 0 ? new isx(0) : isxVar, (i & 2) != 0 ? new lps(0) : lpsVar, new uyh0(0));
        }
    }
}
