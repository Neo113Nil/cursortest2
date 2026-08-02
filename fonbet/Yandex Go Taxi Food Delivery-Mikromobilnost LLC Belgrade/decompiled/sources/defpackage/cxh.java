package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.apf;
import defpackage.bts;
import defpackage.c991;
import defpackage.did;
import defpackage.dxh;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class cxh implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ apf b;

    public /* synthetic */ cxh(apf apfVar, int i) {
        this.a = i;
        this.b = apfVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final apf apfVar = this.b;
        int i2 = 2;
        int i3 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f((hwy0) apfVar.w, btsVar, qti.e), ua3.a.a((dci) apfVar.x)}, wwg.S(-106453255, true, new cxh(apfVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a((hwy0) apfVar.w, wwg.S(-503068126, true, new cxh(apfVar, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1329426507, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            b bVar = (b) apf.this.c;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String obj5 = bVar.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), bVar, 6);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                b bVar2 = (b) ooc.G(qoi0.a(b.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                dxh dxhVar = (dxh) f.b(bVar2.B, btsVar4).getValue();
                                boolean e = btsVar4.e(bVar2);
                                Object Q = btsVar4.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    DeliveryCancelInfoRoot$getView$1$1$1$1$1$1$1 deliveryCancelInfoRoot$getView$1$1$1$1$1$1$1 = new DeliveryCancelInfoRoot$getView$1$1$1$1$1$1$1(1, bVar2, b.class, "onAction", "onAction(Lcom/yandex/delivery/mapper/model/CancelInfoAction;)V", 0);
                                    btsVar4.o0(deliveryCancelInfoRoot$getView$1$1$1$1$1$1$1);
                                    Q = deliveryCancelInfoRoot$getView$1$1$1$1$1$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                boolean e2 = btsVar4.e(bVar2);
                                Object Q2 = btsVar4.Q();
                                if (e2 || Q2 == o430Var) {
                                    DeliveryCancelInfoRoot$getView$1$1$1$1$1$2$1 deliveryCancelInfoRoot$getView$1$1$1$1$1$2$1 = new DeliveryCancelInfoRoot$getView$1$1$1$1$1$2$1(0, bVar2, b.class, "onCancelClick", "onCancelClick()V", 0);
                                    btsVar4.o0(deliveryCancelInfoRoot$getView$1$1$1$1$1$2$1);
                                    Q2 = deliveryCancelInfoRoot$getView$1$1$1$1$1$2$1;
                                }
                                sls slsVar = (sls) ((tfx) Q2);
                                boolean e3 = btsVar4.e(bVar2);
                                Object Q3 = btsVar4.Q();
                                if (e3 || Q3 == o430Var) {
                                    DeliveryCancelInfoRoot$getView$1$1$1$1$1$3$1 deliveryCancelInfoRoot$getView$1$1$1$1$1$3$1 = new DeliveryCancelInfoRoot$getView$1$1$1$1$1$3$1(0, bVar2, b.class, "onDismissClick", "onDismissClick()V", 0);
                                    btsVar4.o0(deliveryCancelInfoRoot$getView$1$1$1$1$1$3$1);
                                    Q3 = deliveryCancelInfoRoot$getView$1$1$1$1$1$3$1;
                                }
                                c991.i(dxhVar, tlsVar, slsVar, (sls) ((tfx) Q3), btsVar4, 0);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar3), btsVar3, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
