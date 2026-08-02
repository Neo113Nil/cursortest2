package xsna;

import xsna.rgc0;

/* compiled from: PostingItemPresenterFactoryImpl.kt */
/* loaded from: classes4.dex */
public final class ugc0 implements rgc0 {
    @Override // xsna.rgc0
    public final sgc0 a(gzs gzsVar, rgc0.a aVar, izs izsVar, wqf wqfVar, trf trfVar, wzs wzsVar) {
        sgc0 sgc0Var = new sgc0(izsVar, aVar, wqfVar, trfVar, this, wzsVar, gzsVar, aVar.a, aVar.d);
        sgc0Var.F = wqfVar;
        return sgc0Var;
    }

    @Override // xsna.rgc0
    public final tgc0 b(qq40 qq40Var, rgc0.a aVar, ape0 ape0Var, ktq0 ktq0Var) {
        return new tgc0(ape0Var, aVar, this, ktq0Var, qq40Var, aVar.a, aVar.d);
    }
}
