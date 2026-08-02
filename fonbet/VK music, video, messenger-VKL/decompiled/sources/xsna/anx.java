package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: InternalTabs.kt */
/* loaded from: classes17.dex */
public final class anx {
    public final khx a;

    public anx(khx khxVar) {
        this.a = khxVar;
    }

    public final void a(final String str, final long j, final long j2, final frv0 frv0Var, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        frv0 frv0Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        char c;
        androidx.compose.runtime.a M = aVar.M(51764800);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.p(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            frv0Var2 = frv0Var;
            i2 |= M.J(frv0Var2) ? 2048 : 1024;
        } else {
            frv0Var2 = frv0Var;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(51764800, i3, -1, "com.vk.core.compose.component.internal.InternalTabScope.InternalTabText (InternalTabs.kt:102)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new va2();
                M.R(x);
            }
            fg90 fg90Var = (fg90) x;
            Object x2 = M.x();
            Object obj = x2;
            if (x2 == c0012a) {
                va2 va2Var = new va2();
                va2Var.i(9);
                M.R(va2Var);
                obj = va2Var;
            }
            fg90 fg90Var2 = (fg90) obj;
            Object x3 = M.x();
            if (x3 == c0012a) {
                c = ' ';
                x3 = androidx.compose.runtime.k.b(new ov70((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32)));
                M.R(x3);
            } else {
                c = ' ';
            }
            wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                long j3 = 0;
                x4 = androidx.compose.runtime.k.b(new q9x((j3 << c) | (j3 & 4294967295L)));
                M.R(x4);
            }
            wh50 wh50Var2 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = bbk0.b(new l49(this, wh50Var, wh50Var2, 4));
                M.R(x5);
            }
            mtk0 mtk0Var = (mtk0) x5;
            fg90Var2.d(j2);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new bv1(19, wh50Var, wh50Var2);
                M.R(x6);
            }
            q630.a aVar3 = q630.a.a;
            q630 A = hr80.A(aVar3, (izs) x6);
            boolean y = M.y(fg90Var) | M.y(fg90Var2);
            Object x7 = M.x();
            if (y || x7 == c0012a) {
                x7 = new eo3(mtk0Var, fg90Var, fg90Var2, 7);
                M.R(x7);
            }
            aVar2 = M;
            yqv0.c(str, bu00.f(A, (izs) x7), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar2, (i3 & 14) | ((i3 << 3) & 896), i3 & 7168, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zmx
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    anx.this.a(str, j, j2, frv0Var, q630Var2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
