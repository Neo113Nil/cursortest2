package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class d7s0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hwo0 b;

    public /* synthetic */ d7s0(hwo0 hwo0Var, int i) {
        this.a = i;
        this.b = hwo0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hwo0 hwo0Var = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1431069075, true, new d7s0(hwo0Var, i2), btsVar), btsVar, 6);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    yt0 yt0Var = new yt0((j2m0) btsVar2.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (c) hwo0Var.x, 22);
                    rs31 a = f5z.a(btsVar2);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        sb2.b(ua3.a.a((dci) hwo0Var.c), wwg.S(537466451, true, new c1p0(11, hwo0Var, (c) ooc.G(qoi0.a(c.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2)), btsVar2), btsVar2, 56);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
