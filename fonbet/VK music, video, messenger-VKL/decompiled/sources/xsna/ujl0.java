package xsna;

import com.vk.dto.common.GoodAlbum;
import kotlin.NoWhenBranchMatchedException;
import xsna.cll0;
import xsna.sjl0;
import xsna.xjl0;

/* compiled from: StorefrontAlbumsActor.kt */
/* loaded from: classes18.dex */
public final class ujl0 extends al50<ukl0, sjl0, on50, cll0, kkl0, xjl0> {
    public ujl0() {
        throw null;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        xjl0.b bVar;
        sjl0 sjl0Var = (sjl0) lj50Var;
        if (!(sjl0Var instanceof sjl0.a)) {
            if (sjl0Var instanceof sjl0.c) {
                a(cll0.c.b);
                return;
            } else {
                if (sjl0Var instanceof sjl0.b) {
                    a(cll0.b.b);
                    return;
                }
                return;
            }
        }
        sjl0.a aVar = (sjl0.a) sjl0Var;
        if (aVar instanceof sjl0.a.c) {
            bVar = xjl0.b.c.a;
        } else if (aVar instanceof sjl0.a.b) {
            bVar = xjl0.b.C4010b.a;
        } else if (aVar instanceof sjl0.a.d) {
            bVar = xjl0.b.d.a;
        } else if (aVar instanceof sjl0.a.C3669a) {
            GoodAlbum goodAlbum = ((sjl0.a.C3669a) aVar).b;
            bVar = new xjl0.b.a(goodAlbum.b, ((ukl0) this.b.getCurrentState()).f.b, goodAlbum.d);
        } else if (aVar instanceof sjl0.a.e) {
            bVar = xjl0.b.e.a;
        } else {
            if (!(aVar instanceof sjl0.a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = xjl0.b.f.a;
        }
        c(bVar);
    }
}
