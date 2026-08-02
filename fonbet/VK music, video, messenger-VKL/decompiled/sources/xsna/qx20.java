package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes11.dex */
public final class qx20 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, zpx0> b;
    public final /* synthetic */ if2<Float, sq2> c;
    public final /* synthetic */ gdj0 d;
    public final /* synthetic */ jai e;
    public final /* synthetic */ jai f;
    public final /* synthetic */ gzs<s3q0> g;
    public final /* synthetic */ yvj h;
    public final /* synthetic */ boolean i;

    public qx20(wzs wzsVar, if2 if2Var, gdj0 gdj0Var, jai jaiVar, jai jaiVar2, gzs gzsVar, yvj yvjVar, boolean z) {
        this.b = wzsVar;
        this.c = if2Var;
        this.d = gdj0Var;
        this.e = jaiVar;
        this.f = jaiVar2;
        this.g = gzsVar;
        this.h = yvjVar;
        this.i = z;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(728743275, intValue, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:359)");
            }
            q630 y = tci.y(txj0.f(q630.a.a, 1.0f), this.b.invoke(aVar2, 0));
            if2<Float, sq2> if2Var = this.c;
            boolean y2 = aVar2.y(if2Var);
            Object x = aVar2.x();
            if (y2 || x == a.C0011a.a) {
                x = new tcn(if2Var, 20);
                aVar2.R(x);
            }
            q630 a = rdu.a(y, (izs) x);
            gdj0 gdj0Var = this.d;
            q630 a2 = rdu.a(a, new qm1(gdj0Var, 10));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, a2);
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
            k9q0.w(aVar2, a3, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            aVar2.K(1352934765);
            bdj0.a(54, aVar2, kai.c(2000500644, new px20(gdj0Var, this.g, this.h, this.i, e7b0.b(R.string.m3c_bottom_sheet_dismiss_description, aVar2), e7b0.b(R.string.m3c_bottom_sheet_expand_description, aVar2), e7b0.b(R.string.m3c_bottom_sheet_collapse_description, aVar2), this.e), aVar2));
            aVar2.j();
            this.f.invoke(r9g.a, aVar2, 6);
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
