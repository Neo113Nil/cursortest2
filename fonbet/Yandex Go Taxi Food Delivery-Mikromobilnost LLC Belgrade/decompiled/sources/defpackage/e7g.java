package defpackage;

import android.content.Context;
import androidx.lifecycle.y;
import com.yandex.go.payments.sbp.data.f;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.layers.api.LayersApi;
import ru.yandex.taxi.layers.e;
import ru.yandex.taxi.utils.d;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class e7g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ e7g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                return ((c0g) i6rVar).F6();
            case 1:
                f600 f600Var = (f600) ((c0g) i6rVar).L.get();
                q5z.h(f600Var);
                return f600Var;
            case 2:
                Context W1 = ((c0g) i6rVar).W1();
                q5z.h(W1);
                return W1;
            case 3:
                c r2 = ((c0g) i6rVar).r2();
                q5z.h(r2);
                return r2;
            case 4:
                return new d((pav) ((c0g) i6rVar).z.p3.get());
            case 5:
                return new ja70((f) ((c0g) i6rVar).A.a.a.Gq.get());
            case 6:
                return ((c0g) i6rVar).A.a.N();
            case 7:
                return new ndl0(9, (f) ((c0g) i6rVar).A.a.a.Gq.get());
            case 8:
                return (dt41) ((c0g) i6rVar).c0.get();
            case 9:
                g V1 = ((c0g) i6rVar).V1();
                q5z.h(V1);
                return V1;
            case 10:
                return ((c0g) i6rVar).w;
            case 11:
                ru.yandex.taxi.activity.g gVar = (ru.yandex.taxi.activity.g) ((c0g) i6rVar).F0.get();
                q5z.h(gVar);
                return gVar;
            case 12:
                y50 y0 = ((c0g) i6rVar).y0();
                q5z.h(y0);
                return y0;
            case 13:
                return (ma1) ((c0g) i6rVar).z.l.get();
            case 14:
                uq1 uq1Var = (uq1) ((c0g) i6rVar).O0.get();
                q5z.h(uq1Var);
                return uq1Var;
            case 15:
                yp2 yp2Var = (yp2) ((c0g) i6rVar).z.kk.get();
                q5z.h(yp2Var);
                return yp2Var;
            case 16:
                return ((c0g) i6rVar).z.a;
            case 17:
                ((c0g) i6rVar).getClass();
                return eja1.s(y.A);
            case 18:
                tt2 Z1 = ((c0g) i6rVar).Z1();
                q5z.h(Z1);
                return Z1;
            case 19:
                vtx0 vtx0Var = (vtx0) ((c0g) i6rVar).z.Xf.get();
                q5z.h(vtx0Var);
                return vtx0Var;
            case 20:
                pw2 pw2Var = (pw2) ((c0g) i6rVar).z.K.get();
                q5z.h(pw2Var);
                return pw2Var;
            case 21:
                ky2 ky2Var = (ky2) ((c0g) i6rVar).z.b0.get();
                q5z.h(ky2Var);
                return ky2Var;
            case 22:
                return ((c0g) i6rVar).z.b();
            case 23:
                iu4 iu4Var = (iu4) ((c0g) i6rVar).z.kg.get();
                q5z.h(iu4Var);
                return iu4Var;
            case 24:
                lx4 F = ((c0g) i6rVar).F();
                q5z.h(F);
                return F;
            case 25:
                mza mzaVar = (mza) ((c0g) i6rVar).kl.get();
                q5z.h(mzaVar);
                return mzaVar;
            case 26:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                zzf zzfVar = d0gVar.a;
                nmx nmxVar = (nmx) zzfVar.Ab.get();
                wiq0 wiq0Var = (wiq0) zzfVar.B2.get();
                com.yandex.go.taxi.tariffs.repository.g gVar2 = (com.yandex.go.taxi.tariffs.repository.g) zzfVar.Lh.get();
                c0g c0gVar = d0gVar.b;
                wd7 wd7Var = (wd7) c0gVar.Ch.get();
                pwy0 pwy0Var = (pwy0) zzfVar.U.get();
                LayersApi layersApi = (LayersApi) zzfVar.Mq.get();
                return new ru.yandex.taxi.layers.source.d((tt2) zzfVar.n.get(), wd7Var, (wnt) zzfVar.q.get(), nmxVar, wiq0Var, pwy0Var, gVar2, (e) c0gVar.qe.get(), layersApi);
            case 27:
                pdc pdcVar = (pdc) ((c0g) i6rVar).z.Ye.get();
                q5z.h(pdcVar);
                return pdcVar;
            case 28:
                qwc qwcVar = (qwc) ((c0g) i6rVar).z.mm.get();
                q5z.h(qwcVar);
                return qwcVar;
            default:
                b bVar = (b) ((c0g) i6rVar).k8.get();
                q5z.h(bVar);
                return bVar;
        }
    }
}
