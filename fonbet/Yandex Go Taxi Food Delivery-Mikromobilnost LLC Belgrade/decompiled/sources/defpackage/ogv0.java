package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ogv0 implements qgv0 {
    public final String a;
    public final String b;

    public ogv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogv0)) {
            return false;
        }
        ogv0 ogv0Var = (ogv0) obj;
        return this.a.equals(ogv0Var.a) && this.b.equals(ogv0Var.b);
    }

    public final int hashCode() {
        return ugv0.b.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        ugv0 ugv0Var = ugv0.b;
        StringBuilder v = b64.v("Button(title=", this.a, ", contentDescription=", this.b, ", action=");
        v.append(ugv0Var);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
