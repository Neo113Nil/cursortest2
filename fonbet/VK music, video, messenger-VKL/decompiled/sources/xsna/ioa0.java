package xsna;

/* compiled from: PinnedChangeSpinner.kt */
/* loaded from: classes17.dex */
public interface ioa0 {

    /* compiled from: PinnedChangeSpinner.kt */
    public static final class a implements ioa0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1000668891;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: PinnedChangeSpinner.kt */
    public static final class b implements ioa0 {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
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
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(isPinAction=");
            sb.append(this.a);
            sb.append(", isSuccess=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
