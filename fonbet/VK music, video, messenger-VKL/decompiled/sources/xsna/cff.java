package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import xsna.ucp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ cff(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new z9e(context);
            case 1:
                ucp ucpVar = ucp.a;
                ucp.b bVar = ucp.r;
                return bVar == null ? Preference.h(context, 0, "emoji") : bVar.provide();
            case 2:
                VideoOverlayView videoOverlayView = new VideoOverlayView(context, null, null, 14);
                videoOverlayView.Z4(new i1t0(true, bo.h()), new VideoOverlayView.c.b(context.getString(R.string.video_gif_overlay), Integer.valueOf(R.drawable.vk_icon_error_outline_56), Integer.valueOf(R.color.vk_black)));
                return videoOverlayView;
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return context.getString(R.string.video_downloaded_title);
        }
    }
}
