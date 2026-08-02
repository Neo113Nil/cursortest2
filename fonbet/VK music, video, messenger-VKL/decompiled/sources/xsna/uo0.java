package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: AddToMyMusicOnboardingButton.kt */
/* loaded from: classes3.dex */
public final class uo0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var, final boolean z) {
        int i3;
        q630 q630Var2;
        q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1035579089);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 v = i4 != 0 ? txj0.v(q630.a.a, 40) : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1035579089, i3, -1, "com.vk.music.stickyplayer.presentation.components.AddToMyMusicOnboardingButton (AddToMyMusicOnboardingButton.kt:19)");
                }
                float f = 24;
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new qo0(0);
                    M.R(x);
                }
                nzu0.e((gzs) x, v, f, null, false, null, null, kai.c(798041734, new wzs() { // from class: xsna.ro0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(798041734, intValue, -1, "com.vk.music.stickyplayer.presentation.components.AddToMyMusicOnboardingButton.<anonymous> (AddToMyMusicOnboardingButton.kt:25)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j = ylu0Var.getIcon().c;
                            q630 k = txj0.k(txj0.p(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 20, 3), 48), 60);
                            izs izsVar2 = izsVar;
                            boolean J = aVar2.J(izsVar2);
                            Object x2 = aVar2.x();
                            if (J || x2 == a.C0011a.a) {
                                x2 = new to0(izsVar2, 0);
                                aVar2.R(x2);
                            }
                            nk2.b(j, z, (gzs) x2, k, 1000L, 0.5f, aVar2, 1769472);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i3 >> 3) & 112) | 100663686, 248);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = v;
            }
            s = M.s();
            if (s == null) {
                s.d = new so0(i, i2, izsVar, q630Var3, z);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
