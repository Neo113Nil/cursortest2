package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: SleepTimerActionButton.kt */
/* loaded from: classes3.dex */
public final class yzj0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        lg90 b;
        androidx.compose.runtime.a M = aVar.M(-656617287);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-656617287, i3, -1, "com.vk.music.stickyplayer.presentation.components.SleepTimerActionButton (SleepTimerActionButton.kt:25)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j = ylu0Var.getBackground().m;
            if (z) {
                M.K(350990816);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1513971602, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Clock28> (VkIcons.kt:1550)");
                }
                b = or.b(M, -1276255553, R.drawable.vk_icon_clock_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(350991591);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2132105284, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ClockOutline28> (VkSdkIcons.kt:548)");
                }
                b = or.b(M, 723000486, R.drawable.vk_icon_clock_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            String N = d370.N(R.string.music_talkback_sleep_timer, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().c;
            float f = 28;
            q630.a aVar3 = q630.a.a;
            q630 q = txj0.q(aVar3, 44);
            boolean p = M.p(j);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (p || x == c0012a) {
                x = new izs() { // from class: xsna.vzj0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        final long j3 = j;
                        return ((kw8) obj).c(new izs() { // from class: xsna.xzj0
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                oio.V1((oio) obj2, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(x);
            }
            q630 E = ahn.E(bu00.e(q, (izs) x), "sleepTimerButton");
            boolean y = M.y(view) | ((i3 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new g4(21, view, izsVar);
                M.R(x2);
            }
            q630Var2 = aVar3;
            aVar2 = M;
            nzu0.c((gzs) x2, b, N, E, f, j2, false, null, false, null, null, aVar2, 24640, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wzj0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yzj0.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var2, z);
                    return s3q0.a;
                }
            };
        }
    }
}
