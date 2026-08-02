package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes10.dex */
public final /* synthetic */ class apr implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ apr(long j, ety0 ety0Var, float f, a aVar) {
        this.b = j;
        this.w = ety0Var;
        this.c = f;
        this.x = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ety0 ety0Var = (ety0) obj4;
                a aVar = (a) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    oaa1.b(this.b, ety0Var, wwg.S(-1767363041, true, new xq1(this.c, (Object) aVar, 1), btsVar), btsVar, 384);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                keb1.b((LineState) obj4, this.b, (f530) obj3, this.c, (fid) obj, vng.O(3073));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ apr(LineState lineState, long j, f530 f530Var, float f, int i) {
        this.w = lineState;
        this.b = j;
        this.x = f530Var;
        this.c = f;
    }
}
