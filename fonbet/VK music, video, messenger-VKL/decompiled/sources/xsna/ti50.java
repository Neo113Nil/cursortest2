package xsna;

/* compiled from: MuteViewState.kt */
/* loaded from: classes17.dex */
public interface ti50 {

    /* compiled from: MuteViewState.kt */
    public static final class a implements ti50 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -881549740;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: MuteViewState.kt */
    public static final class b implements ti50 {
        public final int a;
        public final boolean b;

        public b(int i, boolean z) {
            this.a = i;
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
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(contentDescriptionString=");
            sb.append(this.a);
            sb.append(", isMuted=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
