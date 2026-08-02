package xsna;

import android.os.HandlerThread;
import com.google.gson.GsonBuilder;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueDto;
import com.vk.api.generated.apps.dto.AppsCatalogGamesFeedItemDto;
import com.vk.api.generated.apps.dto.AppsConnectPermissionsDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadDto;
import com.vk.api.generated.atum.dto.AtumAnyActionDto;
import com.vk.api.generated.atum.dto.AtumAnyViewDto;
import com.vk.api.generated.atum.dto.AtumVkuiAnyBadgeDto;
import com.vk.api.generated.atum.dto.AtumVkuiAnyImageDto;
import com.vk.api.generated.atum.dto.AtumVkuiAvatarContentDto;
import com.vk.api.generated.atum.dto.AtumVkuiBadgeContainerBottomRightDto;
import com.vk.api.generated.atum.dto.AtumVkuiButtonAccessoryDto;
import com.vk.api.generated.atum.dto.AtumVkuiHeaderRightContentDto;
import com.vk.api.generated.atum.dto.AtumVkuiPictureContentDto;
import com.vk.api.generated.atum.dto.AtumVkuiRemoteImageViewPlaceholderDto;
import com.vk.api.generated.atum.dto.AtumVkuiSnackbarAccessoryDto;
import com.vk.api.generated.auth.dto.AuthInvalidateExchangeTokenMultiResultDto;
import com.vk.api.generated.base.dto.BaseLinkProductCategoryDto;
import com.vk.api.generated.calls.dto.CallsHistoryRecordDto;
import com.vk.api.generated.channels.dto.ChannelsGetPaymentStatusResponseDataDto;
import com.vk.api.generated.core.JsonStringDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseFooterPayloadDto;
import com.vk.api.generated.feedbacks.dto.FeedbacksFeedbackQuestionDto;
import com.vk.api.generated.friends.dto.FriendsRecDescriptionGenericDto;
import com.vk.api.generated.gifts.dto.GiftsGiftCardPromoCodeDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.api.generated.market.dto.MarketModalDto;
import com.vk.api.generated.marusia.dto.MarusiaWidgetOneOfItemDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarPayloadDto;
import com.vk.api.generated.messages.dto.MessagesConversationStyleBackgroundShadeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedCommentsItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediaDiscoverActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.notifications.dto.NotificationsActionDto;
import com.vk.api.generated.notifications.dto.NotificationsActualFriendEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsEntityCommentEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsEntityPollEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationAttachmentBubbleEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationAttachmentDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationDotsMenuItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationImageDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingStatusDto;
import com.vk.api.generated.search.dto.SearchEntityItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFloatingAdMediaDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetSubscriptionsShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireQuestionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireTriggerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRecomFeedItemDto;
import com.vk.api.generated.spaces.dto.SpacesRelatedEntityDto;
import com.vk.api.generated.stickers.dto.StickersStickerPopupLayerDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetFooterDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageSubIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetInternalActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTypeInformerRowLeftDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTypeInformerRowRightDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetDeliveryClubStateDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetHorizontalButtonScrollOneOfDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetOnboardingPanelActionDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetPayloadDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetVkTaxiStateDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseBadgeDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseConfigurationDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileContentDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileContentRegularIconDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemInnerDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemPayloadDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseMarkBadgeAsClickedDataDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseMarketTileForegroundDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseQueueEventDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionGridItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionScrollItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionVideoBannerBottomDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuBadgeDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuItemIconDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSubscribeTileForegroundDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseTileBackgroundDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseTileForegroundDto;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoAlbumObjectsDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto;
import com.vk.api.generated.vkRun.dto.VkRunProductExtraDataDto;
import com.vk.api.generated.vkRun.dto.VkRunTaskExtraDataDto;
import com.vk.api.generated.wall.dto.WallPlaceOneOfDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.friends.recommendations.impl.di.FriendsRecommendationsComponentImpl;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponentImpl;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.music.player.cache.MusicPlayerCacheComponentImpl;
import com.vk.music.player.cache.a;
import com.vk.notifications.di.NotificationsComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUiComponentVkApp;
import java.util.Collections;
import java.util.UUID;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.audioeffects.AudioEffects;
import xsna.jy40;
import xsna.k840;
import xsna.o7p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fn4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        switch (this.b) {
            case 0:
                return new AudioEffects();
            case 1:
                return k840.c.d();
            case 2:
                return new uk7();
            case 3:
                return new oxi0();
            case 4:
                return new qud();
            case 5:
                qcy<Object>[] qcyVarArr = ClipsUploadSdkUiComponentVkApp.c;
                return new aif(qsk0.a);
            case 6:
                return new ngj0();
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                e1j0.a.getClass();
                return Integer.valueOf(e1j0.d);
            case 8:
                L.e("Participants were assigned to rooms");
                return s3q0.a;
            case 9:
                String[] strArr = DebugDevSettingsFragment.t0;
                return null;
            case 10:
                return new Regex("\\(\\?<([a-zA-Z0-9]+)>");
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                qcy<Object>[] qcyVarArr3 = FriendsRecommendationsComponentImpl.b;
                return new dss();
            case 13:
                return new u1r0();
            case 14:
                return new lu();
            case 15:
                return new ffp0();
            case 16:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(AccountPrivacySettingValueDto.class, new AccountPrivacySettingValueDto.Deserializer()).registerTypeAdapter(MessagesConversationBarPayloadDto.class, new MessagesConversationBarPayloadDto.Deserializer()).registerTypeAdapter(AppsMiniappsCatalogItemPayloadDto.class, new AppsMiniappsCatalogItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetActionDto.class, new SuperAppUniversalWidgetActionDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetInternalActionDto.class, new SuperAppUniversalWidgetInternalActionDto.Deserializer()).registerTypeAdapter(AppsCatalogGamesFeedItemDto.class, new AppsCatalogGamesFeedItemDto.Deserializer()).registerTypeAdapter(ExploreWidgetsBaseFooterPayloadDto.class, new ExploreWidgetsBaseFooterPayloadDto.Deserializer()).registerTypeAdapter(AppsConnectPermissionsDto.class, new AppsConnectPermissionsDto.Deserializer()).registerTypeAdapter(WallPostActivityDto.class, new WallPostActivityDto.Deserializer()).registerTypeAdapter(StickersStickerPopupLayerDto.class, new StickersStickerPopupLayerDto.Deserializer()).registerTypeAdapter(WallPlaceOneOfDto.class, new WallPlaceOneOfDto.Deserializer()).registerTypeAdapter(AuthInvalidateExchangeTokenMultiResultDto.class, new AuthInvalidateExchangeTokenMultiResultDto.Deserializer()).registerTypeAdapter(UsersSubscriptionsItemDto.class, new UsersSubscriptionsItemDto.Deserializer()).registerTypeAdapter(VideoOneOfVideoObjectsDto.class, new VideoOneOfVideoObjectsDto.Deserializer()).registerTypeAdapter(GiftsGiftCardPromoCodeDto.class, new GiftsGiftCardPromoCodeDto.Deserializer()).registerTypeAdapter(VideoOneOfVideoAlbumObjectsDto.class, new VideoOneOfVideoAlbumObjectsDto.Deserializer()).registerTypeAdapter(SuperAppWidgetPayloadDto.class, new SuperAppWidgetPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageBlockDto.class, new SuperAppUniversalWidgetImageBlockDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageSubIconDto.class, new SuperAppUniversalWidgetImageSubIconDto.Deserializer()).registerTypeAdapter(SuperAppWidgetDeliveryClubStateDto.class, new SuperAppWidgetDeliveryClubStateDto.Deserializer()).registerTypeAdapter(SuperAppWidgetVkTaxiStateDto.class, new SuperAppWidgetVkTaxiStateDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetFooterDto.class, new SuperAppUniversalWidgetFooterDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowLeftDto.class, new SuperAppUniversalWidgetTypeInformerRowLeftDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowRightDto.class, new SuperAppUniversalWidgetTypeInformerRowRightDto.Deserializer()).registerTypeAdapter(SuperAppWidgetHorizontalButtonScrollOneOfDto.class, new SuperAppWidgetHorizontalButtonScrollOneOfDto.Deserializer()).registerTypeAdapter(SuperAppWidgetOnboardingPanelActionDto.class, new SuperAppWidgetOnboardingPanelActionDto.Deserializer()).registerTypeAdapter(CallsHistoryRecordDto.class, new CallsHistoryRecordDto.Deserializer()).registerTypeAdapter(WallWallItemDto.class, new WallWallItemDto.Deserializer()).registerTypeAdapter(NewsfeedNewsfeedItemDto.class, new NewsfeedNewsfeedItemDto.Deserializer()).registerTypeAdapter(MarketItemLabelActionDto.class, new MarketItemLabelActionDto.Deserializer()).registerTypeAdapter(MarketModalDto.class, new MarketModalDto.Deserializer()).registerTypeAdapter(FriendsRecDescriptionGenericDto.class, new FriendsRecDescriptionGenericDto.Deserializer()).registerTypeAdapter(NewsfeedMediaDiscoverActionDto.class, new NewsfeedMediaDiscoverActionDto.Deserializer()).registerTypeAdapter(SearchEntityItemDto.class, new SearchEntityItemDto.Deserializer()).registerTypeAdapter(FeedbacksFeedbackQuestionDto.class, new FeedbacksFeedbackQuestionDto.Deserializer()).registerTypeAdapter(ChannelsGetPaymentStatusResponseDataDto.class, new ChannelsGetPaymentStatusResponseDataDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseQueueEventDto.class, new SuperAppShowcaseQueueEventDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemPayloadDto.class, new SuperAppShowcaseItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileBackgroundDto.class, new SuperAppShowcaseTileBackgroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileForegroundDto.class, new SuperAppShowcaseTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseBadgeDto.class, new SuperAppShowcaseBadgeDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionScrollItemDto.class, new SuperAppShowcaseSectionScrollItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSubscribeTileForegroundDto.class, new SuperAppShowcaseSubscribeTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarketTileForegroundDto.class, new SuperAppShowcaseMarketTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionGridItemDto.class, new SuperAppShowcaseSectionGridItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentDto.class, new SuperAppShowcaseHalfTileContentDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentRegularIconDto.class, new SuperAppShowcaseHalfTileContentRegularIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionVideoBannerBottomDto.class, new SuperAppShowcaseSectionVideoBannerBottomDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuItemIconDto.class, new SuperAppShowcaseServicesMenuItemIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuBadgeDto.class, new SuperAppShowcaseServicesMenuBadgeDto.Deserializer()).registerTypeAdapter(AtumAnyViewDto.class, new AtumAnyViewDto.Deserializer()).registerTypeAdapter(AtumAnyActionDto.class, new AtumAnyActionDto.Deserializer()).registerTypeAdapter(AtumVkuiButtonAccessoryDto.class, new AtumVkuiButtonAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiAvatarContentDto.class, new AtumVkuiAvatarContentDto.Deserializer()).registerTypeAdapter(AtumVkuiBadgeContainerBottomRightDto.class, new AtumVkuiBadgeContainerBottomRightDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyImageDto.class, new AtumVkuiAnyImageDto.Deserializer()).registerTypeAdapter(AtumVkuiPictureContentDto.class, new AtumVkuiPictureContentDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyBadgeDto.class, new AtumVkuiAnyBadgeDto.Deserializer()).registerTypeAdapter(AtumVkuiSnackbarAccessoryDto.class, new AtumVkuiSnackbarAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiHeaderRightContentDto.class, new AtumVkuiHeaderRightContentDto.Deserializer()).registerTypeAdapter(AtumVkuiRemoteImageViewPlaceholderDto.class, new AtumVkuiRemoteImageViewPlaceholderDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemInnerDto.class, new SuperAppShowcaseItemInnerDto.Deserializer()).registerTypeAdapter(MarusiaWidgetOneOfItemDto.class, new MarusiaWidgetOneOfItemDto.Deserializer()).registerTypeAdapter(MessagesConversationStyleBackgroundShadeDto.class, new MessagesConversationStyleBackgroundShadeDto.Deserializer()).registerTypeAdapter(NewsfeedCommentsItemDto.class, new NewsfeedCommentsItemDto.Deserializer()).registerTypeAdapter(NotificationsNotificationSettingStatusDto.class, new NotificationsNotificationSettingStatusDto.Deserializer()).registerTypeAdapter(NotificationsNotificationImageDto.class, new NotificationsNotificationImageDto.Deserializer()).registerTypeAdapter(NotificationsActionDto.class, new NotificationsActionDto.Deserializer()).registerTypeAdapter(NotificationsEntityDto.class, new NotificationsEntityDto.Deserializer()).registerTypeAdapter(NotificationsEntityPollEntityDto.class, new NotificationsEntityPollEntityDto.Deserializer()).registerTypeAdapter(NotificationsEntityCommentEntityDto.class, new NotificationsEntityCommentEntityDto.Deserializer()).registerTypeAdapter(NotificationsNotificationAttachmentDto.class, new NotificationsNotificationAttachmentDto.Deserializer()).registerTypeAdapter(NotificationsNotificationAttachmentBubbleEntityDto.class, new NotificationsNotificationAttachmentBubbleEntityDto.Deserializer()).registerTypeAdapter(NotificationsActualFriendEntityDto.class, new NotificationsActualFriendEntityDto.Deserializer()).registerTypeAdapter(NotificationsNotificationDotsMenuItemDto.class, new NotificationsNotificationDotsMenuItemDto.Deserializer()).registerTypeAdapter(NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.class, new NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireQuestionDto.class, new ShortVideoQuestionnaireQuestionDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireTriggerDto.class, new ShortVideoQuestionnaireTriggerDto.Deserializer()).registerTypeAdapter(ShortVideoGetGridShortVideosFeedItemDto.class, new ShortVideoGetGridShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoRecomFeedItemDto.class, new ShortVideoRecomFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoFloatingAdMediaDto.class, new ShortVideoFloatingAdMediaDto.Deserializer()).registerTypeAdapter(ShortVideoGetSubscriptionsShortVideosFeedItemDto.class, new ShortVideoGetSubscriptionsShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(SpacesRelatedEntityDto.class, new SpacesRelatedEntityDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseConfigurationDto.class, new SuperAppShowcaseConfigurationDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarkBadgeAsClickedDataDto.class, new SuperAppShowcaseMarkBadgeAsClickedDataDto.Deserializer()).registerTypeAdapter(VkRunProductExtraDataDto.class, new VkRunProductExtraDataDto.Deserializer()).registerTypeAdapter(VkRunTaskExtraDataDto.class, new VkRunTaskExtraDataDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(false)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 17:
                return new Regex("(<u>|</u>)");
            case 18:
                qcy<Object>[] qcyVarArr4 = ImFeatureScopeProviderComponentImpl.b;
                return new z3w();
            case 19:
                return new thx(-1L, null);
            case 20:
                return v9y.b;
            case 21:
                return new mzr0();
            case 22:
                int i = com.vk.clips.sdk.shared.item.market_ads.b.G;
                return Integer.valueOf(R.layout.fullscreen_market_ads_item_controls);
            case 23:
                return UUID.randomUUID();
            case 24:
                qcy<Object>[] qcyVarArr5 = MusicPlayerCacheComponentImpl.d;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i2 = com.vk.toggle.b.A.i(MusicFeatures.AUDIO_PLAYER_BUFFERING);
                if (i2 == null || !i2.a) {
                    obj = iy40.a;
                } else {
                    JSONObject g = i2.g();
                    if (g != null) {
                        obj = new jy40.a(swe0.g(g.optInt("prefetch_tracks_count", 1), 0, 10), swe0.g(g.optInt("cache_size_mb", 50), 50, 1024), swe0.g(g.optInt("first_phase_prefetch_duration_sec", 5), 0, 120), swe0.g(g.optInt("second_phase_prefetch_duration_min", 20), 0, 20));
                    } else {
                        obj = jy40.b.a;
                    }
                }
                if (!(obj instanceof jy40)) {
                    return a.b.a;
                }
                jy40 jy40Var = (jy40) obj;
                return new a.C1333a(jy40Var.b(), jy40Var.a(), jy40Var.e(), jy40Var.c(), 0, 16);
            case 25:
                return Boolean.valueOf(MusicFeatures.AUDIO_FACE_LIFTING_2_ITERATION.h());
            case 26:
                return Collections.singletonList(o7p0.a.b);
            case 27:
                qcy<Object>[] qcyVarArr6 = NotificationsComponentImpl.b;
                return new pq20();
            case 28:
                OfflineCatalogCategories.c cVar = OfflineCatalogCategories.Companion;
                return Boolean.FALSE;
            default:
                return ((HandlerThread) xk80.u0.getValue()).getLooper();
        }
    }
}
