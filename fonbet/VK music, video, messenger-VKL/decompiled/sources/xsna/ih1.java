package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photos.root.albumdetails.presentation.c;

/* compiled from: AlbumDetailsMviView.kt */
/* loaded from: classes4.dex */
public final class ih1 extends RecyclerView.t {
    public final /* synthetic */ com.vk.photos.root.albumdetails.presentation.c b;

    public ih1(com.vk.photos.root.albumdetails.presentation.c cVar) {
        this.b = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        com.vk.photos.root.albumdetails.presentation.c cVar = this.b;
        cVar.e();
        if (i == 0) {
            int i2 = cVar.C;
            float d = cVar.d(ywu.class, new pt(3));
            RecyclerView.o layoutManager = cVar.j.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                c.a aVar = new c.a(cVar.b);
                if (i2 > 0) {
                    boolean z = true;
                    if (!cVar.D ? d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : cVar.d(af1.class, new ot(2)) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z = false;
                    }
                    if (d != 1.0f && z) {
                        aVar.setTargetPosition(2);
                        linearLayoutManager.startSmoothScroll(aVar);
                    }
                } else if (i2 < 0 && d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    aVar.setTargetPosition(0);
                    linearLayoutManager.startSmoothScroll(aVar);
                }
            }
            cVar.C = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        com.vk.photos.root.albumdetails.presentation.c cVar = this.b;
        cVar.e();
        cVar.C += i2;
    }
}
