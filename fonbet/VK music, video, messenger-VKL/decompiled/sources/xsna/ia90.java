package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.util.Size;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.auth.personalaccount.VkPersonalAccountActivity;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.List;
import kotlinx.serialization.KSerializer;
import one.video.controls.views.ControlsIcon;
import one.video.controls20.SimpleControlsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ia90 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ia90(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        UniversalRequestTtlValidator initialize$lambda$220$lambda$153;
        switch (this.b) {
            case 0:
                return new ots();
            case 1:
                Context context = e43.a;
                return (AudioManager) (context != null ? context : null).getSystemService("audio");
            case 2:
                return new c6t();
            case 3:
                return ((NewsfeedMappersComponent) ((k7m) m7m.f(iuc0.b)).mo408a(fpf0.a(NewsfeedMappersComponent.class))).B1();
            case 4:
                return new DisplayNameFormatter(null, 3, null);
            case 5:
                return s3q0.a;
            case 6:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_SHOU_ENTITY;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 7:
                initialize$lambda$220$lambda$153 = ServiceProvider.initialize$lambda$220$lambda$153();
                return initialize$lambda$220$lambda$153;
            case 8:
                return new String[]{"about", "rules", "copyUrl", "copyErid", "complain"};
            case 9:
                return new z11();
            case 10:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 11:
                ImFeatures imFeatures = ImFeatures.REDESIGN_DIALOG_LIST_ITEM;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_DISCOVERY_AD_BANNER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return Boolean.valueOf(fxc0.B().J().V0());
            case 14:
                int i = VideoCatalogSearchRootVh.S;
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_TOOLBAR_VH_REDESIGN;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 15:
                bpn0 bpn0Var = VideoOverlayView.I;
                return Integer.valueOf(iah0.a(56));
            case 16:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return new ControlsIcon[]{ControlsIcon.CHROME_CAST, ControlsIcon.SMART_CAST, ControlsIcon.SETTINGS, ControlsIcon.RESIZE, ControlsIcon.FEEDBACK, ControlsIcon.BUGREPORT};
            case 17:
                List<SimpleControlsView.ButtonType> list = sqt0.q0;
                return Boolean.FALSE;
            case 18:
                return new rpj(fpf0.a(Size.class), null, new KSerializer[0]);
            default:
                int i2 = VkPersonalAccountActivity.n;
                return Boolean.valueOf(e370.s != null ? com.vk.toggle.b.A.a(SaFeatures.SA_VALIDATE_IF_PERSONAL_ACCOUNT) : false);
        }
    }
}
