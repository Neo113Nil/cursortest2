package xsna;

import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;

/* compiled from: StorefrontAction.kt */
/* loaded from: classes18.dex */
public interface hjl0 extends lj50 {

    /* compiled from: StorefrontAction.kt */
    public interface a extends hjl0 {

        /* compiled from: StorefrontAction.kt */
        /* renamed from: xsna.hjl0$a$a, reason: collision with other inner class name */
        public static final class C3003a implements a {
            public final int b;

            public C3003a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3003a) && this.b == ((C3003a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Album(pos="), this.b, ')');
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1659083439;
            }

            public final String toString() {
                return "AllAlbums";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class c implements a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2011415803;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class d implements a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1332751977;
            }

            public final String toString() {
                return "Bookmarks";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class e implements a {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 2011446068;
            }

            public final String toString() {
                return "Cart";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class f implements a {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 933865264;
            }

            public final String toString() {
                return "Categories";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class g implements a {
            public final b5u b;

            public g(b5u b5uVar) {
                this.b = b5uVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ChangeFave(good=" + this.b + ')';
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class h implements a {
            public static final h b = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1121184831;
            }

            public final String toString() {
                return "CreateAlbum";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class i implements a {
            public static final i b = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1006180589;
            }

            public final String toString() {
                return "CreateGood";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class j implements a {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1802765465;
            }

            public final String toString() {
                return "Filters";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class k implements a {
            public final b5u b;

            public k(b5u b5uVar) {
                this.b = b5uVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Good(good=" + this.b + ')';
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class l implements a {
            public final b5u b;

            public l(b5u b5uVar) {
                this.b = b5uVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "GoodCtaButton(good=" + this.b + ')';
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class m implements a {
            public static final m b = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return -2065483541;
            }

            public final String toString() {
                return "Group";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class n implements a {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -1014212771;
            }

            public final String toString() {
                return "InfoBlockClick";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class o implements a {
            public static final o b = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return 725643452;
            }

            public final String toString() {
                return "Search";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class p implements a {
            public static final p b = new p();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return 1454041442;
            }

            public final String toString() {
                return "ShopConditions";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class q implements a {
            public static final q b = new q();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return -189593162;
            }

            public final String toString() {
                return "Subscribe";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class r implements a {
            public final boolean b;

            public r(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && this.b == ((r) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Unsubscribe(withLeave="), this.b, ')');
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class s implements a {
            public static final s b = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return -1320570149;
            }

            public final String toString() {
                return "Url";
            }
        }

        /* compiled from: StorefrontAction.kt */
        public static final class t implements a {
            public static final t b = new t();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof t);
            }

            public final int hashCode() {
                return -1951016674;
            }

            public final String toString() {
                return "ViewedGoods";
            }
        }
    }

    /* compiled from: StorefrontAction.kt */
    public interface b extends hjl0 {

        /* compiled from: StorefrontAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1361770243;
            }

            public final String toString() {
                return "BookmarksUpdated";
            }
        }

        /* compiled from: StorefrontAction.kt */
        /* renamed from: xsna.hjl0$b$b, reason: collision with other inner class name */
        public static final class C3004b implements b {
            public final ay00 b;

            public C3004b(ay00 ay00Var) {
                this.b = ay00Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3004b) && epx.f(this.b, ((C3004b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "CartUpdated(event=" + this.b + ')';
            }
        }
    }

    /* compiled from: StorefrontAction.kt */
    public static final class c implements hjl0 {
        public final boolean b;
        public final GroupsLeaveLeaveModeDto c;

        public c(boolean z, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto) {
            this.b = z;
            this.c = groupsLeaveLeaveModeDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto = this.c;
            return hashCode + (groupsLeaveLeaveModeDto == null ? 0 : groupsLeaveLeaveModeDto.hashCode());
        }

        public final String toString() {
            return "LeaveGroup(withLeave=" + this.b + ", leaveModeDto=" + this.c + ')';
        }
    }

    /* compiled from: StorefrontAction.kt */
    public static final class d implements hjl0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1736003543;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: StorefrontAction.kt */
    public static final class e implements hjl0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -62391321;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: StorefrontAction.kt */
    public static final class f implements hjl0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1268174390;
        }

        public final String toString() {
            return "SnackBarDismissed";
        }
    }

    /* compiled from: StorefrontAction.kt */
    public static final class g implements hjl0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -388239837;
        }

        public final String toString() {
            return "UpdateModerationItems";
        }
    }
}
