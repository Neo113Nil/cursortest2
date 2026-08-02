package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vkontakte.android.R;

/* compiled from: ClipsGridBlockVideoContainer.kt */
/* loaded from: classes17.dex */
public final class zbe {
    public final ViewGroup a;
    public final VideoTextureViewAdapter b;

    public zbe(ViewGroup viewGroup, VideoTextureViewAdapter videoTextureViewAdapter) {
        this.a = viewGroup;
        this.b = videoTextureViewAdapter;
        ((FrameLayout) viewGroup.findViewById(R.id.clip_item_video_texture_container)).addView(videoTextureViewAdapter.getView());
    }
}
