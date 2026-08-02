package defpackage;

import androidx.compose.material3.t;
import ru.yandex.taxi.masstransit.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class jct0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ jct0(boolean z, boolean z2, h8w h8wVar, imy0 imy0Var, ehr0 ehr0Var) {
        this.b = z;
        this.c = z2;
        this.w = h8wVar;
        this.x = imy0Var;
        this.y = ehr0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.b(this.b, this.c, (nvi0) obj5, (nvi0) obj4, (au2) obj3, (fid) obj, vng.O(1));
                break;
            default:
                h8w h8wVar = (h8w) obj5;
                imy0 imy0Var = (imy0) obj4;
                ehr0 ehr0Var = (ehr0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    t.b.b(this.b, this.c, h8wVar, imy0Var, ehr0Var, btsVar, 114822144);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ jct0(boolean z, boolean z2, nvi0 nvi0Var, nvi0 nvi0Var2, au2 au2Var, int i) {
        this.b = z;
        this.c = z2;
        this.w = nvi0Var;
        this.x = nvi0Var2;
        this.y = au2Var;
    }
}
