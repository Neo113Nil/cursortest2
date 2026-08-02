package xsna;

import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistHeaderVh;

/* compiled from: VideoPlaylistHeaderVh.kt */
/* loaded from: classes16.dex */
public final class v4t0 implements NonBouncedAppBarLayout.d {
    public final /* synthetic */ VideoPlaylistHeaderVh a;

    public v4t0(VideoPlaylistHeaderVh videoPlaylistHeaderVh) {
        this.a = videoPlaylistHeaderVh;
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
    public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i) {
        VideoPlaylistHeaderVh videoPlaylistHeaderVh = this.a;
        VideoPlaylistHeaderVh.a(nonBouncedAppBarLayout, videoPlaylistHeaderVh.d(i));
        float f = swe0.f((i / nonBouncedAppBarLayout.getTotalScrollRange()) + 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        videoPlaylistHeaderVh.i = f;
        videoPlaylistHeaderVh.f.d(f);
        videoPlaylistHeaderVh.g.d(videoPlaylistHeaderVh.i);
        if (videoPlaylistHeaderVh.c()) {
            videoPlaylistHeaderVh.j = nonBouncedAppBarLayout.f();
        }
    }
}
