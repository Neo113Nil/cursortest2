package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lu41 extends ou41 {
    public final Throwable a;
    public final Integer b;

    public lu41(Throwable th, Integer num) {
        this.a = th;
        this.b = num;
    }

    @Override // defpackage.ou41
    public final ou41 a() {
        return this;
    }

    @Override // defpackage.ou41
    public final lu41 b(Throwable th, Integer num) {
        return new lu41(th, num);
    }

    @Override // defpackage.ou41
    public final ou41 c() {
        return this;
    }

    @Override // defpackage.ou41
    public final mu41 d(boolean z, boolean z2) {
        return new mu41(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu41)) {
            return false;
        }
        lu41 lu41Var = (lu41) obj;
        return jl40.l(this.a, lu41Var.a) && jl40.l(this.b, lu41Var.b);
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Failed(throwable=" + this.a + ", errorCode=" + this.b + Extension.C_BRAKE;
    }
}
