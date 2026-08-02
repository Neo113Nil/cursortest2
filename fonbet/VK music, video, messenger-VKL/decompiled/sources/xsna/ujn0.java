package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;

/* compiled from: Surface.kt */
/* loaded from: classes11.dex */
public final class ujn0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ q630 b;
    public final /* synthetic */ r5j0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ jai g;

    public ujn0(q630 q630Var, r5j0 r5j0Var, long j, float f, float f2, jai jaiVar) {
        this.b = q630Var;
        this.c = r5j0Var;
        this.d = j;
        this.e = f;
        this.f = f2;
        this.g = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(421772006, intValue, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
            }
            q630 d = xjn0.d(this.b, this.c, xjn0.e(this.d, this.e, aVar2), null, ((azl) aVar2.r(uvi.h)).I0(this.f));
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new q520(23);
                aVar2.R(x);
            }
            q630 b = egi0.b(d, false, (izs) x);
            s3q0 s3q0Var = s3q0.a;
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = tjn0.a;
                aVar2.R(x2);
            }
            q630 b2 = skn0.b(b, s3q0Var, (PointerInputEventHandler) x2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, true);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, b2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d2, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            if (er.f(0, aVar2, this.g)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
