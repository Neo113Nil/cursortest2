package xsna;

import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class izk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ d0l b;
    public final /* synthetic */ nyk c;
    public final /* synthetic */ vxk d;

    public izk(d0l d0lVar, nyk nykVar, vxk vxkVar) {
        this.b = d0lVar;
        this.c = nykVar;
        this.d = vxkVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1439279037, intValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:180)");
            }
            ayk aykVar = ayk.a;
            d0l d0lVar = this.b;
            aykVar.a(d0lVar.f(), d0lVar.e(), this.c, s200.C(q630.a.a, lzk.f), this.d.c, aVar2, 199680);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
