package xsna;

/* compiled from: VoipShareLinkSheetAction.kt */
/* loaded from: classes7.dex */
public interface w1x0 extends kj50 {

    /* compiled from: VoipShareLinkSheetAction.kt */
    public static final class a implements w1x0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -857392553;
        }

        public final String toString() {
            return "CallAnyway";
        }
    }

    /* compiled from: VoipShareLinkSheetAction.kt */
    public static final class b implements w1x0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1557080474;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VoipShareLinkSheetAction.kt */
    public static final class c implements w1x0 {
        public final boolean b;
        public final boolean c;
        public final String d;

        public c(boolean z, boolean z2, String str) {
            this.b = z;
            this.c = z2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && this.d.equals(cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareLinkClicked(isSharingToChat=");
            sb.append(this.b);
            sb.append(", isLongLink=");
            sb.append(this.c);
            sb.append(", linkText=");
            return ho8.a(sb, this.d, ')');
        }
    }
}
