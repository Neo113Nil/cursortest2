package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoProfileCatalogViewState.kt */
/* loaded from: classes6.dex */
public abstract class k7t0 {

    /* compiled from: VideoProfileCatalogViewState.kt */
    public static final class a extends k7t0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -727237043;
        }

        public final String toString() {
            return "Anonymous";
        }
    }

    /* compiled from: VideoProfileCatalogViewState.kt */
    public static final class b extends k7t0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -893449537;
        }

        public final String toString() {
            return "Gone";
        }
    }

    /* compiled from: VideoProfileCatalogViewState.kt */
    public static final class c extends k7t0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -712203492;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VideoProfileCatalogViewState.kt */
    public static final class d extends k7t0 {
        public final UserId a;
        public final String b;

        public d(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoggedIn(ownerId=");
            sb.append(this.a);
            sb.append(", catalogUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
