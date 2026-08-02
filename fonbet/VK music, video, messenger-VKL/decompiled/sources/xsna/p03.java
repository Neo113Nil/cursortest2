package xsna;

import android.os.Build;
import android.text.TextUtils;
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
import com.vk.api.generated.core.JsonStringDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseFooterPayloadDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarPayloadDto;
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
import com.vk.api.generated.wall.dto.WallPlaceOneOfDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateLocation$Guaranteed;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.MarketOrdersInternalComponent;
import com.vk.im.engine.di.event.ImEventPublisherScopedComponentImpl;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.restriction.di.VideoRestrictionManagerComponentImpl;
import com.vk.stat.sak.scheme.FilteredString;
import com.vk.stat.sak.scheme.SchemeStatSak$BaseOkResponse;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.tabbar.core.impl.di.TabbarCoreComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.comments.api.di.VideoCommentsComponent;
import xsna.pzv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class p03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ p03(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return "internal." + "api.".concat(a0a.d);
            case 1:
                return new nh60(((Boolean) DiscoverNewsEntriesRepository.h.getValue()).booleanValue() ? new pvn() : new bqz0(8), new rte0(), new kh60());
            case 2:
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.GIF;
                b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                boolean z = b.b == PrivateFiles.StorageType.EXTERNAL;
                if (z) {
                    z4g.b(privateFiles.b(privateSubdir, PrivateLocation$Guaranteed.INTERNAL_STORAGE, true).a, null);
                }
                return new androidx.media3.datasource.cache.c(b.a, new dzy(z ? 10485760L : 5242880L), null, true);
            case 3:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(AccountPrivacySettingValueDto.class, new AccountPrivacySettingValueDto.Deserializer()).registerTypeAdapter(MessagesConversationBarPayloadDto.class, new MessagesConversationBarPayloadDto.Deserializer()).registerTypeAdapter(AppsMiniappsCatalogItemPayloadDto.class, new AppsMiniappsCatalogItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetActionDto.class, new SuperAppUniversalWidgetActionDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetInternalActionDto.class, new SuperAppUniversalWidgetInternalActionDto.Deserializer()).registerTypeAdapter(AppsCatalogGamesFeedItemDto.class, new AppsCatalogGamesFeedItemDto.Deserializer()).registerTypeAdapter(ExploreWidgetsBaseFooterPayloadDto.class, new ExploreWidgetsBaseFooterPayloadDto.Deserializer()).registerTypeAdapter(AppsConnectPermissionsDto.class, new AppsConnectPermissionsDto.Deserializer()).registerTypeAdapter(WallPostActivityDto.class, new WallPostActivityDto.Deserializer()).registerTypeAdapter(StickersStickerPopupLayerDto.class, new StickersStickerPopupLayerDto.Deserializer()).registerTypeAdapter(WallPlaceOneOfDto.class, new WallPlaceOneOfDto.Deserializer()).registerTypeAdapter(AuthInvalidateExchangeTokenMultiResultDto.class, new AuthInvalidateExchangeTokenMultiResultDto.Deserializer()).registerTypeAdapter(SuperAppWidgetPayloadDto.class, new SuperAppWidgetPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageBlockDto.class, new SuperAppUniversalWidgetImageBlockDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageSubIconDto.class, new SuperAppUniversalWidgetImageSubIconDto.Deserializer()).registerTypeAdapter(SuperAppWidgetDeliveryClubStateDto.class, new SuperAppWidgetDeliveryClubStateDto.Deserializer()).registerTypeAdapter(SuperAppWidgetVkTaxiStateDto.class, new SuperAppWidgetVkTaxiStateDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetFooterDto.class, new SuperAppUniversalWidgetFooterDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowLeftDto.class, new SuperAppUniversalWidgetTypeInformerRowLeftDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowRightDto.class, new SuperAppUniversalWidgetTypeInformerRowRightDto.Deserializer()).registerTypeAdapter(SuperAppWidgetHorizontalButtonScrollOneOfDto.class, new SuperAppWidgetHorizontalButtonScrollOneOfDto.Deserializer()).registerTypeAdapter(SuperAppWidgetOnboardingPanelActionDto.class, new SuperAppWidgetOnboardingPanelActionDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseQueueEventDto.class, new SuperAppShowcaseQueueEventDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemPayloadDto.class, new SuperAppShowcaseItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileBackgroundDto.class, new SuperAppShowcaseTileBackgroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileForegroundDto.class, new SuperAppShowcaseTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseBadgeDto.class, new SuperAppShowcaseBadgeDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionScrollItemDto.class, new SuperAppShowcaseSectionScrollItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSubscribeTileForegroundDto.class, new SuperAppShowcaseSubscribeTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarketTileForegroundDto.class, new SuperAppShowcaseMarketTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionGridItemDto.class, new SuperAppShowcaseSectionGridItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentDto.class, new SuperAppShowcaseHalfTileContentDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentRegularIconDto.class, new SuperAppShowcaseHalfTileContentRegularIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionVideoBannerBottomDto.class, new SuperAppShowcaseSectionVideoBannerBottomDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuItemIconDto.class, new SuperAppShowcaseServicesMenuItemIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuBadgeDto.class, new SuperAppShowcaseServicesMenuBadgeDto.Deserializer()).registerTypeAdapter(AtumAnyViewDto.class, new AtumAnyViewDto.Deserializer()).registerTypeAdapter(AtumAnyActionDto.class, new AtumAnyActionDto.Deserializer()).registerTypeAdapter(AtumVkuiButtonAccessoryDto.class, new AtumVkuiButtonAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiAvatarContentDto.class, new AtumVkuiAvatarContentDto.Deserializer()).registerTypeAdapter(AtumVkuiBadgeContainerBottomRightDto.class, new AtumVkuiBadgeContainerBottomRightDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyImageDto.class, new AtumVkuiAnyImageDto.Deserializer()).registerTypeAdapter(AtumVkuiPictureContentDto.class, new AtumVkuiPictureContentDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyBadgeDto.class, new AtumVkuiAnyBadgeDto.Deserializer()).registerTypeAdapter(AtumVkuiSnackbarAccessoryDto.class, new AtumVkuiSnackbarAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiHeaderRightContentDto.class, new AtumVkuiHeaderRightContentDto.Deserializer()).registerTypeAdapter(AtumVkuiRemoteImageViewPlaceholderDto.class, new AtumVkuiRemoteImageViewPlaceholderDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemInnerDto.class, new SuperAppShowcaseItemInnerDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseConfigurationDto.class, new SuperAppShowcaseConfigurationDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarkBadgeAsClickedDataDto.class, new SuperAppShowcaseMarkBadgeAsClickedDataDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(false)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 4:
                return Boolean.valueOf(!pmr0.a(null));
            case 5:
                pzv.a aVar = pzv.x0;
                String str = "https://internal." + "api.".concat(a0a.d);
                aVar.getClass();
                String b2 = pzv.a.b(str, "ruim");
                return b2 == null ? pzv.a.a() : b2;
            case 6:
                return new ImEventPublisherScopedComponentImpl.a();
            case 7:
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.registerTypeAdapter(SchemeStatSak$BaseOkResponse.class, new SchemeStatSak$BaseOkResponse.Serializer());
                gsonBuilder.registerTypeAdapter(SchemeStatSak$EventScreen.class, new SchemeStatSak$EventScreen.Serializer());
                gsonBuilder.registerTypeAdapter(SchemeStatSak$TypeVkConnectNavigationItem.EventType.class, new SchemeStatSak$TypeVkConnectNavigationItem.EventType.Serializer());
                gsonBuilder.registerTypeAdapter(FilteredString.class, new FilteredString.Serializer());
                gsonBuilder.disableHtmlEscaping();
                return gsonBuilder.create();
            case 8:
                return new MarketOrdersInternalComponent.a(new fz5());
            case 9:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_HIDE_TEXTURE_UNDER_COVER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 10:
                return new VideoCommentsComponent.a();
            case 11:
                return new TabbarCoreComponentImpl.a();
            case 12:
                return new VideoRestrictionManagerComponentImpl.a();
            case 13:
                boolean z2 = false;
                if ((drm0.D(cqm0.n(Build.BRAND), "MEIZU", false) || drm0.D(cqm0.n(Build.MANUFACTURER), "MEIZU", false)) && TextUtils.equals(cqm0.n(Build.MODEL), "M5")) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 14:
                return new wmg0(new wyn0(7));
            case 15:
                return m1u.a("vk-network-knet-okhttp");
            default:
                return new git();
        }
    }
}
