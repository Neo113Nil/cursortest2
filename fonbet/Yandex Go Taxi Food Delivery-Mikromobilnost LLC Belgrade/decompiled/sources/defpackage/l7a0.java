package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import ru.yandex.taxi.logistics.sdk.payment_method_selector.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class l7a0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7a0 b;
    public final /* synthetic */ eii c;
    public final /* synthetic */ dt20 w;

    public /* synthetic */ l7a0(dt20 dt20Var, n7a0 n7a0Var, eii eiiVar, int i) {
        this.a = i;
        this.w = dt20Var;
        this.b = n7a0Var;
        this.c = eiiVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        eii eiiVar = this.c;
        n7a0 n7a0Var = this.b;
        zy11 zy11Var = zy11.a;
        dt20 dt20Var = this.w;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a((hwy0) dt20Var.c, wwg.S(886458982, true, new l7a0(n7a0Var, eiiVar, dt20Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1449248285, true, new l7a0(n7a0Var, eiiVar, dt20Var, i2), btsVar2), btsVar2, 6);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    String uuid = UUID.randomUUID().toString();
                    m2i m2iVar = new m2i((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (r7a0) dt20Var.w, this.b, this.c, 4);
                    rs31 a = f5z.a(btsVar3);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        a.c((q7a0) ooc.G(qoi0.a(q7a0.class), a, uuid, m2iVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3), btsVar3, 0);
                        break;
                    }
                }
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    sb2.b(ua3.a.a((dci) dt20Var.x), wwg.S(837413807, true, new l7a0(dt20Var, n7a0Var, eiiVar, r7 ? 1 : 0), btsVar4), btsVar4, 56);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ l7a0(n7a0 n7a0Var, eii eiiVar, dt20 dt20Var, int i) {
        this.a = i;
        this.b = n7a0Var;
        this.c = eiiVar;
        this.w = dt20Var;
    }
}
