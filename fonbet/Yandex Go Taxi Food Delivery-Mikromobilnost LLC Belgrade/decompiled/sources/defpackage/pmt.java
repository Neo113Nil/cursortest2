package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class pmt implements qmt {
    public final kwu a;
    public final meu b;
    public final wg10 c;
    public final String d;

    public pmt(kwu kwuVar, meu meuVar, wg10 wg10Var, String str) {
        this.a = kwuVar;
        this.b = meuVar;
        this.c = wg10Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmt)) {
            return false;
        }
        pmt pmtVar = (pmt) obj;
        return jl40.l(this.a, pmtVar.a) && this.b.equals(pmtVar.b) && this.c.equals(pmtVar.c) && this.d.equals(pmtVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(((this.a.i.hashCode() * 31) + Arrays.hashCode(this.b.a)) * 961, 31, this.c.a);
    }

    public final String toString() {
        return "Post(url=" + this.a + ", headers=" + this.b + ", proxyConfig=null, contentType=" + this.c + ", body=" + this.d + Extension.C_BRAKE;
    }
}
