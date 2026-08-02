package xsna;

/* compiled from: DonutButtonState.kt */
/* loaded from: classes14.dex */
public interface pyn {

    /* compiled from: DonutButtonState.kt */
    public static final class a implements pyn {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 925479288;
        }

        public final String toString() {
            return "Gone";
        }
    }

    /* compiled from: DonutButtonState.kt */
    public static final class b implements pyn {
        public final int a;
        public final Integer b;
        public final ezn c;

        public b(int i, Integer num, ezn eznVar) {
            this.a = i;
            this.b = num;
            this.c = eznVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Visible(iconResId=" + this.a + ", textResId=" + this.b + ", donutClickAction=" + this.c + ')';
        }
    }
}
