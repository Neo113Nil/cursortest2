package xsna;

/* compiled from: MusicPlayerPrefetchConfig.kt */
/* loaded from: classes6.dex */
public interface jy40 {

    /* compiled from: MusicPlayerPrefetchConfig.kt */
    public static final class a implements jy40 {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a() {
            this(1, 50, 5, 6);
        }

        @Override // xsna.jy40
        public final int a() {
            return this.b;
        }

        @Override // xsna.jy40
        public final int b() {
            return this.a;
        }

        @Override // xsna.jy40
        public final int c() {
            return this.d;
        }

        @Override // xsna.jy40
        public final int e() {
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Custom(prefetchTracksCount=");
            sb.append(this.a);
            sb.append(", cacheSizeMb=");
            sb.append(this.b);
            sb.append(", firstPhasePrefetchDurationSec=");
            sb.append(this.c);
            sb.append(", secondPhasePrefetchDurationMin=");
            return vu5.b(sb, this.d, ')');
        }

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* compiled from: MusicPlayerPrefetchConfig.kt */
    public static final class b implements jy40 {
        public static final b a = new b();

        @Override // xsna.jy40
        public final int a() {
            return 50;
        }

        @Override // xsna.jy40
        public final int b() {
            return 1;
        }

        @Override // xsna.jy40
        public final int c() {
            return 6;
        }

        @Override // xsna.jy40
        public final int e() {
            return 5;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1179661647;
        }

        public final String toString() {
            return "Default";
        }
    }

    int a();

    int b();

    int c();

    int e();
}
