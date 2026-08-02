package xsna;

/* compiled from: FrameInfo.java */
/* loaded from: classes12.dex */
public final class hfs {
    public final androidx.media3.common.a a;
    public final long b;

    public hfs(androidx.media3.common.a aVar, long j) {
        fxc0.q(aVar.D != null, "format colorInfo must be set");
        int i = aVar.u;
        fxc0.l(i, "format width must be positive, but is: %s", i > 0);
        int i2 = aVar.v;
        fxc0.l(i2, "format height must be positive, but is: %s", i2 > 0);
        this.a = aVar;
        this.b = j;
    }
}
