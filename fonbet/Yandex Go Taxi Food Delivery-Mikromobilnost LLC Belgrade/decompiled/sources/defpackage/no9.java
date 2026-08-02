package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class no9 {
    public final String a;
    public final mo9 b;

    public no9(String str, mo9 mo9Var) {
        this.a = str;
        this.b = mo9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no9)) {
            return false;
        }
        no9 no9Var = (no9) obj;
        return jl40.l(this.a, no9Var.a) && this.b.equals(no9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Toolbar(serviceName=" + this.a + ", icon=" + this.b + Extension.C_BRAKE;
    }
}
