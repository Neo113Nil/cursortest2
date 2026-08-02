package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.preparer.skeleton.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class l701 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m701 b;
    public final /* synthetic */ i701 c;
    public final /* synthetic */ hwo0 w;

    public /* synthetic */ l701(hwo0 hwo0Var, m701 m701Var, i701 i701Var, int i) {
        this.a = i;
        this.w = hwo0Var;
        this.b = m701Var;
        this.c = i701Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        i701 i701Var = this.c;
        m701 m701Var = this.b;
        zy11 zy11Var = zy11.a;
        hwo0 hwo0Var = this.w;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-491644642, true, new l701(m701Var, i701Var, hwo0Var, i2), btsVar), btsVar, 6);
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
                    m2i m2iVar = new m2i((j2m0) btsVar2.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (n701) hwo0Var.w, this.b, this.c, 5);
                    rs31 a = f5z.a(btsVar2);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        ((tgg) hwo0Var.x).a(((b) ooc.G(qoi0.a(b.class), a, null, m2iVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2)).w, null, 0.0f, 0L, false, false, null, btsVar2, 16777216, HProv.PP_DELETE_SAVED_PASSWD);
                        break;
                    }
                }
            case 2:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    sb2.b(nnm.f((hwy0) hwo0Var.c, btsVar3, qti.e), wwg.S(-1885870962, true, new l701(hwo0Var, m701Var, i701Var, 3), btsVar3), btsVar3, 56);
                    break;
                }
            default:
                hwy0 hwy0Var = (hwy0) hwo0Var.c;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    qti.c(hwy0Var.c(btsVar4), hwy0Var.a, false, wwg.S(-500240715, true, new l701(m701Var, i701Var, hwo0Var, r7 ? 1 : 0), btsVar4), btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 4);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ l701(m701 m701Var, i701 i701Var, hwo0 hwo0Var, int i) {
        this.a = i;
        this.b = m701Var;
        this.c = i701Var;
        this.w = hwo0Var;
    }
}
