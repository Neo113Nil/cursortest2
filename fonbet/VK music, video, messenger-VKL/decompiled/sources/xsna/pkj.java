package xsna;

import java.util.List;

/* compiled from: ContentProductsViewState.kt */
/* loaded from: classes18.dex */
public interface pkj extends lm50 {

    /* compiled from: ContentProductsViewState.kt */
    public static final class a implements pkj {
        public final String b;
        public final List<hpd0> c;
        public final List<hpd0> d;
        public final int e;
        public final String f;
        public final boolean g;

        public a(String str, List<hpd0> list, List<hpd0> list2, int i, String str2, boolean z) {
            this.b = str;
            this.c = list;
            this.d = list2;
            this.e = i;
            this.f = str2;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            int a = shy.a(this.e, fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
            String str = this.f;
            return Boolean.hashCode(this.g) + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(title=");
            sb.append(this.b);
            sb.append(", contentItems=");
            sb.append(this.c);
            sb.append(", shopItems=");
            sb.append(this.d);
            sb.append(", cartAmount=");
            sb.append(this.e);
            sb.append(", marketLink=");
            sb.append(this.f);
            sb.append(", hasCart=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: ContentProductsViewState.kt */
    public static final class b implements pkj {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1009565432;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ContentProductsViewState.kt */
    public static final class c implements pkj {
        public final Exception b;

        public c(Exception exc) {
            this.b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.b + ')';
        }
    }

    /* compiled from: ContentProductsViewState.kt */
    public static final class d implements pkj {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1864263113;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
