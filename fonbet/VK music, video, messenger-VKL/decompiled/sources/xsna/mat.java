package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;

/* compiled from: GamesCatalogDetailAction.kt */
/* loaded from: classes17.dex */
public interface mat extends kj50 {

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class a implements mat {
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
            return "AppPartViewed(trackedApp=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class b implements mat {
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
            return "AppViewed(trackedApp=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class c implements mat {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2120504154;
        }

        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class d implements mat {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("DeleteGame(appId="));
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class e implements mat {
        public final djc b;

        public e(djc djcVar) {
            this.b = djcVar;
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
            return "ItemClick(click=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class f implements mat {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2120192859;
        }

        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class g implements mat {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1396403912;
        }

        public final String toString() {
            return "LoadNext";
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class h implements mat {
        public final q7t b;

        public h(q7t q7tVar) {
            this.b = q7tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NotificationInteraction(interaction=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogDetailAction.kt */
    public static final class i implements mat {
        public final GamesHeaderSectionInfo b;

        public i(GamesHeaderSectionInfo gamesHeaderSectionInfo) {
            this.b = gamesHeaderSectionInfo;
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
            return "Setup(sectionInfo=" + this.b + ')';
        }
    }
}
