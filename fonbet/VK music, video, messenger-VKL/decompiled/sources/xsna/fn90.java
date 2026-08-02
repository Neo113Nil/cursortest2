package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a990;
import xsna.dn90;
import xsna.gn90;

/* compiled from: PastAsrListReducer.kt */
/* loaded from: classes7.dex */
public final class fn90 extends dm50<com.vk.voip.ui.asr.ui.list.a, dn90, gn90> {
    @Override // xsna.dm50
    public final gn90 c(gn90 gn90Var, dn90 dn90Var) {
        gn90 gn90Var2 = gn90Var;
        dn90 dn90Var2 = dn90Var;
        if (dn90Var2 instanceof dn90.a) {
            dn90.a aVar = (dn90.a) dn90Var2;
            if (aVar instanceof dn90.a.c) {
                return gn90.d.b;
            }
            if (aVar instanceof dn90.a.b) {
                dn90.a.b bVar = (dn90.a.b) aVar;
                List<ev3> list = bVar.b;
                return list.isEmpty() ? gn90.c.b : new gn90.a(new zm90(list), new a990(Integer.valueOf(bVar.c), bVar.d, a990.a.b.a, a990.b.a.a));
            }
            if (aVar instanceof dn90.a.C2742a) {
                return new gn90.b(((dn90.a.C2742a) aVar).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (dn90Var2 instanceof dn90.b) {
            dn90.b bVar2 = (dn90.b) dn90Var2;
            if (!(gn90Var2 instanceof gn90.a)) {
                return gn90Var2;
            }
            if (bVar2 instanceof dn90.b.c) {
                gn90.a aVar2 = (gn90.a) gn90Var2;
                return gn90.a.a(aVar2, null, a990.a(aVar2.c, null, false, a990.a.c.a, null, 11), 1);
            }
            if (bVar2 instanceof dn90.b.C2743b) {
                gn90.a aVar3 = (gn90.a) gn90Var2;
                dn90.b.C2743b c2743b = (dn90.b.C2743b) bVar2;
                return new gn90.a(new zm90(j5g.u0(c2743b.b, aVar3.b.a)), a990.a(aVar3.c, Integer.valueOf(c2743b.c), c2743b.d, a990.a.b.a, null, 8));
            }
            if (!(bVar2 instanceof dn90.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gn90.a aVar4 = (gn90.a) gn90Var2;
            return gn90.a.a(aVar4, null, a990.a(aVar4.c, null, false, new a990.a.C2530a(((dn90.b.a) bVar2).b), null, 11), 1);
        }
        if (!(dn90Var2 instanceof dn90.c)) {
            if (!(dn90Var2 instanceof dn90.d)) {
                return gn90Var2;
            }
            dn90.d dVar = (dn90.d) dn90Var2;
            if (!(gn90Var2 instanceof gn90.a)) {
                return gn90Var2;
            }
            gn90.a aVar5 = (gn90.a) gn90Var2;
            List<ev3> list2 = aVar5.b.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!epx.f(((ev3) obj).a, dVar.b.a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList.isEmpty() ? gn90.c.b : gn90.a.a(aVar5, new zm90(arrayList), null, 2);
        }
        dn90.c cVar = (dn90.c) dn90Var2;
        if (!(gn90Var2 instanceof gn90.a)) {
            return gn90Var2;
        }
        if (cVar instanceof dn90.c.C2744c) {
            gn90.a aVar6 = (gn90.a) gn90Var2;
            return gn90.a.a(aVar6, null, a990.a(aVar6.c, null, false, null, a990.b.C2531b.a, 7), 1);
        }
        if (!(cVar instanceof dn90.c.b)) {
            if (!(cVar instanceof dn90.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gn90.a aVar7 = (gn90.a) gn90Var2;
            return gn90.a.a(aVar7, null, a990.a(aVar7.c, null, false, null, a990.b.a.a, 7), 1);
        }
        zm90 zm90Var = ((gn90.a) gn90Var2).b;
        dn90.c.b bVar3 = (dn90.c.b) cVar;
        List<ev3> list3 = bVar3.b;
        zm90Var.getClass();
        return new gn90.a(new zm90(list3), new a990(Integer.valueOf(bVar3.c), bVar3.d, a990.a.b.a, a990.b.a.a));
    }

    @Override // xsna.dm50
    public final com.vk.voip.ui.asr.ui.list.a d() {
        fi50 e = e(new v4v(23));
        fi50 e2 = e(new el30(this, 13));
        return new com.vk.voip.ui.asr.ui.list.a(e, e(new com(24)), e(new av70(1)), e2);
    }

    @Override // xsna.dm50
    public final void h(gn90 gn90Var, com.vk.voip.ui.asr.ui.list.a aVar) {
        gn90 gn90Var2 = gn90Var;
        com.vk.voip.ui.asr.ui.list.a aVar2 = aVar;
        if (gn90Var2 instanceof gn90.d) {
            f(aVar2.b, gn90Var2);
            return;
        }
        if (gn90Var2 instanceof gn90.b) {
            f(aVar2.a, gn90Var2);
        } else if (gn90Var2 instanceof gn90.c) {
            f(aVar2.c, gn90Var2);
        } else {
            if (!(gn90Var2 instanceof gn90.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(aVar2.d, gn90Var2);
        }
    }
}
