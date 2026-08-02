package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y5u implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y5u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s3q0 s3q0Var;
        int i = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                r3d0 r3d0Var = (r3d0) obj8;
                z5u z5uVar = (z5u) obj7;
                gzs gzsVar = (gzs) obj6;
                gzs gzsVar2 = (gzs) obj5;
                gzs gzsVar3 = (gzs) obj4;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1382238366, intValue, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.SingleButtonContent.<anonymous> (GoodPreviewButtonsItemRefactoredViewHolder.kt:133)");
                    }
                    oad0 oad0Var = r3d0Var.a;
                    if (oad0Var == null) {
                        aVar.K(-1883207627);
                        aVar.j();
                        s3q0Var = null;
                    } else {
                        aVar.K(-1883207626);
                        z5uVar.m6(oad0Var, gzsVar, q630Var, aVar, (intValue << 6) & 896);
                        aVar.j();
                        s3q0Var = s3q0.a;
                    }
                    if (s3q0Var == null) {
                        aVar.K(-1882909003);
                        qx9 qx9Var = r3d0Var.c;
                        if (qx9Var == null) {
                            aVar.K(-1882909004);
                            aVar.j();
                        } else {
                            aVar.K(-1882909003);
                            z5uVar.i6(qx9Var, false, gzsVar2, gzsVar3, q630Var, aVar, ((intValue << 12) & 57344) | 48);
                            aVar = aVar;
                            aVar.j();
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        aVar.j();
                    } else {
                        aVar.K(1186176914);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                izs izsVar = (izs) obj8;
                mtk0 mtk0Var = (mtk0) obj7;
                mtk0 mtk0Var2 = (mtk0) obj6;
                mtk0 mtk0Var3 = (mtk0) obj5;
                mtk0 mtk0Var4 = (mtk0) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(647364422, intValue2, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.ContentSurface.<anonymous> (NotificationSettingView.kt:119)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    uov0.a(d, null, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1932588467, new tn1(izsVar, mtk0Var, mtk0Var2, mtk0Var3, mtk0Var4), aVar2), aVar2, 1572870, 58);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
