package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import xsna.cri;
import xsna.dt1;
import xsna.ktv0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ote implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ote(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((pte) this.d).h((cue) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                f6t.a((g6t) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                txk0.b((vg7) this.d, (dh7) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                fuv0 fuv0Var = (fuv0) this.d;
                yc0 yc0Var = (yc0) this.e;
                zhf0 zhf0Var = (zhf0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(777129996, intValue, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.AdvertInformationTooltip.<anonymous> (UserProfileAdvertBannerViewHolder.kt:253)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 d = txj0.d(a5j0.b(aVar2, 4, null, false, 0L, 0L, 30), 1.0f);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = ir.h(aVar);
                    }
                    sg50 sg50Var = (sg50) x;
                    boolean J = aVar.J(fuv0Var);
                    Object x2 = aVar.x();
                    if (J || x2 == c0012a) {
                        x2 = new x9l0(fuv0Var, 7);
                        aVar.R(x2);
                    }
                    q630 b = ojc.b(d, sg50Var, null, false, null, (gzs) x2, 28);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d2, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    String str = yc0Var.h;
                    ktv0.e eVar = ktv0.e.a;
                    VkTooltipAppearance vkTooltipAppearance = VkTooltipAppearance.Neutral;
                    float f = 0;
                    boolean J2 = aVar.J(zhf0Var);
                    Object x3 = aVar.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new mcj0(zhf0Var, 15);
                        aVar.R(x3);
                    }
                    cuv0.b("", eVar, vkTooltipAppearance, kci.k(aVar2, (izs) x3), str, false, false, false, false, fuv0Var, null, f, null, null, 0, emi.c, aVar, 1573254, 196656, 30112);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ote(g6t g6tVar, izs izsVar, q630 q630Var, int i) {
        this.b = 1;
        this.d = g6tVar;
        this.c = izsVar;
        this.e = q630Var;
    }

    public /* synthetic */ ote(fuv0 fuv0Var, yc0 yc0Var, zhf0 zhf0Var) {
        this.b = 3;
        this.d = fuv0Var;
        this.e = yc0Var;
        this.c = zhf0Var;
    }
}
