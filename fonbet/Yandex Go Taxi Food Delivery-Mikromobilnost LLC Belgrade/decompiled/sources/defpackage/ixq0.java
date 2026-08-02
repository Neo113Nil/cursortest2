package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ixq0 {
    public final String a;
    public final String b;
    public final ytv c;

    public ixq0(String str, String str2, ytv ytvVar) {
        this.a = str;
        this.b = str2;
        this.c = ytvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixq0)) {
            return false;
        }
        ixq0 ixq0Var = (ixq0) obj;
        return jl40.l(this.a, ixq0Var.a) && jl40.l(this.b, ixq0Var.b) && this.c.equals(ixq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("Link(title=", this.a, ", data=", this.b, ", event=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
