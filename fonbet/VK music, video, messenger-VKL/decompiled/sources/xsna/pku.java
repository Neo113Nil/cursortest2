package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pku implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ pku(int i, gzs gzsVar, q630 q630Var, boolean z) {
        this.d = q630Var;
        this.c = z;
        this.e = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                sll0 sll0Var = (sll0) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-353395348, intValue, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GroupHeader.<anonymous> (GroupHeaderItem.kt:106)");
                    }
                    if (!this.c) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        q630.a aVar2 = q630.a.a;
                        q630 f = txj0.f(aVar2, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        float f2 = 16;
                        q630 H = s200.H(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), f2, 12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                        q630 E = ahn.E(aVar2, "storefront_cta_button_message_header");
                        q630 E2 = ahn.E(aVar2, "storefront_cta_button_header");
                        Object x = aVar.x();
                        if (x == a.C0011a.a) {
                            x = new zq0(izsVar, 3);
                            aVar.R(x);
                        }
                        ekk.b(sll0Var, H, E, E2, (izs) x, aVar, 28032);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                q630 q630Var = (q630) this.d;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                nyu0.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pku(boolean z, sll0 sll0Var, izs izsVar) {
        this.c = z;
        this.d = sll0Var;
        this.e = izsVar;
    }
}
