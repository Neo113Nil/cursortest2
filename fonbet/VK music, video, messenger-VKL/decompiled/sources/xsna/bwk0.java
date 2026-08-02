package xsna;

import kotlin.collections.EmptySet;
import xsna.kwk0;
import xsna.mwk0;
import xsna.wih0;

/* compiled from: StaticAdsItemOverlayDefaultRenderFactory.kt */
/* loaded from: classes17.dex */
public final class bwk0 implements gwk0 {
    public final kwk0 a;
    public final ovk0 b;

    public bwk0(yof yofVar, d11 d11Var) {
        kwk0 kwk0Var = new kwk0();
        kwk0Var.b = EmptySet.b;
        this.a = kwk0Var;
        this.b = new ovk0(yofVar, d11Var);
    }

    @Override // xsna.gwk0
    public final j390 a(mwk0.a aVar) {
        jxk0 jxk0Var = aVar.b;
        o390 o390Var = new o390(jxk0Var, aVar.e);
        wih0.d.a aVar2 = jxk0Var.b;
        tgg tggVar = new tgg(aVar2.a, null, aVar2.b, aVar2.e, aVar2.c, aVar2.h, null);
        kwk0 kwk0Var = this.a;
        kwk0Var.getClass();
        String str = jxk0Var.g;
        kwk0.a aVar3 = kwk0.a.MainOverlay;
        return new j390(new r390(kwk0Var.a(aVar3, o390Var), false, false, kwk0Var.a(kwk0.a.ErrorOverlay, o390Var), str, kwk0Var.a(kwk0.a.UnfocusedBlackout, o390Var)), this.b.a(new of00(kwk0Var.a(aVar3, o390Var), aVar.b, tggVar, aVar.f, aVar.c, aVar.d)));
    }
}
