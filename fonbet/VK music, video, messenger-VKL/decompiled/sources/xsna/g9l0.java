package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.stickers.di.StickersComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import java.lang.annotation.Annotation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g9l0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g9l0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = StickersComponentImpl.e;
                return new x2l0();
            case 1:
                return ((StickersComponent) ((k7m) m7m.f(o0m0.b)).a(fpf0.a(StickersComponent.class))).bc();
            case 2:
                return new StringBuilder();
            case 3:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_IN_PIP;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 4:
                int i = VideoCatalogRootVh.M0;
                return Boolean.FALSE;
            case 5:
                return new abs0();
            case 6:
                if (BuildInfo.q()) {
                    VideoFeatures videoFeatures2 = VideoFeatures.UPDATE_CONSTRAINTS_OPTIMIZATIONS;
                    videoFeatures2.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                return Preference.f("vk_notifications_onboarding_prefs");
            case 8:
                return new tub0(fpf0.a(VkCell.f.class), new Annotation[0]);
            case 9:
                iyk0 iyk0Var = rrv0.a;
                return Boolean.FALSE;
            default:
                return new c41();
        }
    }
}
