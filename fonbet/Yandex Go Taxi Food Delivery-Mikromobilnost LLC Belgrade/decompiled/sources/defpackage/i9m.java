package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class i9m implements bms {
    public final /* synthetic */ View A;
    public final /* synthetic */ wls B;
    public final /* synthetic */ oz40 C;
    public final /* synthetic */ yx40 D;
    public final /* synthetic */ yx40 E;
    public final /* synthetic */ List a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ m0j0 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ oz40 x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ tls z;

    public i9m(List list, ArrayList arrayList, m0j0 m0j0Var, boolean z, oz40 oz40Var, tls tlsVar, tls tlsVar2, View view, wls wlsVar, oz40 oz40Var2, yx40 yx40Var, yx40 yx40Var2) {
        this.a = list;
        this.b = arrayList;
        this.c = m0j0Var;
        this.w = z;
        this.x = oz40Var;
        this.y = tlsVar;
        this.z = tlsVar2;
        this.A = view;
        this.B = wlsVar;
        this.C = oz40Var2;
        this.D = yx40Var;
        this.E = yx40Var2;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        bts btsVar;
        boolean z2;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        int i2 = i;
        boolean z3 = false;
        bts btsVar2 = (bts) fidVar;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Object obj5 = this.a.get(intValue);
            int i3 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            z8m z8mVar = (z8m) obj5;
            btsVar2.e0(1772857629);
            oz40 oz40Var = this.x;
            if (intValue == scc.f((List) oz40Var.getValue())) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            Integer valueOf = Integer.valueOf(z8mVar.e);
            boolean z4 = z;
            ArrayList arrayList = this.b;
            if (arrayList.contains(valueOf)) {
                btsVar2.e0(1772921767);
                aka1.d(u4yVar, this.c, Integer.valueOf(z8mVar.e), null, false, null, wwg.S(-948166435, true, new g9m(this.A, intValue, this.B, oz40Var, z8mVar, z3, this.w, arrayList, this.y, this.z, this.C, this.D, this.E), btsVar2), btsVar2, (i2 & 14) | 1572864);
                btsVar = btsVar2;
                z2 = false;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                boolean z5 = z3;
                z2 = z4;
                btsVar.e0(1776693940);
                int i4 = (i2 & 112) ^ 48;
                boolean k = btsVar.k(oz40Var) | (((i4 <= 32 || !btsVar.c(intValue)) && (i2 & 48) != 32) ? z2 ? 1 : 0 : true);
                tls tlsVar = this.y;
                boolean k2 = k | btsVar.k(tlsVar);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (k2 || Q == o430Var) {
                    Q = new h9m(tlsVar, intValue, oz40Var, z2 ? 1 : 0);
                    btsVar.o0(Q);
                }
                sls slsVar = (sls) Q;
                tls tlsVar2 = this.z;
                boolean k3 = btsVar.k(tlsVar2) | (((i4 <= 32 || !btsVar.c(intValue)) && (i2 & 48) != 32) ? z2 ? 1 : 0 : true);
                Object Q2 = btsVar.Q();
                if (k3 || Q2 == o430Var) {
                    Q2 = new c9m(intValue, 1, tlsVar2);
                    btsVar.o0(Q2);
                }
                ul91.a(null, null, z8mVar, intValue, z5, this.w, slsVar, (sls) Q2, btsVar, (i3 << 6) & 7168, 3);
                btsVar.t(z2);
            }
            btsVar.t(z2);
        } else {
            btsVar2.Y();
        }
        return zy11.a;
    }
}
