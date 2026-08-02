package xsna;

/* compiled from: ImItemsUtils.kt */
/* loaded from: classes2.dex */
public final class c2a0 {
    public final int a;
    public final int b;
    public final izs<Long, Integer> c;

    /* JADX WARN: Multi-variable type inference failed */
    public c2a0(int i, int i2, izs<? super Long, Integer> izsVar) {
        this.a = i;
        this.b = i2;
        this.c = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2a0)) {
            return false;
        }
        c2a0 c2a0Var = (c2a0) obj;
        return this.a == c2a0Var.a && this.b == c2a0Var.b && epx.f(this.c, c2a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phases(dialogsPhase=");
        sb.append(this.a);
        sb.append(", channelsPhase=");
        sb.append(this.b);
        sb.append(", channelPhaseProvider=");
        return up.c(sb, this.c, ')');
    }
}
