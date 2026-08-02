package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.wve;

/* compiled from: ClipPlaylistTargetSelector.kt */
/* loaded from: classes16.dex */
public final class w9d {
    public static final void a(final wve.a aVar, final boolean z, final gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        final q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-44135603);
        int i3 = i | (M.J(aVar) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-44135603, i3, -1, "com.vk.clips.playlists.folders.list.ui.CurrentSelectionItem (ClipPlaylistTargetSelector.kt:49)");
            }
            int i4 = !z ? 0 : 180;
            xmk0<Integer> xmk0Var = hg2.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(428074472, 384, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:282)");
            }
            mtk0 c = hg2.c(Integer.valueOf(i4), rte0.f, xmk0Var, null, "dropdown", null, M, 24576, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.c cVar = androidx.compose.foundation.layout.a.e;
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(ojc.c(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar4, 1.0f)), false, null, null, gzsVar, 15), "PlaylistsTargetSelector");
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ldu0.b(phw.a.a(fwu0.l(aVar.c, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), 24, null, null, null, false, null, null, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            f9t.e(txj0.v(aVar4, 8), M, 6);
            String str = aVar.b;
            long j = wlb0.h(M).getText().d;
            frv0 frv0Var = wlb0.l(M).t0;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str, new xpy(1.0f, false), j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663296, 48, 5880);
            f9t.e(hr80.m(txj0.v(aVar4, 4), l5g.j, androidx.compose.ui.graphics.e.a), M, 6);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(-507862468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown16> (VkSdkIcons.kt:744)");
            } else {
                i2 = 0;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_dropdown_16, i2, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = wlb0.h(M).getIcon().c;
            boolean J = M.J(c);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new r9d(c, 0);
                M.R(x);
            }
            vqv.a(a2, null, rdu.a(aVar4, (izs) x), j2, M, 56, 0);
            aVar3 = M;
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(z, gzsVar, q630Var2, i) { // from class: xsna.s9d
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    w9d.a(wve.a.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(ArrayList arrayList, wve.a aVar, boolean z, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a aVar3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(-1544935265);
        if ((i & 6) == 0) {
            i2 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1544935265, i3, -1, "com.vk.clips.playlists.folders.list.ui.SelectionDropdown (ClipPlaylistTargetSelector.kt:92)");
            }
            int i4 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.c;
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(txj0.v(aVar4, i4 - (2 * 32)), "PlaylistsTargetSelectionItems");
            long floatToRawIntBits = (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(40) & 4294967295L);
            boolean z3 = (i3 & 7168) == 2048;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new t9d(izsVar, 0);
                M.R(x);
            }
            aVar3 = M;
            oqu0.b(z2, (gzs) x, E, ty6Var, floatToRawIntBits, null, null, false, null, kai.c(1606263461, new mm8(arrayList, aVar, izsVar, 1), M), aVar3, ((i3 >> 6) & 14) | 27648, 6, 992);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new mw6(arrayList, aVar, z, izsVar, q630Var2, i);
        }
    }

    public static final void c(final wve.a aVar, final boolean z, final gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(2028589584);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2028589584, i2, -1, "com.vk.clips.playlists.folders.list.ui.SelectionItem (ClipPlaylistTargetSelector.kt:125)");
            }
            q630.a aVar4 = q630.a.a;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(ojc.c(aVar4, false, null, null, gzsVar, 15), 32));
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new u9d(z, 0);
                M.R(x);
            }
            q630 E = ahn.E(com.vk.core.compose.component.semantics.b.b(F, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3)), "PlaylistsTargetSelectionItem__" + aVar.b);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ldu0.b(phw.a.a(fwu0.l(aVar.c, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), 24, null, null, null, false, null, null, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            f9t.e(txj0.v(aVar4, 12), M, 6);
            String str = aVar.b;
            long j = wlb0.h(M).getText().d;
            frv0 frv0Var = wlb0.l(M).p1;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str, new xpy(1.0f, true), j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663296, 48, 5880);
            aVar3 = M;
            if (z) {
                aVar3.K(-1813641464);
                q630 q = txj0.q(aVar4, 20);
                qzu0.a.getClass();
                vqv.a(qzu0.s(aVar3), "", q, wlb0.h(aVar3).getIcon().a, aVar3, 440, 0);
            } else {
                aVar3.K(-1819563146);
            }
            aVar3.j();
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(z, gzsVar, q630Var2, i) { // from class: xsna.v9d
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    w9d.c(wve.a.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
