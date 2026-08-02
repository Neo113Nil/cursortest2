package defpackage;

import com.yx360.design.compose.atoms.DsButton$Style;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fqm {
    public final String a;
    public final sls b;
    public final DsButton$Style c;

    public fqm(sls slsVar, DsButton$Style dsButton$Style, String str) {
        this.a = str;
        this.b = slsVar;
        this.c = dsButton$Style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqm)) {
            return false;
        }
        fqm fqmVar = (fqm) obj;
        return jl40.l(this.a, fqmVar.a) && jl40.l(this.b, fqmVar.b) && this.c == fqmVar.c;
    }

    public final int hashCode() {
        int a = nnm.a(this.a.hashCode() * 31, 31, this.b);
        DsButton$Style dsButton$Style = this.c;
        return a + (dsButton$Style == null ? 0 : dsButton$Style.hashCode());
    }

    public final String toString() {
        return "PrimaryButton(title=" + this.a + ", onClick=" + this.b + ", style=" + this.c + Extension.C_BRAKE;
    }
}
