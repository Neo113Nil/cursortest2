package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fsi {
    public final kfi a;
    public final List b;

    public fsi(kfi kfiVar, List list) {
        this.a = kfiVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi)) {
            return false;
        }
        fsi fsiVar = (fsi) obj;
        return jl40.l(this.a, fsiVar.a) && this.b.equals(fsiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadExperiment(experiment=" + this.a + ", requirements=" + this.b + Extension.C_BRAKE;
    }
}
