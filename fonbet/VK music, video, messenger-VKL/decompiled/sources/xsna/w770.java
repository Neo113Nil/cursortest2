package xsna;

/* compiled from: NotificationAvatar.kt */
/* loaded from: classes4.dex */
public interface w770 {

    /* compiled from: NotificationAvatar.kt */
    public static final class a implements w770 {
        public final String a;
        public final String b;
        public final tlo0 c;

        public a(String str, String str2, tlo0 tlo0Var) {
            this.a = str;
            this.b = str2;
            this.c = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Double(firstUrl=");
            sb.append(this.a);
            sb.append(", secondUrl=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            return bt.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationAvatar.kt */
    public static final class b implements w770 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -603710879;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: NotificationAvatar.kt */
    public static final class c implements w770 {
        public final String a;
        public final snv b;
        public final tlo0 c;

        public c(String str, snv snvVar, tlo0 tlo0Var) {
            this.a = str;
            this.b = snvVar;
            this.c = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            snv snvVar = this.b;
            return this.c.hashCode() + ((hashCode + (snvVar == null ? 0 : snvVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Service(url=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            return bt.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationAvatar.kt */
    public static final class d implements w770 {
        public final String a;
        public final snv b;
        public final tlo0 c;

        public d(String str, snv snvVar, tlo0 tlo0Var) {
            this.a = str;
            this.b = snvVar;
            this.c = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            snv snvVar = this.b;
            return this.c.hashCode() + ((hashCode + (snvVar == null ? 0 : snvVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Single(url=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            return bt.a(sb, this.c, ')');
        }
    }
}
