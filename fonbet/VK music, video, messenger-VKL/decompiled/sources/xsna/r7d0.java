package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: PrimaryBlockEvent.kt */
/* loaded from: classes17.dex */
public interface r7d0 {

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class a implements r7d0 {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnAlbumClick(id=");
            sb.append(this.a);
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class b implements r7d0 {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnAlbumViewed(id=");
            sb.append(this.a);
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class c implements r7d0 {
        public final String a;
        public final int b;

        public c(String str, int i) {
            this.a = str;
            this.b = i;
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
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCtaBtnClick(uid=");
            sb.append((Object) MarketProductTileConfig.f.a(this.a));
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class d implements r7d0 {
        public final String a;
        public final int b;

        public d(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnFavoriteClick(uid=");
            sb.append((Object) MarketProductTileConfig.f.a(this.a));
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class e implements r7d0 {
        public final String a;
        public final int b;

        public e(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnItemClick(uid=");
            sb.append((Object) MarketProductTileConfig.f.a(this.a));
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class f implements r7d0 {
        public final String a;
        public final int b;

        public f(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnItemViewed(uid=");
            sb.append((Object) MarketProductTileConfig.f.a(this.a));
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class g implements r7d0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -988345994;
        }

        public final String toString() {
            return "OnRetryBtnClick";
        }
    }

    /* compiled from: PrimaryBlockEvent.kt */
    public static final class h implements r7d0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -143966794;
        }

        public final String toString() {
            return "OnScrolledToEnd";
        }
    }
}
