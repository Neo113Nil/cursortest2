package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.player.LoopMode;
import xsna.q630;

/* compiled from: RepeatButton.kt */
/* loaded from: classes3.dex */
public final class h0g0 {

    /* compiled from: RepeatButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoopMode.TRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final LoopMode loopMode, final boolean z, final izs izsVar, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2004852387);
        int i2 = i | (M.o(loopMode.ordinal()) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2004852387, i2, -1, "com.vk.music.stickyplayer.presentation.components.controls.RepeatButton (RepeatButton.kt:24)");
            }
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(s200.D(aVar2, 10), 24);
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 7168) == 2048) | (i3 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new com.vk.movika.tools.controls.seekbar.g(18, izsVar2, loopMode);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(q, z, null, null, (gzs) x, 14), "repeatTrackButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new j5n(22);
                M.R(x2);
            }
            izs izsVar3 = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new gz30(13);
                M.R(x3);
            }
            yl2.a(loopMode, j, izsVar3, E, (izs) x3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, izsVar, M, i3 | 24960 | ((i2 << 15) & 29360128), 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, izsVar, izsVar2, q630Var2, i) { // from class: xsna.g0g0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    h0g0.a(LoopMode.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
