package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;

/* compiled from: GamesCatalogWhatInsideModalBottomSheetView.kt */
/* loaded from: classes17.dex */
public final class bft extends jmu0 {
    public final nkx0 h1;
    public final frg i1;
    public final nuj j1;

    public bft(nkx0 nkx0Var, frg frgVar, nuj nujVar) {
        this.h1 = nkx0Var;
        this.i1 = frgVar;
        this.j1 = nujVar;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(230227519);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(230227519, i2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogWhatInsideModalBottomSheetView.ThemedContent (GamesCatalogWhatInsideModalBottomSheetView.kt:17)");
            }
            Mode mode = Mode.FullScreen;
            fdj0 H = nr2.H(mode, M, 6);
            boolean z = (i2 & 14) == 4 || M.y(this);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new x5i(this, 22);
                M.R(x);
            }
            aVar2 = M;
            a030.b(mode, (gzs) x, null, H, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(843348257, new x9a(this, 2), M), aVar2, 805306374, 100663296, 261620);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nq1(this, i, 4);
        }
    }
}
