package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: GamesCatalogDetailPatch.kt */
/* loaded from: classes17.dex */
public interface xat extends xl50 {

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class a implements xat {
        public final long b;

        public a(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("DeleteGame(appId="));
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class b implements xat {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DeleteNotification(requestId="), this.b, ')');
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class c implements xat {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FailureLoading(isNetworkException="), this.b, ')');
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class d implements xat {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1630011804;
        }

        public final String toString() {
            return "FailureLoadingNext";
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class e implements xat {
        public final String b;
        public final List<ebt> c;
        public final boolean d;

        public e(String str, ListBuilder listBuilder, boolean z) {
            this.b = str;
            this.c = listBuilder;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.d) + fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(title=");
            sb.append(this.b);
            sb.append(", data=");
            sb.append(this.c);
            sb.append(", hasNext=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class f implements xat {
        public final ebt b;

        public f(ebt ebtVar) {
            this.b = ebtVar;
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
            return "Loading(sections=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class g implements xat {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -77319376;
        }

        public final String toString() {
            return "LoadingNext";
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class h implements xat {
        public final List<ebt> b;
        public final boolean c;

        public h(ListBuilder listBuilder, boolean z) {
            this.b = listBuilder;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextLoaded(data=");
            sb.append(this.b);
            sb.append(", hasNext=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: GamesCatalogDetailPatch.kt */
    public static final class i implements xat {
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
            return "UpdateToolbar(header=" + this.b + ')';
        }
    }
}
