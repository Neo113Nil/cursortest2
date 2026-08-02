package xsna;

/* compiled from: FBMedia.kt */
/* loaded from: classes17.dex */
public interface ygq {

    /* compiled from: FBMedia.kt */
    public static final class a implements ygq {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public a(String str, int i, int i2, int i3, int i4) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        @Override // xsna.ygq
        public final int L() {
            return this.e;
        }

        @Override // xsna.ygq
        public final int a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        @Override // xsna.ygq
        public final int getHeight() {
            return this.c;
        }

        @Override // xsna.ygq
        public final int getWidth() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FBImage(url=");
            sb.append(this.a);
            sb.append(", width=");
            sb.append(this.b);
            sb.append(", height=");
            sb.append(this.c);
            sb.append(", marginStart=");
            sb.append(this.d);
            sb.append(", marginBottom=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: FBMedia.kt */
    public static final class b implements ygq {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b(String str, int i, int i2, int i3, int i4) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        @Override // xsna.ygq
        public final int L() {
            return this.e;
        }

        @Override // xsna.ygq
        public final int a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        @Override // xsna.ygq
        public final int getHeight() {
            return this.c;
        }

        @Override // xsna.ygq
        public final int getWidth() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FBLottie(url=");
            sb.append(this.a);
            sb.append(", width=");
            sb.append(this.b);
            sb.append(", height=");
            sb.append(this.c);
            sb.append(", marginStart=");
            sb.append(this.d);
            sb.append(", marginBottom=");
            return vu5.b(sb, this.e, ')');
        }
    }

    int L();

    int a();

    int getHeight();

    int getWidth();
}
