package xsna;

/* compiled from: CacheVideoSource.kt */
@ozl
/* loaded from: classes8.dex */
public final class ay8 extends sht0 {
    public final String d;
    public final r7s0 e;
    public final sht0 f;

    public ay8(String str, r7s0 r7s0Var, sht0 sht0Var) {
        super(sht0Var);
        this.d = str;
        this.e = r7s0Var;
        this.f = sht0Var;
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new ay8(this.d, this.e, this.f.d(str));
    }

    @Override // xsna.sht0
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            ay8 ay8Var = (ay8) obj;
            if (epx.f(this.d, ay8Var.d) && epx.f(this.e, ay8Var.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.sht0
    public final int hashCode() {
        return this.e.hashCode() + urd0.a(super.hashCode() * 31, 31, this.d);
    }
}
