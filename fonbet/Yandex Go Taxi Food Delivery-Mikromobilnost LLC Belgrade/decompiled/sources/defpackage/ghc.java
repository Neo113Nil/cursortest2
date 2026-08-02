package defpackage;

/* loaded from: classes.dex */
public final class ghc implements moy0 {
    public final long a;

    public ghc(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        jxv.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.moy0
    public final float a() {
        return ldc.d(this.a);
    }

    @Override // defpackage.moy0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.moy0
    public final ml6 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghc) && ldc.c(this.a, ((ghc) obj).a);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) ldc.i(this.a)) + ')';
    }
}
