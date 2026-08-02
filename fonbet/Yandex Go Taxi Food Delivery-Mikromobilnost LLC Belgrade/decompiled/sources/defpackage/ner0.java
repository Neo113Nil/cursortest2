package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ner0 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public ner0(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ner0)) {
            return false;
        }
        ner0 ner0Var = (ner0) obj;
        return this.a == ner0Var.a && this.b == ner0Var.b && this.c.equals(ner0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(qv10.u("InAppOnlyToggleModel(visible=", ", checked=", ", title=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
