package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;

/* compiled from: GamesCatalogAchievementsModalBottomSheetView.kt */
/* loaded from: classes17.dex */
public final class m9t extends jmu0 {
    public final n9t h1;
    public final u4e i1;
    public final k5h j1;

    public m9t(n9t n9tVar, u4e u4eVar, k5h k5hVar) {
        this.h1 = n9tVar;
        this.i1 = u4eVar;
        this.j1 = k5hVar;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(811171071);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(811171071, i2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogAchievementsModalBottomSheetView.ThemedContent (GamesCatalogAchievementsModalBottomSheetView.kt:17)");
            }
            Mode mode = Mode.FullScreen;
            fdj0 H = nr2.H(mode, M, 6);
            boolean z = (i2 & 14) == 4 || M.y(this);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pff(this, 26);
                M.R(x);
            }
            aVar2 = M;
            a030.b(mode, (gzs) x, null, H, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(-620185887, new y9a(this, 1), M), aVar2, 805306374, 100663296, 261620);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bh5(this, i, 5);
        }
    }
}
