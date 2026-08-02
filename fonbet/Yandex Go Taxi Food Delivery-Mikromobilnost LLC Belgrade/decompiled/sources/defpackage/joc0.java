package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Notification$Position;

/* loaded from: classes2.dex */
public final class joc0 implements loc0 {
    public final int a;
    public final PlaqueModel$Notification$Position b;

    public joc0(PlaqueModel$Notification$Position plaqueModel$Notification$Position, int i) {
        this.a = i;
        this.b = plaqueModel$Notification$Position;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joc0)) {
            return false;
        }
        joc0 joc0Var = (joc0) obj;
        return this.a == joc0Var.a && this.b == joc0Var.b;
    }

    @Override // defpackage.loc0
    public final PlaqueModel$Notification$Position getPosition() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", position=" + this.b + ')';
    }
}
