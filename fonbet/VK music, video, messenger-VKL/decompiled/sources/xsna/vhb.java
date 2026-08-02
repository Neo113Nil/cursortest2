package xsna;

/* compiled from: ChannelsPhaseProvider.kt */
/* loaded from: classes2.dex */
public final class vhb implements b2a0 {
    public final long a;
    public final xgl0 b;

    public vhb(long j, xgl0 xgl0Var) {
        this.a = j;
        this.b = xgl0Var;
    }

    @Override // xsna.b2a0
    public final int a() {
        xgl0 xgl0Var = this.b;
        uib a = xgl0Var.a();
        long j = this.a;
        return ad0.B(a.B(j)) ? xgl0Var.system().r(j) : xgl0Var.system().j();
    }
}
