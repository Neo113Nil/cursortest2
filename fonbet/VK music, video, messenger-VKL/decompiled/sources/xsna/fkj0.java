package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: ShuffleButton.kt */
/* loaded from: classes3.dex */
public final class fkj0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final izs izsVar2, q630 q630Var, final boolean z, final boolean z2) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-323381878);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-323381878, i2, -1, "com.vk.music.stickyplayer.presentation.components.controls.ShuffleButton (ShuffleButton.kt:23)");
            }
            q630Var2 = q630.a.a;
            q630 q = txj0.q(s200.D(q630Var2, 10), 24);
            int i3 = i2 & 14;
            boolean z3 = ((i2 & 7168) == 2048) | (i3 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new dkj0(izsVar2, z);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(q, z2, null, null, (gzs) x, 14), "shuffleTrackButton");
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
            if (x2 == c0012a) {
                x2 = new cd10(16);
                M.R(x2);
            }
            izs izsVar3 = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new e420(23);
                M.R(x3);
            }
            yl2.a(valueOf, j, izsVar3, E, (izs) x3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, izsVar, M, i3 | 24960 | ((i2 << 15) & 29360128), 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, izsVar, izsVar2, q630Var2, z, z2) { // from class: xsna.ekj0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;

                {
                    this.b = z;
                    this.c = z2;
                    this.d = izsVar;
                    this.e = izsVar2;
                    this.f = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fkj0.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.d, this.e, this.f, this.b, this.c);
                    return s3q0.a;
                }
            };
        }
    }
}
