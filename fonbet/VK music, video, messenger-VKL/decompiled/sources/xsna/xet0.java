package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.video.seasons.VideoSeasonsHorizontalVh;

/* compiled from: VideoSeasonsHorizontalVh.kt */
/* loaded from: classes16.dex */
public final class xet0 extends RecyclerView.t {
    public final /* synthetic */ VideoSeasonsHorizontalVh b;

    public xet0(VideoSeasonsHorizontalVh videoSeasonsHorizontalVh) {
        this.b = videoSeasonsHorizontalVh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.b.x += i;
    }
}
