package xsna;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.tooling.PreviewActivity;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ynj implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ynj(String str, String str2, Object[] objArr, rg50 rg50Var) {
        this.c = str;
        this.d = str2;
        this.e = objArr;
        this.f = rg50Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                wzs wzsVar = (wzs) obj7;
                boj bojVar = (boj) obj6;
                yzs yzsVar = (yzs) obj5;
                gzs gzsVar = (gzs) obj4;
                mnj mnjVar = (mnj) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(mnjVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1789283891, intValue, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.kt:297)");
                    }
                    String str = (String) wzsVar.invoke(aVar, 0);
                    if (drm0.N(str)) {
                        xzw.c("Label must not be blank");
                    }
                    bojVar.getClass();
                    fei.a.f(str, Boolean.TRUE, mnjVar, yzsVar, gzsVar, aVar, Integer.valueOf((intValue << 9) & 7168));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                Object[] objArr = (Object[]) obj5;
                rg50 rg50Var = (rg50) obj4;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i2 = PreviewActivity.f;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(s890Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(993072492, intValue2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
                    }
                    q630 C = s200.C(q630.a.a, s890Var);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, C);
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
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    if (aVar2.L()) {
                        aVar2.b(valueOf, bVar);
                    }
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    fai.u(str2, str3, aVar2, objArr[rg50Var.getIntValue()]);
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

    public /* synthetic */ ynj(wzs wzsVar, boj bojVar, yzs yzsVar, gzs gzsVar) {
        this.c = wzsVar;
        this.d = bojVar;
        this.e = yzsVar;
        this.f = gzsVar;
    }
}
