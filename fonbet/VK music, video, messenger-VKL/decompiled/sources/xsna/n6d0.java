package xsna;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class n6d0 extends vcr<p6d0> {
    public final String e;
    public p6d0 f;
    public String g;

    public n6d0() {
        this(null, null, 15);
    }

    @Override // xsna.vcr
    public final p6d0 b() {
        return null;
    }

    @Override // xsna.vcr
    public final p6d0 d() {
        return this.f;
    }

    @Override // xsna.vcr
    public final void e(p6d0 p6d0Var) {
        this.f = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n6d0(String str, p6d0 p6d0Var, int i) {
        super(2, p6d0Var, null);
        str = (i & 1) != 0 ? null : str;
        p6d0Var = (i & 2) != 0 ? null : p6d0Var;
        this.e = str;
        this.f = p6d0Var;
        this.g = null;
    }
}
