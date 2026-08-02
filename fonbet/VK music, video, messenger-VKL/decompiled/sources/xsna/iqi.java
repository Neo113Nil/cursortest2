package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.tile.TileContentType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.iev;
import xsna.q630;

/* compiled from: ComposePodcastSliderVh.kt */
/* loaded from: classes16.dex */
public final class iqi {
    public static final void a(ijb0 ijb0Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        azo0 azo0Var;
        androidx.compose.runtime.a M = aVar.M(-1684498651);
        int i2 = (M.J(ijb0Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1684498651, i2, -1, "com.vk.catalog2.feature.music.holders.podcast.PodcastSliderTile (ComposePodcastSliderVh.kt:130)");
            }
            float d = r490.d(R.dimen.music_playlist_slider_image_size, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1189087034, 0, -1, "com.vk.catalog2.feature.music.holders.podcast.rememberBadgePainter (ComposePodcastSliderVh.kt:167)");
            }
            float I0 = ((azl) M.r(uvi.h)).I0(6);
            boolean n = M.n(I0);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (n || x == c0012a) {
                x = new hqi(I0);
                M.R(x);
            }
            hqi hqiVar = (hqi) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x2;
            TileContentType tileContentType = TileContentType.Other;
            ArrayList arrayList = ijb0Var.c;
            boolean z = ijb0Var.e;
            pja0 a = HorizontalListItem$VisualContent.c.a(new ojb0(arrayList, gzsVar, z), M, 0, 6);
            long b = byc0.b(d, d);
            String str = ijb0Var.a;
            String str2 = ijb0Var.b;
            if (ijb0Var.d) {
                M.K(-500578710);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                azo0Var = new azo0(hqiVar, new l5g(ylu0Var.getBackground().b));
                M.j();
            } else {
                M.K(-500399623);
                M.j();
                azo0Var = null;
            }
            aVar2 = M;
            asv0.d(tileContentType, a, b, iev.b.a(str, null, null, null, null, null, str2, null, azo0Var, null, null, null, M, 0, 3774), ojc.b(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 0 : 12, 7), sg50Var, (buw) M.r(cuw.a), false, null, gzsVar, 28), false, false, null, null, null, aVar2, 6, 992);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nz1(ijb0Var, gzsVar, i, 3);
        }
    }
}
