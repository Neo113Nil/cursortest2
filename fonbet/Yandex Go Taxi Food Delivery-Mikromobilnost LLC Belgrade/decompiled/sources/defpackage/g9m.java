package defpackage;

import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class g9m implements bms {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ tls B;
    public final /* synthetic */ tls C;
    public final /* synthetic */ oz40 D;
    public final /* synthetic */ yx40 E;
    public final /* synthetic */ yx40 F;
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ oz40 w;
    public final /* synthetic */ z8m x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public g9m(View view, int i, wls wlsVar, oz40 oz40Var, z8m z8mVar, boolean z, boolean z2, ArrayList arrayList, tls tlsVar, tls tlsVar2, oz40 oz40Var2, yx40 yx40Var, yx40 yx40Var2) {
        this.a = view;
        this.b = i;
        this.c = wlsVar;
        this.w = oz40Var;
        this.x = z8mVar;
        this.y = z;
        this.z = z2;
        this.A = arrayList;
        this.B = tlsVar;
        this.C = tlsVar2;
        this.D = oz40Var2;
        this.E = yx40Var;
        this.F = yx40Var2;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        f530 a;
        oz40 oz40Var;
        z8m z8mVar;
        f0j0 f0j0Var = (f0j0) obj;
        ((Boolean) obj2).getClass();
        fid fidVar = (fid) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((bts) fidVar).k(f0j0Var) : fidVar.e(f0j0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & HProv.PP_FAST_CODE) != 130)) {
            Object Q = btsVar.Q();
            Object obj5 = did.a;
            if (Q == obj5) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            Object obj6 = this.a;
            boolean e = btsVar.e(obj6);
            int i = this.b;
            boolean c = e | btsVar.c(i);
            Object Q2 = btsVar.Q();
            if (c || Q2 == obj5) {
                Object d9mVar = new d9m(this.a, this.D, this.E, this.b, this.F);
                btsVar.o0(d9mVar);
                Q2 = d9mVar;
            }
            tls tlsVar = (tls) Q2;
            Object obj7 = this.c;
            boolean k = btsVar.k(obj7) | btsVar.e(obj6);
            Object Q3 = btsVar.Q();
            if (k || Q3 == obj5) {
                Object e9mVar = new e9m(obj7, this.E, this.F, obj6, 0);
                btsVar.o0(e9mVar);
                Q3 = e9mVar;
            }
            r5y r5yVar = new r5y(f0j0Var, zx40Var, tlsVar, (sls) Q3, 14);
            c530 c530Var = c530.a;
            a = b.a(c530Var, m.a(), r5yVar);
            Object Q4 = btsVar.Q();
            if (Q4 == obj5) {
                Q4 = av0.z;
                btsVar.o0(Q4);
            }
            f530 a2 = fnq0.a(a, (tls) Q4);
            String e2 = ohb1.e(btsVar, vzh0.accessibility_action_move_up);
            String e3 = ohb1.e(btsVar, vzh0.accessibility_action_move_down);
            boolean k2 = btsVar.k(e2) | btsVar.c(i);
            oz40 oz40Var2 = this.w;
            boolean k3 = k2 | btsVar.k(oz40Var2) | btsVar.k(obj7) | btsVar.k(e3);
            Object Q5 = btsVar.Q();
            if (k3 || Q5 == obj5) {
                Object d9mVar2 = new d9m(e2, e3, this.b, this.c, oz40Var2);
                oz40Var = oz40Var2;
                btsVar.o0(d9mVar2);
                Q5 = d9mVar2;
            } else {
                oz40Var = oz40Var2;
            }
            f530 b = fnq0.b(c530Var, false, (tls) Q5);
            boolean k4 = btsVar.k(oz40Var) | btsVar.c(i);
            ArrayList arrayList = this.A;
            boolean e4 = k4 | btsVar.e(arrayList);
            z8m z8mVar2 = this.x;
            boolean k5 = e4 | btsVar.k(z8mVar2) | btsVar.k(this.B);
            Object Q6 = btsVar.Q();
            if (k5 || Q6 == obj5) {
                z8mVar = z8mVar2;
                Object b9mVar = new b9m(arrayList, z8mVar, this.B, this.b, oz40Var);
                btsVar.o0(b9mVar);
                Q6 = b9mVar;
            } else {
                z8mVar = z8mVar2;
            }
            sls slsVar = (sls) Q6;
            tls tlsVar2 = this.C;
            boolean k6 = btsVar.k(tlsVar2) | btsVar.c(i);
            Object Q7 = btsVar.Q();
            if (k6 || Q7 == obj5) {
                Q7 = new c9m(i, 0, tlsVar2);
                btsVar.o0(Q7);
            }
            ul91.a(b, a2, z8mVar, this.b, this.y, this.z, slsVar, (sls) Q7, btsVar, 0, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
