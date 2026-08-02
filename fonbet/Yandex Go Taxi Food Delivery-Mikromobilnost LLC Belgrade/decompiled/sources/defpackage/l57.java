package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final /* synthetic */ class l57 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ cms w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l57(long j, long j2, ArrayList arrayList, sls slsVar, tls tlsVar, int i) {
        this.b = j;
        this.c = j2;
        this.y = arrayList;
        this.w = slsVar;
        this.z = tlsVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        cms cmsVar = this.w;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                zcb1.a((f530) obj4, (d37) obj3, (sls) cmsVar, this.b, this.c, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                urb1.d(this.b, this.c, (ArrayList) obj4, (sls) cmsVar, (tls) obj3, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                yib1.c((f530) obj4, (ehr0) obj3, this.b, this.c, (a) cmsVar, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ l57(f530 f530Var, d37 d37Var, sls slsVar, long j, long j2, int i) {
        this.y = f530Var;
        this.z = d37Var;
        this.w = slsVar;
        this.b = j;
        this.c = j2;
        this.x = i;
    }

    public /* synthetic */ l57(f530 f530Var, ehr0 ehr0Var, long j, long j2, a aVar, int i) {
        this.y = f530Var;
        this.z = ehr0Var;
        this.b = j;
        this.c = j2;
        this.w = aVar;
        this.x = i;
    }
}
