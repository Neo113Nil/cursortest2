package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.cost_details.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class k2i implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1i b;

    public /* synthetic */ k2i(v1i v1iVar, int i) {
        this.a = 4;
        this.b = v1iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v1i v1iVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    ymb1.e(v1iVar.a, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65534);
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
                    ymb1.e(v1iVar.b, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 0, 0, 65534);
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
                    ymb1.e(v1iVar.a, null, 0L, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65518);
                    break;
                }
            case 3:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    ymb1.e(v1iVar.b, null, 0L, null, lzr.G, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65518);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                a.f(v1iVar, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ k2i(v1i v1iVar, int i, byte b) {
        this.a = i;
        this.b = v1iVar;
    }
}
