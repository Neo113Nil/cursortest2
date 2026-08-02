package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class fhk extends x3 {
    public final List c;
    public final sls w;

    public fhk(List list, sls slsVar) {
        super(6, slsVar);
        this.c = list;
        this.w = slsVar;
    }

    @Override // defpackage.x3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhk)) {
            return false;
        }
        fhk fhkVar = (fhk) obj;
        return jl40.l(this.c, fhkVar.c) && this.w.equals(fhkVar.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DivProTopupMethodsBottomSheet(methods=" + this.c + ", hideCallback=" + this.w + Extension.C_BRAKE;
    }
}
