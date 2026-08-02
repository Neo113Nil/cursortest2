package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Notification$Position;

/* loaded from: classes2.dex */
public final class koc0 implements loc0 {
    public final qf20 a;
    public final PlaqueModel$Notification$Position b;

    public koc0(qf20 qf20Var, PlaqueModel$Notification$Position plaqueModel$Notification$Position) {
        this.a = qf20Var;
        this.b = plaqueModel$Notification$Position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koc0)) {
            return false;
        }
        koc0 koc0Var = (koc0) obj;
        return this.a.equals(koc0Var.a) && this.b == koc0Var.b;
    }

    @Override // defpackage.loc0
    public final PlaqueModel$Notification$Position getPosition() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", position=" + this.b + ')';
    }
}
