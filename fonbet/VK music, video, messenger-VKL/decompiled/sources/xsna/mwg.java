package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.lwg;
import xsna.mvg;

/* compiled from: CommunityCheckListNavigator.kt */
/* loaded from: classes18.dex */
public final class mwg {
    public final wj50<lwg> a;

    public mwg(f4z f4zVar) {
        this.a = f4zVar;
    }

    public final void a(mvg.d dVar) {
        lwg lVar;
        if (dVar instanceof mvg.d.b) {
            lVar = new lwg.c(((mvg.d.b) dVar).a);
        } else if (dVar instanceof mvg.d.e) {
            lVar = new lwg.f(((mvg.d.e) dVar).a);
        } else if (dVar instanceof mvg.d.c) {
            lVar = new lwg.d(fkq0.a(((mvg.d.c) dVar).a));
        } else if (dVar instanceof mvg.d.g) {
            mvg.d.g gVar = (mvg.d.g) dVar;
            lVar = new lwg.i(gVar.a, gVar.b);
        } else if (dVar instanceof mvg.d.a) {
            lVar = new lwg.b(fkq0.a(((mvg.d.a) dVar).a));
        } else if (dVar instanceof mvg.d.f) {
            lVar = new lwg.g(((mvg.d.f) dVar).a);
        } else if (dVar instanceof mvg.d.l) {
            lVar = lwg.m.a;
        } else if (dVar instanceof mvg.d.m) {
            mvg.d.m mVar = (mvg.d.m) dVar;
            lVar = new lwg.k(mVar.a, mVar.b);
        } else if (dVar instanceof mvg.d.i) {
            lVar = new lwg.h(((mvg.d.i) dVar).a);
        } else if (dVar instanceof mvg.d.C3375d) {
            lVar = new lwg.e(((mvg.d.C3375d) dVar).a);
        } else if (dVar instanceof mvg.d.h) {
            mvg.d.h hVar = (mvg.d.h) dVar;
            lVar = new lwg.j(hVar.a, hVar.b);
        } else if (dVar instanceof mvg.d.j) {
            lVar = new lwg.a(fkq0.a(((mvg.d.j) dVar).a));
        } else {
            if (!(dVar instanceof mvg.d.k)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = new lwg.l(((mvg.d.k) dVar).a);
        }
        this.a.b(lVar);
    }
}
