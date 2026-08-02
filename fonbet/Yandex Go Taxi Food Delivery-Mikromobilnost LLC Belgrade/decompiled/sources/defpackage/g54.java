package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class g54 extends c3f.e.d.a.b.AbstractC0020e.AbstractC0022b.AbstractC0023a {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final h54 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new h54(this.e, this.a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final g54 b(String str) {
        this.c = str;
        return this;
    }

    public final g54 c(int i) {
        this.e = i;
        this.f = (byte) (this.f | 4);
        return this;
    }

    public final g54 d(long j) {
        this.d = j;
        this.f = (byte) (this.f | 2);
        return this;
    }

    public final g54 e(long j) {
        this.a = j;
        this.f = (byte) (this.f | 1);
        return this;
    }

    public final g54 f(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null symbol");
        return null;
    }
}
