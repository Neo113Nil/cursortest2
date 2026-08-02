package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: StorefrontServicesEvent.kt */
/* loaded from: classes18.dex */
public interface lnl0 extends pk50 {

    /* compiled from: StorefrontServicesEvent.kt */
    public interface a extends lnl0 {

        /* compiled from: StorefrontServicesEvent.kt */
        /* renamed from: xsna.lnl0$a$a, reason: collision with other inner class name */
        public static final class C3278a implements a {
            public static final C3278a a = new C3278a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3278a);
            }

            public final int hashCode() {
                return 1274759146;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class b implements a {
            public final goi0 a;

            public b(goi0 goi0Var) {
                this.a = goi0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenAlbum(item=" + this.a + ')';
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class c implements a {
            public final UserId a;

            public c(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenAllAlbums(ownerId="), this.a, ')');
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 796581680;
            }

            public final String toString() {
                return "OpenBookmarks";
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class e implements a {
            public final uoi0 a;
            public final CommonMarketStat$TypeRefSource b;
            public final int c;

            public e(int i, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, uoi0 uoi0Var) {
                this.a = uoi0Var;
                this.b = commonMarketStat$TypeRefSource;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenService(item=");
                sb.append(this.a);
                sb.append(", source=");
                sb.append(this.b);
                sb.append(", position=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class f implements a {
            public final String a;

            public f(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenServiceCreate(openUrl="), this.a, ')');
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class g implements a {
            public final UserId a;

            public g(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenServiceSettings(ownerId="), this.a, ')');
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class h implements a {
            public final UserId a;
            public final String b;
            public final String c;

            public h(UserId userId, String str, String str2) {
                this.a = userId;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenServicesSection(ownerId=");
                sb.append(this.a);
                sb.append(", sectionId=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class i implements a {
            public final uoi0 a;
            public final int b;
            public final CommonMarketStat$TypeRefSource c;

            public i(int i, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, uoi0 uoi0Var) {
                this.a = uoi0Var;
                this.b = i;
                this.c = commonMarketStat$TypeRefSource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "ServiceCallToAction(service=" + this.a + ", position=" + this.b + ", source=" + this.c + ')';
            }
        }

        /* compiled from: StorefrontServicesEvent.kt */
        public static final class j implements a {
        }
    }

    /* compiled from: StorefrontServicesEvent.kt */
    public interface b extends lnl0 {

        /* compiled from: StorefrontServicesEvent.kt */
        public interface a extends b {

            /* compiled from: StorefrontServicesEvent.kt */
            /* renamed from: xsna.lnl0$b$a$a, reason: collision with other inner class name */
            public static final class C3279a implements a {
                public static final C3279a a = new C3279a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3279a);
                }

                public final int hashCode() {
                    return -1956660506;
                }

                public final String toString() {
                    return "ResetScroll";
                }
            }
        }
    }
}
