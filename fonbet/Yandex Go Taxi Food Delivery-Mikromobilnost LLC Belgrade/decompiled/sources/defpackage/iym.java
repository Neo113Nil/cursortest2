package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iym {
    public final String a;
    public final String b;
    public final og70 c;

    public iym(String str, String str2, og70 og70Var) {
        this.a = str;
        this.b = str2;
        this.c = og70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iym)) {
            return false;
        }
        iym iymVar = (iym) obj;
        return jl40.l(this.a, iymVar.a) && jl40.l(this.b, iymVar.b) && this.c.equals(iymVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("DueSlot(title=", this.a, ", descriptionTemplate=", this.b, ", options=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
