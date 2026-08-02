package xsna;

/* compiled from: PrivateCommand.java */
/* loaded from: classes12.dex */
public final class xfd0 extends clk0 {
    public final long a;
    public final long b;

    public xfd0(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // xsna.clk0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return efz.b(this.b, " }", sb);
    }
}
