package xsna;

/* compiled from: DiscoverBlockInfo.kt */
/* loaded from: classes16.dex */
public interface m1n {

    /* compiled from: DiscoverBlockInfo.kt */
    public static final class a implements m1n {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Compilation(id=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DiscoverBlockInfo.kt */
    public static final class b implements m1n {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Hashtag(name=");
            sb.append(this.a);
            sb.append(", isTrending=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: DiscoverBlockInfo.kt */
    public static final class c implements m1n {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Mask(id=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DiscoverBlockInfo.kt */
    public static final class d implements m1n {
        public final String a;
        public final String b;
        public final boolean c;

        public d(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Music(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", isTrending=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
