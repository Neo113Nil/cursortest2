package xsna;

import com.vk.dto.shortvideo.ClipsAuthor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pvm0 implements izs {
    public final /* synthetic */ uvm0 b;
    public final /* synthetic */ ClipsAuthor c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Long e;

    public /* synthetic */ pvm0(uvm0 uvm0Var, ClipsAuthor clipsAuthor, int i, Long l) {
        this.b = uvm0Var;
        this.c = clipsAuthor;
        this.d = i;
        this.e = l;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        uvm0 uvm0Var = this.b;
        uvm0Var.b(true);
        ClipsAuthor clipsAuthor = this.c;
        clipsAuthor.f = this.d;
        clipsAuthor.k3(false);
        uvm0Var.f(clipsAuthor);
        clipsAuthor.n(this.e);
        com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
        return s3q0.a;
    }
}
