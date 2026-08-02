package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;

/* loaded from: classes12.dex */
public final class eqa extends RecyclerView.g {
    public final /* synthetic */ ChargersStationAboutLocationView a;

    public eqa(ChargersStationAboutLocationView chargersStationAboutLocationView) {
        this.a = chargersStationAboutLocationView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView.e layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int H1 = linearLayoutManager.H1();
            if (H1 == -1) {
                H1 = linearLayoutManager.K1();
            }
            if (H1 != -1) {
                ChargersStationAboutLocationView chargersStationAboutLocationView = this.a;
                i2 = chargersStationAboutLocationView.currentPhotoIndex;
                if (H1 != i2) {
                    chargersStationAboutLocationView.currentPhotoIndex = H1;
                    fss galleryViewerAnalyticsProxy = chargersStationAboutLocationView.getGalleryViewerAnalyticsProxy();
                    if (galleryViewerAnalyticsProxy != null) {
                        i3 = chargersStationAboutLocationView.currentPhotoIndex;
                        galleryViewerAnalyticsProxy.q(i3 + 1);
                    }
                }
            }
        }
    }
}
