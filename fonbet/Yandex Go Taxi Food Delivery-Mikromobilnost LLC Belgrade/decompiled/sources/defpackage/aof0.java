package defpackage;

/* loaded from: classes12.dex */
public final class aof0 {
    public final mp60 a;
    public final mp60 b;
    public final boolean c;

    public aof0(mp60 mp60Var, mp60 mp60Var2, boolean z) {
        this.a = mp60Var;
        this.b = mp60Var2;
        this.c = z;
    }

    public static aof0 a(aof0 aof0Var, xy40 xy40Var) {
        mp60 mp60Var = aof0Var.b;
        boolean z = aof0Var.c;
        aof0Var.getClass();
        return new aof0(xy40Var, mp60Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aof0)) {
            return false;
        }
        aof0 aof0Var = (aof0) obj;
        return jl40.l(this.a, aof0Var.a) && jl40.l(this.b, aof0Var.b) && this.c == aof0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public aof0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aof0(int i) {
        this(r2, r2, false);
        xy40 xy40Var = np60.b;
    }
}
