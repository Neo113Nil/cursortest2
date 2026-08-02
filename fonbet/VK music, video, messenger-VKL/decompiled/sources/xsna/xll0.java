package xsna;

import com.vk.api.generated.market.dto.MarketCatalogFilterDto;
import com.vk.api.generated.market.dto.MarketCatalogSortingDto;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;

/* compiled from: StorefrontEvent.kt */
/* loaded from: classes18.dex */
public interface xll0 extends pk50 {

    /* compiled from: StorefrontEvent.kt */
    public interface a extends xll0 {

        /* compiled from: StorefrontEvent.kt */
        /* renamed from: xsna.xll0$a$a, reason: collision with other inner class name */
        public static final class C4016a implements a {
            public static final C4016a a = new C4016a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4016a);
            }

            public final int hashCode() {
                return 81596315;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public interface b extends a {

            /* compiled from: StorefrontEvent.kt */
            /* renamed from: xsna.xll0$a$b$a, reason: collision with other inner class name */
            public static final class C4017a implements b {
                public final ja9 a;
                public final CommonMarketStat$TypeCtaButtonPositionType b;

                public C4017a(ja9 ja9Var, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
                    this.a = ja9Var;
                    this.b = commonMarketStat$TypeCtaButtonPositionType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4017a)) {
                        return false;
                    }
                    C4017a c4017a = (C4017a) obj;
                    return epx.f(this.a, c4017a.a) && this.b == c4017a.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "OpenCTA(cta=" + this.a + ", posType=" + this.b + ')';
                }
            }

            /* compiled from: StorefrontEvent.kt */
            /* renamed from: xsna.xll0$a$b$b, reason: collision with other inner class name */
            public static final class C4018b implements b {
                public final CommonMarketStat$TypeCtaButtonPositionType a;

                public C4018b(CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
                    this.a = commonMarketStat$TypeCtaButtonPositionType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4018b) && this.a == ((C4018b) obj).a;
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "OpenChat(posType=" + this.a + ')';
                }
            }

            /* compiled from: StorefrontEvent.kt */
            public static final class c implements b {
                public final UsersUserFullDto a;
                public final CommonMarketStat$TypeCtaButtonPositionType b;

                public c(UsersUserFullDto usersUserFullDto, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
                    this.a = usersUserFullDto;
                    this.b = commonMarketStat$TypeCtaButtonPositionType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && this.b == cVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "VKCall(user=" + this.a + ", posType=" + this.b + ')';
                }
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class c implements a {
            public final b5u a;
            public final Integer b;

            public c(b5u b5uVar, Integer num) {
                this.a = b5uVar;
                this.b = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GoodCallToAction(good=");
                sb.append(this.a);
                sb.append(", position=");
                return uqi.b(sb, this.b, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 455084396;
            }

            public final String toString() {
                return "OpenAddAlbum";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class e implements a {
            public final String a;

            public e(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenAddGood(editUrl="), this.a, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class f implements a {
            public final int a;
            public final boolean b;
            public final String c;

            public f(int i, boolean z, String str) {
                this.a = i;
                this.b = z;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.a == fVar.a && this.b == fVar.b && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenAlbum(albumId=");
                sb.append(this.a);
                sb.append(", canEdit=");
                sb.append(this.b);
                sb.append(", albumTitle=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class g implements a {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 790390151;
            }

            public final String toString() {
                return "OpenAllAlbums";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class h implements a {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -512741729;
            }

            public final String toString() {
                return "OpenBookmarks";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class i implements a {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1914277570;
            }

            public final String toString() {
                return "OpenCart";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class j implements a {
            public final MarketCatalogSortingDto a;
            public final String b;

            public j(MarketCatalogSortingDto marketCatalogSortingDto, String str) {
                this.a = marketCatalogSortingDto;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCategories(sorting=");
                sb.append(this.a);
                sb.append(", trackCode=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class k implements a {
            public final MarketCatalogFilterDto a;
            public final String b;

            public k(MarketCatalogFilterDto marketCatalogFilterDto, String str) {
                this.a = marketCatalogFilterDto;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenFilters(filter=");
                sb.append(this.a);
                sb.append(", trackCode=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class l implements a {
            public final b5u a;

            public l(b5u b5uVar) {
                this.a = b5uVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenGood(good=" + this.a + ')';
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class m implements a {
            public static final m a = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return 791135265;
            }

            public final String toString() {
                return "OpenGroup";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class n implements a {
            public final MarketItemLabelActionDto a;

            public n(MarketItemLabelActionDto marketItemLabelActionDto) {
                this.a = marketItemLabelActionDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
            }

            public final int hashCode() {
                MarketItemLabelActionDto marketItemLabelActionDto = this.a;
                if (marketItemLabelActionDto == null) {
                    return 0;
                }
                return marketItemLabelActionDto.hashCode();
            }

            public final String toString() {
                return "OpenInfoBlock(action=" + this.a + ')';
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class o implements a {
            public final String a;

            public o(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class p implements a {
            public final Integer a;
            public final String b;

            public p(Integer num, String str) {
                this.a = num;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b);
            }

            public final int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.b;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenSearch(categoryId=");
                sb.append(this.a);
                sb.append(", trackCode=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class q implements a {
            public static final q a = new q();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 1624283884;
            }

            public final String toString() {
                return "OpenShopConditions";
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class r implements a {
            public final boolean a;

            public r(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && this.a == ((r) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("OpenSubscribers(isNeedFriends="), this.a, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class s implements a {
            public final String a;

            public s(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenViewedAlbums(title="), this.a, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class t implements a {
            public final Throwable a;

            public t(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("ShowErrorToast(throwable="), this.a, ')');
            }
        }

        /* compiled from: StorefrontEvent.kt */
        public static final class u implements a {
            public final boolean a;

            public u(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && this.a == ((u) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ShowUnsubscribeDialog(withLeave="), this.a, ')');
            }
        }
    }
}
