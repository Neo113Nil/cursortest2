package defpackage;

import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class joi implements uni {
    public final String a;
    public final abu b;
    public final tpr c;

    public joi(String str, abu abuVar, m0 m0Var) {
        this.a = str;
        this.b = abuVar;
        this.c = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joi)) {
            return false;
        }
        joi joiVar = (joi) obj;
        return jl40.l(this.a, joiVar.a) && this.b.equals(joiVar.b) && jl40.l(this.c, joiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DeliverySddSlotsArgs(tariff=" + this.a + ", header=" + this.b + ", slots=" + this.c + Extension.C_BRAKE;
    }
}
