package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.onlinebooking.impl.common.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BookingError.kt */
/* loaded from: classes18.dex */
public final class iq7 {
    public static final void a(com.vk.ecomm.onlinebooking.impl.common.a aVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i) {
        q630.a aVar3;
        gzs<s3q0> gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar2.M(448359690);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(448359690, i2, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingError (BookingError.kt:37)");
            }
            q630.a aVar4 = q630.a.a;
            q630 D = p490.D(s200.D(hr80.m(txj0.d(aVar4, 1.0f), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a), 32), p490.x(M), 14);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i3 = i2 & 14;
            boolean J = M.J(context) | (i3 == 4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = com.vk.ecomm.onlinebooking.impl.common.b.b(aVar, context);
                M.R(x);
            }
            String str = (String) x;
            boolean J2 = M.J(context) | (i3 == 4);
            Object x2 = M.x();
            if (J2 || x2 == obj) {
                x2 = com.vk.ecomm.onlinebooking.impl.common.b.a(aVar, context);
                M.R(x2);
            }
            String str2 = (String) x2;
            if (aVar instanceof a.f) {
                M.K(1356924576);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1454766162, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelCircleOutline56> (VkSdkIcons.kt:266)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_cancel_circle_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a2, null, null, wlb0.h(M).getIcon().l, M, 56, 4);
                M.j();
                aVar3 = aVar4;
            } else {
                M.K(1357138662);
                aVar3 = aVar4;
                vjw.a(pg90.a(we7.m(M) ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56, 0, M), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                M = M;
                M.j();
            }
            f9t.e(txj0.h(aVar3, 12), M, 6);
            M.K(1706359253);
            androidx.compose.runtime.a aVar6 = M;
            q630.a aVar7 = aVar3;
            yqv0.c(str, null, wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, aVar6, 0, 0, 8122);
            M = aVar6;
            ck70.b(aVar7, 8, M, 6);
            if (str2 == null) {
                M.K(1357838951);
                M.j();
            } else {
                M.K(1357838952);
                yqv0.c(str2, null, wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).p1, M, 0, 0, 8122);
                M = M;
                ck70.b(aVar7, 16, M, 6);
            }
            if (aVar.a()) {
                M.K(1358167180);
                androidx.compose.runtime.a aVar8 = M;
                gzsVar2 = gzsVar;
                bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(R.string.booking_error_action, 0, M), null, null, null, null, false, null, null, null, aVar8, ((i2 >> 3) & 14) | X2.b.f, 0, 0, 4190192);
                M = aVar8;
            } else {
                gzsVar2 = gzsVar;
                M.K(1354556238);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xf4(aVar, gzsVar2, i, 1);
        }
    }
}
