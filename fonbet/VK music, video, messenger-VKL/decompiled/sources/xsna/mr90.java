package xsna;

/* compiled from: PausingDispatcher.jvm.kt */
/* loaded from: classes12.dex */
public final class mr90 extends ovj {
    public final kcn c = new kcn();

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        kcn kcnVar = this.c;
        kcnVar.getClass();
        bdn bdnVar = bdn.a;
        ge00 U = ie00.a.U();
        if (U.S(dVar) || kcnVar.b || !kcnVar.a) {
            U.P(dVar, new l96(1, kcnVar, runnable));
        } else {
            if (!kcnVar.d.offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            kcnVar.a();
        }
    }

    @Override // xsna.ovj
    public final boolean S(kotlin.coroutines.d dVar) {
        bdn bdnVar = bdn.a;
        if (ie00.a.U().S(dVar)) {
            return true;
        }
        kcn kcnVar = this.c;
        return !(kcnVar.b || !kcnVar.a);
    }
}
