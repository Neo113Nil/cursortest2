package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lq51 extends hz91 {
    public final rbv c;

    public lq51(rbv rbvVar) {
        this.c = rbvVar;
    }

    @Override // defpackage.hz91
    public final rbv a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq51) && jl40.l(this.c, ((lq51) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Error(icon=" + this.c + Extension.C_BRAKE;
    }
}
