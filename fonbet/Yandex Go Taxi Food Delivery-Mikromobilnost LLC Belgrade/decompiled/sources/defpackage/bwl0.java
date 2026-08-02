package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bwl0 implements dwl0 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public bwl0(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwl0)) {
            return false;
        }
        bwl0 bwl0Var = (bwl0) obj;
        return this.a == bwl0Var.a && this.b == bwl0Var.b && this.c.equals(bwl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(qv10.u("Editing(isSubmitting=", ", isValid=", ", doneButtonText=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
