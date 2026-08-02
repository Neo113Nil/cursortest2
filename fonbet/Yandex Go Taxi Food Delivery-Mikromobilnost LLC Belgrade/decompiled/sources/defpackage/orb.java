package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class orb implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boj0 b;

    public /* synthetic */ orb(boj0 boj0Var, int i) {
        this.a = i;
        this.b = boj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boj0 boj0Var = this.b;
        Object[] objArr = 0;
        int i2 = 2;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    yt0 yt0Var = new yt0((j2m0) btsVar.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (e) boj0Var.z, i2);
                    rs31 a = f5z.a(btsVar);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        sb2.c(new vvf0[]{ua3.a.a((dci) boj0Var.c), mhg.a.a((lhg) boj0Var.w)}, wwg.S(-733172692, true, new i9a(16, boj0Var, (e) ooc.G(qoi0.a(e.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar)), btsVar), btsVar, 56);
                        break;
                    }
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1669888148, true, new orb(boj0Var, objArr == true ? 1 : 0), btsVar2), btsVar2, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
