package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class ka9 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma9 b;

    public /* synthetic */ ka9(ma9 ma9Var, int i) {
        this.a = i;
        this.b = ma9Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ma9 ma9Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                hwy0 hwy0Var = ma9Var.c;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.c(hwy0Var.c(btsVar), hwy0Var.a, false, wwg.S(-247958159, true, new ka9(ma9Var, i3), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
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
                    xi91.a(wwg.S(1212997850, true, new ka9(ma9Var, i2), btsVar2), btsVar2, 6);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    yt0 yt0Var = new yt0((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), ma9Var.b, i3);
                    rs31 a = f5z.a(btsVar3);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        a.a((d) ooc.G(qoi0.a(d.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3), btsVar3, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
