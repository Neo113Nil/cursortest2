package xsna;

/* compiled from: VoipShareLinkSheetNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface x1x0 {

    /* compiled from: VoipShareLinkSheetNavigationEvent.kt */
    public static final class a implements x1x0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1855241440;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: VoipShareLinkSheetNavigationEvent.kt */
    public static final class b implements x1x0 {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareExternal(text=");
            sb.append(this.a);
            sb.append(", isLongLink=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
