package xsna;

import xsna.lta;

/* compiled from: NicknameSwitchChangesApplier.kt */
/* loaded from: classes5.dex */
public final class e270 implements lta {
    public final pta a;

    public e270(pta ptaVar) {
        this.a = ptaVar;
    }

    @Override // xsna.lta
    public final io.reactivex.rxjava3.core.x<lta.a> apply() {
        pta ptaVar = pta.this;
        boolean z = ptaVar.c.c;
        boolean z2 = ptaVar.b.c;
        lta.a.b bVar = lta.a.b.a;
        return z != z2 ? io.reactivex.rxjava3.core.x.k(bVar) : io.reactivex.rxjava3.core.x.k(bVar);
    }
}
