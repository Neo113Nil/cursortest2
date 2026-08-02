package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.GsonBuilder;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.ads.optional.impl.di.OptionalAdsFeatureComponentImpl;
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
import com.vk.clips.external.nps.impl.di.ClipsExternalNpsComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.superapp.analytics.js.bridge.impl.di.JsAnalyticsDelegateComponentImpl;
import com.vk.superapp.permission.js.bridge.impl.di.JsPermissionDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.k840;
import xsna.q0f;
import xsna.vxi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class vv0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vv0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AdsComponentImpl.g;
                return new hu0(0);
            case 1:
                return new float[9];
            case 2:
                s750 s750Var = k840.a.e;
                if (s750Var != null) {
                    return s750Var;
                }
                return null;
            case 3:
                return new rek0(f870.c(1308617531));
            case 4:
                return com.vk.movika.sdk.base.model.n.a(16.0f);
            case 5:
                return Boolean.valueOf(wn80.q);
            case 6:
                return new u2a();
            case 7:
                return s3q0.a;
            case 8:
                int i = ClipFeedListFragment.a2;
                return new q0f(new q0f.a(0), 2);
            case 9:
                return Preference.f("clips_search");
            case 10:
                qcy<Object>[] qcyVarArr2 = ClipsExternalNpsComponentImpl.c;
                return new efq(pn00.n(ipf.a, phd.a));
            case 11:
                return qhp0.a();
            case 12:
                bpn0 bpn0Var = fxc0.a;
                return Boolean.valueOf(((g7s0) (bpn0Var != null ? bpn0Var : null).getValue()).J().n());
            case 13:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                L.A("VoipViewModel", "resetState");
                com.vk.voip.ui.c.C(cVar, null, 0L, false, false, false, null, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                if (oKVoipEngine.w()) {
                    dfs dfsVar = OKVoipEngine.i;
                    if (dfsVar != null) {
                        dfsVar.d(null);
                    }
                    oKVoipEngine.u(null);
                }
                ConversationFactory conversationFactory = OKVoipEngine.x;
                if (conversationFactory != null) {
                    conversationFactory.reset();
                }
                return s3q0.a;
            case 14:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_TAB_REDESIGN;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 15:
                return new vxi.d();
            case 16:
                vxq vxqVar = new vxq();
                vxqVar.b.add(new dyq());
                return vxqVar;
            case 17:
                return new ValueAnimator().getInterpolator();
            case 18:
                return s3q0.a;
            case 19:
                int i2 = GamesCatalogFragment.i0;
                return new w9t();
            case 20:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(AccountPrivacySettingValueDto.class, new AccountPrivacySettingValueDto.Deserializer()).registerTypeAdapter(MessagesConversationBarPayloadDto.class, new MessagesConversationBarPayloadDto.Deserializer()).registerTypeAdapter(AppsMiniappsCatalogItemPayloadDto.class, new AppsMiniappsCatalogItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetActionDto.class, new SuperAppUniversalWidgetActionDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetInternalActionDto.class, new SuperAppUniversalWidgetInternalActionDto.Deserializer()).registerTypeAdapter(AppsCatalogGamesFeedItemDto.class, new AppsCatalogGamesFeedItemDto.Deserializer()).registerTypeAdapter(ExploreWidgetsBaseFooterPayloadDto.class, new ExploreWidgetsBaseFooterPayloadDto.Deserializer()).registerTypeAdapter(AppsConnectPermissionsDto.class, new AppsConnectPermissionsDto.Deserializer()).registerTypeAdapter(WallPostActivityDto.class, new WallPostActivityDto.Deserializer()).registerTypeAdapter(StickersStickerPopupLayerDto.class, new StickersStickerPopupLayerDto.Deserializer()).registerTypeAdapter(WallPlaceOneOfDto.class, new WallPlaceOneOfDto.Deserializer()).registerTypeAdapter(AuthInvalidateExchangeTokenMultiResultDto.class, new AuthInvalidateExchangeTokenMultiResultDto.Deserializer()).registerTypeAdapter(UsersSubscriptionsItemDto.class, new UsersSubscriptionsItemDto.Deserializer()).registerTypeAdapter(VideoOneOfVideoObjectsDto.class, new VideoOneOfVideoObjectsDto.Deserializer()).registerTypeAdapter(GiftsGiftCardPromoCodeDto.class, new GiftsGiftCardPromoCodeDto.Deserializer()).registerTypeAdapter(VideoOneOfVideoAlbumObjectsDto.class, new VideoOneOfVideoAlbumObjectsDto.Deserializer()).registerTypeAdapter(SuperAppWidgetPayloadDto.class, new SuperAppWidgetPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageBlockDto.class, new SuperAppUniversalWidgetImageBlockDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageSubIconDto.class, new SuperAppUniversalWidgetImageSubIconDto.Deserializer()).registerTypeAdapter(SuperAppWidgetDeliveryClubStateDto.class, new SuperAppWidgetDeliveryClubStateDto.Deserializer()).registerTypeAdapter(SuperAppWidgetVkTaxiStateDto.class, new SuperAppWidgetVkTaxiStateDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetFooterDto.class, new SuperAppUniversalWidgetFooterDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowLeftDto.class, new SuperAppUniversalWidgetTypeInformerRowLeftDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowRightDto.class, new SuperAppUniversalWidgetTypeInformerRowRightDto.Deserializer()).registerTypeAdapter(SuperAppWidgetHorizontalButtonScrollOneOfDto.class, new SuperAppWidgetHorizontalButtonScrollOneOfDto.Deserializer()).registerTypeAdapter(SuperAppWidgetOnboardingPanelActionDto.class, new SuperAppWidgetOnboardingPanelActionDto.Deserializer()).registerTypeAdapter(CallsHistoryRecordDto.class, new CallsHistoryRecordDto.Deserializer()).registerTypeAdapter(WallWallItemDto.class, new WallWallItemDto.Deserializer()).registerTypeAdapter(NewsfeedNewsfeedItemDto.class, new NewsfeedNewsfeedItemDto.Deserializer()).registerTypeAdapter(MarketItemLabelActionDto.class, new MarketItemLabelActionDto.Deserializer()).registerTypeAdapter(MarketModalDto.class, new MarketModalDto.Deserializer()).registerTypeAdapter(FriendsRecDescriptionGenericDto.class, new FriendsRecDescriptionGenericDto.Deserializer()).registerTypeAdapter(NewsfeedMediaDiscoverActionDto.class, new NewsfeedMediaDiscoverActionDto.Deserializer()).registerTypeAdapter(SearchEntityItemDto.class, new SearchEntityItemDto.Deserializer()).registerTypeAdapter(FeedbacksFeedbackQuestionDto.class, new FeedbacksFeedbackQuestionDto.Deserializer()).registerTypeAdapter(ChannelsGetPaymentStatusResponseDataDto.class, new ChannelsGetPaymentStatusResponseDataDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseQueueEventDto.class, new SuperAppShowcaseQueueEventDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemPayloadDto.class, new SuperAppShowcaseItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileBackgroundDto.class, new SuperAppShowcaseTileBackgroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileForegroundDto.class, new SuperAppShowcaseTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseBadgeDto.class, new SuperAppShowcaseBadgeDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionScrollItemDto.class, new SuperAppShowcaseSectionScrollItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSubscribeTileForegroundDto.class, new SuperAppShowcaseSubscribeTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarketTileForegroundDto.class, new SuperAppShowcaseMarketTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionGridItemDto.class, new SuperAppShowcaseSectionGridItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentDto.class, new SuperAppShowcaseHalfTileContentDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentRegularIconDto.class, new SuperAppShowcaseHalfTileContentRegularIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionVideoBannerBottomDto.class, new SuperAppShowcaseSectionVideoBannerBottomDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuItemIconDto.class, new SuperAppShowcaseServicesMenuItemIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuBadgeDto.class, new SuperAppShowcaseServicesMenuBadgeDto.Deserializer()).registerTypeAdapter(AtumAnyViewDto.class, new AtumAnyViewDto.Deserializer()).registerTypeAdapter(AtumAnyActionDto.class, new AtumAnyActionDto.Deserializer()).registerTypeAdapter(AtumVkuiButtonAccessoryDto.class, new AtumVkuiButtonAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiAvatarContentDto.class, new AtumVkuiAvatarContentDto.Deserializer()).registerTypeAdapter(AtumVkuiBadgeContainerBottomRightDto.class, new AtumVkuiBadgeContainerBottomRightDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyImageDto.class, new AtumVkuiAnyImageDto.Deserializer()).registerTypeAdapter(AtumVkuiPictureContentDto.class, new AtumVkuiPictureContentDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyBadgeDto.class, new AtumVkuiAnyBadgeDto.Deserializer()).registerTypeAdapter(AtumVkuiSnackbarAccessoryDto.class, new AtumVkuiSnackbarAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiHeaderRightContentDto.class, new AtumVkuiHeaderRightContentDto.Deserializer()).registerTypeAdapter(AtumVkuiRemoteImageViewPlaceholderDto.class, new AtumVkuiRemoteImageViewPlaceholderDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemInnerDto.class, new SuperAppShowcaseItemInnerDto.Deserializer()).registerTypeAdapter(MarusiaWidgetOneOfItemDto.class, new MarusiaWidgetOneOfItemDto.Deserializer()).registerTypeAdapter(MessagesConversationStyleBackgroundShadeDto.class, new MessagesConversationStyleBackgroundShadeDto.Deserializer()).registerTypeAdapter(NewsfeedCommentsItemDto.class, new NewsfeedCommentsItemDto.Deserializer()).registerTypeAdapter(NotificationsNotificationSettingStatusDto.class, new NotificationsNotificationSettingStatusDto.Deserializer()).registerTypeAdapter(NotificationsNotificationImageDto.class, new NotificationsNotificationImageDto.Deserializer()).registerTypeAdapter(NotificationsActionDto.class, new NotificationsActionDto.Deserializer()).registerTypeAdapter(NotificationsEntityDto.class, new NotificationsEntityDto.Deserializer()).registerTypeAdapter(NotificationsEntityPollEntityDto.class, new NotificationsEntityPollEntityDto.Deserializer()).registerTypeAdapter(NotificationsEntityCommentEntityDto.class, new NotificationsEntityCommentEntityDto.Deserializer()).registerTypeAdapter(NotificationsNotificationAttachmentDto.class, new NotificationsNotificationAttachmentDto.Deserializer()).registerTypeAdapter(NotificationsNotificationAttachmentBubbleEntityDto.class, new NotificationsNotificationAttachmentBubbleEntityDto.Deserializer()).registerTypeAdapter(NotificationsActualFriendEntityDto.class, new NotificationsActualFriendEntityDto.Deserializer()).registerTypeAdapter(NotificationsNotificationDotsMenuItemDto.class, new NotificationsNotificationDotsMenuItemDto.Deserializer()).registerTypeAdapter(NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.class, new NotificationsNotificationDotsMenuItemDeleteContentItemEntityDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireQuestionDto.class, new ShortVideoQuestionnaireQuestionDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireTriggerDto.class, new ShortVideoQuestionnaireTriggerDto.Deserializer()).registerTypeAdapter(ShortVideoGetGridShortVideosFeedItemDto.class, new ShortVideoGetGridShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoRecomFeedItemDto.class, new ShortVideoRecomFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoFloatingAdMediaDto.class, new ShortVideoFloatingAdMediaDto.Deserializer()).registerTypeAdapter(ShortVideoGetSubscriptionsShortVideosFeedItemDto.class, new ShortVideoGetSubscriptionsShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(SpacesRelatedEntityDto.class, new SpacesRelatedEntityDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseConfigurationDto.class, new SuperAppShowcaseConfigurationDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarkBadgeAsClickedDataDto.class, new SuperAppShowcaseMarkBadgeAsClickedDataDto.Deserializer()).registerTypeAdapter(VkRunProductExtraDataDto.class, new VkRunProductExtraDataDto.Deserializer()).registerTypeAdapter(VkRunTaskExtraDataDto.class, new VkRunTaskExtraDataDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(true)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 21:
                return new DisplayNameFormatter(null, 3, null);
            case 22:
                qcy<Object>[] qcyVarArr3 = JsAnalyticsDelegateComponentImpl.b;
                return new s1y();
            case 23:
                qcy<Object>[] qcyVarArr4 = JsPermissionDelegateComponentImpl.b;
                return new x5y();
            case 24:
                int i3 = com.vk.clips.sdk.shared.item.market_ads.b.G;
                return Integer.valueOf(R.layout.fullscreen_market_ads_item_controls_redesign);
            case 25:
                return new mw40(0L, 0L, 0L, 0L, 0L, true);
            case 26:
                qcy<Object>[] qcyVarArr5 = OptionalAdsFeatureComponentImpl.e;
                Context context = e43.a;
                if (context != null) {
                    return context;
                }
                return null;
            case 27:
                dhr0.a.getClass();
                return new brj0(1, 0, dhr0.t.b(R.drawable.vk_icon_users_3_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_open_group, null, false, false, null, 0, null, null, null, null, null, 131058);
            case 28:
                return new nhs(new jwx(2, 30));
            default:
                return new Handler(Looper.getMainLooper());
        }
    }

    public /* synthetic */ vv0(Object obj, int i) {
        this.b = i;
    }
}
