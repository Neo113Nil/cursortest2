package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import one.video.transform.TransformController;

/* compiled from: CommunityProfileNoAutoPlayLiveVideoViewHolder.kt */
/* loaded from: classes5.dex */
public final class wrh extends reh {
    public final h270 D;

    public wrh(Context context, boolean z) {
        super(context, z);
        this.D = new h270(this.y, this.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, this.z, null, 188);
    }

    @Override // xsna.reh
    public final void q6(VideoFile videoFile, com.vk.libvideo.autoplay.a aVar) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(videoFile, null);
        h270 h270Var = this.D;
        h270Var.k(videoFile, e, aVar);
        h270Var.w(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_LIVES_BLOCK));
    }

    @Override // xsna.reh
    public final void s6(FrameLayout frameLayout) {
        VideoTextureView videoTextureView = this.x;
        videoTextureView.getTransformController().f(TransformController.ScaleType.CROP, false);
        videoTextureView.setId(R.id.video_display);
        frameLayout.addView(videoTextureView, -1, -1);
        frameLayout.addView(this.y);
        View view = this.w;
        view.setId(R.id.catalog_video_large_item_overlay);
        f4m.j(view);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = this.A;
        linearLayout.setId(R.id.duration_holder);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = iah0.a(16);
        layoutParams.setMargins(a, a, a, a);
        layoutParams.gravity = 8388659;
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(linearLayout, layoutParams);
        DurationView durationView = this.z;
        durationView.setId(R.id.duration);
        linearLayout.addView(durationView, -2, -2);
    }

    @Override // xsna.reh
    public final uc t6() {
        return this.D;
    }
}
