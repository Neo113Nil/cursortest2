package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import xsna.iev;
import xsna.kpv;
import xsna.phw;
import xsna.q630;

/* compiled from: GroupPickerUserItem.kt */
/* loaded from: classes17.dex */
public final class ulu {
    public static final void a(String str, String str2, boolean z, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        iy5 iy5Var;
        androidx.compose.runtime.a M = aVar.M(1122788726);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1122788726, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.views.GroupPickerUserItem (GroupPickerUserItem.kt:27)");
            }
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            q630 b = ojc.b(q630.a.a, (sg50) x, null, false, null, gzsVar, 28);
            phw a = phw.a.a(fwu0.l(str, null, null, null, M, i2 & 14, 62), null, null, null, null, M, 196616, 30);
            androidx.compose.runtime.a aVar2 = M;
            if (z) {
                aVar2.K(-205801338);
                qzu0.a.getClass();
                iy5Var = kpv.a.a(qzu0.q(aVar2), l5g.k, 0L, BadgeAlignment.BottomRight, false, null, null, aVar2, 100687928, 236);
                aVar2 = aVar2;
                aVar2.j();
            } else {
                aVar2.K(-205573054);
                aVar2.j();
                iy5Var = rep.a;
            }
            float f = 0;
            androidx.compose.runtime.a aVar3 = aVar2;
            azu0.b(withPicture, HorizontalListItem$VisualContent.a.a(a, iy5Var, null, 0, aVar2, 0, 28), iev.c.a(str2, null, 2, null, aVar2, (i2 & 112) | 24576, 45), b, new gev(new uco(byc0.b(80, 64)), s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5), new u890(f, f, f, f), 8), aVar3, 6, 0);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wac(i, 2, str, str2, gzsVar, z);
        }
    }
}
