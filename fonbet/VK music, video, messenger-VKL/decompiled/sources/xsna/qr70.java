package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.ar20;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;

/* compiled from: ObtainVerificationContent.kt */
/* loaded from: classes18.dex */
public final class qr70 {
    public static final void a(final String str, final String str2, final ArrayList arrayList, final q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1774199635);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(arrayList) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1774199635, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationContent (ObtainVerificationContent.kt:39)");
            }
            q630 D = p490.D(q630Var, p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.h(aVar4, 12), M, 6);
            float f = 8;
            fwu0.c(rte0.d(txj0.f(sua.d(2.089172f, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), false), 1.0f), vog0.b(f)), null, str, null, null, null, null, vii.a, M, 100663296 | ((i2 << 6) & 896), 250);
            f9t.e(txj0.h(aVar4, f), M, 6);
            b4v0.a(ar20.a.a(str2, true, false, false, null, M, ((i2 >> 3) & 14) | 196656, 28), MiniInfoCell$Mode.BaseAccent, null, null, null, null, null, M, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            androidx.compose.runtime.a aVar5 = M;
            aVar5.K(402162751);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                nr70 nr70Var = (nr70) arrayList.get(i3);
                boolean z = nr70Var.b;
                CharSequence a2 = tlo0.b.a(nr70Var.c, (Context) aVar5.r(AndroidCompositionLocals_androidKt.b));
                String obj = a2 != null ? a2.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                boolean J = ((57344 & i2) == 16384) | aVar5.J(nr70Var);
                Object x = aVar5.x();
                if (J || x == a.C0011a.a) {
                    x = new k22(14, izsVar, nr70Var);
                    aVar5.R(x);
                }
                or70.a(z, obj, (izs) x, null, aVar5, 0);
            }
            boolean d = gp.d(aVar5);
            aVar2 = aVar5;
            if (d) {
                androidx.compose.runtime.b.e();
                aVar2 = aVar5;
            }
        } else {
            androidx.compose.runtime.a aVar6 = M;
            aVar6.h();
            aVar2 = aVar6;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, str2, arrayList, q630Var, izsVar, i) { // from class: xsna.pr70
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ ArrayList d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    qr70.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
