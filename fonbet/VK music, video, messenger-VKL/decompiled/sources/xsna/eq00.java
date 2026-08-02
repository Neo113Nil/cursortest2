package xsna;

import kotlin.collections.EmptySet;
import xsna.dr00;
import xsna.nq00;
import xsna.pq00;
import xsna.wih0;

/* compiled from: MarketAdsItemOverlayDefaultRenderFactory.kt */
/* loaded from: classes17.dex */
public final class eq00 implements jq00 {
    public final nq00 a;
    public final mp00 b;

    public eq00(yof yofVar, d11 d11Var) {
        nq00 nq00Var = new nq00();
        nq00Var.b = EmptySet.b;
        this.a = nq00Var;
        this.b = new mp00(yofVar, d11Var);
    }

    @Override // xsna.jq00
    public final dr00.d a(pq00.a aVar) {
        hr00 hr00Var = aVar.b;
        n390 n390Var = new n390(hr00Var, aVar.e);
        wih0.b.a aVar2 = hr00Var.b;
        tgg tggVar = new tgg(aVar2.a, aVar2.c, null, aVar2.f, aVar2.d, aVar2.i, null);
        nq00 nq00Var = this.a;
        nq00Var.getClass();
        String str = hr00Var.g;
        nq00.a aVar3 = nq00.a.MainOverlay;
        return new dr00.d(new r390(nq00Var.a(aVar3, n390Var), false, false, false, str, nq00Var.a(nq00.a.UnfocusedBlackout, n390Var)), this.b.a(new nf00(nq00Var.a(aVar3, n390Var), aVar.b, tggVar, aVar.f, aVar.c, aVar.d)));
    }
}
