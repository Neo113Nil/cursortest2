package xsna;

import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.toggle.features.VideoFeatures;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cem0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cem0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ssl0();
            case 1:
                return k840.a.g().b();
            case 2:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_FIRST_SCREEN_VISIBLE_IMAGES_METRIC;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 3:
                int i = VideoToolbarView.M;
                return Boolean.valueOf(fxc0.B().J().X1());
            case 4:
                return (qfv0) jfv0.s.getValue();
            default:
                return k840.a.g().b();
        }
    }
}
