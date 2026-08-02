package xsna;

/* compiled from: ChannelReactionQuantitySelectorState.kt */
/* loaded from: classes16.dex */
public final class sab implements km50 {
    public final int b;
    public final int c;
    public final int d;

    public sab() {
        this(0);
    }

    public static sab a(sab sabVar, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = sabVar.b;
        }
        if ((i4 & 2) != 0) {
            i2 = sabVar.c;
        }
        sabVar.getClass();
        return new sab(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sab)) {
            return false;
        }
        sab sabVar = (sab) obj;
        return this.b == sabVar.b && this.c == sabVar.c && this.d == sabVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelReactionQuantitySelectorState(reactionCount=");
        sb.append(this.b);
        sb.append(", reactionCost=");
        sb.append(this.c);
        sb.append(", amount=");
        return vu5.b(sb, this.d, ')');
    }

    public /* synthetic */ sab(int i) {
        this(1, 0, 0);
    }

    public sab(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
