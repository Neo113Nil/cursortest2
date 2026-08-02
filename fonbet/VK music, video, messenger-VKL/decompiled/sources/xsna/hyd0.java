package xsna;

import com.vk.libvideo.offline.VideoDownloadService;
import com.vk.libvideo.offline.VideoDownloadServiceV2;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SaFeatures;
import java.lang.annotation.Annotation;
import xsna.aq5;
import xsna.g7v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hyd0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hyd0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                int i = ProfileMainPhotosFragment.F0;
                return new zvw(null);
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                int i2 = StoryAvatarView.G;
                aq5.a.getClass();
                return aq5.a.b;
            case 4:
                return x260.b(com.vk.core.utils.newtork.b.c());
            case 5:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_USER_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 6:
                ComFeatures comFeatures2 = ComFeatures.COM_EASY_PROMOTE;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 7:
                return fxc0.B().J().k1() ? VideoDownloadServiceV2.class : VideoDownloadService.class;
            case 8:
                return Boolean.valueOf(e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_NEW_DISCOUNT));
            case 9:
                return new tub0(fpf0.a(dko.class), new Annotation[0]);
            case 10:
                throw null;
            case 11:
                return e43.l(g7v0.f.b, g7v0.b.b, g7v0.e.b, g7v0.d.b);
            case 12:
                return (nfv0) jfv0.u.getValue();
            default:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_v2_test", false));
        }
    }
}
