package xsna;

import com.vk.games.model.GamesCatalogScreenTab;

/* compiled from: GamesCatalogAction.kt */
/* loaded from: classes17.dex */
public interface o9t extends kj50 {

    /* compiled from: GamesCatalogAction.kt */
    public static final class a implements o9t {
        public final uet b;

        public a(uet uetVar) {
            this.b = uetVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AppPartViewed(item=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class b implements o9t {
        public final uet b;

        public b(uet uetVar) {
            this.b = uetVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AppViewed(item=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class c implements o9t {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1066963483;
        }

        public final String toString() {
            return "CatalogPaused";
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class d implements o9t {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1123352576;
        }

        public final String toString() {
            return "CatalogResumed";
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class e implements o9t {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1906927872;
        }

        public final String toString() {
            return "ClickGenerateNextGame";
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class f implements o9t {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1149847668;
        }

        public final String toString() {
            return "DismissAchievements";
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class g implements o9t {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 630766034;
        }

        public final String toString() {
            return "DismissPWA";
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class h implements o9t {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -848847288;
        }

        public final String toString() {
            return "DismissWhatInside";
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class i implements o9t {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LinkClicked(url="), this.b, ')');
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class j implements o9t {
        public final q7t b;

        public j(q7t q7tVar) {
            this.b = q7tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NotificationInteraction(interaction=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class k implements o9t {
        public final zct b;

        public k(zct zctVar) {
            this.b = zctVar;
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
            return "OpenPWAActionLink(pwaModalState=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class l implements o9t {
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class m implements o9t {
        public final djc b;

        public m(djc djcVar) {
            this.b = djcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SectionClick(item=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class n implements o9t {
        public final mhp0 b;

        public n(mhp0 mhp0Var) {
            this.b = mhp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SectionViewed(item=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class o implements o9t {
        public final String b;
        public final boolean c;
        public final boolean d;

        public o(String str, boolean z, boolean z2) {
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.b, oVar.b) && this.c == oVar.c && this.d == oVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.d) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Setup(avatarUrl=");
            sb.append(this.b);
            sb.append(", isAvatarVisible=");
            sb.append(this.c);
            sb.append(", isBackButtonVisible=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class p implements o9t {
        public final GamesCatalogScreenTab b;

        public p(GamesCatalogScreenTab gamesCatalogScreenTab) {
            this.b = gamesCatalogScreenTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TabChanged(tab=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public interface q extends o9t {

        /* compiled from: GamesCatalogAction.kt */
        public static final class a implements o9t, q {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 348321353;
            }

            public final String toString() {
                return "ClickAvatar";
            }
        }

        /* compiled from: GamesCatalogAction.kt */
        public static final class b implements o9t, q {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -64107543;
            }

            public final String toString() {
                return "ClickBackButton";
            }
        }

        /* compiled from: GamesCatalogAction.kt */
        public static final class c implements o9t, q {
            public final zbt b;

            public c(zbt zbtVar) {
                this.b = zbtVar;
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
                return "ClickGiftIcon(giftIcon=" + this.b + ')';
            }
        }

        /* compiled from: GamesCatalogAction.kt */
        public static final class d implements o9t, q {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 847944344;
            }

            public final String toString() {
                return "ClickSearch";
            }
        }

        /* compiled from: GamesCatalogAction.kt */
        public static final class e implements o9t, q {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 43535917;
            }

            public final String toString() {
                return "LongClickAvatar";
            }
        }

        /* compiled from: GamesCatalogAction.kt */
        public static final class f implements q {
            public final zhf0 b;

            public f(zhf0 zhf0Var) {
                this.b = zhf0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return itj0.c(new StringBuilder("SetAvatarRect(rect="), this.b, ')');
            }
        }
    }

    /* compiled from: GamesCatalogAction.kt */
    public static final class r implements o9t {
        public final String b;
        public final boolean c;
        public final boolean d;

        public r(String str, boolean z, boolean z2) {
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && this.c == rVar.c && this.d == rVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.d) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateToolbarInfo(avatarUrl=");
            sb.append(this.b);
            sb.append(", isNeedToShow=");
            sb.append(this.c);
            sb.append(", isCanGoBack=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
