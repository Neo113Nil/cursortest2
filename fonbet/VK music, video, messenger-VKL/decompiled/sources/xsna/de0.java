package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AdChoicesBottomSheetRedesign.kt */
/* loaded from: classes14.dex */
public final class de0 {
    public static final void a(z0n z0nVar, androidx.compose.runtime.a aVar, int i) {
        q630.a aVar2;
        String str;
        float f;
        String str2;
        int i2;
        int i3;
        int i4;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(716572799);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(716572799, i, -1, "com.vk.ads.impl.adchoice.AdChoicesDisclaimer (AdChoicesBottomSheetRedesign.kt:129)");
        }
        float f2 = 16;
        q630.a aVar4 = q630.a.a;
        q630 F = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4);
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
        int hashCode = Long.hashCode(n34.n(M));
        sy90 D = M.D();
        q630 c = qri.c(M, F);
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
        k9q0.w(M, D, cri.a.e);
        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(M, cri.a.h);
        k9q0.w(M, c, cri.a.d);
        String str3 = z0nVar.a;
        if (str3 == null) {
            M.K(-1844991069);
            M.j();
            f = f2;
            str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            aVar2 = aVar4;
            i2 = -473561179;
            str2 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
        } else {
            M.K(-1844991068);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.l0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = aVar4;
            str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            f = f2;
            str2 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
            i2 = -473561179;
            yqv0.c(str3, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5), ylu0Var.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
            M = M;
            M.j();
        }
        String str4 = z0nVar.b;
        if (str4 == null) {
            M.K(-1844657385);
            M.j();
            aVar3 = M;
        } else {
            M.K(-1844657384);
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                i4 = 0;
                androidx.compose.runtime.b.f(i2, 0, -1, str2);
            } else {
                i3 = -1;
                i4 = 0;
            }
            wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var2 = wuv0Var2.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i4, i3, str);
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3 = M;
            yqv0.c(str4, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7), ylu0Var2.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar3, 48, 0, 8184);
            aVar3.j();
        }
        aVar3.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new ce0(z0nVar, i, 0);
        }
    }

    public static final void b(ArrayList arrayList, z0n z0nVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(98987960);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(98987960, i, -1, "com.vk.ads.impl.adchoice.AdChoicesMenu (AdChoicesBottomSheetRedesign.kt:111)");
        }
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
        int hashCode = Long.hashCode(n34.n(M));
        sy90 D = M.D();
        q630 c = qri.c(M, q630.a.a);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (M.N() == null) {
            n34.r();
            throw null;
        }
        M.H();
        if (M.L()) {
            M.I(aVar2);
        } else {
            M.f();
        }
        k9q0.w(M, a, cri.a.f);
        k9q0.w(M, D, cri.a.e);
        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(M, cri.a.h);
        k9q0.w(M, c, cri.a.d);
        if (z0nVar == null) {
            M.K(1662874028);
        } else {
            M.K(1662874029);
            a(z0nVar, M, 0);
        }
        M.j();
        M.K(-639093140);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jd0 jd0Var = (jd0) it.next();
            androidx.compose.runtime.a aVar3 = M;
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(jd0Var.b, null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar3, 196608, 30);
            boolean J = aVar3.J(izsVar) | aVar3.y(jd0Var);
            Object x = aVar3.x();
            if (J || x == a.C0011a.a) {
                x = new defpackage.u(1, izsVar, jd0Var);
                aVar3.R(x);
            }
            wiu0.b(null, false, null, a2, null, (gzs) x, null, aVar3, 0, 87);
            M = aVar3;
        }
        androidx.compose.runtime.a aVar4 = M;
        if (gp.d(aVar4)) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = aVar4.s();
        if (s != null) {
            s.d = new be0(i, 0, arrayList, z0nVar, izsVar);
        }
    }
}
