package defpackage;

/* loaded from: classes10.dex */
public final class is90 extends jse {
    public final oyj b = new oyj();

    @Override // defpackage.jse
    public final boolean G(fse fseVar) {
        sjh sjhVar = uyj.a;
        if (o400.a.x.G(fseVar)) {
            return true;
        }
        oyj oyjVar = this.b;
        return !(oyjVar.b || !oyjVar.a);
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        oyj oyjVar = this.b;
        oyjVar.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a.x;
        if (g6uVar.G(fseVar) || oyjVar.b || !oyjVar.a) {
            g6uVar.o(fseVar, new wqj(2, oyjVar, runnable));
        } else if (oyjVar.d.offer(runnable)) {
            oyjVar.a();
        } else {
            ny61.r("cannot enqueue any more runnables");
        }
    }
}
