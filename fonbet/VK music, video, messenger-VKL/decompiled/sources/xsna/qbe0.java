package xsna;

import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.libvideo.impl.di.WatchLaterComponentImpl;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.profile.presentation.catalog.VideoProfileCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vk.voip.VoipCallActivity;
import com.vkontakte.android.R;
import xsna.r5f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qbe0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qbe0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        OmidManager initialize$lambda$220$lambda$61;
        switch (this.b) {
            case 0:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 1:
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return new y3v();
            case 3:
                return new r5f0.a();
            case 4:
                return new okhttp3.o();
            case 5:
                return s3q0.a;
            case 6:
                initialize$lambda$220$lambda$61 = ServiceProvider.initialize$lambda$220$lambda$61();
                return initialize$lambda$220$lambda$61;
            case 7:
                SettingsFragmentInternalComponent.a aVar = SettingsFragmentInternalComponent.j;
                return new f1t0();
            case 8:
                return s3q0.a;
            case 9:
                int i = VideoMinimizableDiscoveryFragment.p1;
                return s3q0.a;
            case 10:
                int i2 = VideoProfileCatalogFragment.R;
                if (fxc0.B().J().M()) {
                    return new f7t0();
                }
                return null;
            case 11:
                return new fst0();
            case 12:
                return tlo0.Companion.serializer();
            case 13:
                return s3q0.a;
            case 14:
                int i3 = VoipCallActivity.P;
                com.vk.voip.ui.c.b.getClass();
                rah0 rah0Var = com.vk.voip.ui.c.g;
                if (rah0Var == null) {
                    rah0Var = null;
                }
                rah0Var.getClass();
                L.G("ScreenCaptureManagerImpl", "Screen cast permission denied");
                rah0Var.e(null);
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 15:
                qcy<Object>[] qcyVarArr2 = WatchLaterComponentImpl.b;
                return new sbx0();
            default:
                return xq4.c(bay.c().f());
        }
    }
}
