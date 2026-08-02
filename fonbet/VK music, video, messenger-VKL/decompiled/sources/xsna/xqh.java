package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;

/* compiled from: CommunityProfileLiveVideosAdapter.kt */
/* loaded from: classes5.dex */
public final class xqh extends zoj0<VideoFile, reh> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((reh) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z = getItemCount() == 1;
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        return com.vk.libvideo.autoplay.e.g() ? new ieh(viewGroup.getContext(), z) : new wrh(viewGroup.getContext(), z);
    }
}
