package xsna;

/* compiled from: MiniAppCallState.kt */
/* loaded from: classes7.dex */
public final class ep20 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public ep20(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep20)) {
            return false;
        }
        ep20 ep20Var = (ep20) obj;
        return this.a == ep20Var.a && this.b == ep20Var.b && this.c == ep20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppCallState(participantsCount=");
        sb.append(this.a);
        sb.append(", isReconnecting=");
        sb.append(this.b);
        sb.append(", canFinishCallForAll=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
