package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;
import xsna.sx40;

/* compiled from: RedesignPlayerActionsBlock.kt */
/* loaded from: classes3.dex */
public final class zlf0 {
    public static final void a(final boolean z, final izs izsVar, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final float f2;
        lg90 b;
        androidx.compose.runtime.a M = aVar.M(754415242);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            float f3 = 28;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(754415242, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.AddToMyMusicButton (RedesignPlayerActionsBlock.kt:259)");
            }
            final View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            if (z) {
                M.K(-779131344);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                }
                b = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-779085247);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(316178300, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline28> (VkSdkIcons.kt:364)");
                }
                b = or.b(M, 404637919, R.drawable.vk_icon_check_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            String N = d370.N(z ? R.string.music_talkback_player_remove_track_from_favorite : R.string.music_talkback_player_add_track_to_favorite, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(s200.D(aVar2, 4), f3);
            boolean y = M.y(view) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new gzs() { // from class: xsna.vlf0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        cl40.a(view, MusicHapticEvent.LIGHT);
                        izsVar.invoke(new sx40.m0(z, PlayerContext.FULL));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            nzu0.c((gzs) x, b, N, q, f3, j, false, null, false, null, null, M, 64 | ((i3 << 3) & 57344), 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            f2 = f3;
        } else {
            M.h();
            q630Var2 = q630Var;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wlf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zlf0.a(z, izsVar, q630Var2, f2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final izs izsVar, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(-2085427114);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            float f3 = 28;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2085427114, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.DislikeButton (RedesignPlayerActionsBlock.kt:224)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(s200.D(aVar2, 4), f3);
            boolean y = M.y(view) | ((i3 & 112) == 32);
            int i4 = i3 & 14;
            boolean z2 = y | (i4 == 4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                x = new g31(view, izsVar, z);
                M.R(x);
            }
            q630 c = ojc.c(q, false, null, null, (gzs) x, 15);
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
                x2 = new xsq(23);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z3 = i4 == 4;
            Object x3 = M.x();
            if (z3 || x3 == obj) {
                x3 = new xum(z, 2);
                M.R(x3);
            }
            yl2.a(valueOf, j, izsVar2, c, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (izs) x3, M, i4 | 384, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            f2 = f3;
        } else {
            M.h();
            q630Var2 = q630Var;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.slf0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    zlf0.b(z, izsVar, q630Var2, f2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(float f, final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        int i2;
        final float f2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(642402104);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | Tensorflow.FRAME_WIDTH;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            f2 = 36;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(642402104, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.PlayNextButton (RedesignPlayerActionsBlock.kt:157)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630Var2 = q630.a.a;
            q630 E = ahn.E(o19.a(txj0.q(s200.D(q630Var2, 4), f2), 1.0f), "playNextButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            boolean y = M.y(view) | ((i3 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new xm6(12, view, izsVar);
                M.R(x);
            }
            nk2.c(R.raw.skip_forward_36, j, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, (gzs) x, Integer.valueOf(R.string.music_talkback_player_go_forward), M, 24576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            f2 = f;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ulf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    zlf0.c(f2, I, (androidx.compose.runtime.a) obj, izsVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final boolean z, final izs izsVar, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(1770452563);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            float f3 = 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1770452563, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.PlayPauseButton (RedesignPlayerActionsBlock.kt:117)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(s200.D(aVar2, 4), f3);
            boolean y = M.y(view) | ((i3 & 112) == 32);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new qsd0(view, izsVar);
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
                x2 = new l140(11);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new swb(z, 2);
                M.R(x3);
            }
            yl2.a(valueOf, j, izsVar2, E, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (izs) x3, M, i4 | 384, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            f2 = f3;
        } else {
            M.h();
            q630Var2 = q630Var;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rlf0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    zlf0.d(z, izsVar, q630Var2, f2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(float f, final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        int i2;
        final float f2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(112836216);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | Tensorflow.FRAME_WIDTH;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            f2 = 36;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(112836216, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.PlayPrevButton (RedesignPlayerActionsBlock.kt:93)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630Var2 = q630.a.a;
            q630 E = ahn.E(txj0.q(s200.D(q630Var2, 4), f2), "playPreviousButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            boolean y = M.y(view) | ((i3 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new fg1(24, view, izsVar);
                M.R(x);
            }
            nk2.c(R.raw.skip_back_36, j, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, (gzs) x, Integer.valueOf(R.string.music_talkback_player_go_back), M, 24576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            f2 = f;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ylf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    zlf0.e(f2, I, (androidx.compose.runtime.a) obj, izsVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ivs ivsVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        boolean z;
        gfp0.b bVar = ivsVar.b;
        dz40.t tVar = ivsVar.a;
        androidx.compose.runtime.a M = aVar.M(857934249);
        if ((i & 6) == 0) {
            i2 = i | (M.J(ivsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(857934249, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.PlayerActionsBlock (RedesignPlayerActionsBlock.kt:44)");
            }
            wh50 c = jk50.c(tVar.a.c, M);
            wh50 c2 = jk50.c(tVar.f, M);
            wh50 c3 = jk50.c(tVar.j, M);
            wh50 c4 = jk50.c(tVar.i, M);
            boolean z2 = bVar instanceof gfp0.b.c;
            int i4 = ivsVar.e;
            int intValue = ((Number) c.getValue()).intValue();
            int i5 = ivsVar.d;
            gfp0.b.c cVar = z2 ? (gfp0.b.c) bVar : null;
            if (cVar != null) {
                aVar2 = M;
                z = cVar.h;
            } else {
                aVar2 = M;
                z = false;
            }
            x17 q = sd9.q(z2, z, i4, intValue, i5, aVar2);
            M = aVar2;
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c5 = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c5, cri.a.d);
            int i6 = (i3 >> 3) & 14;
            e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, M, izsVar, null);
            int i7 = i3 & 112;
            d(ivsVar.h, izsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i7);
            c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, M, izsVar, null);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f, true), M, 0);
            if (((Boolean) c4.getValue()).booleanValue()) {
                M.K(-1713504363);
            } else {
                M.K(-1710377920);
                g(((Boolean) c2.getValue()).booleanValue(), izsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i7);
            }
            M.j();
            b(((Boolean) c3.getValue()).booleanValue(), izsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i7);
            a(!ivsVar.f.b, izsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i7);
            h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, M, izsVar, null);
            M.G();
            w17.a(q, 16, izsVar, txj0.f(aVar3, 1.0f), M, ((i3 << 3) & 896) | 3120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q5v(ivsVar, izsVar, q630Var2, i, 3);
        }
    }

    public static final void g(final boolean z, final izs izsVar, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(146773034);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            float f3 = 28;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(146773034, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.ShuffleButton (RedesignPlayerActionsBlock.kt:182)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(s200.D(aVar2, 4), f3);
            boolean y = M.y(view) | ((i3 & 112) == 32);
            int i4 = i3 & 14;
            boolean z2 = y | (i4 == 4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                x = new p2i(view, izsVar, z);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(q, true, null, null, (gzs) x, 14), "shuffleTrackButton");
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
                x2 = new sux(21);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new y510(19);
                M.R(x3);
            }
            izs izsVar3 = (izs) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new n9w(20);
                M.R(x4);
            }
            yl2.a(valueOf, j, izsVar2, E, izsVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (izs) x4, M, i4 | 12607872, 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            f2 = f3;
        } else {
            M.h();
            q630Var2 = q630Var;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xlf0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    zlf0.g(z, izsVar, q630Var2, f2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(float f, final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        int i2;
        final float f2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-86328033);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | Tensorflow.FRAME_WIDTH;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            float f3 = 28;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-86328033, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.TrackMenuButton (RedesignPlayerActionsBlock.kt:296)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            boolean y = M.y(view) | ((i3 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new nh3(26, view, izsVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            lg90 a = pg90.a(R.drawable.vk_icon_more_vertical_shadow_24, 0, M);
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(aVar2, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = f3;
            q630Var2 = aVar2;
            nzu0.c(gzsVar, a, null, D, f2, ylu0Var.getIcon().c, false, null, true, null, null, M, 100663744 | ((i3 << 6) & 57344), 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            f2 = f;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tlf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    zlf0.h(f2, I, (androidx.compose.runtime.a) obj, izsVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }
}
