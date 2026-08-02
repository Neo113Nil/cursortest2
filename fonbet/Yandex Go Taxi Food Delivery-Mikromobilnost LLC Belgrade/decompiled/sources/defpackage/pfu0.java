package defpackage;

import com.yandex.mapkit.transport.masstransit.LineAtStop;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pfu0 {
    public final igu0 a;
    public final LineAtStop b;
    public final wy30 c;
    public final vfu0 d;
    public final Float e;

    public pfu0(igu0 igu0Var, LineAtStop lineAtStop, wy30 wy30Var, vfu0 vfu0Var, Float f) {
        this.a = igu0Var;
        this.b = lineAtStop;
        this.c = wy30Var;
        this.d = vfu0Var;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pfu0) {
            pfu0 pfu0Var = (pfu0) obj;
            if (this.a.equals(pfu0Var.a) && this.b.equals(pfu0Var.b) && this.c.equals(pfu0Var.c) && this.d == pfu0Var.d && jl40.l(this.e, pfu0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        Float f = this.e;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "StopBubbleState(stopModel=" + this.a + ", line=" + this.b + ", schedule=" + this.c + ", focusMode=" + this.d + ", minZoom=" + this.e + Extension.C_BRAKE;
    }
}
