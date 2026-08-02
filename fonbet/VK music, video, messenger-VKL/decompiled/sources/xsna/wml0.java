package xsna;

import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;

/* compiled from: StorefrontServicesAction.kt */
/* loaded from: classes18.dex */
public interface wml0 extends lj50 {

    /* compiled from: StorefrontServicesAction.kt */
    public interface a extends wml0 {

        /* compiled from: StorefrontServicesAction.kt */
        /* renamed from: xsna.wml0$a$a, reason: collision with other inner class name */
        public static final class C3942a implements a {
            public final int b;

            public C3942a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3942a) && this.b == ((C3942a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Album(itemId="), this.b, ')');
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1143666454;
            }

            public final String toString() {
                return "AllAlbums";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class c implements a {
            public final String b;
            public final String c;

            public c(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AllServices(sectionId=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class d implements a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -686324286;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class e implements a {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1848168962;
            }

            public final String toString() {
                return "Bookmarks";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class f implements a {
            public final long b;

            public f(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("ChangeFave(itemId="));
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class g implements a {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1899679842;
            }

            public final String toString() {
                return "CreateService";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class h implements a {
            public static final h b = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1545253184;
            }

            public final String toString() {
                return "Filters";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class i implements a {
            public final long b;

            public i(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.b == ((i) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Service(itemId="));
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class j implements a {
            public final long b;

            public j(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.b == ((j) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("ServiceCtaButton(itemId="));
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class k implements a {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1480960130;
            }

            public final String toString() {
                return "Settings";
            }
        }
    }

    /* compiled from: StorefrontServicesAction.kt */
    public interface b extends wml0 {

        /* compiled from: StorefrontServicesAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1788253285;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        /* renamed from: xsna.wml0$b$b, reason: collision with other inner class name */
        public static final class C3943b implements b {
            public static final C3943b b = new C3943b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3943b);
            }

            public final int hashCode() {
                return 290409560;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* compiled from: StorefrontServicesAction.kt */
        public static final class c implements b {
            public final ServicesSort b;
            public final Integer c;
            public final Integer d;
            public final String e;

            public c(ServicesSort servicesSort, Integer num, Integer num2, String str) {
                this.b = servicesSort;
                this.c = num;
                this.d = num2;
                this.e = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Integer num = this.c;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.e;
                return hashCode3 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Update(sort=");
                sb.append(this.b);
                sb.append(", fromPrice=");
                sb.append(this.c);
                sb.append(", toPrice=");
                sb.append(this.d);
                sb.append(", sectionId=");
                return ho8.a(sb, this.e, ')');
            }
        }
    }

    /* compiled from: StorefrontServicesAction.kt */
    public static final class c implements wml0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2056128848;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: StorefrontServicesAction.kt */
    public static final class d implements wml0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1452357678;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: StorefrontServicesAction.kt */
    public static final class e implements wml0 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(query="), this.b, ')');
        }
    }

    /* compiled from: StorefrontServicesAction.kt */
    public static final class f implements wml0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1632309361;
        }

        public final String toString() {
            return "SnackBarDismissed";
        }
    }
}
