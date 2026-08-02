package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.a;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class fzi0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hzi0 b;

    public /* synthetic */ fzi0(hzi0 hzi0Var, int i) {
        this.a = i;
        this.b = hzi0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hzi0 hzi0Var = this.b;
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
                    sb2.c(new vvf0[]{ua3.a.a(hzi0Var.w), nnm.f(hzi0Var.c, btsVar, qti.e)}, wwg.S(-1940946396, true, new fzi0(hzi0Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a(hzi0Var.c, wwg.S(-1150138021, true, new fzi0(hzi0Var, i2), btsVar2), btsVar2, 56);
                    break;
                }
            case 2:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-602821230, true, new fzi0(hzi0Var, 3), btsVar3), btsVar3, 6);
                    break;
                }
            default:
                bts btsVar4 = (bts) fidVar;
                if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), hzi0Var.b, 19);
                    rs31 a = f5z.a(btsVar4);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        a.a((d) ooc.G(qoi0.a(d.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4), btsVar4, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
