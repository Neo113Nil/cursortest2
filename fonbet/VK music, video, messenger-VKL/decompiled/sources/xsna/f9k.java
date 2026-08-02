package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CreateMarketItemReviewView.kt */
/* loaded from: classes18.dex */
public final class f9k {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1883502643);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1883502643, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewLoadingView (CreateMarketItemReviewView.kt:166)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, SpinnerSize.Size56, null, M, 24582, 44);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e9k(q630Var, i, 0);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        TopBar$Before.e eVar;
        androidx.compose.runtime.a M = aVar.M(37545885);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(37545885, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.Toolbar (CreateMarketItemReviewView.kt:141)");
            }
            nek0 nek0Var = (nek0) M.r(uvi.q);
            if (c(M)) {
                M.K(1838217587);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.vk_back, 0, M);
                boolean J = M.J(nek0Var) | ((i2 & 112) == 32);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.flow.binding.l(8, nek0Var, izsVar);
                    M.R(x);
                }
                eVar = TopBar$Before.e.a.a(b, N, (gzs) x, null, null, null, M, 1572872, 56);
                M.j();
            } else {
                M.K(1838579232);
                M.j();
                eVar = null;
            }
            TopBar$Before.e eVar2 = eVar;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            M = M;
            muv0.h(a, null, null, null, null, eVar2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pzj(str, izsVar, i, 1);
        }
    }

    public static final boolean c(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(136822917, 0, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.rememberIsMobileUI (CreateMarketItemReviewView.kt:160)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            HashSet hashSet = iah0.a;
            x = Boolean.valueOf(fnj.c(context));
            aVar.R(x);
        }
        boolean booleanValue = ((Boolean) x).booleanValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return booleanValue;
    }
}
