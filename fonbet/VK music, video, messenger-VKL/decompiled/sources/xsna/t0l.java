package xsna;

import xsna.q630;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class t0l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ e1l b;
    public final /* synthetic */ vxk c;

    public t0l(e1l e1lVar, vxk vxkVar) {
        this.b = e1lVar;
        this.c = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-803011924, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:105)");
            }
            n0l.a.c(this.b.e(), 3120, this.c.b, aVar2, s200.C(q630.a.a, x0l.b));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
