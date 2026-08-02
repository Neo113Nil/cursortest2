package xsna;

import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes11.dex */
public final class fx20 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ long b;
    public final /* synthetic */ gzs<s3q0> c;
    public final /* synthetic */ gdj0 d;
    public final /* synthetic */ yx20 e;
    public final /* synthetic */ if2<Float, sq2> f;
    public final /* synthetic */ yvj g;
    public final /* synthetic */ izs<Float, s3q0> h;
    public final /* synthetic */ q630 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ r5j0 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ float o;
    public final /* synthetic */ jai p;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, zpx0> q;
    public final /* synthetic */ jai r;

    public fx20(long j, gzs gzsVar, gdj0 gdj0Var, yx20 yx20Var, if2 if2Var, yvj yvjVar, izs izsVar, q630 q630Var, float f, boolean z, r5j0 r5j0Var, long j2, long j3, float f2, jai jaiVar, wzs wzsVar, jai jaiVar2) {
        this.b = j;
        this.c = gzsVar;
        this.d = gdj0Var;
        this.e = yx20Var;
        this.f = if2Var;
        this.g = yvjVar;
        this.h = izsVar;
        this.i = q630Var;
        this.j = f;
        this.k = z;
        this.l = r5j0Var;
        this.m = j2;
        this.n = j3;
        this.o = f2;
        this.p = jaiVar;
        this.q = wzsVar;
        this.r = jaiVar2;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1010026864, intValue, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:185)");
            }
            q630 A = f9t.A(txj0.d(q630.a.a, 1.0f));
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new bqt(7);
                aVar2.R(x);
            }
            q630 b = egi0.b(A, false, (izs) x);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, b);
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
            k9q0.w(aVar2, d, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            gdj0 gdj0Var = this.d;
            boolean z = ((SheetValue) gdj0Var.d.h.getValue()) != SheetValue.Hidden;
            boolean z2 = this.e.c;
            long j = this.b;
            gzs<s3q0> gzsVar = this.c;
            sx20.c(j, gzsVar, z, z2, aVar2, 0);
            sx20.b(this.f, this.g, gzsVar, this.h, this.i, gdj0Var, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, aVar2, 70);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
