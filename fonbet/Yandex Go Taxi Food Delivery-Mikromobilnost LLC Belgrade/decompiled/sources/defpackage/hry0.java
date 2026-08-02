package defpackage;

/* loaded from: classes10.dex */
public final class hry0 {
    public final bmt0 a;
    public final bmt0 b;
    public final bmt0 c;
    public final bmt0 d;

    public hry0(bmt0 bmt0Var, bmt0 bmt0Var2, bmt0 bmt0Var3, bmt0 bmt0Var4) {
        this.a = bmt0Var;
        this.b = bmt0Var2;
        this.c = bmt0Var3;
        this.d = bmt0Var4;
    }

    public final bmt0 a() {
        return this.b;
    }

    public final bmt0 b() {
        return this.c;
    }

    public final bmt0 c() {
        return this.d;
    }

    public final bmt0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hry0)) {
            return false;
        }
        hry0 hry0Var = (hry0) obj;
        return jl40.l(this.a, hry0Var.a) && jl40.l(this.b, hry0Var.b) && jl40.l(this.c, hry0Var.c) && jl40.l(this.d, hry0Var.d);
    }

    public final int hashCode() {
        bmt0 bmt0Var = this.a;
        int hashCode = (bmt0Var != null ? bmt0Var.hashCode() : 0) * 31;
        bmt0 bmt0Var2 = this.b;
        int hashCode2 = (hashCode + (bmt0Var2 != null ? bmt0Var2.hashCode() : 0)) * 31;
        bmt0 bmt0Var3 = this.c;
        int hashCode3 = (hashCode2 + (bmt0Var3 != null ? bmt0Var3.hashCode() : 0)) * 31;
        bmt0 bmt0Var4 = this.d;
        return hashCode3 + (bmt0Var4 != null ? bmt0Var4.hashCode() : 0);
    }

    public hry0() {
        this(null, 15);
    }

    public /* synthetic */ hry0(bmt0 bmt0Var, int i) {
        this((i & 1) != 0 ? null : bmt0Var, null, null, null);
    }
}
