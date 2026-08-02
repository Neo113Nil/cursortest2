package xsna;

import xsna.tlo0;

/* compiled from: SnackbarModel.kt */
/* loaded from: classes18.dex */
public final class u8k0 {
    public final tlo0.f a;
    public final r2c b;

    public u8k0(tlo0.f fVar, r2c r2cVar) {
        this.a = fVar;
        this.b = r2cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8k0)) {
            return false;
        }
        u8k0 u8k0Var = (u8k0) obj;
        return epx.f(this.a, u8k0Var.a) && epx.f(this.b, u8k0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        r2c r2cVar = this.b;
        return hashCode + (r2cVar == null ? 0 : r2cVar.hashCode());
    }

    public final String toString() {
        return "SnackbarModel(title=" + this.a + ", actionForRetry=" + this.b + ')';
    }
}
