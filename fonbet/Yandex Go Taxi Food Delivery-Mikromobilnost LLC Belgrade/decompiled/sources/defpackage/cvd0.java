package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cvd0 extends evd0 {
    public final v4v a;
    public final long b;
    public final float c;

    public cvd0(v4v v4vVar, long j, float f) {
        this.a = v4vVar;
        this.b = j;
        this.c = f;
    }

    @Override // defpackage.evd0
    public final v4v a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvd0)) {
            return false;
        }
        cvd0 cvd0Var = (cvd0) obj;
        return jl40.l(this.a, cvd0Var.a) && this.b == cvd0Var.b && Float.compare(this.c, cvd0Var.c) == 0;
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        return Float.hashCode(this.c) + qv10.c((v4vVar == null ? 0 : v4vVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "AnimatablePointState(iconModel=" + this.a + ", remainingTimeInMillis=" + this.b + ", initialProgress=" + this.c + Extension.C_BRAKE;
    }
}
