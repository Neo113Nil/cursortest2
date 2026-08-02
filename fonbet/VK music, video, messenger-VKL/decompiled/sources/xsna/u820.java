package xsna;

/* compiled from: MenuViewModel.kt */
/* loaded from: classes7.dex */
public abstract class u820 {

    /* compiled from: MenuViewModel.kt */
    public static final class a extends u820 {
        public static final a a = new a();
    }

    /* compiled from: MenuViewModel.kt */
    public static final class b extends u820 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Enabled(title=");
            sb.append(this.a);
            sb.append(", iconUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
