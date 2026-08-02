package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tn1 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ tn1(int i, hr1 hr1Var, izs izsVar, r820 r820Var, q630 q630Var, w4p0 w4p0Var) {
        this.d = hr1Var;
        this.e = w4p0Var;
        this.f = r820Var;
        this.c = izsVar;
        this.g = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                hr1 hr1Var = (hr1) this.d;
                w4p0 w4p0Var = (w4p0) this.e;
                r820 r820Var = (r820) this.f;
                q630 q630Var = (q630) this.g;
                ((Integer) obj2).getClass();
                do1.c(ne7.I(1), (androidx.compose.runtime.a) obj, hr1Var, this.c, r820Var, q630Var, w4p0Var);
                return s3q0.a;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                mtk0 mtk0Var2 = (mtk0) this.e;
                mtk0 mtk0Var3 = (mtk0) this.f;
                mtk0 mtk0Var4 = (mtk0) this.g;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1932588467, intValue, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.ContentSurface.<anonymous>.<anonymous> (NotificationSettingView.kt:123)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 d = txj0.d(aVar2, 1.0f);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, d);
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
                    if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                        aVar.K(-1313445047);
                        q630 q = txj0.q(aVar2, 48);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        mku0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 28, ylu0Var.getIcon().f, aVar, q);
                        aVar.j();
                    } else {
                        boolean booleanValue = ((Boolean) mtk0Var2.getValue()).booleanValue();
                        izs izsVar = this.c;
                        if (booleanValue) {
                            aVar.K(-1313437804);
                            boolean J = aVar.J(izsVar);
                            Object x = aVar.x();
                            if (J || x == a.C0011a.a) {
                                x = new px(izsVar, 3);
                                aVar.R(x);
                            }
                            uwp.a(0, aVar, (gzs) x, null);
                            aVar.j();
                        } else {
                            if (((List) mtk0Var3.getValue()) != null) {
                                aVar.K(-1313433988);
                                ue70.e(384, aVar, (List) mtk0Var3.getValue(), izsVar, ahn.E(aVar2, "NotificationSettingList"));
                            } else {
                                aVar.K(-2067225445);
                            }
                            aVar.j();
                        }
                    }
                    if (((SpinnerState) mtk0Var4.getValue()) != null) {
                        aVar.K(-2061594140);
                        zfr0.d((SpinnerState) mtk0Var4.getValue(), null, null, null, null, 0L, 0L, null, null, aVar, 0, 510);
                        aVar = aVar;
                    } else {
                        aVar.K(-2067225445);
                    }
                    aVar.j();
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

    public /* synthetic */ tn1(izs izsVar, mtk0 mtk0Var, mtk0 mtk0Var2, mtk0 mtk0Var3, mtk0 mtk0Var4) {
        this.c = izsVar;
        this.d = mtk0Var;
        this.e = mtk0Var2;
        this.f = mtk0Var3;
        this.g = mtk0Var4;
    }
}
