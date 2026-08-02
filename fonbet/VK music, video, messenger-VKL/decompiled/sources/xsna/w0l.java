package xsna;

import androidx.compose.runtime.a;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class w0l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ e1l b;
    public final /* synthetic */ wz8 c;
    public final /* synthetic */ nyk d;
    public final /* synthetic */ vxk e;
    public final /* synthetic */ rwr f;

    public w0l(e1l e1lVar, wz8 wz8Var, nyk nykVar, vxk vxkVar, rwr rwrVar) {
        this.b = e1lVar;
        this.c = wz8Var;
        this.d = nykVar;
        this.e = vxkVar;
        this.f = rwrVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(684885105, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:154)");
            }
            e1l e1lVar = this.b;
            Long g = e1lVar.g();
            Long f = e1lVar.f();
            long a = e1lVar.a();
            int e = e1lVar.e();
            boolean J = aVar2.J(e1lVar);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new wa5(e1lVar, 3);
                aVar2.R(x);
            }
            wzs wzsVar = (wzs) x;
            boolean J2 = aVar2.J(e1lVar);
            Object x2 = aVar2.x();
            if (J2 || x2 == obj) {
                x2 = new jm0(e1lVar, 26);
                aVar2.R(x2);
            }
            x0l.c(g, f, a, e, wzsVar, (izs) x2, this.c, e1lVar.a, this.d, e1lVar.c(), this.e, this.f, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
