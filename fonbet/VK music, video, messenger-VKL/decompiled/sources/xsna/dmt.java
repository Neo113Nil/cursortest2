package xsna;

/* compiled from: GeoPostsMviPatch.kt */
/* loaded from: classes4.dex */
public interface dmt extends yl50 {

    /* compiled from: GeoPostsMviPatch.kt */
    public static final class a implements dmt {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateToolbar(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
