package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.jns;
import xsna.otf0;
import xsna.pf90;
import xsna.wns;

/* compiled from: FriendsCleanupReducer.kt */
/* loaded from: classes15.dex */
public final class pns extends dm50<cos, jns, wns> {
    public final zms d;

    public pns() {
        super(wns.d.b);
        this.d = new zms();
    }

    @Override // xsna.dm50
    public final wns c(wns wnsVar, jns jnsVar) {
        wns wnsVar2 = wnsVar;
        jns jnsVar2 = jnsVar;
        if (!(jnsVar2 instanceof jns.b)) {
            if (jnsVar2 instanceof jns.c) {
                jns.c cVar = (jns.c) jnsVar2;
                if (cVar instanceof jns.c.a) {
                    jns.c.a aVar = (jns.c.a) cVar;
                    if (wnsVar2 instanceof wns.a) {
                        return wns.a.a((wns.a) wnsVar2, null, null, new pf90.a(aVar.b), 3);
                    }
                } else if (cVar instanceof jns.c.b) {
                    hns hnsVar = ((jns.c.b) cVar).b;
                    if (wnsVar2 instanceof wns.a) {
                        wns.a aVar2 = (wns.a) wnsVar2;
                        rms rmsVar = aVar2.b;
                        return wns.a.a(aVar2, rms.a(rmsVar, j5g.u0(hnsVar.b, rmsVar.b), null, 93), null, pf90.b.a, 2);
                    }
                } else {
                    if (!(cVar instanceof jns.c.C3133c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (wnsVar2 instanceof wns.a) {
                        return wns.a.a((wns.a) wnsVar2, null, null, pf90.c.a, 3);
                    }
                }
            } else if (jnsVar2 instanceof jns.d) {
                jns.d dVar = (jns.d) jnsVar2;
                if (wnsVar2 instanceof wns.a) {
                    if (dVar instanceof jns.d.c) {
                        return wns.a.a((wns.a) wnsVar2, null, otf0.b.a, null, 5);
                    }
                    if (!(dVar instanceof jns.d.b)) {
                        if (dVar instanceof jns.d.a) {
                            return wns.a.a((wns.a) wnsVar2, null, otf0.a.a, null, 5);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    rms rmsVar2 = ((jns.d.b) dVar).b;
                    if (rmsVar2.d != 0) {
                        return new wns.a(rmsVar2, otf0.a.a, pf90.b.a);
                    }
                }
            } else if (jnsVar2 instanceof lns) {
                UserId userId = ((lns) jnsVar2).b;
                if (wnsVar2 instanceof wns.a) {
                    wns.a aVar3 = (wns.a) wnsVar2;
                    rms rmsVar3 = aVar3.b;
                    if (rmsVar3.e.contains(userId)) {
                        return wnsVar2;
                    }
                    return wns.a.a(aVar3, rms.a(aVar3.b, null, j5g.v0(userId, rmsVar3.e), 111), null, null, 6);
                }
            } else if (jnsVar2 instanceof kns) {
                UserId userId2 = ((kns) jnsVar2).b;
                if (wnsVar2 instanceof wns.a) {
                    wns.a aVar4 = (wns.a) wnsVar2;
                    rms rmsVar4 = aVar4.b;
                    if (!rmsVar4.e.contains(userId2)) {
                        return wnsVar2;
                    }
                    return wns.a.a(aVar4, rms.a(aVar4.b, null, j5g.s0(rmsVar4.e, userId2), 111), null, null, 6);
                }
            } else if (!(jnsVar2 instanceof jns.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return wnsVar2;
        }
        jns.b bVar = (jns.b) jnsVar2;
        if (!(bVar instanceof jns.b.C3132b)) {
            if (bVar instanceof jns.b.a) {
                return new wns.c(((jns.b.a) bVar).b);
            }
            if (epx.f(bVar, jns.b.c.b)) {
                return wns.d.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        rms rmsVar5 = ((jns.b.C3132b) bVar).b;
        if (rmsVar5.d != 0) {
            return new wns.a(rmsVar5, otf0.a.a, pf90.b.a);
        }
        return wns.b.b;
    }

    @Override // xsna.dm50
    public final cos d() {
        return new cos(e(new tr0(19)), e(new d40(27)), e(new lwh(this, 12)), e(new dam(6)));
    }

    @Override // xsna.dm50
    public final void h(wns wnsVar, cos cosVar) {
        wns wnsVar2 = wnsVar;
        cos cosVar2 = cosVar;
        if (wnsVar2 instanceof wns.a) {
            f(cosVar2.c, wnsVar2);
            return;
        }
        if (wnsVar2 instanceof wns.c) {
            f(cosVar2.b, wnsVar2);
        } else if (wnsVar2 instanceof wns.d) {
            f(cosVar2.a, wnsVar2);
        } else {
            if (!(wnsVar2 instanceof wns.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(cosVar2.d, wnsVar2);
        }
    }
}
