package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plaque.api.models.PlaqueModel$TabletPlaqueModel$Notification$Position;

/* loaded from: classes6.dex */
public final class noc0 implements ooc0 {
    public final pf20 a;
    public final PlaqueModel$TabletPlaqueModel$Notification$Position b;

    public noc0(pf20 pf20Var, PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position) {
        this.a = pf20Var;
        this.b = plaqueModel$TabletPlaqueModel$Notification$Position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noc0)) {
            return false;
        }
        noc0 noc0Var = (noc0) obj;
        return jl40.l(this.a, noc0Var.a) && this.b == noc0Var.b;
    }

    @Override // defpackage.ooc0
    public final PlaqueModel$TabletPlaqueModel$Notification$Position getPosition() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
