package xsna;

import xsna.hxo;

/* compiled from: EcosystemMultiAccountRenderer.kt */
/* loaded from: classes6.dex */
public final class pxo implements ij0 {
    public final /* synthetic */ qxo a;

    public pxo(qxo qxoVar) {
        this.a = qxoVar;
    }

    @Override // xsna.kgq0
    public final void a(com.vk.superapp.multiaccount.api.f fVar) {
        this.a.d.invoke(new hxo.g(fVar));
    }

    @Override // xsna.kgq0
    public final void b(com.vk.superapp.multiaccount.api.f fVar) {
        this.a.d.invoke(new hxo.k(fVar));
    }

    @Override // xsna.kgq0
    public final void c(com.vk.superapp.multiaccount.api.f fVar) {
        this.a.d.invoke(new hxo.h(fVar));
    }

    @Override // xsna.ij0
    public final void d() {
        this.a.d.invoke(hxo.d.b);
    }

    @Override // xsna.ij0
    public final void e() {
        this.a.d.invoke(hxo.a.b);
    }
}
