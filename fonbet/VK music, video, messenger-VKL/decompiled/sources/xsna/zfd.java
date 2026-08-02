package xsna;

/* compiled from: ClippingVideoSource.kt */
/* loaded from: classes8.dex */
public final class zfd extends sht0 {
    public final sht0 d;
    public final long e;
    public final long f;

    public zfd(sht0 sht0Var, long j, long j2) {
        super(sht0Var);
        this.d = sht0Var;
        this.e = j;
        this.f = j2;
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new zfd(this.d.d(str), this.e, this.f);
    }

    @Override // xsna.sht0
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            zfd zfdVar = (zfd) obj;
            if (this.e == zfdVar.e && this.f == zfdVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.sht0
    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(super.hashCode() * 31, 31, this.e);
    }
}
