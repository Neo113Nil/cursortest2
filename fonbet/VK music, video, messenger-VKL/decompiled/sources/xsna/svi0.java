package xsna;

/* compiled from: SessionRoomsCountdownTimerState.kt */
/* loaded from: classes7.dex */
public final class svi0 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public svi0(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svi0)) {
            return false;
        }
        svi0 svi0Var = (svi0) obj;
        return this.a == svi0Var.a && this.b == svi0Var.b && this.c == svi0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomsCountdownTimerState(isTimerEnabled=");
        sb.append(this.a);
        sb.append(", isTimerPreset=");
        sb.append(this.b);
        sb.append(", timerValue=");
        return vu5.b(sb, this.c, ')');
    }
}
