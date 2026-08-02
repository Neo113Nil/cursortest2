package xsna;

/* compiled from: ExcerptConfig.kt */
/* loaded from: classes6.dex */
public final class s1q {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Float e;

    /* compiled from: ExcerptConfig.kt */
    public static final class a {
        public static s1q a() {
            return new s1q(3, 0, 52);
        }

        public static s1q b() {
            return new s1q(3, 2, 48);
        }

        public static s1q c() {
            return new s1q(3, 0, 48);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s1q() {
        this(r0, r0, 63);
        int i = 0;
    }

    public static s1q a(s1q s1qVar, int i, int i2) {
        int i3 = (i2 & 2) != 0 ? s1qVar.b : 0;
        int i4 = s1qVar.c;
        boolean z = s1qVar.d;
        s1qVar.getClass();
        Float f = s1qVar.e;
        s1qVar.getClass();
        return new s1q(i, i3, i4, z, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1q)) {
            return false;
        }
        s1q s1qVar = (s1q) obj;
        return this.a == s1qVar.a && this.b == s1qVar.b && this.c == s1qVar.c && this.d == s1qVar.d && epx.f(this.e, s1qVar.e);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 961, this.d);
        Float f = this.e;
        return b + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExcerptConfig(maxExcerptLines=");
        sb.append(this.a);
        sb.append(", minTrimmedLines=");
        sb.append(this.b);
        sb.append(", linesThreshold=");
        sb.append(this.c);
        sb.append(", clickable=");
        sb.append(this.d);
        sb.append(", color=null, ratio=");
        return so.b(sb, this.e, ')');
    }

    public /* synthetic */ s1q(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? Integer.MAX_VALUE : 20, true, (i3 & 32) != 0 ? null : Float.valueOf(1.0f));
    }

    public s1q(int i, int i2, int i3, boolean z, Float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = f;
    }
}
