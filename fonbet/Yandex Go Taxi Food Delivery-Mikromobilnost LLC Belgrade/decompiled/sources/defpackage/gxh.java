package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gxh {
    public final String a;
    public final ra90 b;

    public gxh(String str, ra90 ra90Var) {
        this.a = str;
        this.b = ra90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxh)) {
            return false;
        }
        gxh gxhVar = (gxh) obj;
        return jl40.l(this.a, gxhVar.a) && this.b.equals(gxhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PerformerState(rating=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
