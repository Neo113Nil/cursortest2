package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkProgress.kt */
/* loaded from: classes17.dex */
public final class bev0 {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ((r22 & 4) != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final float f, final int i, final int i2, long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        long j2;
        int i4;
        int i5;
        final long j3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(558371374);
        if ((i & 6) == 0) {
            i3 = i | (M.n(f) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            j2 = j;
            if (M.p(j2)) {
                i4 = 256;
                i5 = i3 | i4;
                if (M.t(i5 & 1, (i5 & 147) == 146)) {
                    M.h();
                    j3 = j2;
                } else {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if ((i2 & 4) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var.m().a;
                            i5 &= -897;
                        }
                        int i6 = i5;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(558371374, i6, -1, "com.vk.core.compose.component.VkProgress (VkProgress.kt:32)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j4 = ylu0Var2.b().a;
                        long j5 = j2;
                        mtk0 b = hg2.b(swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), k2e0.b, "VkProgressAnimation", null, M, 3072, 20);
                        q630 a = j3e0.a(hr80.m(rte0.d(txj0.f(txj0.h(q630Var, 2), 1.0f), vog0.a), j4, androidx.compose.ui.graphics.e.a), ((Number) b.getValue()).floatValue());
                        boolean J = ((((i6 & 896) ^ 384) > 256 && M.p(j5)) || (i6 & 384) == 256) | M.J(b);
                        Object x = M.x();
                        if (J || x == a.C0011a.a) {
                            x = new wg3(j5, b, 3);
                            M.R(x);
                        }
                        xa4.i(0, M, (izs) x, a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j3 = j5;
                    } else {
                        M.h();
                    }
                }
                s = M.s();
                if (s == null) {
                    s.d = new wzs() { // from class: xsna.aev0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            bev0.a(f, I, i2, j3, (androidx.compose.runtime.a) obj, q630Var);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i4 = 128;
        i5 = i3 | i4;
        if (M.t(i5 & 1, (i5 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
