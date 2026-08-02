package xsna;

/* compiled from: ChannelSendMsgViewState.kt */
/* loaded from: classes16.dex */
public final class ccb implements ao50 {
    public final boolean a;
    public final boolean b;

    public ccb() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccb)) {
            return false;
        }
        ccb ccbVar = (ccb) obj;
        return this.a == ccbVar.a && this.b == ccbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelSendMsgViewState(isAvailable=");
        sb.append(this.a);
        sb.append(", isPostDelayed=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public ccb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
