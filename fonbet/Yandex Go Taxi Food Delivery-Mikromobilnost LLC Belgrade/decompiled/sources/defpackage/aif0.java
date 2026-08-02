package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aif0 extends n351 {
    public final long c;
    public final long d;

    public aif0(long j, long j2) {
        super("progress-bar-key", false, 14);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aif0)) {
            return false;
        }
        aif0 aif0Var = (aif0) obj;
        return this.c == aif0Var.c && this.d == aif0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return oyr.n(this.d, Extension.C_BRAKE, unr0.w(this.c, "ProgressBarModel(startTime=", ", estimateMs="));
    }
}
