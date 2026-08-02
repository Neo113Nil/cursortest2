package xsna;

import android.app.Activity;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import xsna.cri;
import xsna.dt1;
import xsna.g9k;
import xsna.hiu0;
import xsna.jpl0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class g8k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g8k(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i;
        int i2;
        switch (this.b) {
            case 0:
                g9k.a aVar = (g9k.a) this.d;
                q630 q630Var = (q630) this.e;
                izs izsVar = (izs) this.c;
                ((Integer) obj2).getClass();
                k8k.e(ne7.I(1), (androidx.compose.runtime.a) obj, aVar, izsVar, q630Var);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                cv70.i((hv70) this.d, (izs) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                pf80.c((hh80) this.d, (mc90) this.e, (mc90) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                lll0.a((jpl0.a.d) this.d, (gzs) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                sbq0.c((String) this.d, (us2) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                w6s0 w6s0Var = (w6s0) this.d;
                Activity activity = (Activity) this.e;
                gzs<s3q0> gzsVar = (gzs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(341935590, intValue, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.VideoBottomSheetScreen.<anonymous>.<anonymous> (VideoBottomSheetRedesign.kt:105)");
                    }
                    w6s0Var.a(activity, gzsVar, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                CellButton$Appearance cellButton$Appearance = (CellButton$Appearance) this.d;
                String str = (String) this.e;
                String str2 = (String) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1460170341, intValue2, -1, "com.vk.core.compose.component.cell.button.VkCellButton.<anonymous> (VkCellButton.kt:124)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1911935938, 6, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.middleVerticalPadding (VkCellButtonDefaults.kt:172)");
                    }
                    float f = 5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630.a aVar4 = q630.a.a;
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar4);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, F);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(114446650, 48, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.titleColor (VkCellButtonDefaults.kt:125)");
                    }
                    int i3 = hiu0.a.$EnumSwitchMapping$2[cellButton$Appearance.ordinal()];
                    if (i3 == 1) {
                        aVar3.K(-1685914431);
                        aVar3.K(-723661966);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().a;
                        aVar3.j();
                        aVar3.j();
                    } else if (i3 == 2) {
                        aVar3.K(-1685908251);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().m;
                        aVar3.j();
                    } else {
                        if (i3 != 3) {
                            throw alb0.c(-1685916137, aVar3);
                        }
                        aVar3.K(-1685905882);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.getText().k;
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-853791201, 48, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.titleStyle (VkCellButtonDefaults.kt:154)");
                    }
                    aVar3.K(-497101610);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    iyk0 iyk0Var = rrv0.c;
                    wuv0 wuv0Var = (wuv0) aVar3.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.X;
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar3, 0, 48, 6138);
                    if (str2 != null) {
                        aVar3.K(-159480771);
                        if (a690.d(aVar4, kqu0.q, aVar3, 0)) {
                            i = -1;
                            androidx.compose.runtime.b.f(1810277090, 6, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.subtitleColor (VkCellButtonDefaults.kt:149)");
                        } else {
                            i = -1;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, i, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var4.getText().p;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            i2 = -1;
                            androidx.compose.runtime.b.f(-1474364029, 48, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.subtitleStyle (VkCellButtonDefaults.kt:163)");
                        } else {
                            i2 = -1;
                        }
                        aVar3.K(1851994798);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) aVar3.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var2 = wuv0Var2.m0;
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(str2, null, j2, null, null, 0, 0, null, 0, false, 0, 2, null, frv0Var2, aVar3, 0, 0, 6138);
                    } else {
                        aVar3.K(-164307843);
                    }
                    aVar3.j();
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ g8k(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ g8k(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }
}
