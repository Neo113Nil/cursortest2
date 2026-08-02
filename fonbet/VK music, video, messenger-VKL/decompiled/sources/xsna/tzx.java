package xsna;

import com.vk.voip.api.join.JoinData;
import kotlin.NoWhenBranchMatchedException;
import xsna.pzx;
import xsna.uzx;

/* compiled from: JoinCallReducer.kt */
/* loaded from: classes7.dex */
public final class tzx extends dm50<yzx, pzx, uzx> {
    public final boolean d;

    public tzx(boolean z) {
        super(new uzx.d(z));
        this.d = z;
    }

    @Override // xsna.dm50
    public final uzx c(uzx uzxVar, pzx pzxVar) {
        uzx.a.AbstractC3860a c3861a;
        uzx uzxVar2 = uzxVar;
        pzx pzxVar2 = pzxVar;
        Object obj = null;
        if (pzxVar2 instanceof pzx.a) {
            pzx.a aVar = (pzx.a) pzxVar2;
            if (aVar instanceof pzx.a.c) {
                return new uzx.d(this.d);
            }
            if (aVar instanceof pzx.a.C3540a) {
                return new uzx.c(((pzx.a.C3540a) aVar).b);
            }
            if (!(aVar instanceof pzx.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            pzx.a.b bVar = (pzx.a.b) aVar;
            return new uzx.a(bVar.c, bVar.d, bVar.e, bVar.f, bVar.h ? new uzx.a.AbstractC3860a.c(bVar.g, o25.a().o(), new og0(obj, bVar.b)) : uzx.a.AbstractC3860a.d.a, false, bVar.g, new uzx.b(bVar.j), bVar.k, bVar.i);
        }
        if (pzxVar2 instanceof pzx.d) {
            pzx.d dVar = (pzx.d) pzxVar2;
            if (uzxVar2 instanceof uzx.a) {
                if (dVar instanceof pzx.d.a) {
                    throw null;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (pzxVar2 instanceof pzx.b) {
            pzx.b bVar2 = (pzx.b) pzxVar2;
            if (uzxVar2 instanceof uzx.a) {
                uzx.a aVar2 = (uzx.a) uzxVar2;
                JoinData joinData = aVar2.h;
                if (bVar2 instanceof pzx.b.C3541b) {
                    pzx.b.C3541b c3541b = (pzx.b.C3541b) bVar2;
                    c3861a = new uzx.a.AbstractC3860a.c(joinData, c3541b.b, c3541b.c);
                } else if (bVar2 instanceof pzx.b.c) {
                    c3861a = new uzx.a.AbstractC3860a.b(joinData, ((pzx.b.c) bVar2).b);
                } else {
                    if (!(bVar2 instanceof pzx.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pzx.b.a aVar3 = (pzx.b.a) bVar2;
                    c3861a = new uzx.a.AbstractC3860a.C3861a(aVar3.c, aVar3.b);
                }
                return uzx.a.a(aVar2, c3861a, false, null, false, 1007);
            }
        } else if (pzxVar2 instanceof pzx.c) {
            pzx.c cVar = (pzx.c) pzxVar2;
            if (uzxVar2 instanceof uzx.a) {
                if (epx.f(cVar, pzx.c.a.b)) {
                    return uzx.a.a((uzx.a) uzxVar2, null, false, new uzx.b(!r1.i.a), false, 895);
                }
                if (!epx.f(cVar, pzx.c.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return uzx.a.a((uzx.a) uzxVar2, null, false, null, !r0.j, 767);
            }
        } else {
            if (!(pzxVar2 instanceof pzx.e)) {
                throw new NoWhenBranchMatchedException();
            }
            pzx.e eVar = (pzx.e) pzxVar2;
            if (uzxVar2 instanceof uzx.a) {
                return uzx.a.a((uzx.a) uzxVar2, null, eVar.b, null, false, 991);
            }
        }
        return uzxVar2;
    }

    @Override // xsna.dm50
    public final yzx d() {
        return new yzx(e(new wr0(28)), e(new s6x(1)), e(new z6u(4)));
    }

    @Override // xsna.dm50
    public final void h(uzx uzxVar, yzx yzxVar) {
        uzx uzxVar2 = uzxVar;
        yzx yzxVar2 = yzxVar;
        if (uzxVar2 instanceof uzx.d) {
            f(yzxVar2.b, uzxVar2);
        } else if (uzxVar2 instanceof uzx.c) {
            f(yzxVar2.a, uzxVar2);
        } else {
            if (!(uzxVar2 instanceof uzx.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(yzxVar2.c, uzxVar2);
        }
    }
}
