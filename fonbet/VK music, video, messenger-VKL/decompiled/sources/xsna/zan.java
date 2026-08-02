package xsna;

import java.util.concurrent.CancellationException;

/* compiled from: DiskCacheReadProducer.java */
/* loaded from: classes12.dex */
public final class zan implements tpj<rip, Void> {
    public final /* synthetic */ yhd0 a;
    public final /* synthetic */ uhd0 b;
    public final /* synthetic */ l7j c;
    public final /* synthetic */ com.facebook.imagepipeline.producers.a d;

    public zan(com.facebook.imagepipeline.producers.a aVar, yhd0 yhd0Var, uhd0 uhd0Var, l7j l7jVar) {
        this.d = aVar;
        this.a = yhd0Var;
        this.b = uhd0Var;
        this.c = l7jVar;
    }

    @Override // xsna.tpj
    public final void a(e5o0 e5o0Var) throws Exception {
        boolean z;
        com.facebook.imagepipeline.producers.a aVar = this.d;
        l7j<rip> l7jVar = this.c;
        yhd0 yhd0Var = this.a;
        uhd0 uhd0Var = this.b;
        synchronized (e5o0Var.a) {
            z = e5o0Var.c;
        }
        if (z || (e5o0Var.e() && (e5o0Var.c() instanceof CancellationException))) {
            yhd0Var.g(uhd0Var, "DiskCacheProducer");
            l7jVar.a();
            return;
        }
        if (e5o0Var.e()) {
            yhd0Var.b(uhd0Var, "DiskCacheProducer", e5o0Var.c(), null);
            aVar.c.b(l7jVar, uhd0Var);
            return;
        }
        rip ripVar = (rip) e5o0Var.d();
        if (ripVar == null) {
            yhd0Var.f(uhd0Var, "DiskCacheProducer", com.facebook.imagepipeline.producers.a.c(yhd0Var, uhd0Var, false, 0));
            aVar.c.b(l7jVar, uhd0Var);
            return;
        }
        yhd0Var.f(uhd0Var, "DiskCacheProducer", com.facebook.imagepipeline.producers.a.c(yhd0Var, uhd0Var, true, ripVar.r()));
        yhd0Var.e(uhd0Var, "DiskCacheProducer", true);
        uhd0Var.t("disk");
        l7jVar.c(1.0f);
        l7jVar.b(1, ripVar);
        ripVar.close();
    }
}
