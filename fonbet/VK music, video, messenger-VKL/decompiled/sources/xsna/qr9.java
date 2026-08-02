package xsna;

/* compiled from: CaptchaContract.kt */
/* loaded from: classes15.dex */
public abstract class qr9 {
    public final int a;

    /* compiled from: CaptchaContract.kt */
    public static final class a extends qr9 {
        public final String b;
        public final int c;

        public a(String str, int i) {
            super(i);
            this.b = str;
            this.c = i;
        }

        @Override // xsna.qr9
        public final int a() {
            return this.c;
        }

        @Override // xsna.qr9
        public final qr9 b(int i) {
            return new a(this.b, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Checking(input=");
            sb.append(this.b);
            sb.append(", refreshCountdown=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: CaptchaContract.kt */
    public static final class b extends qr9 {
        public final int b;

        public b(int i) {
            super(i);
            this.b = i;
        }

        @Override // xsna.qr9
        public final int a() {
            return this.b;
        }

        @Override // xsna.qr9
        public final qr9 b(int i) {
            return new b(i);
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
            return vu5.b(new StringBuilder("Inactive(refreshCountdown="), this.b, ')');
        }
    }

    /* compiled from: CaptchaContract.kt */
    public static final class c extends qr9 {
        public final int b;

        public c(int i) {
            super(i);
            this.b = i;
        }

        @Override // xsna.qr9
        public final int a() {
            return this.b;
        }

        @Override // xsna.qr9
        public final qr9 b(int i) {
            return new c(i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Loading(refreshCountdown="), this.b, ')');
        }
    }

    /* compiled from: CaptchaContract.kt */
    public static final class d extends qr9 {
        public final int b;

        public d(int i) {
            super(i);
            this.b = i;
        }

        @Override // xsna.qr9
        public final int a() {
            return this.b;
        }

        @Override // xsna.qr9
        public final qr9 b(int i) {
            return new d(i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LoadingError(refreshCountdown="), this.b, ')');
        }
    }

    /* compiled from: CaptchaContract.kt */
    public static final class e extends qr9 {
        public final boolean b;
        public final int c;

        public e(boolean z, int i) {
            super(i);
            this.b = z;
            this.c = i;
        }

        @Override // xsna.qr9
        public final int a() {
            return this.c;
        }

        @Override // xsna.qr9
        public final qr9 b(int i) {
            return new e(this.b, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(isPlaying=");
            sb.append(this.b);
            sb.append(", refreshCountdown=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public qr9(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public abstract qr9 b(int i);
}
