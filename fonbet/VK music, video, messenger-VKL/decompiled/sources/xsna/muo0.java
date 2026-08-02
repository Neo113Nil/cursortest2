package xsna;

import androidx.compose.runtime.a;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class muo0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ a9x b;
    public final /* synthetic */ qw1 c;
    public final /* synthetic */ boolean d;

    public muo0(a9x a9xVar, qw1 qw1Var, boolean z) {
        this.b = a9xVar;
        this.c = qw1Var;
        this.d = z;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        q630.a aVar2;
        qw1 qw1Var;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-596940007, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1616)");
            }
            aVar3.K(1866272144);
            a9x a9xVar = this.b;
            int i = a9xVar.b;
            int i2 = 0;
            while (true) {
                aVar2 = q630.a.a;
                qw1Var = this.c;
                if (i2 >= i) {
                    break;
                }
                int a = (!qw1Var.a.g() || qw1Var.a.a() == 1) ? a9xVar.a(i2) : a9xVar.a(i2) % 12;
                boolean o = aVar3.o(i2);
                Object x = aVar3.x();
                if (o || x == a.C0011a.a) {
                    x = new c6b(i2, 2);
                    aVar3.R(x);
                }
                kuo0.d(egi0.b(aVar2, false, (izs) x), qw1Var, a, this.d, aVar3, 0);
                i2++;
            }
            aVar3.j();
            if (qw1Var.a.a() == 0 && qw1Var.a.g()) {
                aVar3.K(2020585964);
                kuo0.a(kuo0.b, Tensorflow.FRAME_WIDTH, aVar3, kai.c(-1385767514, new luo0(qw1Var, this.d), aVar3), hr80.m(txj0.q(vua0.u(aVar2, aoy.InnerCircle), vuo0.b), l5g.j, vog0.a));
                aVar3.j();
            } else {
                aVar3.K(2021505641);
                aVar3.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3.h();
        }
        return s3q0.a;
    }
}
