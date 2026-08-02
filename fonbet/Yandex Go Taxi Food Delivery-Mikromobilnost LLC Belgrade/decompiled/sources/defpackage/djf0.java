package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class djf0 {
    public final double a;
    public final qfc b;
    public final qfc c;

    public djf0(double d, qfc qfcVar, qfc qfcVar2) {
        this.a = d;
        this.b = qfcVar;
        this.c = qfcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djf0)) {
            return false;
        }
        djf0 djf0Var = (djf0) obj;
        return Double.compare(this.a, djf0Var.a) == 0 && this.b.equals(djf0Var.b) && this.c.equals(djf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ProgressIndicatorModel(progress=" + this.a + ", fillColor=" + this.b + ", trackColor=" + this.c + Extension.C_BRAKE;
    }
}
