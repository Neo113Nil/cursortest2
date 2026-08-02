package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bms;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.moi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.poi;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qws0;
import defpackage.rs31;
import defpackage.tfx;
import defpackage.vbu;
import defpackage.w8f;
import defpackage.wls;
import defpackage.yt0;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class loi implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ moi b;

    public /* synthetic */ loi(moi moiVar, int i) {
        this.a = i;
        this.b = moiVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final moi moiVar = this.b;
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
                    sb2.b(ua3.a.a(moiVar.c), wwg.S(-1290280319, true, new loi(moiVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a(moiVar.b, wwg.S(-647150870, true, new loi(moiVar, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(2066867795, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), moi.this.w, 8);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                poi poiVar = (poi) ooc.G(qoi0.a(poi.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                Object Q = btsVar4.Q();
                                Object obj5 = did.a;
                                if (Q == obj5) {
                                    Q = poiVar.y;
                                    btsVar4.o0(Q);
                                }
                                vbu vbuVar = (vbu) Q;
                                qws0 qws0Var = (qws0) f.b(poiVar.z, btsVar4).getValue();
                                boolean e = btsVar4.e(poiVar);
                                Object Q2 = btsVar4.Q();
                                if (e || Q2 == obj5) {
                                    Object deliverySddSlotsRoot$getView$1$1$1$1$1$1$1 = new DeliverySddSlotsRoot$getView$1$1$1$1$1$1$1(4, poiVar, poi.class, "onSlotClicked", "onSlotClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                                    btsVar4.o0(deliverySddSlotsRoot$getView$1$1$1$1$1$1$1);
                                    Q2 = deliverySddSlotsRoot$getView$1$1$1$1$1$1$1;
                                }
                                bms bmsVar = (bms) ((tfx) Q2);
                                boolean e2 = btsVar4.e(poiVar);
                                Object Q3 = btsVar4.Q();
                                if (e2 || Q3 == obj5) {
                                    Object deliverySddSlotsRoot$getView$1$1$1$1$1$2$1 = new DeliverySddSlotsRoot$getView$1$1$1$1$1$2$1(2, poiVar, poi.class, "onShown", "onShown(II)V", 0);
                                    btsVar4.o0(deliverySddSlotsRoot$getView$1$1$1$1$1$2$1);
                                    Q3 = deliverySddSlotsRoot$getView$1$1$1$1$1$2$1;
                                }
                                b.a(vbuVar, qws0Var, bmsVar, (wls) ((tfx) Q3), btsVar4, 6);
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
