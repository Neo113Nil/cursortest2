package xsna;

import xsna.dt1;
import xsna.q630;

/* compiled from: PullToRefresh.kt */
/* loaded from: classes17.dex */
public final class dge0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final gzs gzsVar, q630 q630Var, kge0 kge0Var, dt1 dt1Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final q630 q630Var2;
        int i3;
        int i4;
        dt1 dt1Var2;
        final kge0 kge0Var2;
        final dt1 dt1Var3;
        androidx.compose.runtime.f s;
        dt1 dt1Var4;
        q630 q630Var3;
        kge0 kge0Var3;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1365574460);
        int i6 = (M.l(z) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 256 : 128;
            i3 = i6 | 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 = i6 | 25600;
            } else if ((i & 24576) == 0) {
                dt1Var2 = dt1Var;
                i3 |= M.J(dt1Var2) ? 16384 : 8192;
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
                        kge0 e = blx.e(M);
                        int i8 = i3 & (-7169);
                        if (i4 != 0) {
                            dt1.a.getClass();
                            dt1Var2 = dt1.a.b;
                        }
                        dt1Var4 = dt1Var2;
                        q630Var3 = q630Var4;
                        kge0Var3 = e;
                        i5 = i8;
                    } else {
                        M.h();
                        i5 = i3 & (-7169);
                        kge0Var3 = kge0Var;
                        dt1Var4 = dt1Var2;
                        q630Var3 = q630Var2;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1365574460, i5, -1, "com.vk.core.compose.component.ptr.VkPullToRefreshBox (PullToRefresh.kt:58)");
                    }
                    blx.c(z, gzsVar, q630Var3, kge0Var3, dt1Var4, null, jaiVar, M, (65534 & i5) | 1572864);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = q630Var3;
                    kge0Var2 = kge0Var3;
                    dt1Var3 = dt1Var4;
                } else {
                    M.h();
                    kge0Var2 = kge0Var;
                    dt1Var3 = dt1Var2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.cge0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            dge0.a(z, gzsVar, q630Var2, kge0Var2, dt1Var3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            dt1Var2 = dt1Var;
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i3 = i6 | 1024;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        dt1Var2 = dt1Var;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
