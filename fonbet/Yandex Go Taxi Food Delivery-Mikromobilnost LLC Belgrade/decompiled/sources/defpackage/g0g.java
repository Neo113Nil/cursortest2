package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.preorder.source.domain.a;

/* loaded from: classes6.dex */
public final class g0g implements xvf0 {
    public final /* synthetic */ int a;
    public final h0g b;

    public /* synthetic */ g0g(h0g h0gVar, int i) {
        this.a = i;
        this.b = h0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0g h0gVar = this.b;
        switch (i) {
            case 0:
                return new yzf(h0gVar.x, h0gVar.y, h0gVar.z);
            case 1:
                return new uu((k7x0) h0gVar.x.M3.get(), (i130) h0gVar.y.g0.get(), (iuv) h0gVar.B7.a);
            case 2:
                a aVar = (a) h0gVar.y.sk.get();
                q5z.h(aVar);
                return aVar;
            case 3:
                kr0 kr0Var = (kr0) h0gVar.y.Ec.get();
                q5z.h(kr0Var);
                return kr0Var;
            case 4:
                return h0gVar.y.w1();
            case 5:
                return (u) h0gVar.y.kk.get();
            case 6:
                yp2 yp2Var = (yp2) h0gVar.x.kk.get();
                q5z.h(yp2Var);
                return yp2Var;
            case 7:
                return new com.yandex.go.taxi.tariffs.interactor.a((k) h0gVar.x.B2.get());
            case 8:
                return (d83) h0gVar.y.lv.get();
            case 9:
                im4 im4Var = (im4) h0gVar.x.Co.get();
                q5z.h(im4Var);
                return im4Var;
            case 10:
                return h0gVar.x.q();
            case 11:
                return h0gVar.a();
            case 12:
                ru.yandex.taxi.preorder.source.cars.a aVar2 = (ru.yandex.taxi.preorder.source.cars.a) h0gVar.x.Uo.get();
                q5z.h(aVar2);
                return aVar2;
            case 13:
                return (d49) h0gVar.y.Iu.get();
            case 14:
                return new u49(new hh5((dne0) h0gVar.x.d.get()));
            case 15:
                d0g d0gVar = h0gVar.y.a;
                zzf zzfVar = d0gVar.a;
                return new hf9((dqe0) zzfVar.s2.get(), d0gVar.b.T2(), (wiq0) zzfVar.B2.get());
            case 16:
                return new dwb(h0gVar.x.A1());
            case 17:
                c0g c0gVar = h0gVar.y.a.b;
                return new mwb((pwb) c0gVar.bw.get(), c0gVar.I1());
            case 18:
                return h0gVar.L();
            case 19:
                return (mzb) h0gVar.y.Ic.get();
            case 20:
                r8h r8hVar = (r8h) h0gVar.x.s.get();
                q5z.h(r8hVar);
                return r8hVar;
            case 21:
                return (ypc) h0gVar.y.Wd.get();
            case 22:
                return (drd) h0gVar.x.Qg.get();
            case 23:
                ncb ncbVar = h0gVar.E7;
                qrb qrbVar = h0gVar.F7;
                g6 g6Var = h0gVar.G7;
                zzf zzfVar2 = h0gVar.x;
                return new mnc(ncbVar, qrbVar, g6Var, (wiq0) zzfVar2.B2.get(), new rz0((rqo) zzfVar2.C.get(), 3));
            case 24:
                return new gvd(h0gVar.x.x());
            case 25:
                b bVar = (b) h0gVar.y.k8.get();
                q5z.h(bVar);
                return bVar;
            case 26:
                return new ooe(h0gVar.y.I1());
            case 27:
                return new qoe(h0gVar.y.I1());
            case 28:
                zwe zweVar = (zwe) h0gVar.x.Vi.get();
                q5z.h(zweVar);
                return zweVar;
            default:
                return h0gVar.y.a.c();
        }
    }
}
