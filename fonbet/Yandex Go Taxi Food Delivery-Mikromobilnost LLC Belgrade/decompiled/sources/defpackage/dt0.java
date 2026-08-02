package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class dt0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;
    public final /* synthetic */ es0 c;

    public /* synthetic */ dt0(gt0 gt0Var, es0 es0Var, int i) {
        this.a = i;
        this.b = gt0Var;
        this.c = es0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gt0 gt0Var = this.b;
        zy11 zy11Var = zy11.a;
        es0 es0Var = this.c;
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
                    sb2.c(new vvf0[]{ua3.a.a(gt0Var.w), l290.a.a(null), ib51.a.a(gt0Var.z)}, wwg.S(-1642104692, true, new dt0(gt0Var, es0Var, i3), btsVar), btsVar, 56);
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
                    qti.b(gt0Var.c, (ThemeStyle) f.a(gt0Var.y.a(), ThemeStyle.DEFAULT, null, btsVar2, 48, 2).getValue(), wwg.S(1710670020, true, new dt0(gt0Var, es0Var, i2), btsVar2), btsVar2, 392);
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
                    xi91.a(wwg.S(-261695365, true, new dt0(gt0Var, es0Var, 3), btsVar3), btsVar3, 6);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gt0 gt0Var2 = this.b;
                    yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), gt0Var2.b, r8 ? 1 : 0);
                    rs31 a = f5z.a(btsVar4);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        oz40 b = f.b(((e) ooc.G(qoi0.a(e.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4)).B, btsVar4);
                        es0Var.getClass();
                        gt0Var2.a(((ps0) b.getValue()).a, ((ps0) b.getValue()).b, ((ps0) b.getValue()).c, ((ps0) b.getValue()).d, ((ps0) b.getValue()).e, ((ps0) b.getValue()).f, btsVar4, 0);
                    }
                } else {
                    btsVar4.Y();
                }
                break;
        }
        return zy11Var;
    }
}
