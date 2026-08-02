package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class dk70 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ p370 b;
    public final /* synthetic */ ek70 c;
    public final /* synthetic */ ck70 w;

    public /* synthetic */ dk70(p370 p370Var, ek70 ek70Var, ck70 ck70Var, int i) {
        this.a = i;
        this.b = p370Var;
        this.c = ek70Var;
        this.w = ck70Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ck70 ck70Var = this.w;
        ek70 ek70Var = this.c;
        zy11 zy11Var = zy11.a;
        p370 p370Var = this.b;
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
                    sb2.b(nnm.f((hwy0) p370Var.c, btsVar, qti.e), wwg.S(-1914904836, true, new dk70(p370Var, ek70Var, ck70Var, i3), btsVar), btsVar, 56);
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
                    qti.a((hwy0) p370Var.c, wwg.S(-723026523, true, new dk70(p370Var, ek70Var, ck70Var, i2), btsVar2), btsVar2, 56);
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
                    xi91.a(wwg.S(1052647246, true, new dk70(p370Var, ek70Var, ck70Var, 3), btsVar3), btsVar3, 6);
                    break;
                }
            default:
                kk70 kk70Var = (kk70) p370Var.w;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    String obj3 = kk70Var.toString();
                    m2i m2iVar = new m2i((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), kk70Var, this.c, this.w, 3);
                    rs31 a = f5z.a(btsVar4);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        a.e((jk70) ooc.G(qoi0.a(jk70.class), a, obj3, m2iVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4), btsVar4, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
