package defpackage;

/* loaded from: classes12.dex */
public final class m2p implements w8w0 {
    public final /* synthetic */ sls a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ p2p c;

    public m2p(sls slsVar, sls slsVar2, p2p p2pVar) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = p2pVar;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.w8w0
    public final void onFailure(Throwable th) {
        jst.e.h(null, "Failed to open super authorization from service modal view", th);
        this.b.invoke();
        this.c.r(new qu(9));
    }

    @Override // defpackage.w8w0
    public final void p() {
        this.a.invoke();
    }
}
