package xsna;

import com.vk.dto.shortvideo.ClipsAuthor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rvm0 implements izs {
    public final /* synthetic */ uvm0 b;
    public final /* synthetic */ ClipsAuthor c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Long f;

    public /* synthetic */ rvm0(uvm0 uvm0Var, ClipsAuthor clipsAuthor, int i, boolean z, Long l) {
        this.b = uvm0Var;
        this.c = clipsAuthor;
        this.d = i;
        this.e = z;
        this.f = l;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        uvm0 uvm0Var = this.b;
        uvm0Var.b(true);
        if (!((Boolean) obj).booleanValue()) {
            ClipsAuthor clipsAuthor = this.c;
            clipsAuthor.f = this.d;
            clipsAuthor.k3(this.e);
            uvm0Var.f(clipsAuthor);
            clipsAuthor.n(this.f);
        }
        return s3q0.a;
    }
}
