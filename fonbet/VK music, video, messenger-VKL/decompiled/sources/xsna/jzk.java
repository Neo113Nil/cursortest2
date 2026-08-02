package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class jzk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ d0l b;
    public final /* synthetic */ vxk c;

    public jzk(d0l d0lVar, vxk vxkVar) {
        this.b = d0lVar;
        this.c = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1483431603, intValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:206)");
            }
            q630 C = s200.C(q630.a.a, lzk.d);
            d0l d0lVar = this.b;
            int e = d0lVar.e();
            boolean J = aVar2.J(d0lVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new frg(d0lVar, 6);
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
