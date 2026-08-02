package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gpi extends hpi {
    public final String a;
    public final String b;
    public final bpi c;

    public gpi(String str, String str2, bpi bpiVar) {
        this.a = str;
        this.b = str2;
        this.c = bpiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpi)) {
            return false;
        }
        gpi gpiVar = (gpi) obj;
        return this.a.equals(gpiVar.a) && this.b.equals(gpiVar.b) && this.c.equals(gpiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectSetupRequirement(title=", this.a, ", subtitle=", this.b, ", payload=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
