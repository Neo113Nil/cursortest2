package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class czb0 {
    public final qzb0 a;
    public final PinState b;
    public final PinState c;
    public PinState d;

    public czb0(qzb0 qzb0Var, PinState pinState, PinState pinState2, PinState pinState3) {
        this.a = qzb0Var;
        this.b = pinState;
        this.c = pinState2;
        this.d = pinState3;
    }

    public static czb0 a(czb0 czb0Var, PinState pinState, int i) {
        qzb0 qzb0Var = czb0Var.a;
        PinState pinState2 = czb0Var.b;
        PinState pinState3 = czb0Var.c;
        if ((i & 8) != 0) {
            pinState = czb0Var.d;
        }
        czb0Var.getClass();
        return new czb0(qzb0Var, pinState2, pinState3, pinState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czb0)) {
            return false;
        }
        czb0 czb0Var = (czb0) obj;
        return this.a.equals(czb0Var.a) && this.b == czb0Var.b && this.c == czb0Var.c && this.d == czb0Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        PinState pinState = this.d;
        return hashCode + (pinState == null ? 0 : pinState.hashCode());
    }

    public final String toString() {
        return "Descriptor(seed=" + this.a + ", minState=" + this.b + ", maxState=" + this.c + ", state=" + this.d + Extension.C_BRAKE;
    }
}
