package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import ru.yandex.taxi.logistics.sdk.cost_details.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class g2i implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ apf b;
    public final /* synthetic */ h2i c;
    public final /* synthetic */ z1i w;

    public /* synthetic */ g2i(apf apfVar, h2i h2iVar, z1i z1iVar, int i) {
        this.a = i;
        this.b = apfVar;
        this.c = h2iVar;
        this.w = z1iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        z1i z1iVar = this.w;
        h2i h2iVar = this.c;
        zy11 zy11Var = zy11.a;
        apf apfVar = this.b;
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
                    sb2.b(ua3.a.a((dci) apfVar.x), wwg.S(292465969, true, new g2i(apfVar, h2iVar, z1iVar, i3), btsVar), btsVar, 56);
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
                    qti.a((hwy0) apfVar.c, wwg.S(193875304, true, new g2i(h2iVar, z1iVar, apfVar, i2), btsVar2), btsVar2, 56);
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
                    xi91.a(wwg.S(-1287812449, true, new g2i(h2iVar, z1iVar, apfVar, 3), btsVar3), btsVar3, 6);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    String uuid = UUID.randomUUID().toString();
                    m2i m2iVar = new m2i((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (o2i) apfVar.w, this.c, this.w, 0);
                    rs31 a = f5z.a(btsVar4);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        a.c((n2i) ooc.G(qoi0.a(n2i.class), a, uuid, m2iVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4), btsVar4, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }

    public /* synthetic */ g2i(h2i h2iVar, z1i z1iVar, apf apfVar, int i) {
        this.a = i;
        this.c = h2iVar;
        this.w = z1iVar;
        this.b = apfVar;
    }
}
