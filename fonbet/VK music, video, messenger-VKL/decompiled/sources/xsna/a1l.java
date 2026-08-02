package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import xsna.q630;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class a1l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ nyk b;
    public final /* synthetic */ zz8 c;
    public final /* synthetic */ wz8 d;
    public final /* synthetic */ List<fmk> e;
    public final /* synthetic */ vxk f;

    public a1l(nyk nykVar, zz8 zz8Var, wz8 wz8Var, List<fmk> list, vxk vxkVar) {
        this.b = nykVar;
        this.c = zz8Var;
        this.d = wz8Var;
        this.e = list;
        this.f = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-577031469, intValue, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
            }
            String a = this.b.a(Long.valueOf(this.c.e), this.d.a);
            if (a == null) {
                a = "-";
            }
            q630 C = s200.C(q630.a.a, x0l.a);
            List<fmk> list = this.e;
            boolean y = aVar2.y(list);
            Object x = aVar2.x();
            if (y || x == a.C0011a.a) {
                x = new k0j(list, 6);
                aVar2.R(x);
            }
            cjo0.c(a, egi0.b(C, false, (izs) x), this.f.e, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
