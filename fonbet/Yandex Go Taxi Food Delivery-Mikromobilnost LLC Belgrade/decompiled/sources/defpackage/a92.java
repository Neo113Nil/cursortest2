package defpackage;

import androidx.compose.material3.internal.h;
import androidx.compose.runtime.internal.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class a92 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ a92(f530 f530Var, long j, a aVar, int i) {
        this.a = 2;
        this.w = f530Var;
        this.b = j;
        this.c = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c92.a((mv60) obj4, (f530) obj3, this.b, (fid) obj, vng.O(1));
                break;
            case 1:
                j690 j690Var = (j690) obj4;
                zls zlsVar = (zls) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    oaa1.b(this.b, ((bq11) btsVar.m(eq11.a)).m, wwg.S(417635459, true, new x07(j690Var, zlsVar, 0), btsVar), btsVar, 384);
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                gpb1.d((f530) obj3, this.b, (a) obj4, (fid) obj, vng.O(385));
                break;
            default:
                ety0 ety0Var = (ety0) obj4;
                wls wlsVar = (wls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    h.b(this.b, ety0Var, wlsVar, btsVar2, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ a92(long j, Object obj, cms cmsVar, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.w = cmsVar;
    }

    public /* synthetic */ a92(mv60 mv60Var, f530 f530Var, long j, int i) {
        this.a = 0;
        this.c = mv60Var;
        this.w = f530Var;
        this.b = j;
    }
}
