package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AboutVideoCounterVkUiDelegate.kt */
/* loaded from: classes2.dex */
public final class b6 {
    public static final void a(vxj vxjVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        List<axj> list = vxjVar.a;
        androidx.compose.runtime.a M = aVar.M(79578927);
        int i2 = (M.J(vxjVar) ? 4 : 2) | i | 48;
        boolean z = true;
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(79578927, i2, -1, "com.vk.libvideo.bottomsheet.about.delegate.ViewsLikesContent (AboutVideoCounterVkUiDelegate.kt:124)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 1.0f;
            q630 E = s200.E(txj0.f(aVar3, 1.0f), kqu0.b, kqu0.v);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            uog0 b = vog0.b(12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().l;
            M.K(889997033);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                axj axjVar = (axj) obj;
                if (i4 > 0) {
                    M.K(1735062217);
                    mq.d(aVar3, kqu0.v, M, i3);
                } else {
                    M.K(1730423780);
                    M.j();
                }
                if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 m = hr80.m(txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, z)), j, b);
                float f2 = f;
                String str = axjVar.a;
                androidx.compose.runtime.a aVar5 = M;
                wiu0.b(m, false, null, Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 0, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(axjVar.b, 1, null, null, null, aVar5, 12583344, 120), null, null, aVar5, 196608, 28), null, null, null, aVar5, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                M = aVar5;
                f = f2;
                b = b;
                i4 = i5;
                j = j;
                i3 = 0;
                z = true;
            }
            float f3 = f;
            aVar2 = M;
            aVar2.j();
            if (list.size() < 2) {
                aVar2.K(1820903057);
                if (f3 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                f9t.e(new xpy(f3 > Float.MAX_VALUE ? Float.MAX_VALUE : f3, true), aVar2, 0);
            } else {
                aVar2.K(1815505647);
            }
            aVar2.j();
            aVar2.G();
            q630Var2 = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar3;
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a6(vxjVar, q630Var2, i, 0);
        }
    }
}
