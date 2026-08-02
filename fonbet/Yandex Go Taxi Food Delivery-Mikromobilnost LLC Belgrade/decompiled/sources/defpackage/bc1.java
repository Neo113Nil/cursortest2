package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.common_models.net.map_object.a0;

/* loaded from: classes9.dex */
public final class bc1 {
    public static final bc1 g;
    public final a0 a;
    public final UpdateReason b;
    public final String c;
    public final pv0 d;
    public final g2t e;
    public final String f;

    static {
        a0.Companion.getClass();
        g = new bc1(a0.e, UpdateReason.UNKNOWN, "", null, null, null);
    }

    public bc1(a0 a0Var, UpdateReason updateReason, String str, pv0 pv0Var, g2t g2tVar, String str2) {
        this.a = a0Var;
        this.b = updateReason;
        this.c = str;
        this.d = pv0Var;
        this.e = g2tVar;
        this.f = str2;
    }

    public final v6r a() {
        g2t g2tVar = this.e;
        if (g2tVar != null) {
            return g2tVar.a;
        }
        return null;
    }

    public final zzs b() {
        g2t g2tVar = this.e;
        p820 p820Var = g2tVar != null ? g2tVar.b : null;
        if (p820Var != null) {
            return p820Var.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc1)) {
            return false;
        }
        bc1 bc1Var = (bc1) obj;
        return jl40.l(this.a, bc1Var.a) && this.b == bc1Var.b && jl40.l(this.c, bc1Var.c) && jl40.l(this.d, bc1Var.d) && jl40.l(this.e, bc1Var.e) && jl40.l(this.f, bc1Var.f);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        pv0 pv0Var = this.d;
        int hashCode = (b + (pv0Var == null ? 0 : pv0Var.hashCode())) * 31;
        g2t g2tVar = this.e;
        int hashCode2 = (hashCode + (g2tVar == null ? 0 : g2tVar.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdjustmentShowScreenData(screen=" + this.a + ", updateReason=" + this.b + ", selectedPickupPointId=" + this.c + ", addressInfo=" + this.d + ", finalSuggestResponse=" + this.e + ", choiceId=" + this.f + Extension.C_BRAKE;
    }
}
