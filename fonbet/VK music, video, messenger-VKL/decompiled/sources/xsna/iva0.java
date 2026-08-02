package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: PlayPauseButton.kt */
/* loaded from: classes3.dex */
public final class iva0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final izs<? super Boolean, Integer> izsVar, final izs<? super sx40, s3q0> izsVar2, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        float f2;
        androidx.compose.runtime.a aVar2;
        final float f3;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(242824774);
        int i3 = (M.l(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i3 | (M.y(izsVar2) ? 256 : 128);
        int i5 = i4 | 3072;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 = i4 | 27648;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i5 |= M.n(f2) ? 16384 : 8192;
            if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                aVar2 = M;
                aVar2.h();
                f3 = f2;
                q630Var2 = q630Var;
            } else {
                if (i6 != 0) {
                    f2 = 48;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(242824774, i5, -1, "com.vk.music.stickyplayer.presentation.components.controls.PlayPauseButton (PlayPauseButton.kt:27)");
                }
                View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                q630.a aVar3 = q630.a.a;
                q630 q = txj0.q(s200.D(aVar3, 8), f2);
                boolean y = M.y(view) | ((i5 & 896) == 256);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (y || x == obj) {
                    x = new fva0(0, view, izsVar2);
                    M.R(x);
                }
                q630 E = ahn.E(ojc.c(q, false, null, null, (gzs) x, 15), z ? "pauseButton" : "playButton");
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().c;
                Boolean valueOf = Boolean.valueOf(z);
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = new wo40(7);
                    M.R(x2);
                }
                aVar2 = M;
                yl2.a(valueOf, j, (izs) x2, E, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, izsVar, aVar2, (i5 & 14) | 384 | ((i5 << 18) & 29360128), 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f3 = f2;
                q630Var2 = aVar3;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.hva0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        iva0.a(z, izsVar, izsVar2, q630Var2, f3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
