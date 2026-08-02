package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class v0l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ e1l b;
    public final /* synthetic */ vxk c;

    public v0l(e1l e1lVar, vxk vxkVar) {
        this.b = e1lVar;
        this.c = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1343236786, intValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:139)");
            }
            q630 C = s200.C(q630.a.a, lzk.d);
            e1l e1lVar = this.b;
            int e = e1lVar.e();
            boolean J = aVar2.J(e1lVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new fm0(e1lVar, 26);
                aVar2.R(x);
            }
            lzk.f(C, e, (izs) x, this.c, aVar2, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
