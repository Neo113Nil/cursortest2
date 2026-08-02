package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.impl.di.VideoAdvertisementsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import java.util.EnumMap;
import xsna.tav;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class q0s0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ q0s0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = VideoAdvertisementsComponentImpl.g;
                return new EnumMap(VideoAdvertisementsComponent.AdType.class);
            case 1:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                return new s290();
            case 2:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
                videoFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures)) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
                    videoFeatures2.getClass();
                    if (bVar.a(videoFeatures2)) {
                        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NEW_EXTEND_SEEK;
                        videoFeatures3.getClass();
                        if (bVar.a(videoFeatures3)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                return qyk0.a().getDeviceInfo();
            case 4:
                return VkCell.Middle.Size.Companion.serializer();
            case 5:
                return h6v0.a;
            case 6:
                return s3q0.a;
            case 7:
                com.vk.voip.ui.c.b.getClass();
                if (com.vk.voip.ui.c.z0()) {
                    nav navVar = com.vk.voip.ui.c.S;
                    if (navVar == null) {
                        navVar = null;
                    }
                    navVar.a.a(tav.e.a);
                }
                return s3q0.a;
            default:
                if (com.vk.voip.ui.c.v && !epx.f(com.vk.voip.ui.c.d, Boolean.TRUE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
