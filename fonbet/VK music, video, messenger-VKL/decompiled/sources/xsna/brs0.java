package xsna;

import xsna.a8a;
import xsna.jht0;
import xsna.wqs0;

/* compiled from: VideoFocusInteractor.kt */
/* loaded from: classes16.dex */
public final class brs0 implements izs<jht0, jht0> {
    public final /* synthetic */ wqs0.h b;

    public brs0(wqs0.h hVar) {
        this.b = hVar;
    }

    @Override // xsna.izs
    public final jht0 invoke(jht0 jht0Var) {
        jht0 jht0Var2 = jht0Var;
        jht0.a aVar = (jht0.a) (!(jht0Var2 instanceof jht0.a) ? null : jht0Var2);
        if (aVar == null) {
            return jht0Var2;
        }
        wqs0.h hVar = this.b;
        a8a.a aVar2 = hVar.c;
        return jht0.a.b(aVar, false, aVar2.d, aVar2.e, Float.valueOf(aVar2.a), hVar.d, hVar.e, 7);
    }
}
