package xsna;

/* compiled from: VideoViewHolder.java */
/* loaded from: classes2.dex */
public final class brt0 implements izs<io.reactivex.rxjava3.disposables.c, s3q0> {
    public final /* synthetic */ art0 b;

    public brt0(art0 art0Var) {
        this.b = art0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = cVar;
        art0 art0Var = this.b;
        if (!art0Var.p.n.i()) {
            art0Var.e.setVisibility(0);
        }
        io.reactivex.rxjava3.disposables.c cVar3 = art0Var.m;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        art0Var.m = cVar2;
        return s3q0.a;
    }
}
