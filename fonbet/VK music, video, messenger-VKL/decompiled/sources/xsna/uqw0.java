package xsna;

/* compiled from: VoipInviteToScheduledCallNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface uqw0 {

    /* compiled from: VoipInviteToScheduledCallNavigationEvent.kt */
    public static final class a implements uqw0 {
        public final f1x0 a;

        public a(f1x0 f1x0Var) {
            this.a = f1x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAddCalendarScreen(calendarItem=" + this.a + ')';
        }
    }

    /* compiled from: VoipInviteToScheduledCallNavigationEvent.kt */
    public static final class b implements uqw0 {
        public final g1x0 a;

        public b(g1x0 g1x0Var) {
            this.a = g1x0Var;
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
            return "OpenShareByMailScreen(shareData=" + this.a + ')';
        }
    }

    /* compiled from: VoipInviteToScheduledCallNavigationEvent.kt */
    public static final class c implements uqw0 {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenShareLinkScreen(link="), this.a, ')');
        }
    }

    /* compiled from: VoipInviteToScheduledCallNavigationEvent.kt */
    public static final class d implements uqw0 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenShareQRScreen(link="), this.a, ')');
        }
    }
}
