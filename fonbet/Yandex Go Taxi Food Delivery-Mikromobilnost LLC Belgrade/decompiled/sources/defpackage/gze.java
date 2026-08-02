package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class gze implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hze b;

    public /* synthetic */ gze(hze hzeVar) {
        this.b = hzeVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hze hzeVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    ymb1.c(hzeVar.a, null, 0L, null, lzr.E, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65518);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                psb1.a(hzeVar, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ gze(hze hzeVar, int i) {
        this.b = hzeVar;
    }
}
