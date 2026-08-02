package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ocr0 implements pcr0 {
    public final String a;
    public final boolean b;

    public ocr0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocr0)) {
            return false;
        }
        ocr0 ocr0Var = (ocr0) obj;
        return jl40.l(this.a, ocr0Var.a) && this.b == ocr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Name(title=", this.a, ", isEnabled=", this.b, Extension.C_BRAKE);
    }
}
