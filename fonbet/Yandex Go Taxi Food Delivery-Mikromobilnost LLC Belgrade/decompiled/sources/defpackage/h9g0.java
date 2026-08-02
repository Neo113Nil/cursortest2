package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h9g0 {
    public final g9g0 a;
    public final String b;

    public h9g0(g9g0 g9g0Var) {
        this.a = g9g0Var;
        this.b = "QrcScanId_" + UUID.randomUUID();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9g0) && jl40.l(this.a, ((h9g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QrPaymentsMainState(status=" + this.a + Extension.C_BRAKE;
    }

    public h9g0() {
        this(0);
    }

    public h9g0(int i) {
        this(new c9g0());
    }
}
