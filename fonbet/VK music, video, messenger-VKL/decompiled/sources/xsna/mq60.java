package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.xn60;

/* compiled from: NewsfeedListItemActor.kt */
/* loaded from: classes4.dex */
public final class mq60 extends al50<ur60, xn60.b, on50, ds60, qr60, yo60> {
    public mq60(dht dhtVar) {
        super(dhtVar);
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(xn60.b bVar) {
        if (bVar instanceof xn60.b.g) {
            a(new ds60.c.j(((xn60.b.g) bVar).b));
            return;
        }
        if (bVar instanceof xn60.b.h) {
            xn60.b.h hVar = (xn60.b.h) bVar;
            a(new ds60.c.l(hVar.c, hVar.b));
            return;
        }
        if (bVar instanceof xn60.b.f) {
            a(new ds60.c.i(((xn60.b.f) bVar).b));
            return;
        }
        if (bVar instanceof xn60.b.a) {
            xn60.b.a aVar = (xn60.b.a) bVar;
            a(new ds60.c.a(aVar.c, aVar.b));
            return;
        }
        if (bVar instanceof xn60.b.e) {
            a(new ds60.c.h(null, null));
            return;
        }
        if (bVar instanceof xn60.b.C4020b) {
            ((xn60.b.C4020b) bVar).getClass();
            a(new ds60.c.C2748c());
            return;
        }
        if (bVar instanceof xn60.b.c) {
            a(new ds60.c.d(null, null));
            return;
        }
        if (bVar instanceof xn60.b.d) {
            a(new ds60.c.f(null));
            return;
        }
        if (bVar instanceof yn60) {
            a(new ds60.c.g.b(((yn60) bVar).b));
            return;
        }
        if (bVar instanceof ao60) {
            a(new ds60.c.g.d(((ao60) bVar).b));
        } else if (bVar instanceof zn60) {
            a(new ds60.c.g.C2749c(((zn60) bVar).b));
        } else {
            if (!(bVar instanceof bo60)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new ds60.c.g.e(((bo60) bVar).b));
        }
    }
}
