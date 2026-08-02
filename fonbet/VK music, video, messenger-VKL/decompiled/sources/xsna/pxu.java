package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.playlists.playlist_ui.model.PlaylistHeaderIconState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;
import xsna.yre;

/* compiled from: Header.kt */
/* loaded from: classes16.dex */
public final class pxu {

    /* compiled from: Header.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaylistHeaderIconState.values().length];
            try {
                iArr[PlaylistHeaderIconState.More.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaylistHeaderIconState.Share.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final gzs gzsVar, final String str, final String str2, final PlaylistHeaderIconState playlistHeaderIconState, final gzs gzsVar2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        lg90 b;
        com.vk.core.compose.component.topbar.a aVar2;
        androidx.compose.runtime.a M = aVar.M(252871137);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.o(playlistHeaderIconState.ordinal()) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(252871137, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.HeaderRow (Header.kt:93)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            String N = d370.N(R.string.clips_playlists_a11y_close, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new xsq(7);
                M.R(x);
            }
            TopBar$Before.d a2 = TopBar$Before.d.a.a(N, gzsVar, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, ((i2 << 3) & 112) | 24576, 4);
            TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, ((i2 >> 3) & 14) | 196608, 30);
            TopBar$Middle.Text.d a4 = TopBar$Middle.Text.d.a.a(str2, 0, 0, null, null, M, ((i2 >> 6) & 14) | 196608, 30);
            androidx.compose.runtime.a aVar3 = M;
            TopBar$Middle.Text a5 = TopBar$Middle.Text.b.a(a3, a4, null, null, aVar3, 12);
            if (playlistHeaderIconState == PlaylistHeaderIconState.None) {
                aVar3.K(-87745787);
                aVar3.j();
                aVar2 = null;
            } else {
                aVar3.K(-87707533);
                boolean z = playlistHeaderIconState == PlaylistHeaderIconState.More;
                int i3 = (i2 >> 9) & 112;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(374459569, i3, -1, "com.vk.clips.playlists.playlist_ui.ui.trailingIcon (Header.kt:123)");
                }
                if (z) {
                    aVar3.K(-921600961);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
                    }
                    b = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.K(-921599969);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
                    }
                    b = or.b(aVar3, 1878014662, R.drawable.vk_icon_share_outline_28, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                aVar3.j();
                lg90 lg90Var = b;
                Object x2 = aVar3.x();
                if (x2 == c0012a) {
                    x2 = new vsq(7);
                    aVar3.R(x2);
                }
                d.c.C0760d a6 = d.c.C0760d.a.a(lg90Var, d370.N(z ? R.string.clips_playlists_a11y_playlist_actions : R.string.clips_playlists_a11y_playlist_share, 0, aVar3), gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar3, 1572872 | ((i3 << 3) & 896), 24);
                aVar3 = aVar3;
                com.vk.core.compose.component.topbar.a a7 = d.a.a(a6, null, null, null, aVar3, 24576, 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                aVar2 = a7;
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            muv0.h(a5, f, null, null, null, a2, aVar2, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 100663296, 0, 7836);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, playlistHeaderIconState, gzsVar2, q630Var, i) { // from class: xsna.oxu
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ PlaylistHeaderIconState e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196609);
                    pxu.a(gzs.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(yre.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a aVar4;
        int i2;
        String str;
        PlaylistHeaderIconState playlistHeaderIconState;
        String str2;
        PlaylistHeaderIconState playlistHeaderIconState2;
        androidx.compose.runtime.a M = aVar2.M(781398891);
        int i3 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(781398891, i3, -1, "com.vk.clips.playlists.playlist_ui.ui.PlaylistHeader (Header.kt:28)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = aVar instanceof yre.a.C4132a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(-289312481);
                wh50 d2 = jk50.d(((yre.a.C4132a) aVar).h, new s930(), M, 48);
                int i4 = i3 & 112;
                boolean z2 = i4 == 32;
                Object x = M.x();
                if (z2 || x == c0012a2) {
                    x = new nxu(izsVar, 0);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                s930 s930Var = (s930) d2.getValue();
                boolean z3 = i4 == 32;
                Object x2 = M.x();
                if (z3 || x2 == c0012a2) {
                    x2 = new pl9(izsVar, 1);
                    M.R(x2);
                }
                izs izsVar2 = (izs) x2;
                c0012a = c0012a2;
                aVar4 = M;
                i2 = 48;
                wmo.a(gzsVar, s930Var, izsVar2, null, aVar4, 0);
            } else {
                c0012a = c0012a2;
                aVar4 = M;
                i2 = 48;
                aVar4.K(-290709155);
            }
            aVar4.j();
            Context context = (Context) aVar4.r(AndroidCompositionLocals_androidKt.b);
            String str3 = "";
            if (aVar.equals(yre.a.c.a)) {
                aVar4.K(-288785729);
                aVar4.j();
                playlistHeaderIconState2 = PlaylistHeaderIconState.None;
                str2 = "";
            } else {
                if (z) {
                    aVar4.K(-288597001);
                    yre.a.C4132a c4132a = (yre.a.C4132a) aVar;
                    str = (String) jk50.d(c4132a.a, "", aVar4, i2).getValue();
                    yzt0<tlo0> yzt0Var = c4132a.b;
                    tlo0.Companion.getClass();
                    str3 = ((tlo0) jk50.d(yzt0Var, new tlo0.h(""), aVar4, 0).getValue()).a(context).toString();
                    playlistHeaderIconState = (PlaylistHeaderIconState) jk50.d(c4132a.l, PlaylistHeaderIconState.None, aVar4, i2).getValue();
                    aVar4.j();
                } else if (aVar instanceof yre.a.b) {
                    aVar4.K(-288248871);
                    yre.a.b bVar = (yre.a.b) aVar;
                    str = (String) jk50.d(bVar.a, "", aVar4, i2).getValue();
                    yzt0<tlo0> yzt0Var2 = bVar.b;
                    tlo0.Companion.getClass();
                    str3 = ((tlo0) jk50.d(yzt0Var2, new tlo0.h(""), aVar4, 0).getValue()).a(context).toString();
                    playlistHeaderIconState = (PlaylistHeaderIconState) jk50.d(bVar.d, PlaylistHeaderIconState.None, aVar4, i2).getValue();
                    aVar4.j();
                } else {
                    if (!(aVar instanceof yre.a.d)) {
                        throw alb0.c(-286411347, aVar4);
                    }
                    aVar4.K(-287900679);
                    yre.a.d dVar = (yre.a.d) aVar;
                    str = (String) jk50.d(dVar.a, "", aVar4, i2).getValue();
                    yzt0<tlo0> yzt0Var3 = dVar.b;
                    tlo0.Companion.getClass();
                    str3 = ((tlo0) jk50.d(yzt0Var3, new tlo0.h(""), aVar4, 0).getValue()).a(context).toString();
                    playlistHeaderIconState = (PlaylistHeaderIconState) jk50.d(dVar.d, PlaylistHeaderIconState.None, aVar4, i2).getValue();
                    aVar4.j();
                }
                str2 = str;
                playlistHeaderIconState2 = playlistHeaderIconState;
            }
            int i5 = i3 & 112;
            boolean z4 = i5 == 32;
            Object x3 = aVar4.x();
            if (z4 || x3 == c0012a) {
                x3 = new v67(izsVar, 4);
                aVar4.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            boolean o = aVar4.o(playlistHeaderIconState2.ordinal()) | (i5 == 32);
            Object x4 = aVar4.x();
            if (o || x4 == c0012a) {
                x4 = new cm(16, playlistHeaderIconState2, izsVar);
                aVar4.R(x4);
            }
            androidx.compose.runtime.a aVar6 = aVar4;
            a(gzsVar2, str2, str3, playlistHeaderIconState2, (gzs) x4, txj0.f(q630.a.a, 1.0f), aVar6, 196608);
            aVar3 = aVar6;
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
            s.d = new fy7(i, 7, aVar, izsVar, q630Var);
        }
    }
}
