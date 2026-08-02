package xsna;

/* compiled from: DateInput.kt */
/* loaded from: classes11.dex */
public final class q1l implements b6u0 {
    public final bxk a;
    public final int b;
    public final int c;
    public final int d;
    public final a e;

    /* compiled from: DateInput.kt */
    public static final class a implements uv70 {
        public a() {
        }

        @Override // xsna.uv70
        public final int a(int i) {
            q1l q1lVar = q1l.this;
            if (i <= q1lVar.b - 1) {
                return i;
            }
            if (i <= q1lVar.c - 1) {
                return i - 1;
            }
            int i2 = q1lVar.d;
            return i <= i2 + 1 ? i - 2 : i2;
        }

        @Override // xsna.uv70
        public final int b(int i) {
            q1l q1lVar = q1l.this;
            if (i < q1lVar.b) {
                return i;
            }
            if (i < q1lVar.c) {
                return i + 1;
            }
            int i2 = q1lVar.d;
            return i <= i2 ? i + 2 : i2 + 2;
        }
    }

    public q1l(bxk bxkVar) {
        this.a = bxkVar;
        String str = bxkVar.a;
        char c = bxkVar.b;
        this.b = drm0.L(str, c, 0, 6);
        this.c = drm0.P(str, c, 0, 6);
        this.d = bxkVar.c.length();
        this.e = new a();
    }

    @Override // xsna.b6u0
    public final klp0 a(us2 us2Var) {
        String str = us2Var.c;
        int length = str.length();
        int i = 0;
        int i2 = this.d;
        if (length > i2) {
            k9x q = swe0.q(0, i2);
            str = str.substring(q.b, q.c + 1);
        }
        String str2 = "";
        int i3 = 0;
        while (i < str.length()) {
            int i4 = i3 + 1;
            str2 = str2 + str.charAt(i);
            if (i4 == this.b || i3 + 2 == this.c) {
                StringBuilder e = fw3.e(str2);
                e.append(this.a.b);
                str2 = e.toString();
            }
            i++;
            i3 = i4;
        }
        return new klp0(new us2(str2), this.e);
    }
}
