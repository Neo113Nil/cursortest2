package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BiometricsLockPlaceholder.kt */
/* loaded from: classes15.dex */
public final class a87 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final String str2, final q630 q630Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        androidx.compose.runtime.a aVar2;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-621068018);
        int i3 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            wzsVar2 = wzsVar;
            i3 |= M.y(wzsVar2) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                aVar2 = M;
                aVar2.h();
                wzsVar3 = wzsVar2;
            } else {
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar4 = i4 != 0 ? s101.d : wzsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-621068018, i3, -1, "com.vk.biometrics.lock.impl.presentation.base.view.BiometricsLockPlaceholder (BiometricsLockPlaceholder.kt:24)");
                }
                q630 f = txj0.f(q630Var, 1.0f);
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f);
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
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                wzsVar4.invoke(M, Integer.valueOf((i3 >> 9) & 14));
                q630.a aVar4 = q630.a.a;
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar5 = wzsVar4;
                aVar2 = M;
                yqv0.a(str, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().m, 0L, b6s.d, null, 0L, 3, 0L, null, 0, false, 0, 0, null, wlb0.l(M).D, aVar2, (i3 & 14) | 196656, 0, 523224);
                yqv0.c(str2, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar2).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).X, aVar2, ((i3 >> 3) & 14) | 48, 0, 8120);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                wzsVar3 = wzsVar5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.y77
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a87.a(str, str2, q630Var, wzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        wzsVar2 = wzsVar;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1627414270);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1627414270, i, -1, "com.vk.biometrics.lock.impl.presentation.base.view.DefaultIcon (BiometricsLockPlaceholder.kt:50)");
            }
            qzu0.a.getClass();
            vjw.a(qzu0.h0(M), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z77(q630Var, i, 0);
        }
    }
}
