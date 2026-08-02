package xsna;

/* compiled from: NotificationButtonsModel.kt */
/* loaded from: classes4.dex */
public interface i870 {

    /* compiled from: NotificationButtonsModel.kt */
    public static final class a implements i870 {
        public final tlo0 a;
        public final tlo0 b;
        public final snv c;
        public final snv d;
        public final Boolean e;

        public a(tlo0 tlo0Var, tlo0 tlo0Var2, snv snvVar, snv snvVar2, Boolean bool) {
            this.a = tlo0Var;
            this.b = tlo0Var2;
            this.c = snvVar;
            this.d = snvVar2;
            this.e = bool;
        }

        public static a a(a aVar, Boolean bool) {
            tlo0 tlo0Var = aVar.a;
            tlo0 tlo0Var2 = aVar.b;
            snv snvVar = aVar.c;
            snv snvVar2 = aVar.d;
            aVar.getClass();
            return new a(tlo0Var, tlo0Var2, snvVar, snvVar2, bool);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            tlo0 tlo0Var = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31)) * 31;
            snv snvVar = this.d;
            int hashCode3 = (hashCode2 + (snvVar == null ? 0 : snvVar.hashCode())) * 31;
            Boolean bool = this.e;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Buttons(primary=");
            sb.append(this.a);
            sb.append(", secondary=");
            sb.append(this.b);
            sb.append(", primaryAction=");
            sb.append(this.c);
            sb.append(", secondaryAction=");
            sb.append(this.d);
            sb.append(", isPrimaryLoading=");
            return tn.a(sb, this.e, ')');
        }
    }

    /* compiled from: NotificationButtonsModel.kt */
    public static final class b implements i870 {
        public final int a;
        public final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultLabel(icon=");
            sb.append(this.a);
            sb.append(", text=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
