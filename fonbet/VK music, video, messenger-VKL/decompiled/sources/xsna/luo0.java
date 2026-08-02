package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class luo0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ qw1 b;
    public final /* synthetic */ boolean c;

    public luo0(qw1 qw1Var, boolean z) {
        this.b = qw1Var;
        this.c = z;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1385767514, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1639)");
            }
            int i = kuo0.j.b;
            for (int i2 = 0; i2 < i; i2++) {
                int a = kuo0.j.a(i2);
                boolean o = aVar2.o(i2);
                Object x = aVar2.x();
                if (o || x == a.C0011a.a) {
                    x = new yvd(i2, 2);
                    aVar2.R(x);
                }
                kuo0.d(egi0.b(q630.a.a, false, (izs) x), this.b, a, this.c, aVar2, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
