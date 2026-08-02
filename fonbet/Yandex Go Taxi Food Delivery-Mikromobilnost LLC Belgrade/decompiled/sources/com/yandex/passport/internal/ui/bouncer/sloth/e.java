package com.yandex.passport.internal.ui.bouncer.sloth;

import androidx.core.app.a1;
import com.yandex.passport.sloth.ui.u0;
import com.yandex.passport.sloth.ui.w;
import defpackage.bts;
import defpackage.cvw;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.oz40;
import defpackage.sls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class e implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ u0 c;

    public /* synthetic */ e(f fVar, u0 u0Var, int i) {
        this.a = i;
        this.b = fVar;
        this.c = u0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        u0 u0Var = this.c;
        f fVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                b bVar = fVar.E;
                if ((intValue & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(478093942);
                boolean k = btsVar2.k(u0Var) | btsVar2.k(bVar);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = bVar.slothUiInteractor(u0Var.a).build();
                    btsVar2.o0(Q);
                }
                c cVar = (c) Q;
                btsVar2.t(false);
                Object[] objArr = new Object[0];
                btsVar2.e0(478105012);
                Object Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                    Q2 = new a1(17);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                w.b(cVar, (String) ((oz40) cvw.V(objArr, (sls) Q2, btsVar2, 48)).getValue(), btsVar2, 0, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(false, fVar.D, wwg.S(-86547642, true, new e(fVar, u0Var, i2), fidVar2), fidVar2, 384, 1);
                break;
        }
        return zy11Var;
    }
}
