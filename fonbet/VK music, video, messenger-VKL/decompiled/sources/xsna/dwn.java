package xsna;

/* compiled from: DonationViewerData.kt */
/* loaded from: classes16.dex */
public interface dwn {

    /* compiled from: DonationViewerData.kt */
    public static final class a implements dwn {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AsDon(donationBadge="), this.a, ')');
        }
    }

    /* compiled from: DonationViewerData.kt */
    public static final class b implements dwn {
        public final String a;
        public final String b;
        public final long c;

        public b(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsSubscriber(snippet=");
            sb.append(this.a);
            sb.append(", donationUrl=");
            sb.append(this.b);
            sb.append(", channelId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: DonationViewerData.kt */
    public static final class c implements dwn {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1556383010;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
