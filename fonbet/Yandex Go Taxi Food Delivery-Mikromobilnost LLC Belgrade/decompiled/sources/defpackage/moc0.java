package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plaque.api.models.PlaqueModel$TabletPlaqueModel$Notification$Position;

/* loaded from: classes6.dex */
public final class moc0 implements ooc0 {
    public final int a;
    public final PlaqueModel$TabletPlaqueModel$Notification$Position b;

    public moc0(PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position, int i) {
        this.a = i;
        this.b = plaqueModel$TabletPlaqueModel$Notification$Position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moc0)) {
            return false;
        }
        moc0 moc0Var = (moc0) obj;
        return this.a == moc0Var.a && this.b == moc0Var.b;
    }

    @Override // defpackage.ooc0
    public final PlaqueModel$TabletPlaqueModel$Notification$Position getPosition() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
