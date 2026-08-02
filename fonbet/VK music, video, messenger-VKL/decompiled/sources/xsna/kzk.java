package xsna;

import androidx.compose.runtime.a;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class kzk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ d0l b;
    public final /* synthetic */ wz8 c;
    public final /* synthetic */ nyk d;
    public final /* synthetic */ vxk e;
    public final /* synthetic */ rwr f;

    public kzk(d0l d0lVar, wz8 wz8Var, nyk nykVar, vxk vxkVar, rwr rwrVar) {
        this.b = d0lVar;
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
                androidx.compose.runtime.b.f(-1346903698, intValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:220)");
            }
            d0l d0lVar = this.b;
            Long f = d0lVar.f();
            long a = d0lVar.a();
            int e = d0lVar.e();
            boolean J = aVar2.J(d0lVar);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new wje(d0lVar, 13);
                aVar2.R(x);
            }
            izs izsVar = (izs) x;
            boolean J2 = aVar2.J(d0lVar);
            Object x2 = aVar2.x();
            if (J2 || x2 == obj) {
                x2 = new eph(d0lVar, 6);
                aVar2.R(x2);
            }
            lzk.k(f, a, e, izsVar, (izs) x2, this.c, d0lVar.a, this.d, d0lVar.c(), this.e, this.f, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
