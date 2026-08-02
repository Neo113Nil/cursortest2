package xsna;

import com.vk.dto.shortvideo.ClipsAuthor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class eqm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eqm(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                rdm rdmVar = (rdm) this.d;
                w2w w2wVar = (w2w) this.e;
                fqm fqmVar = (fqm) this.f;
                new upm(rdmVar).o(w2wVar);
                w2wVar.I0().b().c().n(this.c, fqmVar.d);
                break;
            default:
                uvm0 uvm0Var = (uvm0) this.d;
                ClipsAuthor clipsAuthor = (ClipsAuthor) this.e;
                Long l = (Long) this.f;
                uvm0Var.b(true);
                if (!((Boolean) obj).booleanValue()) {
                    clipsAuthor.f = this.c;
                    clipsAuthor.k3(false);
                    uvm0Var.f(clipsAuthor);
                    clipsAuthor.n(l);
                }
                break;
        }
        return s3q0.a;
    }
}
