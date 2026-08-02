package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mu41 extends ou41 {
    public final boolean a;
    public final boolean b;

    public mu41(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.ou41
    public final /* bridge */ /* synthetic */ ou41 a() {
        return nu41.a;
    }

    @Override // defpackage.ou41
    public final lu41 b(Throwable th, Integer num) {
        return new lu41(th, num);
    }

    @Override // defpackage.ou41
    public final /* bridge */ /* synthetic */ ou41 c() {
        return nu41.a;
    }

    @Override // defpackage.ou41
    public final mu41 d(boolean z, boolean z2) {
        return new mu41(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu41)) {
            return false;
        }
        mu41 mu41Var = (mu41) obj;
        return this.a == mu41Var.a && this.b == mu41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("Loading(afterError=", ", is401ErrorRetry=", Extension.C_BRAKE, this.a, this.b);
    }
}
