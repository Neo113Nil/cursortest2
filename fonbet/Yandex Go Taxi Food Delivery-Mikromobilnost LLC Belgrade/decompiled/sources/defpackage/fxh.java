package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fxh {
    public final String a;
    public final v4v b;
    public final tv7 c;

    public fxh(String str, ra90 ra90Var, tv7 tv7Var) {
        this.a = str;
        this.b = ra90Var;
        this.c = tv7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxh)) {
            return false;
        }
        fxh fxhVar = (fxh) obj;
        return jl40.l(this.a, fxhVar.a) && jl40.l(this.b, fxhVar.b) && this.c.equals(fxhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v4v v4vVar = this.b;
        return this.c.hashCode() + ((hashCode + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ContentActionState(title=" + this.a + ", icon=" + this.b + ", clickPayload=" + this.c + Extension.C_BRAKE;
    }
}
