package xsna;

/* compiled from: ChannelsPostponedPostsCountChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class yhb extends e500 {
    public final w2w c;
    public final long d;
    public final int e;

    public yhb(w2w w2wVar, long j, int i) {
        super("ChannelsPostponedPostsCountChangeLpTask");
        this.c = w2wVar;
        this.d = j;
        this.e = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().a().b0(this.e, this.d);
    }
}
