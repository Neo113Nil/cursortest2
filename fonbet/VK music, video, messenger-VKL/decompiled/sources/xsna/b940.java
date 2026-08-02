package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: MusicActionsPanel.kt */
/* loaded from: classes3.dex */
public final class b940 {
    public static final long a = l2l0.l(21);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0216, code lost:
    
        if (r10 == r9) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(gfp0.b.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        a.C0011a.C0012a c0012a;
        q630.a aVar4;
        boolean z;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a M = aVar2.M(-1556628081);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1556628081, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.AdActions (MusicActionsPanel.kt:172)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.music_player_ad_title, 0, M);
            long j = wlb0.h(M).getText().d;
            frv0 frv0Var = wlb0.l(M).f;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(N, new xpy(1.0f, true), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            androidx.compose.runtime.a aVar6 = M;
            boolean z2 = aVar.d;
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            q630.a aVar7 = q630.a.a;
            if (z2) {
                aVar6.K(-412194306);
                q630 E = ahn.E(aVar7, "gotoAdEnabled");
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                String N2 = d370.N(R.string.music_player_ad_goto_title, 0, aVar6);
                uog0 b = vog0.b(kqu0.h);
                boolean z3 = (i2 & 112) == 32;
                Object x = aVar6.x();
                if (z3 || x == c0012a3) {
                    x = new fr0(izsVar, 4);
                    aVar6.R(x);
                }
                z = true;
                aVar4 = aVar7;
                c0012a = c0012a3;
                bhu0.e(z3r0.d(0, 1, aVar6, (gzs) x), buttonSize, buttonStyle, buttonAppearance, E, b, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar6, 28080, 0, 0, 4190144);
                aVar6 = aVar6;
            } else {
                c0012a = c0012a3;
                aVar4 = aVar7;
                z = true;
                aVar6.K(-420061393);
            }
            aVar6.j();
            long c2 = l5g.c(14, wlb0.h(aVar6).getBackground().m, 0.2f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, aVar6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N3 = d370.N(R.string.music_talkback_player_more, 0, aVar6);
            long j2 = wlb0.h(aVar6).getIcon().c;
            float f = 24;
            q630 q = txj0.q(s200.H(aVar4, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 40);
            boolean p = aVar6.p(c2);
            Object x2 = aVar6.x();
            if (p) {
                c0012a2 = c0012a;
            } else {
                c0012a2 = c0012a;
            }
            x2 = new vsr(c2, 1);
            aVar6.R(x2);
            q630 E2 = ahn.E(bu00.e(q, (izs) x2), "moreButtonInAdPlayer");
            boolean z4 = (i2 & 112) == 32 ? z : false;
            Object x3 = aVar6.x();
            if (z4 || x3 == c0012a2) {
                x3 = new gy7(izsVar, 4);
                aVar6.R(x3);
            }
            androidx.compose.runtime.a aVar8 = aVar6;
            nzu0.c((gzs) x3, a3, N3, E2, f, j2, false, null, false, null, null, aVar8, 24640, 1984);
            aVar3 = aVar8;
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new oyl(aVar, izsVar, q630Var, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-900637462);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-900637462, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.AudioReactionsButton (MusicActionsPanel.kt:340)");
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
            long j = ylu0Var.getBackground().m;
            q630.a aVar2 = q630.a.a;
            Object obj = a.C0011a.a;
            if (str != null) {
                M.K(-229657451);
                q630 E = ahn.E(txj0.q(aVar2, 40), "reactionsButtonInPlayer");
                boolean p = M.p(j);
                Object x = M.x();
                if (p || x == obj) {
                    x = new hnf(j, 1);
                    M.R(x);
                }
                q630 e = bu00.e(E, (izs) x);
                plg0 plg0Var = new plg0(0);
                boolean y = M.y(view) | ((i2 & 112) == 32);
                Object x2 = M.x();
                if (y || x2 == obj) {
                    x2 = new s6t(1, view, izsVar);
                    M.R(x2);
                }
                nk2.a(str, l5g.j, ojc.c(e, false, null, plg0Var, (gzs) x2, 11), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, (i2 & 14) | 48);
                M.j();
            } else {
                int i3 = i2;
                M.K(-228981372);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-958788478, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Fire24White> (VkSdkIcons.kt:900)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_fire_24_white, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().c;
                float f = 24;
                q630 q = txj0.q(aVar2, 40);
                boolean p2 = M.p(j);
                Object x3 = M.x();
                if (p2 || x3 == obj) {
                    x3 = new com.vk.movika.sdk.base.observable.y(j, 1);
                    M.R(x3);
                }
                q630 E2 = ahn.E(bu00.e(q, (izs) x3), "reactionsButtonInPlayer");
                boolean y2 = M.y(view) | ((i3 & 112) == 32);
                Object x4 = M.x();
                if (y2 || x4 == obj) {
                    x4 = new km1(15, view, izsVar);
                    M.R(x4);
                }
                nzu0.c((gzs) x4, a2, "", E2, f, j2, false, null, false, null, null, M, 25024, 1984);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy9(str, izsVar, i, 2);
        }
    }

    public static final void c(final gfp0.b.c cVar, final dz40.c cVar2, final izs izsVar, final boolean z, final ParentBottomSheetState parentBottomSheetState, final boolean z2, final Set set, final BigPlayerBottomSheetValue bigPlayerBottomSheetValue, final boolean z3, final boolean z4, final boolean z5, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-28462305);
        int i2 = i | (M.J(cVar) ? 4 : 2) | (M.J(cVar2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.o(parentBottomSheetState.ordinal()) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536) | (M.J(set) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.o(bigPlayerBottomSheetValue.ordinal()) ? 8388608 : 4194304) | (M.l(z3) ? 67108864 : 33554432) | (M.l(z4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = M.l(z5) ? 4 : 2;
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-28462305, i2, i3, "com.vk.music.stickyplayer.presentation.components.music.MusicActions (MusicActionsPanel.kt:140)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i4 = i2 >> 3;
            e(cVar, cVar2, izsVar, parentBottomSheetState, z2, null, z, M, (i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | (i4 & 7168) | (i4 & 57344) | ((i2 << 9) & 3670016));
            f9t.e(txj0.h(aVar2, 16), M, 6);
            int i5 = i2 << 3;
            wh2.a(((i2 >> 18) & 14) | ((i2 >> 21) & 896) | (i5 & 7168) | (i5 & 57344), M, set, izsVar, null, new dz40.e(parentBottomSheetState, bigPlayerBottomSheetValue, z3, z5, !(fg40.a() == null)), z4, z);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(cVar2, izsVar, z, parentBottomSheetState, z2, set, bigPlayerBottomSheetValue, z3, z4, z5, i) { // from class: xsna.z840
                public final /* synthetic */ dz40.c c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ParentBottomSheetState f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Set h;
                public final /* synthetic */ BigPlayerBottomSheetValue i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    b940.c(gfp0.b.c.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final gfp0.b bVar, final dz40.c cVar, final Set set, final boolean z, final ParentBottomSheetState parentBottomSheetState, final BigPlayerBottomSheetValue bigPlayerBottomSheetValue, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1851675101);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.J(cVar) ? 32 : 16) | (M.J(set) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.o(parentBottomSheetState.ordinal()) ? 16384 : 8192) | (M.o(bigPlayerBottomSheetValue.ordinal()) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z3) ? 8388608 : 4194304) | (M.l(z4) ? 67108864 : 33554432) | (M.l(z5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = M.y(izsVar) ? 4 : 2;
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1851675101, i2, i3, "com.vk.music.stickyplayer.presentation.components.music.MusicActionsPanel (MusicActionsPanel.kt:88)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new u620(5);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new gzn(18);
                M.R(x2);
            }
            xh2.a(bVar, null, izsVar2, null, "ActionPanel", (izs) x2, kai.c(-153046173, new zzs() { // from class: xsna.w840
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    gfp0.b bVar2 = (gfp0.b) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-153046173, intValue, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicActionsPanel.<anonymous> (MusicActionsPanel.kt:99)");
                    }
                    boolean z6 = bVar2 instanceof gfp0.b.c;
                    izs izsVar3 = izsVar;
                    if (z6) {
                        aVar2.K(-1048481261);
                        b940.c((gfp0.b.c) bVar2, dz40.c.this, izsVar3, z, parentBottomSheetState, z3, set, bigPlayerBottomSheetValue, z2, z4, z5, aVar2, 0);
                        aVar2.j();
                    } else if (bVar2 instanceof gfp0.b.a) {
                        aVar2.K(-1048460142);
                        b940.a((gfp0.b.a) bVar2, izsVar3, txj0.f(q630.a.a, 1.0f), aVar2, 384);
                        aVar2.j();
                    } else {
                        if (!(bVar2 instanceof gfp0.b.C2940b)) {
                            throw alb0.c(-1048482656, aVar2);
                        }
                        aVar2.K(1857683869);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | 1794432, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(cVar, set, z, parentBottomSheetState, bigPlayerBottomSheetValue, z2, z3, z4, z5, izsVar, i) { // from class: xsna.x840
                public final /* synthetic */ dz40.c c;
                public final /* synthetic */ Set d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ParentBottomSheetState f;
                public final /* synthetic */ BigPlayerBottomSheetValue g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ izs l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    b940.d(gfp0.b.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(gfp0.b.c cVar, dz40.c cVar2, izs izsVar, ParentBottomSheetState parentBottomSheetState, final boolean z, q630 q630Var, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        gfp0.b.c cVar3;
        dz40.c cVar4;
        ParentBottomSheetState parentBottomSheetState2;
        final q630 q630Var2;
        int i2;
        String str;
        final izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(1385799789);
        int i3 = (M.J(cVar) ? 4 : 2) | i | (M.J(cVar2) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= M.o(parentBottomSheetState.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.l(z) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1385799789, i4, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicInfo (MusicActionsPanel.kt:233)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(12, dt1.a.o), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar5 = cri.a.f;
            k9q0.w(M, a2, cVar5);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                long j = a;
                x2 = on00.f(new Pair("explicit", new r0x(new esa0(j, j, 6), l370.c)));
                M.R(x2);
            }
            Map map = (Map) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new y840(0, wh50Var);
                M.R(x3);
            }
            q630 z3 = sv1.z(xpyVar, (izs) x3);
            int i5 = i4 & 896;
            boolean z4 = i5 == 256;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new oq5(izsVar2, 6);
                M.R(x4);
            }
            q630 c2 = ojc.c(z3, false, null, null, (gzs) x4, 15);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, c2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar5);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            float f2 = 10;
            cVar3 = cVar;
            eg10.a(z3r0.g(cVar.c, cVar.e ? "explicit" : null, M, 0), ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "title"), 0L, a, 0L, 0L, 0, false, map, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 24960, 491496);
            q630 E = ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), "artistTitle");
            String str2 = cVar3.d;
            long j2 = ((q9x) wh50Var.getValue()).a;
            if (androidx.compose.runtime.b.d()) {
                i2 = i4;
                str = str2;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i2 = i4;
                str = str2;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            eg10.b(str, j2, E, l5g.c(14, l5g.d, 0.6f), 0, 0, false, 0, wuv0Var.m0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 3456, 7152);
            M.G();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, aVar2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cVar5);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            cVar4 = cVar2;
            boolean z5 = cVar4.b;
            boolean z6 = (i2 & 14) == 4;
            Object x5 = M.x();
            if (z6 || x5 == c0012a) {
                x5 = new w620(cVar3, 3);
                M.R(x5);
            }
            int i6 = i2 >> 6;
            M = M;
            po0.a(z5, (izs) x5, izsVar, null, z2, M, i5 | (57344 & i6), 8);
            if (z && cVar4.a) {
                M.K(-1306189349);
                parentBottomSheetState2 = parentBottomSheetState;
                uo0.a((i2 >> 3) & 112, 4, M, izsVar, null, parentBottomSheetState2 == ParentBottomSheetState.EXPANDED);
                M = M;
                izsVar2 = izsVar;
            } else {
                izsVar2 = izsVar;
                parentBottomSheetState2 = parentBottomSheetState;
                M.K(-1318507509);
            }
            M.j();
            M.G();
            if (MusicFeatures.AUDIO_MULTI_REACTIONS.h()) {
                M.K(-2092940230);
                Reaction reaction = cVar3.f;
                b((i2 >> 3) & 112, M, reaction != null ? reaction.e : null, izsVar2);
                M.j();
            } else {
                M.K(-2092849152);
                f(izsVar2, M, i6 & 14);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            cVar3 = cVar;
            cVar4 = cVar2;
            parentBottomSheetState2 = parentBottomSheetState;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final gfp0.b.c cVar6 = cVar3;
            final dz40.c cVar7 = cVar4;
            final ParentBottomSheetState parentBottomSheetState3 = parentBottomSheetState2;
            s.d = new wzs() { // from class: xsna.a940
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b940.e(gfp0.b.c.this, cVar7, izsVar2, parentBottomSheetState3, z, q630Var2, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1442974589);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1442974589, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.TrackMenuButton (MusicActionsPanel.kt:315)");
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
            long j = ylu0Var.getBackground().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_player_more, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().c;
            float f = 24;
            q630 q = txj0.q(q630.a.a, 40);
            boolean p = M.p(j);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (p || x == c0012a) {
                x = new idj(j, 1);
                M.R(x);
            }
            q630 E = ahn.E(bu00.e(q, (izs) x), "moreButtonInPlayer");
            boolean y = M.y(view) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new ks2(21, view, izsVar);
                M.R(x2);
            }
            nzu0.c((gzs) x2, a2, N, E, f, j2, false, null, false, null, null, M, 24640, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ny5(izsVar, i, 2);
        }
    }
}
