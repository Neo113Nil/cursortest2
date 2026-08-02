package xsna;

import xsna.q630;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class u0l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ e1l b;
    public final /* synthetic */ nyk c;
    public final /* synthetic */ vxk d;

    public u0l(e1l e1lVar, nyk nykVar, vxk vxkVar) {
        this.b = e1lVar;
        this.c = nykVar;
        this.d = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-331385278, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
            }
            e1l e1lVar = this.b;
            n0l.a.b(e1lVar.g(), e1lVar.f(), e1lVar.e(), this.c, s200.C(q630.a.a, x0l.c), this.d.c, aVar2, 1597440);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
