package defpackage;

import io.scer.pdfx.a;

/* loaded from: classes4.dex */
public final class ira0 implements tsr {
    public final c2m a = new c2m();
    public final s790 b = new s790();

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        qrb0.a(ssrVar.c, new a(ssrVar, this.a, this.b));
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        qrb0.a(ssrVar.c, null);
        this.a.a.clear();
        this.b.a.clear();
    }
}
