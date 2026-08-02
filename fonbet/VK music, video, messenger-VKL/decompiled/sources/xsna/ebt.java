package xsna;

import com.vk.games.presentation.catalog.model.GamesDetailCatalogHeaderType;
import com.vk.games.presentation.catalog.model.SectionTypePrefixKey;

/* compiled from: GamesCatalogDetailSectionData.kt */
/* loaded from: classes17.dex */
public abstract class ebt {

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class a extends ebt {
        public final s90 a;
        public final String b;

        public a(s90 s90Var) {
            this.a = s90Var;
            this.b = s90Var.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ActivitySection(item=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class b extends ebt {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1636770938;
        }

        public final String toString() {
            return "ActivitySectionSkeleton";
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class c extends ebt {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -840221221;
        }

        public final String toString() {
            return "BaseSkeleton";
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class d extends ebt {
        public final qka a;
        public final String b;

        public d(qka qkaVar) {
            this.a = qkaVar;
            this.b = qkaVar.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "DetailSection(item=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class e extends ebt {
        public final GamesDetailCatalogHeaderType a;
        public final String b;

        public e(GamesDetailCatalogHeaderType gamesDetailCatalogHeaderType) {
            this.a = gamesDetailCatalogHeaderType;
            this.b = SectionTypePrefixKey.HEADER.h() + '_' + gamesDetailCatalogHeaderType.name();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Header(headerType=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class f extends ebt {
        public final ko50 a;
        public final String b;

        public f(ko50 ko50Var) {
            this.a = ko50Var;
            this.b = ko50Var.f;
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
            return "MyGamesSection(item=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class g extends ebt {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1716879238;
        }

        public final String toString() {
            return "MyGamesSectionSkeleton";
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class h extends ebt {
        public final r7t a;
        public final boolean b;
        public final String c;

        public h(r7t r7tVar, boolean z) {
            this.a = r7tVar;
            this.b = z;
            this.c = r7tVar.n + '_' + z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewNotificationSection(item=");
            sb.append(this.a);
            sb.append(", isFirst=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class i extends ebt {
        public final r7t a;
        public final boolean b;
        public final String c;

        public i(r7t r7tVar, boolean z) {
            this.a = r7tVar;
            this.b = z;
            this.c = r7tVar.n + '_' + z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && this.b == iVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationSection(item=");
            sb.append(this.a);
            sb.append(", isFirst=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class j extends ebt {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1611167914;
        }

        public final String toString() {
            return "NotificationSectionSkeleton";
        }
    }

    /* compiled from: GamesCatalogDetailSectionData.kt */
    public static final class k extends ebt {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1502400181;
        }

        public final String toString() {
            return "Stub";
        }
    }
}
