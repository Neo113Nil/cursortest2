package xsna;

/* compiled from: DiscoverStoryPreviewHolder.kt */
/* loaded from: classes6.dex */
public final class p9n implements b780 {
    public final /* synthetic */ q9n b;

    public p9n(q9n q9nVar) {
        this.b = q9nVar;
    }

    @Override // xsna.b780
    public final void g(String str) {
        q9n q9nVar = this.b;
        bwt0.p0(q9nVar.r, false);
        bwt0.p0(q9nVar.q, true);
        q9nVar.q.d();
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        q9n q9nVar = this.b;
        bwt0.p0(q9nVar.r, true);
        bwt0.p0(q9nVar.q, false);
        q9nVar.q.e();
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
