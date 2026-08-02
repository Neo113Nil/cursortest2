package xsna;

/* compiled from: DiskCacheVideoSource.kt */
/* loaded from: classes8.dex */
public final class dbn extends sht0 {
    public final String d;
    public final sht0 e;

    public dbn(String str, sht0 sht0Var) {
        super(sht0Var);
        this.d = str;
        this.e = sht0Var;
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new dbn(this.d, this.e.d(str));
    }

    @Override // xsna.sht0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof dbn)) {
            return false;
        }
        dbn dbnVar = (dbn) obj;
        return epx.f(this.d, dbnVar.d) && epx.f(this.e, dbnVar.e);
    }

    @Override // xsna.sht0
    public final int hashCode() {
        return this.e.hashCode() + urd0.a(super.hashCode() * 31, 31, this.d);
    }
}
