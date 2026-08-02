package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PlayPrevButton.kt */
/* loaded from: classes3.dex */
public final class nva0 {
    public static final void a(final boolean z, final int i, final izs<? super sx40, s3q0> izsVar, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        float f2;
        int i4;
        final q630 q630Var2;
        final float f3;
        androidx.compose.runtime.a M = aVar.M(508933860);
        int i5 = i2 | (M.l(z) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        int i6 = i5 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i5 | 27648;
            f2 = f;
        } else {
            f2 = f;
            i4 = i6 | (M.n(f2) ? 16384 : 8192);
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (i7 != 0) {
                f2 = 36;
            }
            float f4 = f2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(508933860, i4, -1, "com.vk.music.stickyplayer.presentation.components.controls.PlayPrevButton (PlayPrevButton.kt:29)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(o19.a(txj0.q(s200.D(aVar2, 4), f4), z ? 1.0f : 0.64f), "playPreviousButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            boolean y = M.y(view) | ((i4 & 896) == 256);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new j3(view, izsVar);
                M.R(x);
            }
            nk2.c(R.raw.skip_back_36, j, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, (gzs) x, Integer.valueOf(i), M, ((i4 << 12) & 57344) | ((i4 << 15) & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f3 = f4;
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
            f3 = f2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i, izsVar, q630Var2, f3, i2, i3) { // from class: xsna.mva0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ int c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ float f;
                public final /* synthetic */ int g;

                {
                    this.g = i3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    nva0.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                    return s3q0.a;
                }
            };
        }
    }
}
