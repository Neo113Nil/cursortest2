package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: FastForwardButton.kt */
/* loaded from: classes3.dex */
public final class zkq {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final izs izsVar, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        float f2;
        final float f3;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1133822311);
        int i3 = (M.y(izsVar) ? 32 : 16) | i;
        int i4 = i3 | 384;
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i4 |= M.n(f2) ? 2048 : 1024;
            if (M.t(i4 & 1, (i4 & 1171) == 1170)) {
                M.h();
                f3 = f2;
                q630Var2 = q630Var;
            } else {
                if (i5 != 0) {
                    f2 = 36;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1133822311, i4, -1, "com.vk.music.stickyplayer.presentation.components.controls.FastForwardButton (FastForwardButton.kt:27)");
                }
                View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                q630.a aVar2 = q630.a.a;
                q630 E = ahn.E(o19.a(txj0.q(s200.D(aVar2, 4), f2), 1.0f), "fastForwardButton");
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().c;
                boolean y = M.y(view) | ((i4 & 112) == 32);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new kg(12, view, izsVar);
                    M.R(x);
                }
                nk2.c(R.raw.forward_15_48, j, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, (gzs) x, Integer.valueOf(R.string.accessibility_rewind_on_15_sec_forward), M, 24576);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f3 = f2;
                q630Var2 = aVar2;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ykq
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zkq.a(izs.this, q630Var2, f3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if (M.t(i4 & 1, (i4 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
