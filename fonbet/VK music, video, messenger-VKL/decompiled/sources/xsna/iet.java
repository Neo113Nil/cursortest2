package xsna;

/* compiled from: GamesCatalogSideEffect.kt */
/* loaded from: classes17.dex */
public interface iet {

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class a implements iet {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1173976023;
        }

        public final String toString() {
            return "ChangeProfile";
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class b implements iet {
        public final zbt a;

        public b(zbt zbtVar) {
            this.a = zbtVar;
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
            return "GiftIconClick(giftIcon=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class c implements iet {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1434781599;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class d implements iet {
        public final n9t a;

        public d(n9t n9tVar) {
            this.a = n9tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAchievementsModal(achievementsModalState=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class e implements iet {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class f implements iet {
        public final zct a;

        public f(zct zctVar) {
            this.a = zctVar;
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
            return "OpenPWAModal(pwaModalState=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class g implements iet {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1556411313;
        }

        public final String toString() {
            return "OpenProfile";
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class h implements iet {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1962931778;
        }

        public final String toString() {
            return "OpenSearch";
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class i implements iet {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OpenWhatInsideModal(modalInfo=null)";
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class j implements iet {
        public final djc a;

        public j(djc djcVar) {
            this.a = djcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SectionAction(item=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class k implements iet {
        public final zhf0 a;

        public k(zhf0 zhf0Var) {
            this.a = zhf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return itj0.c(new StringBuilder("SetAvatarRect(rect="), this.a, ')');
        }
    }

    /* compiled from: GamesCatalogSideEffect.kt */
    public static final class l implements iet {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -2137732224;
        }

        public final String toString() {
            return "ShowErrorSnackbar";
        }
    }
}
