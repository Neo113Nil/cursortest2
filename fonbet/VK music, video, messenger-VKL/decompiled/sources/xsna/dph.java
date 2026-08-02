package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.ui.VideoHideView;
import xsna.sst0;

/* compiled from: CommunityProfileHiddenVideoItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class dph extends vif0<sst0.b> {
    public final VideoHideView n;

    public dph(ViewGroup viewGroup) {
        super(new VideoHideView(viewGroup.getContext(), null, 0, 14, 0));
        VideoHideView videoHideView = (VideoHideView) this.itemView;
        this.n = videoHideView;
        int a = iah0.a(12);
        int a2 = iah0.a(16);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        pVar.setMargins(a2, a, a2, a);
        videoHideView.setLayoutParams(pVar);
    }

    @Override // xsna.vif0
    public final void i6(sst0.b bVar) {
        this.n.setVideoFile(bVar.a);
    }
}
