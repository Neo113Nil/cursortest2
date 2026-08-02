package defpackage;

import androidx.compose.material3.a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final /* synthetic */ class eye implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eye(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Long] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nsb1.a((wxe) obj3, j, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t1a1.c((zxi) obj3, j, (fid) obj, vng.O(55));
                break;
            case 2:
                sva0 sva0Var = (sva0) obj2;
                sva0Var.b = true;
                sva0Var.j = Long.valueOf(j);
                ((Ref$ObjectRef) obj3).element = sva0Var.k;
                break;
            case 3:
                o0t0 o0t0Var = (o0t0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    l690 l690Var = rz6.a;
                    long j2 = ldc.m;
                    hz6 a = rz6.c((agc) btsVar.m(dgc.a)).a(j2, this.b, j2, j2);
                    boolean k = btsVar.k(o0t0Var);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new p0t0(o0t0Var, 1);
                        btsVar.o0(Q);
                    }
                    a.f((sls) Q, null, false, null, a, null, wwg.S(521110564, true, new zel0(1), btsVar), btsVar, 805306368, 494);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                sfb1.b((ra90) obj3, j, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ eye(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = j;
    }
}
