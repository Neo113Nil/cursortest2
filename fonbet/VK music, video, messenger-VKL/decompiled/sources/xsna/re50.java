package xsna;

/* compiled from: MusicVideoPlayerPrefetchConfig.kt */
/* loaded from: classes11.dex */
public interface re50 {

    /* compiled from: MusicVideoPlayerPrefetchConfig.kt */
    /* loaded from: classes6.dex */
    public static final class a implements re50 {
        public final int a;
        public final int b;
        public final int c;

        public a() {
            this(3, 50, 3);
        }

        @Override // xsna.re50
        public final int a() {
            return this.b;
        }

        @Override // xsna.re50
        public final int b() {
            return this.a;
        }

        @Override // xsna.re50
        public final int d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Custom(prefetchTracksCount=");
            sb.append(this.a);
            sb.append(", cacheSizeMb=");
            sb.append(this.b);
            sb.append(", firstPhasePrefetchTracksCount=");
            return vu5.b(sb, this.c, ')');
        }

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: MusicVideoPlayerPrefetchConfig.kt */
    /* loaded from: classes6.dex */
    public static final class b implements re50 {
        public static final b a = new b();

        @Override // xsna.re50
        public final int a() {
            return 50;
        }

        @Override // xsna.re50
        public final int b() {
            return 3;
        }

        @Override // xsna.re50
        public final int d() {
            return 3;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -354250068;
        }

        public final String toString() {
            return "Default";
        }
    }

    int a();

    int b();

    int d();
}
