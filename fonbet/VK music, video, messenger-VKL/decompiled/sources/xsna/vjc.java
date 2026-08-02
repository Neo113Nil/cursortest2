package xsna;

/* compiled from: ClickableReactionInfo.kt */
/* loaded from: classes5.dex */
public final class vjc {
    public final int a;
    public final boolean b;

    public vjc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjc)) {
            return false;
        }
        vjc vjcVar = (vjc) obj;
        return this.a == vjcVar.a && this.b == vjcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableReactionInfo(reactionId=");
        sb.append(this.a);
        sb.append(", withBlackBackground=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
