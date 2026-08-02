package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class l44 extends c3f.e.b {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public c3f.e.a g;
    public c3f.e.f h;
    public c3f.e.AbstractC0027e i;
    public c3f.e.c j;
    public List k;
    public int l;
    public byte m;

    public final m44 a() {
        String str;
        String str2;
        c3f.e.a aVar;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (aVar = this.g) != null) {
            return new m44(str, str2, this.c, this.d, this.e, this.f, aVar, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final l44 b(boolean z) {
        this.f = z;
        this.m = (byte) (this.m | 2);
        return this;
    }
}
