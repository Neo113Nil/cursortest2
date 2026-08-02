package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jta0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jta0(w7t w7tVar, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, int i) {
        this.e = w7tVar;
        this.f = rhaVar;
        this.g = izsVar;
        this.c = xvyVar;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.e;
                jai jaiVar = (jai) this.f;
                mt6 mt6Var = (mt6) this.g;
                gzs<? extends tny> gzsVar = (gzs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1070596993, intValue, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders.<anonymous> (PlatformDefaultTextContextMenuProviders.android.kt:76)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new z26(2, wh50Var);
                        aVar.R(x);
                    }
                    q630 o = egi.o(this.d, (izs) x);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, true);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, o);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    jaiVar.invoke(aVar, 0);
                    mt6Var.b(gzsVar, aVar, 6);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((a4b0) this.e).p((gzs) this.c, (gzs) this.f, (i0k0) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(32769));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                f5e0.a((w7t) this.e, (rha) this.f, (izs) this.g, (xvy) this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ jta0(q630 q630Var, wh50 wh50Var, jai jaiVar, mt6 mt6Var, gzs gzsVar) {
        this.d = q630Var;
        this.e = wh50Var;
        this.f = jaiVar;
        this.g = mt6Var;
        this.c = gzsVar;
    }

    public /* synthetic */ jta0(a4b0 a4b0Var, gzs gzsVar, gzs gzsVar2, i0k0 i0k0Var, q630 q630Var, int i) {
        this.e = a4b0Var;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.g = i0k0Var;
        this.d = q630Var;
    }
}
