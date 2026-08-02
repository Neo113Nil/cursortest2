package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import defpackage.di31;
import defpackage.tje;
import defpackage.zy11;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;

/* loaded from: classes14.dex */
public final /* synthetic */ class fh31 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ fh31(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final d dVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).f = me4.a;
                agd agdVar = (agd) yfdVar;
                agdVar.c = dVar.m0.a();
                agdVar.e = new tls() { // from class: com.yandex.go.taxi.summary.verticalsummary.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        d dVar2 = d.this;
                        tje.N(dVar2.o(), null, null, new VerticalSummaryComposeRouter$content$1$1$1(dVar2, (di31) obj2, null), 3);
                        return zy11.a;
                    }
                };
                final n0 n0Var = dVar.o0.b;
                bov0 a = dVar.d0.a();
                boolean z = false;
                if (a != null && a.a) {
                    z = true;
                }
                final boolean z2 = !z;
                agdVar.g = new a(2108810722, new bms() { // from class: gh31
                    @Override // defpackage.bms
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i2;
                        xfd xfdVar = (xfd) obj2;
                        ki31 ki31Var = (ki31) obj3;
                        fid fidVar = (fid) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 6) == 0) {
                            i2 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i2 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i2 |= ((bts) fidVar).k(ki31Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
                            d dVar2 = d.this;
                            boolean e = btsVar.e(dVar2);
                            Object Q = btsVar.Q();
                            if (e || Q == did.a) {
                                Q = new b931(dVar2);
                                btsVar.o0(Q);
                            }
                            hpb1.a((sls) Q, wwg.S(-169891511, true, new r2z0(ki31Var, z2, xfdVar, n0Var, 22), btsVar), btsVar, 48);
                        } else {
                            btsVar.Y();
                        }
                        return zy11.a;
                    }
                }, true);
                break;
            case 1:
                dVar.Z.a((String) obj);
                break;
            default:
                dVar.Q.b((TariffPageCloseReason) obj);
                break;
        }
        return zy11Var;
    }
}
