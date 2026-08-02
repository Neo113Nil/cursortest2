package xsna;

import java.util.List;

/* compiled from: AutoValue_SpanWrapper.java */
/* loaded from: classes8.dex */
public final class un5 extends lik0 {
    public final rkh0 a;
    public final List<d9z> b;
    public final List<pyp> c;
    public final q94 d;
    public final int e;
    public final int f;
    public final izk0 g;
    public final String h;
    public final long i;
    public final boolean j;

    public un5(rkh0 rkh0Var, List list, List list2, q94 q94Var, int i, int i2, izk0 izk0Var, String str, long j, boolean z) {
        this.a = rkh0Var;
        if (list == null) {
            throw new NullPointerException("Null resolvedLinks");
        }
        this.b = list;
        if (list2 == null) {
            throw new NullPointerException("Null resolvedEvents");
        }
        this.c = list2;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.d = q94Var;
        this.e = i;
        this.f = i2;
        if (izk0Var == null) {
            throw new NullPointerException("Null status");
        }
        this.g = izk0Var;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.h = str;
        this.i = j;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lik0)) {
            return false;
        }
        lik0 lik0Var = (lik0) obj;
        return this.a.equals(lik0Var.q()) && this.b.equals(lik0Var.v()) && this.c.equals(lik0Var.u()) && this.d.equals(lik0Var.p()) && this.e == lik0Var.x() && this.f == lik0Var.y() && lik0Var.z() == 0 && this.g.equals(lik0Var.w()) && this.h.equals(lik0Var.t()) && this.i == lik0Var.r() && this.j == lik0Var.s();
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * (-721379959)) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        long j = this.i;
        return ((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ (this.j ? 1231 : 1237);
    }

    @Override // xsna.lik0
    public final q94 p() {
        return this.d;
    }

    @Override // xsna.lik0
    public final rkh0 q() {
        return this.a;
    }

    @Override // xsna.lik0
    public final long r() {
        return this.i;
    }

    @Override // xsna.lik0
    public final boolean s() {
        return this.j;
    }

    @Override // xsna.lik0
    public final String t() {
        return this.h;
    }

    @Override // xsna.lik0
    public final List<pyp> u() {
        return this.c;
    }

    @Override // xsna.lik0
    public final List<d9z> v() {
        return this.b;
    }

    @Override // xsna.lik0
    public final izk0 w() {
        return this.g;
    }

    @Override // xsna.lik0
    public final int x() {
        return this.e;
    }

    @Override // xsna.lik0
    public final int y() {
        return this.f;
    }

    @Override // xsna.lik0
    public final int z() {
        return 0;
    }
}
