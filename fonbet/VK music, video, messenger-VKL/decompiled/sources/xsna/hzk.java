package xsna;

import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class hzk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ d0l b;
    public final /* synthetic */ vxk c;

    public hzk(d0l d0lVar, vxk vxkVar) {
        this.b = d0lVar;
        this.c = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1655706771, intValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
            }
            ayk.a.b(this.b.e(), 3120, this.c.b, aVar2, s200.C(q630.a.a, lzk.e));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
