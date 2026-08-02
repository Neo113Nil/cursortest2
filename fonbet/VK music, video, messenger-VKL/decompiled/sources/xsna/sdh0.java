package xsna;

/* compiled from: ScreencastSubscriptionProposalState.kt */
/* loaded from: classes7.dex */
public abstract class sdh0 {

    /* compiled from: ScreencastSubscriptionProposalState.kt */
    public static final class a extends sdh0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1833780310;
        }

        public final String toString() {
            return "CloseProposal";
        }
    }

    /* compiled from: ScreencastSubscriptionProposalState.kt */
    public static final class b extends sdh0 {
        public final int a;
        public final boolean b;
        public final boolean c;

        public b(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProposalInProgress(progress=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", isFullscreenHorizontal=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ScreencastSubscriptionProposalState.kt */
    public static final class c extends sdh0 {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ShowProposal(adDurationSec="));
        }
    }
}
