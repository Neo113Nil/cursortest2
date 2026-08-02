package defpackage;

import com.yandex.delivery.mapper.model.state.SlotState$Size;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kus0 {
    public final iqs0 a;
    public final pts0 b;
    public final iqs0 c;
    public final iqs0 d;
    public final nr e;
    public final rus0 f;
    public final gws0 g;
    public final SlotState$Size h;

    public kus0(iqs0 iqs0Var, pts0 pts0Var, iqs0 iqs0Var2, iqs0 iqs0Var3, nr nrVar, rus0 rus0Var, gws0 gws0Var, SlotState$Size slotState$Size) {
        this.a = iqs0Var;
        this.b = pts0Var;
        this.c = iqs0Var2;
        this.d = iqs0Var3;
        this.e = nrVar;
        this.f = rus0Var;
        this.g = gws0Var;
        this.h = slotState$Size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kus0)) {
            return false;
        }
        kus0 kus0Var = (kus0) obj;
        return this.a.equals(kus0Var.a) && jl40.l(this.b, kus0Var.b) && jl40.l(this.c, kus0Var.c) && jl40.l(this.d, kus0Var.d) && jl40.l(this.e, kus0Var.e) && this.f.equals(kus0Var.f) && jl40.l(this.g, kus0Var.g) && this.h == kus0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pts0 pts0Var = this.b;
        int hashCode2 = (hashCode + (pts0Var == null ? 0 : pts0Var.hashCode())) * 31;
        iqs0 iqs0Var = this.c;
        int hashCode3 = (hashCode2 + (iqs0Var == null ? 0 : iqs0Var.hashCode())) * 31;
        iqs0 iqs0Var2 = this.d;
        int hashCode4 = (hashCode3 + (iqs0Var2 == null ? 0 : iqs0Var2.hashCode())) * 31;
        nr nrVar = this.e;
        int hashCode5 = (this.f.hashCode() + ((hashCode4 + (nrVar == null ? 0 : nrVar.hashCode())) * 31)) * 31;
        gws0 gws0Var = this.g;
        return this.h.hashCode() + ((hashCode5 + (gws0Var != null ? gws0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SlotState(body1=" + this.a + ", lead=" + this.b + ", body2=" + this.c + ", body3=" + this.d + ", action=" + this.e + ", style=" + this.f + ", trail=" + this.g + ", size=" + this.h + Extension.C_BRAKE;
    }
}
