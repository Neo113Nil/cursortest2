package xsna;

/* compiled from: SetManagedGroupsCountersCmd.kt */
/* loaded from: classes2.dex */
public final class tyi0 extends le6<s3q0> {
    public final int b;

    public tyi0(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        int b = w2wVar.I0().system().b();
        w2wVar.I0().l().h(new di00(this.b, b));
        w2wVar.I0().l().i(new di00(0, b));
        w2wVar.I0().l().j(new di00(0, b));
        w2wVar.e1(this, new f780(this));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyi0) && this.b == ((tyi0) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(0, Integer.hashCode(this.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return h5s.c(this.b, ", dialogsUnreadCount=0, dialogsUnreadUnmutedCount=0)", new StringBuilder("SetManagedGroupsCountersCmd(totalGroups="));
    }
}
