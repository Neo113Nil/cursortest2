package xsna;

import android.graphics.drawable.ColorDrawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.GsonBuilder;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.api.generated.base.dto.BaseLinkProductCategoryDto;
import com.vk.api.generated.core.JsonStringDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFloatingAdMediaDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetSubscriptionsShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireQuestionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireTriggerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRecomFeedItemDto;
import com.vk.channelrestrictions.ChannelRestrictionsComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.sdk.api.generated.GsonHolder;
import com.vk.community.strikes.impl.di.CommunityStrikesComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeImage;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.video.playlist.common.di.PlaylistComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUploaderComponentVkApp;
import java.util.HashMap;
import kotlin.text.Regex;
import xsna.bpn0;
import xsna.gzs;
import xsna.i71;
import xsna.r46;
import xsna.s0m0;
import xsna.s3q0;
import xsna.vi0;
import xsna.xv0;
import xsna.zlj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class wv0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wv0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AdsComponentImpl.g;
                return new mg30();
            case 1:
                Serializer.c<BadgeImage> cVar = BadgeImage.CREATOR;
                HashMap hashMap = new HashMap();
                hq.c(26, hashMap, "", 52, "_2x");
                hq.c(78, hashMap, "_3x", 104, "_4x");
                return hashMap;
            case 2:
                return ((MaxUtilityComponent) ((k7m) m7m.f(new r46.c())).mo408a(fpf0.a(MaxUtilityComponent.class))).j7();
            case 3:
                return Boolean.valueOf(MusicFeatures.PODCAST_EPISODE_DOWNLOAD.h());
            case 4:
                return new ChannelRestrictionsComponent() { // from class: com.vk.channelrestrictions.ChannelRestrictionsComponent$Companion$STUB$2$1
                    public final bpn0 a = new bpn0(new xv0(3));
                    public final bpn0 b = new bpn0(new vi0(6));

                    @Override // com.vk.channelrestrictions.ChannelRestrictionsComponent
                    public final zlj ad() {
                        return (b) this.b.getValue();
                    }

                    @Override // com.vk.channelrestrictions.ChannelRestrictionsComponent
                    public final i71 h2() {
                        return (a) this.a.getValue();
                    }

                    /* compiled from: ChannelRestrictionsComponent.kt */
                    public static final class b implements zlj {
                        @Override // xsna.zlj
                        public final void b(FragmentActivity fragmentActivity) {
                        }

                        @Override // xsna.zlj
                        public final void a(FragmentActivity fragmentActivity, WarningReason warningReason, boolean z, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3, WarningNotification warningNotification) {
                        }
                    }

                    /* compiled from: ChannelRestrictionsComponent.kt */
                    public static final class a implements i71 {
                        @Override // xsna.i71
                        public final void a(RestrictionBadge restrictionBadge, FragmentManager fragmentManager) {
                        }
                    }
                };
            case 5:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f(h0f.b)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsUploadSdkUploaderComponentVkApp.g;
                return new mlf();
            case 7:
                return new Regex("^(https?://)?(www\\.)?([a-zA-Z0-9-]+|[а-яА-ЯёЁ0-9-]+)\\.([a-zA-Z]{2,}|[а-яА-ЯёЁ]{2,})(\\.([a-zA-Z]{2,}|[а-яА-ЯёЁ]{2,}))?$");
            case 8:
                return new i1t0(true, bo.h());
            case 9:
                qcy<Object>[] qcyVarArr3 = CommunityStrikesComponentImpl.c;
                return new v2i();
            case 10:
                return new lu();
            case 11:
                return s0m0.a.a;
            case 12:
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                return emq.a(0);
            case 15:
                return new ColorDrawable(-16777216);
            case 16:
                return new lwk();
            case 17:
                return new h5u();
            case 18:
                int i = GoodPreviewFragment.X;
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 19:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireQuestionDto.class, new ShortVideoQuestionnaireQuestionDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireTriggerDto.class, new ShortVideoQuestionnaireTriggerDto.Deserializer()).registerTypeAdapter(ShortVideoGetGridShortVideosFeedItemDto.class, new ShortVideoGetGridShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoRecomFeedItemDto.class, new ShortVideoRecomFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoFloatingAdMediaDto.class, new ShortVideoFloatingAdMediaDto.Deserializer()).registerTypeAdapter(ShortVideoGetSubscriptionsShortVideosFeedItemDto.class, new ShortVideoGetSubscriptionsShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(true)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 20:
                return new eav();
            case 21:
                return Boolean.valueOf(!BuildInfo.m());
            case 22:
                qcy<Object>[] qcyVarArr4 = NewsfeedFragment.J0;
                return Boolean.valueOf(com.vk.toggle.d.Q());
            case 23:
                FeedFeatures feedFeatures = FeedFeatures.FEED_APPLOVIN_PRELOAD_CONFIG;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 24:
                return new a390();
            case 25:
                qcy<Object>[] qcyVarArr5 = PlaylistComponentImpl.b;
                return new pab0();
            case 26:
                hhd0 hhd0Var = znk0.o;
                if (hhd0Var == null) {
                    hhd0Var = null;
                }
                return new gqt(((u6g0) hhd0Var.b).a());
            case 27:
                dhr0.a.getClass();
                return new brj0(2, 0, dhr0.t.b(R.drawable.vk_icon_minus_square_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_unsubscribe, null, false, false, null, 0, null, null, null, null, null, 131058);
            case 28:
                qcy<Object>[] qcyVarArr6 = PostponedPostsFragment.q0;
                return new y3v();
            default:
                return s3q0.a;
        }
    }
}
