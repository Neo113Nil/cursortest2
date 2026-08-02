package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: VideoDiscoveryCatalogPaddingDelegate.kt */
/* loaded from: classes7.dex */
public final class ofs0 extends p1u0<pfs0> {

    /* compiled from: VideoDiscoveryCatalogPaddingDelegate.kt */
    public interface a {
    }

    /* compiled from: VideoDiscoveryCatalogPaddingDelegate.kt */
    public static final class b extends vfz<pfs0> implements a {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(pfs0 pfs0Var) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends pfs0> b(ViewGroup viewGroup) {
        return new b(bwt0.I(R.layout.video_discovery_catalog_zero_space, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof pfs0;
    }
}
