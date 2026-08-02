package xsna;

import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.im.converters.ImVideoConverter;
import com.vk.media.ext.VideoEncoderSettings;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.player.analytics.impl.tracker.di.PlayerAnalyticsComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import xsna.oz50;
import xsna.ph20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class eu2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ eu2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        zqk0 zqk0Var;
        xdw0 b;
        switch (this.b) {
            case 0:
                return e43.l(SakFeatures.Type.FEATURE_TEST_ANONYMOUS_TOGGLE, SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH, SakFeatures.Type.FEATURE_STRONG_PASSWORD, SakFeatures.Type.FEATURE_VKC_SMARTFLOW_METHODS_CACHE, SakFeatures.Type.FEATURE_SIGN_ANONYMOUS_TOKEN, SakFeatures.Type.FEATURE_VKC_LIBVERIFY_CALLIN_AUTH, SakFeatures.Type.FEATURE_VKC_LIBVERIFY_CALLIN_REG, SakFeatures.Type.FEATURE_VKC_AVAILABLE_OAUTH_LIST, SakFeatures.Type.FEATURE_CORE_COMPANION_DEVICE_ID, SakFeatures.Type.FEATURE_CORE_STAT_FLUSH_ON_CLEAR, SakFeatures.Type.FEATURE_CHOOSE_HOST, SakFeatures.Type.CORE_SWITCH_VK_RU_DOMAIN_ANON, SakFeatures.Type.INVITE_LINKS, SakFeatures.Type.LOGOUT_DEBOUNCE, SakFeatures.Type.FEATURE_VKM_SESSION_MANAGEMENT, SakFeatures.Type.VKC_CREATE_ACCOUNT, SakFeatures.Type.FEATURE_VKM_MULTI_ACCOUNT, SakFeatures.Type.FEATURE_VKM_MULTI_ACCOUNT_BETA, SakFeatures.Type.VKC_LIBVERIFY_SESSION, SakFeatures.Type.VKC_SDK_SESSION_MANAGEMENT, SakFeatures.Type.VKC_LIBVERIFY_CONF_CHANGE, SakFeatures.Type.VKC_HITMAN_CAPTCHA_ANDROID, SakFeatures.Type.VKC_BACKUP_SENDING, SakFeatures.Type.USERS_STORE_ONLY_CACHE, SakFeatures.Type.VKC_LIBVERIFY_FACTORS_KZ, SakFeatures.Type.VKC_PHONE_HINT_IM, SakFeatures.Type.VKC_PHONE_HINT_INNER, SakFeatures.Type.VOIP_JOIN_TO_CALL_BY_PASSWORD_ANON, SakFeatures.Type.VKC_PHONE_REUSE_AUTH, SakFeatures.Type.FEATURE_NETWORK_REPORT_CONFIG, SakFeatures.Type.NEW_GEOBLOCK_ERROR, SakFeatures.Type.VIDEO_FB_INIT_TYPE, SakFeatures.Type.VKC_RESTORE_TO_VK_ID_HOST, SakFeatures.Type.SAK_SEAMLESS_FLOW, SakFeatures.Type.SAK_PASSWORD_AUTO_COMPLETE_ANDROID, SakFeatures.Type.SAK_EMAIL_ACTUALIZATION, SakFeatures.Type.SAK_MAIL_PROMO_MAX, SakFeatures.Type.VKC_ONEPASS_PROMO, SakFeatures.Type.AUDIO_VIDEO_TRACK_ADD, SakFeatures.Type.AUDIO_VIDEO_CARD_TRACK_NOTE, SakFeatures.Type.AUDIO_VIDEO_RELATED_TRACKS, SakFeatures.Type.SAK_SBER_ID_CLOUD, SakFeatures.Type.SAK_LIBVERIFY_AB_SUFFIX, SakFeatures.Type.VIDEO_FIX_MINIPLAYER_HEADSET, SakFeatures.Type.SAK_MAX_AUTH_TIMER_ANDROID, SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID, SakFeatures.Type.SAK_QR_WITH_CODE, SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET, SakFeatures.Type.SAK_MESSENGER_SKIP_SMS_ANDROID, SakFeatures.Type.SAK_MIGRATION_ACCOUNT_GET_INFO, SakFeatures.Type.SAK_DEF_CLIENT_INSTALL_ANDROID, SakFeatures.Type.SAK_HELP_BUTTON_ANDROID, SakFeatures.Type.SA_INIT_DATING_TRACER, SakFeatures.Type.SA_SHOW_PERMISSION_ON_START, SakFeatures.Type.SA_SPINOFF_ONBOARDING_DISABLED, SakFeatures.Type.SAK_COROUTINES_MIGRATION, SakFeatures.Type.CORE_REMOVE_EXTRA_STICKERS_UPDATE);
            case 1:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.f());
            case 2:
                return new ClipsViewerComponentImpl.a();
            case 3:
                return new mir(rhr.e, (vjr) rhr.a.getValue());
            case 4:
                rsr rsrVar = oz50.k;
                oz50.b.d();
                return MainActivity.class;
            case 5:
                return ((VideoAppStabilityComponent) m7m.e().a(fpf0.a(VideoAppStabilityComponent.class))).G7();
            case 6:
                VideoEncoderSettings videoEncoderSettings = VideoEncoderSettings.d;
                return new ImVideoConverter(VideoEncoderSettings.b.a(), new bu0(18), new ph20.b(com.vk.stories.b.a));
            case 7:
                return s3q0.a;
            case 8:
                return new PlayerAnalyticsComponentImpl.a();
            case 9:
                return new bk3();
            case 10:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return new kn4(8);
            case 11:
                FeedFeatures feedFeatures = FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_CLICK_ZONE_FIX;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                j490 j490Var = OKVoipEngine.m;
                if (j490Var != null) {
                    j490Var.b();
                }
                return s3q0.a;
            case 13:
                return new hxh();
            case 14:
                VKApplication.a aVar = VKApplication.c;
                return Boolean.valueOf(BuildInfo.e());
            case 15:
                return new pnf(Boolean.TRUE.booleanValue());
            case 16:
                return new SuperAppServicesComponentImpl.a();
            case 17:
                return new NewsFeedComponentImpl.a();
            case 18:
                com.vk.voip.ui.c.b.getClass();
                boolean z = true;
                if (!com.vk.voip.ui.c.J().h() && ((zqk0Var = com.vk.voip.ui.c.P) == null || (b = zqk0Var.b()) == null || !b.c())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f(gex0.b)).a(fpf0.a(VkClientMultiAccountComponent.class))).Vc();
        }
    }
}
