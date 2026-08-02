package xsna;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.fave.di.FaveComponentImpl;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.config.FeedTabsDelayConfig;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.odnoklassniki.registration.b;
import com.vk.sharing.core.picker.PickingImpl;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import java.util.regex.Pattern;
import xsna.bbv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ml7 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ml7(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        VolumeChange initialize$lambda$220$lambda$171;
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return new ColorMatrixColorFilter(colorMatrix);
            case 1:
                return new w8a();
            case 2:
                return Preference.f("clips-subtitles-state");
            case 3:
                qcy<Object>[] qcyVarArr = CommonEditorComponentImpl.h;
                return new v3l0();
            case 4:
                VideoFeatures videoFeatures = VideoFeatures.COMMUNITY_LIVE_BLOCK;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 5:
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                return new i3n();
            case 7:
                qcy<Object>[] qcyVarArr3 = DiscoverSimilarFeedFragment.s0;
                int i = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 8:
                qcy<Object>[] qcyVarArr4 = FaveComponentImpl.e;
                return gnq.a;
            case 9:
                return txq.a(R.drawable.vk_icon_play_24);
            case 10:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 11:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 12:
                int i2 = ItemsDialogWrapper.S;
                return new Handler(Looper.getMainLooper());
            case 13:
                return new r5f0();
            case 14:
                return Pattern.compile("\\[#blur\\|([^|]+)\\|([^]]+)]");
            case 15:
                qcy<Object>[] qcyVarArr5 = MediaPipelineComponentVkApp.d;
                return new ele();
            case 16:
                return new jwx(2, 48);
            case 17:
                return Boolean.FALSE;
            case 18:
                return new FeedTabsDelayConfig(10000L);
            case 19:
                com.vk.voip.ui.a.a.getClass();
                com.vk.voip.ui.a.j();
                return s3q0.a;
            case 20:
                return new b.a.C1444a();
            case 21:
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                return new umk();
            case 22:
                return new uw80();
            case 23:
                return ((NewsFeedComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(NewsFeedComponent.class))).ze();
            case 24:
                return new com.vk.reefton.d();
            case 25:
                return new RectF();
            case 26:
                initialize$lambda$220$lambda$171 = ServiceProvider.initialize$lambda$220$lambda$171();
                return initialize$lambda$220$lambda$171;
            case 27:
                qcy<Object>[] qcyVarArr6 = SharingImEngineComponentImpl.m;
                return new PickingImpl();
            case 28:
                b = e8r.a.b(r2, PrivateSubdir.VK_APPS.h(), true);
                return new l9r(b.a, 41943040L);
            default:
                int i3 = VideoBottomPanelView.Q;
                VideoFeatures videoFeatures2 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
        }
    }

    public /* synthetic */ ml7(txq txqVar) {
        this.b = 9;
    }
}
