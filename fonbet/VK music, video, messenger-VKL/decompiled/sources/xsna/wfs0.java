package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: VideoDiscoveryCatalogScrollSensorDelegate.kt */
/* loaded from: classes7.dex */
public final class wfs0 extends p1u0<vfs0> {

    /* compiled from: VideoDiscoveryCatalogScrollSensorDelegate.kt */
    public interface a {
    }

    /* compiled from: VideoDiscoveryCatalogScrollSensorDelegate.kt */
    public static final class b extends vfz<vfs0> implements a {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(vfs0 vfs0Var) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends vfs0> b(ViewGroup viewGroup) {
        b bVar = new b(bwt0.I(R.layout.video_discovery_catalog_zero_space, viewGroup, false));
        bVar.itemView.setId(R.id.tabs_scroll_sensor);
        return bVar;
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vfs0;
    }
}
