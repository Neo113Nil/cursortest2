package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.kj31;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o9z0;
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
public final /* synthetic */ class ij31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj31 b;

    public /* synthetic */ ij31(kj31 kj31Var, int i) {
        this.a = i;
        this.b = kj31Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final kj31 kj31Var = this.b;
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
                    sb2.c(new vvf0[]{nnm.f(kj31Var.c, btsVar, qti.e), ua3.a.a(kj31Var.w)}, wwg.S(-1703218254, true, new ij31(kj31Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a(kj31Var.c, wwg.S(-588777573, true, new ij31(kj31Var, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-76890492, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            d dVar = kj31.this.b;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String obj5 = dVar.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), dVar, 26);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                d dVar2 = (d) ooc.G(qoi0.a(d.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                o9z0 o9z0Var = (o9z0) f.b(dVar2.z, btsVar4).getValue();
                                boolean e = btsVar4.e(dVar2);
                                Object Q = btsVar4.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    VerticalTimelineRoot$getView$1$1$1$1$1$1$1 verticalTimelineRoot$getView$1$1$1$1$1$1$1 = new VerticalTimelineRoot$getView$1$1$1$1$1$1$1(1, dVar2, d.class, "onShareClicked", "onShareClicked(Lru/yandex/taxi/logistics/sdk/ui_models/timeline/TimelineDetailsShareButtonActionState;)V", 0);
                                    btsVar4.o0(verticalTimelineRoot$getView$1$1$1$1$1$1$1);
                                    Q = verticalTimelineRoot$getView$1$1$1$1$1$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                boolean e2 = btsVar4.e(dVar2);
                                Object Q2 = btsVar4.Q();
                                if (e2 || Q2 == o430Var) {
                                    VerticalTimelineRoot$getView$1$1$1$1$1$2$1 verticalTimelineRoot$getView$1$1$1$1$1$2$1 = new VerticalTimelineRoot$getView$1$1$1$1$1$2$1(0, dVar2, d.class, "onDoneClicked", "onDoneClicked()V", 0);
                                    btsVar4.o0(verticalTimelineRoot$getView$1$1$1$1$1$2$1);
                                    Q2 = verticalTimelineRoot$getView$1$1$1$1$1$2$1;
                                }
                                sls slsVar = (sls) ((tfx) Q2);
                                boolean e3 = btsVar4.e(dVar2);
                                Object Q3 = btsVar4.Q();
                                if (e3 || Q3 == o430Var) {
                                    VerticalTimelineRoot$getView$1$1$1$1$1$3$1 verticalTimelineRoot$getView$1$1$1$1$1$3$1 = new VerticalTimelineRoot$getView$1$1$1$1$1$3$1(0, dVar2, d.class, "onTimelineShow", "onTimelineShow()V", 0);
                                    btsVar4.o0(verticalTimelineRoot$getView$1$1$1$1$1$3$1);
                                    Q3 = verticalTimelineRoot$getView$1$1$1$1$1$3$1;
                                }
                                sls slsVar2 = (sls) ((tfx) Q3);
                                boolean e4 = btsVar4.e(dVar2);
                                Object Q4 = btsVar4.Q();
                                if (e4 || Q4 == o430Var) {
                                    VerticalTimelineRoot$getView$1$1$1$1$1$4$1 verticalTimelineRoot$getView$1$1$1$1$1$4$1 = new VerticalTimelineRoot$getView$1$1$1$1$1$4$1(0, dVar2, d.class, "onTimelineClose", "onTimelineClose()V", 0);
                                    btsVar4.o0(verticalTimelineRoot$getView$1$1$1$1$1$4$1);
                                    Q4 = verticalTimelineRoot$getView$1$1$1$1$1$4$1;
                                }
                                b.g(o9z0Var, tlsVar, slsVar, slsVar2, (sls) ((tfx) Q4), btsVar4, 0);
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
