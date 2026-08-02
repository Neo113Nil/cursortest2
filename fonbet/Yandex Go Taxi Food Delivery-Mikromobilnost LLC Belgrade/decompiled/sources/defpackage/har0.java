package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class har0 {
    public final String a;
    public final p9r0 b;

    public har0(String str, p9r0 p9r0Var) {
        this.a = str;
        this.b = p9r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof har0)) {
            return false;
        }
        har0 har0Var = (har0) obj;
        return jl40.l(this.a, har0Var.a) && jl40.l(this.b, har0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
