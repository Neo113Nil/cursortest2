package xsna;

/* compiled from: LyricsTimecodeLine.kt */
/* loaded from: classes3.dex */
public abstract class ob00 {
    public final int a;
    public final int b;
    public boolean c;

    /* compiled from: LyricsTimecodeLine.kt */
    public static final class a extends ob00 {
        public final int d;
        public final int e;
        public boolean f;

        public a(int i, int i2) {
            super(i, i2);
            this.d = i;
            this.e = i2;
            this.f = false;
        }

        @Override // xsna.ob00
        public final int a() {
            return this.e;
        }

        @Override // xsna.ob00
        public final int b() {
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
            return this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + shy.a(this.e, Integer.hashCode(this.d) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Countdown(start=");
            sb.append(this.d);
            sb.append(", end=");
            sb.append(this.e);
            sb.append(", isEnded=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: LyricsTimecodeLine.kt */
    public static final class b extends ob00 {
        public final int d;
        public final String e;

        public b(int i, String str) {
            super(i, Integer.MAX_VALUE);
            this.d = i;
            this.e = str;
        }

        @Override // xsna.ob00
        public final int b() {
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
            return this.d == bVar.d && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Credits(start=");
            sb.append(this.d);
            sb.append(", text=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: LyricsTimecodeLine.kt */
    public static final class c extends ob00 {
        public final int d;
        public final int e;

        public c(int i, int i2) {
            super(i, i2);
            this.d = i;
            this.e = i2;
        }

        @Override // xsna.ob00
        public final int a() {
            return this.e;
        }

        @Override // xsna.ob00
        public final int b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interlude(start=");
            sb.append(this.d);
            sb.append(", end=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: LyricsTimecodeLine.kt */
    public static final class d extends ob00 {
        public final int d;
        public final int e;
        public final String f;

        public d(int i, int i2, String str) {
            super(i, i2);
            this.d = i;
            this.e = i2;
            this.f = str;
        }

        @Override // xsna.ob00
        public final int a() {
            return this.e;
        }

        @Override // xsna.ob00
        public final int b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shy.a(this.e, Integer.hashCode(this.d) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextLine(start=");
            sb.append(this.d);
            sb.append(", end=");
            sb.append(this.e);
            sb.append(", text=");
            return ho8.a(sb, this.f, ')');
        }
    }

    public ob00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}
