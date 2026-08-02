package xsna;

/* compiled from: DialogHistoryBoundDataSource.kt */
/* loaded from: classes13.dex */
public final class ifm implements h8v {
    public final a1w a;
    public final long b;
    public final bpn0 c = new bpn0(new nuj(this, 3));

    public ifm(long j, a1w a1wVar) {
        this.a = a1wVar;
        this.b = j;
    }

    @Override // xsna.h8v
    public final g8v a() {
        return (hfm) this.c.getValue();
    }

    public final String toString() {
        return "DialogHistoryBoundDataSource-" + hashCode() + ": dialogId=" + this.b;
    }
}
