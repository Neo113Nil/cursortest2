package defpackage;

import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lx2 {
    public final String a;
    public final long b;

    public lx2(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = str;
        this.b = elapsedRealtime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx2)) {
            return false;
        }
        lx2 lx2Var = (lx2) obj;
        return jl40.l(this.a, lx2Var.a) && this.b == lx2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Metadata(source=", this.a, ", initTime=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
