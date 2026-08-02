package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import xsna.ycw0;

/* compiled from: FeatureStateToMenuViewModelTransformer.kt */
/* loaded from: classes7.dex */
public final class evq extends wcw0<orw0, me00> {
    @Override // xsna.wcw0
    public final ycw0 a(VoipActionsFeatureState voipActionsFeatureState) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        me00 me00Var = (me00) voipActionsFeatureState;
        VoipActionsFeatureState.s sVar = me00Var.b;
        boolean z5 = sVar.a;
        boolean z6 = sVar.b;
        boolean z7 = me00Var.p.a;
        VoipActionsFeatureState.v vVar = me00Var.c;
        VoipActionsFeatureState.UserType userType = me00Var.a;
        VoipActionsFeatureState.UserType userType2 = VoipActionsFeatureState.UserType.AUTHORIZED;
        boolean z8 = userType == userType2;
        boolean z9 = vVar.a;
        if (z9 && z8) {
            z = z9;
            z2 = true;
        } else {
            z = z9;
            z2 = false;
        }
        ycw0.d dVar = new ycw0.d(z2, z && (vVar.c || vVar.e), vVar.b, vVar.f, vVar.e);
        VoipActionsFeatureState.r rVar = me00Var.d;
        boolean z10 = userType == userType2;
        boolean z11 = rVar.d;
        boolean z12 = rVar.a;
        boolean z13 = z12 && z10;
        if (z12 && (rVar.c || z11)) {
            z4 = false;
            z3 = true;
        } else {
            z3 = false;
            z4 = false;
        }
        ycw0.r rVar2 = new ycw0.r(z13, z3, rVar.b, z11);
        VoipActionsFeatureState.w wVar = me00Var.f;
        boolean z14 = true;
        ycw0.u uVar = new ycw0.u(wVar.a, wVar.c, wVar.b, wVar.d);
        VoipActionsFeatureState.k kVar = me00Var.g;
        ycw0.l lVar = new ycw0.l(kVar.a, kVar.c, kVar.b, kVar.d);
        VoipActionsFeatureState.m mVar = me00Var.l;
        ycw0.n nVar = new ycw0.n(mVar.a, mVar.b);
        VoipActionsFeatureState.b bVar = me00Var.i;
        boolean z15 = userType == userType2 ? true : z4;
        if (!bVar.a || !z15) {
            z14 = z4;
        }
        ycw0.b bVar2 = new ycw0.b(z14, bVar.b, bVar.c);
        VoipActionsFeatureState.l lVar2 = me00Var.m;
        ycw0.m mVar2 = new ycw0.m(lVar2.a, lVar2.b);
        VoipActionsFeatureState.x xVar = me00Var.o;
        ycw0.v vVar2 = new ycw0.v(xVar.a, xVar.b, xVar.c, xVar.d);
        VoipActionsFeatureState.i iVar = me00Var.h;
        ycw0.j jVar = new ycw0.j(iVar.a, iVar.b, iVar.c);
        ycw0.k kVar2 = new ycw0.k(me00Var.n.a);
        ycw0.f fVar = new ycw0.f(me00Var.e.a);
        VoipActionsFeatureState.t tVar = me00Var.q;
        ycw0.s sVar2 = new ycw0.s(tVar.c, tVar.h, tVar.a, tVar.b, tVar.d, tVar.e, tVar.f, tVar.g, tVar.i);
        ycw0.t tVar2 = new ycw0.t(me00Var.r.a);
        VoipActionsFeatureState.a aVar = me00Var.s;
        ycw0.a aVar2 = new ycw0.a(aVar.a, aVar.b);
        ycw0.g gVar = new ycw0.g(me00Var.t.a);
        VoipActionsFeatureState.d dVar2 = me00Var.u;
        return new orw0(z5, z6, z7, dVar, rVar2, uVar, lVar, nVar, mVar2, jVar, bVar2, kVar2, gVar, vVar2, fVar, sVar2, tVar2, aVar2, new ycw0.e(dVar2.a, dVar2.b, dVar2.c));
    }
}
