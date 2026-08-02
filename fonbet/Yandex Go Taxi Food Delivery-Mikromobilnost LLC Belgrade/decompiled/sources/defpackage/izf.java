package defpackage;

import android.content.Context;
import com.yandex.go.analytics.b;
import com.yandex.go.taxi.tariffs.internal.interactor.f;
import com.yandex.go.taxi.tariffs.internal.routestats.interactor.c;
import com.yandex.go.taxi.tariffs.repository.a;
import com.yandex.go.taxi.tariffs.repository.g;
import ru.yandex.taxi.routestats.prefetch.m;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes5.dex */
public final class izf implements xvf0 {
    public final /* synthetic */ int a;
    public final bym b;

    public /* synthetic */ izf(bym bymVar, int i) {
        this.a = i;
        this.b = bymVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        bym bymVar = this.b;
        switch (i) {
            case 0:
                Context W1 = ((c0g) ((hzf) bymVar).a).W1();
                q5z.h(W1);
                return W1;
            case 1:
                tt2 Z1 = ((c0g) ((hzf) bymVar).a).Z1();
                q5z.h(Z1);
                return Z1;
            case 2:
                zzf zzfVar = ((c0g) ((hzf) bymVar).a).A.a.a;
                return new ryh(21, new iom0((zuj0) zzfVar.W.get(), zzfVar.j1(), (j5z) zzfVar.f0.get()));
            case 3:
                String str = ((hzf) bymVar).b;
                q5z.h(str);
                return str;
            case 4:
                return ((c0g) ((hzf) bymVar).a).A.a.g();
            case 5:
                axm axmVar = (axm) ((c0g) ((hzf) bymVar).a).z.Vj.get();
                q5z.h(axmVar);
                return axmVar;
            case 6:
                return ((hzf) bymVar).c;
            case 7:
                return ((hzf) bymVar).d;
            case 8:
                zzf zzfVar2 = ((c0g) ((hzf) bymVar).a).z;
                return new a(new f((com.yandex.go.taxi.tariffs.internal.repository.a) zzfVar2.Mf.get(), zzfVar2.t1(), (uvw) zzfVar2.up.get(), (ru.yandex.taxi.preorder.tollroad.a) zzfVar2.Sp.get(), (opz0) zzfVar2.Lb.get(), (mqz0) zzfVar2.Mb.get(), new ae61((dne0) zzfVar2.d.get(), (b03) zzfVar2.f.get()), (nrx0) zzfVar2.Ep.get(), (tt2) zzfVar2.n.get(), zzfVar2.s1()), zzfVar2.i(), new c(new t7j0((zuj0) zzfVar2.W.get(), (cpw0) zzfVar2.t5.get(), (bko) zzfVar2.Sg.get(), new xox0((com.yandex.go.navigation.screen.c) zzfVar2.Bc.get(), (qbl0) zzfVar2.C2.get(), (wiq0) zzfVar2.B2.get()), new au50(11, (i270) zzfVar2.Cm.get()), new dmw0((hqj0) zzfVar2.fh.get(), zzfVar2.E1(), new pp40((rqo) zzfVar2.C.get())), new vo40((rqo) zzfVar2.C.get(), new ijj0((g) zzfVar2.Lh.get(), zzf.Z0(), zzfVar2.t()), (g) zzfVar2.Lh.get()), new am2((acz) zzfVar2.o0.get(), (ru.yandex.taxi.maas.impl.ride.c) zzfVar2.d9.get(), new dhe0(zzfVar2.i1(), (n) zzfVar2.Q2.get())), new nlw0((mqv0) zzfVar2.j2.get())), (ru.yandex.taxi.provider.a) zzfVar2.Bp.get(), (uze0) zzfVar2.B2.get(), (m) zzfVar2.Dp.get(), (b) zzfVar2.i3.get()));
            case 9:
                rqo l2 = ((c0g) ((hzf) bymVar).a).l2();
                q5z.h(l2);
                return l2;
            case 10:
                y1s y1sVar = (y1s) ((c0g) ((hzf) bymVar).a).z.Zm.get();
                q5z.h(y1sVar);
                return y1sVar;
            case 11:
                pav w2 = ((c0g) ((hzf) bymVar).a).w2();
                q5z.h(w2);
                return w2;
            case 12:
                dqe0 I2 = ((c0g) ((hzf) bymVar).a).I2();
                q5z.h(I2);
                return I2;
            case 13:
                zuj0 N2 = ((c0g) ((hzf) bymVar).a).N2();
                q5z.h(N2);
                return N2;
            case 14:
                com.yandex.go.due.data.repository.a aVar = (com.yandex.go.due.data.repository.a) ((c0g) ((hzf) bymVar).a).A.a.y2.get();
                q5z.h(aVar);
                return aVar;
            case 15:
                ((c0g) ((hzf) bymVar).a).getClass();
                return new seq0();
            default:
                wiq0 S2 = ((c0g) ((hzf) bymVar).a).S2();
                q5z.h(S2);
                return S2;
        }
    }
}
