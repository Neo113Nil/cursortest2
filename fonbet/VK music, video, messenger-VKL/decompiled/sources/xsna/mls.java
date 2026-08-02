package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.hls;
import xsna.ols;
import xsna.qtf0;
import xsna.rf90;

/* compiled from: FriendsAndFollowersTabReducer.kt */
/* loaded from: classes15.dex */
public final class mls extends dm50<qls, hls, ols> {
    public final iks d;

    public mls() {
        super(ols.d.b);
        this.d = new iks();
    }

    @Override // xsna.dm50
    public final ols c(ols olsVar, hls hlsVar) {
        ols olsVar2 = olsVar;
        hls hlsVar2 = hlsVar;
        if (hlsVar2 instanceof hls.b) {
            hls.b bVar = (hls.b) hlsVar2;
            if (bVar instanceof hls.b.a) {
                hls.b.a aVar = (hls.b.a) bVar;
                if (olsVar2 instanceof ols.a) {
                    return ols.a.a((ols.a) olsVar2, null, null, new rf90.a(aVar.b), 3);
                }
            } else if (bVar instanceof hls.b.C3007b) {
                jks jksVar = ((hls.b.C3007b) bVar).b;
                if (olsVar2 instanceof ols.a) {
                    ols.a aVar2 = (ols.a) olsVar2;
                    return ols.a.a(aVar2, new dls(j5g.u0(jksVar.a, aVar2.b.a), jksVar.b), null, rf90.b.a, 2);
                }
            } else {
                if (!(bVar instanceof hls.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (olsVar2 instanceof ols.a) {
                    return ols.a.a((ols.a) olsVar2, null, null, rf90.c.a, 3);
                }
            }
        } else if (hlsVar2 instanceof hls.d) {
            hls.d dVar = (hls.d) hlsVar2;
            if (olsVar2 instanceof ols.a) {
                if (dVar instanceof hls.d.c) {
                    return ols.a.a((ols.a) olsVar2, null, qtf0.b.a, null, 5);
                }
                if (dVar instanceof hls.d.b) {
                    return new ols.a(((hls.d.b) dVar).b, qtf0.a.a, rf90.b.a);
                }
                if (dVar instanceof hls.d.a) {
                    return ols.a.a((ols.a) olsVar2, null, qtf0.a.a, null, 5);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (hlsVar2 instanceof hls.a) {
                hls.a aVar3 = (hls.a) hlsVar2;
                if (aVar3 instanceof hls.a.b) {
                    return new ols.a(((hls.a.b) aVar3).b, qtf0.a.a, rf90.b.a);
                }
                if (aVar3 instanceof hls.a.C3006a) {
                    return new ols.c(((hls.a.C3006a) aVar3).b);
                }
                if (epx.f(aVar3, hls.a.c.b)) {
                    return ols.d.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (hlsVar2 instanceof jls) {
                return new ols.b(((jls) hlsVar2).b, false);
            }
            if (hlsVar2 instanceof ils) {
                ils ilsVar = (ils) hlsVar2;
                if (olsVar2 instanceof ols.b) {
                    return new ols.b(ilsVar.b, true);
                }
            } else {
                if (!(hlsVar2 instanceof hls.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                hls.c cVar = (hls.c) hlsVar2;
                if (olsVar2 instanceof ols.b) {
                    return new ols.b(cVar.b, ((ols.b) olsVar2).c);
                }
            }
        }
        return olsVar2;
    }

    @Override // xsna.dm50
    public final qls d() {
        return new qls(e(new qb(28)), e(new g54(24)), e(new k7f(this, 16)), e(new wh1(18)));
    }

    @Override // xsna.dm50
    public final void h(ols olsVar, qls qlsVar) {
        ols olsVar2 = olsVar;
        qls qlsVar2 = qlsVar;
        if (olsVar2 instanceof ols.a) {
            f(qlsVar2.c, olsVar2);
            return;
        }
        if (olsVar2 instanceof ols.c) {
            f(qlsVar2.b, olsVar2);
        } else if (olsVar2 instanceof ols.d) {
            f(qlsVar2.a, olsVar2);
        } else {
            if (!(olsVar2 instanceof ols.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(qlsVar2.d, olsVar2);
        }
    }
}
