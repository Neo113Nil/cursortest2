package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.blacklists.impl.di.ClipsBlacklistsComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.datepicker.impl.di.DatePickerComponentImpl;
import com.vk.folders.impl.di.FoldersComponentImpl;
import com.vk.libvideo.impl.di.VideoApiHelperComponentImpl;
import com.vk.mail.auth.contract.di.MailAuthInternalComponent;
import com.vk.music.analytics.di.MusicAnalyticsComponentImpl;
import com.vk.music.player.core.audioeffect.AudioEffectSettingsComponentImpl;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import xsna.l55;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u35 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ u35(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return ((MailAuthInternalComponent) ((k7m) m7m.f(new l55.d())).a(fpf0.a(MailAuthInternalComponent.class))).L8().a();
            case 1:
                return new ClipsBlacklistsComponentImpl.a();
            case 2:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 3:
                return new eny();
            case 4:
                b = e8r.a.b(r2, PrivateSubdir.SMALL_FILE.h(), true);
                return new l9r(b.a, 10485760L);
            case 5:
                return ((VkHealthPermissionsComponent) ((k7m) m7m.f(new w7m())).a(fpf0.a(VkHealthPermissionsComponent.class))).Wb();
            case 6:
                return (ProfileFragmentProviderComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 7:
                qcy<Object>[] qcyVarArr = MusicAnalyticsComponentImpl.b;
                return new x950();
            case 8:
                return new AudioEffectSettingsComponentImpl.a();
            case 9:
                return com.vk.toggle.d.m.b();
            case 10:
                ow90 ow90Var = ow90.a;
                return new p();
            case 11:
                qcy<Object>[] qcyVarArr2 = PodcastComponentImpl.g;
                return new wjb0();
            case 12:
                VKApplication.a aVar = VKApplication.c;
                return ((NotificationsComponent) m7m.e().a(fpf0.a(NotificationsComponent.class))).b();
            case 13:
                return dhr0.f;
            case 14:
                qcy<Object>[] qcyVarArr3 = VideoApiHelperComponentImpl.b;
                return new com.vk.libvideo.a(new VideoApiHelperComponentImpl.b(1, cdt0.a, cdt0.class, "map", "map(Lcom/vk/api/generated/video/dto/VideoGetResponseDto;)Ljava/util/List;", 0), new VideoApiHelperComponentImpl.c(1, fgj0.a, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0), new VideoApiHelperComponentImpl.d(3, rst0.a, rst0.class, "map", "map(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", 0));
            case 15:
                ComFeatures comFeatures2 = ComFeatures.COM_VIDEO_ON_USER_MAIN_TAB;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 16:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NO_CLIPS_PREVIEW_SEEK_BAR;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 17:
                return new FoldersComponentImpl.a();
            case 18:
                return new DatePickerComponentImpl.a();
            case 19:
                qcy<Object>[] qcyVarArr4 = VoipAnalyticsInternalComponent.b;
                return new srw0(new c3x0());
            case 20:
                Context context = e43.a;
                if (context != null) {
                    return context;
                }
                return null;
            default:
                return ((BridgeComponent) ((k7m) m7m.f(wdx0.b)).a(fpf0.a(BridgeComponent.class))).s();
        }
    }

    public /* synthetic */ u35(VKApplication vKApplication) {
        this.b = 12;
    }
}
