package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipsPlaylistSmallFolderItem.kt */
/* loaded from: classes16.dex */
public final class yqe {
    public static final uog0 a = vog0.b(6);

    public static final void a(final gzs gzsVar, final boolean z, final boolean z2, final boolean z3, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar2;
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 a2;
        pco pcoVar;
        androidx.compose.runtime.a M = aVar.M(-1189260214);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1189260214, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.ClipsPlaylistsSmallFolderCreationItem (ClipsPlaylistSmallFolderItem.kt:63)");
            }
            String N = d370.N(R.string.clips_playlist_create, 0, M);
            String str = z ? N : null;
            if (z3) {
                M.K(-417751366);
                qzu0.a.getClass();
                a2 = qzu0.B0(M);
            } else {
                M.K(-417750405);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1972220764, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ListPlusOutline16> (VkIcons.kt:6648)");
                }
                a2 = pg90.a(R.drawable.vk_icon_list_plus_outline_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            if (z3) {
                M.K(-65250957);
                M.j();
                pcoVar = null;
            } else {
                M.K(-417747868);
                float v = hr80.z().v(ButtonSize.Small, M, 6);
                M.j();
                pcoVar = new pco(v);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().j;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = M.J(N);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new wqe(N, 0);
                M.R(x);
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2));
            boolean z4 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new ykd(z2, 1);
                M.R(x2);
            }
            uog0 uog0Var = a;
            aVar2 = M;
            bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Secondary, ButtonAppearance.Neutral, rdu.a(b, (izs) x2), uog0Var, false, false, a2, new l5g(j), pcoVar, str, null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | 1073941936, 0, 0, 4186560);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xqe
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yqe.a(gzs.this, z, z2, z3, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(708694420);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(708694420, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.ClipsPlaylistsSmallFolderItem (ClipsPlaylistSmallFolderItem.kt:41)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-74086416, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ListPlayOutline16> (VkIcons.kt:6634)");
            }
            lg90 b = or.b(M, 504947697, R.drawable.vk_icon_list_play_outline_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float v = hr80.z().v(ButtonSize.Small, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().j;
            int i3 = i2;
            int i4 = i3 << 6;
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Secondary, ButtonAppearance.Neutral, q630Var, a, false, false, b, new l5g(j), new pco(v), str, null, null, null, null, false, null, null, null, aVar2, ((i3 >> 3) & 14) | 200112 | (57344 & i4) | 1073741824, i4 & 896, 0, 4186560);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xrc(i, 1, str, gzsVar, q630Var);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(19668696);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(19668696, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.ClipsPlaylistsSmallFolderItemSkeleton (ClipsPlaylistSmallFolderItem.kt:93)");
            }
            float f = 8;
            q630 E = s200.E(q630Var, f, 4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().x;
            uog0 uog0Var = vog0.a;
            q630.a aVar3 = q630.a.a;
            ja8.a(txj0.q(hr80.m(aVar3, j, uog0Var), 16), M, 0);
            f9t.e(txj0.v(aVar3, 6), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(txj0.s(s200.D(hr80.m(aVar3, ylu0Var2.getBackground().x, vog0.b(3)), 2), 73, f), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fw9(q630Var, i, 1);
        }
    }
}
