package xsna;

import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a990;
import xsna.no90;
import xsna.qo90;

/* compiled from: PastBroadcastsReducer.kt */
/* loaded from: classes7.dex */
public final class po90 extends dm50<com.vk.voip.ui.broadcast.list.ui.a, no90, qo90> {
    @Override // xsna.dm50
    public final qo90 c(qo90 qo90Var, no90 no90Var) {
        qo90 qo90Var2 = qo90Var;
        no90 no90Var2 = no90Var;
        if (no90Var2 instanceof no90.a) {
            no90.a aVar = (no90.a) no90Var2;
            if (aVar instanceof no90.a.c) {
                return qo90.d.b;
            }
            if (aVar instanceof no90.a.b) {
                no90.a.b bVar = (no90.a.b) aVar;
                List<VideoFile> list = bVar.b;
                return list.isEmpty() ? qo90.c.b : new qo90.a(new xn90(list), new a990(Integer.valueOf(bVar.c), bVar.d, a990.a.b.a, a990.b.a.a));
            }
            if (aVar instanceof no90.a.C3406a) {
                return new qo90.b(((no90.a.C3406a) aVar).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (no90Var2 instanceof no90.b) {
            no90.b bVar2 = (no90.b) no90Var2;
            if (!(qo90Var2 instanceof qo90.a)) {
                return qo90Var2;
            }
            if (bVar2 instanceof no90.b.c) {
                qo90.a aVar2 = (qo90.a) qo90Var2;
                return qo90.a.a(aVar2, null, a990.a(aVar2.c, null, false, a990.a.c.a, null, 11), 1);
            }
            if (bVar2 instanceof no90.b.C3407b) {
                qo90.a aVar3 = (qo90.a) qo90Var2;
                no90.b.C3407b c3407b = (no90.b.C3407b) bVar2;
                return new qo90.a(new xn90(j5g.u0(c3407b.b, aVar3.b.a)), a990.a(aVar3.c, Integer.valueOf(c3407b.c), c3407b.d, a990.a.b.a, null, 8));
            }
            if (!(bVar2 instanceof no90.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            qo90.a aVar4 = (qo90.a) qo90Var2;
            return qo90.a.a(aVar4, null, a990.a(aVar4.c, null, false, new a990.a.C2530a(((no90.b.a) bVar2).b), null, 11), 1);
        }
        if (no90Var2 instanceof no90.c) {
            no90.c cVar = (no90.c) no90Var2;
            if (!(qo90Var2 instanceof qo90.a)) {
                return qo90Var2;
            }
            if (cVar instanceof no90.c.C3408c) {
                qo90.a aVar5 = (qo90.a) qo90Var2;
                return qo90.a.a(aVar5, null, a990.a(aVar5.c, null, false, null, a990.b.C2531b.a, 7), 1);
            }
            if (!(cVar instanceof no90.c.b)) {
                if (!(cVar instanceof no90.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qo90.a aVar6 = (qo90.a) qo90Var2;
                return qo90.a.a(aVar6, null, a990.a(aVar6.c, null, false, null, a990.b.a.a, 7), 1);
            }
            xn90 xn90Var = ((qo90.a) qo90Var2).b;
            no90.c.b bVar3 = (no90.c.b) cVar;
            List<VideoFile> list2 = bVar3.b;
            xn90Var.getClass();
            return new qo90.a(new xn90(list2), new a990(Integer.valueOf(bVar3.c), bVar3.d, a990.a.b.a, a990.b.a.a));
        }
        if (no90Var2 instanceof no90.e) {
            VideoFile videoFile = ((no90.e) no90Var2).b;
            if (!(qo90Var2 instanceof qo90.a)) {
                return qo90Var2;
            }
            qo90.a aVar7 = (qo90.a) qo90Var2;
            List<VideoFile> list3 = aVar7.b.a;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (VideoFile videoFile2 : list3) {
                if (videoFile2.o0() == videoFile.o0()) {
                    videoFile2 = videoFile;
                }
                arrayList.add(videoFile2);
            }
            return qo90.a.a(aVar7, new xn90(arrayList), null, 2);
        }
        if (!(no90Var2 instanceof no90.d)) {
            return qo90Var2;
        }
        no90.d dVar = (no90.d) no90Var2;
        if (!(qo90Var2 instanceof qo90.a)) {
            return qo90Var2;
        }
        qo90.a aVar8 = (qo90.a) qo90Var2;
        List<VideoFile> list4 = aVar8.b.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list4) {
            if (((VideoFile) obj).o0() != dVar.b.o0()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.isEmpty() ? qo90.c.b : qo90.a.a(aVar8, new xn90(arrayList2), null, 2);
    }

    @Override // xsna.dm50
    public final com.vk.voip.ui.broadcast.list.ui.a d() {
        fi50 e = e(new jz30(5));
        fi50 e2 = e(new lxz(this, 14));
        return new com.vk.voip.ui.broadcast.list.ui.a(e, e(new sux(10)), e(new kl60(4)), e2);
    }

    @Override // xsna.dm50
    public final void h(qo90 qo90Var, com.vk.voip.ui.broadcast.list.ui.a aVar) {
        qo90 qo90Var2 = qo90Var;
        com.vk.voip.ui.broadcast.list.ui.a aVar2 = aVar;
        if (qo90Var2 instanceof qo90.d) {
            f(aVar2.b, qo90Var2);
            return;
        }
        if (qo90Var2 instanceof qo90.b) {
            f(aVar2.a, qo90Var2);
        } else if (qo90Var2 instanceof qo90.c) {
            f(aVar2.c, qo90Var2);
        } else {
            if (!(qo90Var2 instanceof qo90.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(aVar2.d, qo90Var2);
        }
    }
}
