package xsna;

import android.content.Context;
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
import com.vk.clips.editor.templates.impl.di.ClipsTemplatesEditorComponentBase;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.di.event.ImCoroutinesEventObserverComponentImpl;
import com.vk.log.L;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.newsfeed.impl.di.PostingSettingsComponentImpl;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.toggle.features.CoreFeatures;
import com.vk.video.ui.search.filters.api.di.VideoSearchFiltersComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.notifications.incoming.d;
import com.vkontakte.android.VKApplication;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class t03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ t03(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v63, types: [xsna.y6l] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        z = false;
        int i = 2;
        switch (this.b) {
            case 0:
                if (com.vk.toggle.d.L()) {
                    CoreFeatures coreFeatures = CoreFeatures.NETWORK_TRACE_OTEL;
                    coreFeatures.getClass();
                    if (com.vk.toggle.b.A.a(coreFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                zeb c = zdwVar.c();
                if (c != null) {
                    return ((kju0) c).d();
                }
                return null;
            case 2:
                return new s290();
            case 3:
                qcy<Object>[] qcyVarArr = ClipsTemplatesEditorComponentBase.d;
                return Boolean.TRUE;
            case 4:
                return new PostingSettingsComponentImpl.a(new myk());
            case 5:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(AccountPrivacySettingValueDto.class, new AccountPrivacySettingValueDto.Deserializer()).registerTypeAdapter(MessagesConversationBarPayloadDto.class, new MessagesConversationBarPayloadDto.Deserializer()).registerTypeAdapter(AppsMiniappsCatalogItemPayloadDto.class, new AppsMiniappsCatalogItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetActionDto.class, new SuperAppUniversalWidgetActionDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetInternalActionDto.class, new SuperAppUniversalWidgetInternalActionDto.Deserializer()).registerTypeAdapter(AppsCatalogGamesFeedItemDto.class, new AppsCatalogGamesFeedItemDto.Deserializer()).registerTypeAdapter(ExploreWidgetsBaseFooterPayloadDto.class, new ExploreWidgetsBaseFooterPayloadDto.Deserializer()).registerTypeAdapter(AppsConnectPermissionsDto.class, new AppsConnectPermissionsDto.Deserializer()).registerTypeAdapter(WallPostActivityDto.class, new WallPostActivityDto.Deserializer()).registerTypeAdapter(StickersStickerPopupLayerDto.class, new StickersStickerPopupLayerDto.Deserializer()).registerTypeAdapter(WallPlaceOneOfDto.class, new WallPlaceOneOfDto.Deserializer()).registerTypeAdapter(AuthInvalidateExchangeTokenMultiResultDto.class, new AuthInvalidateExchangeTokenMultiResultDto.Deserializer()).registerTypeAdapter(SuperAppWidgetPayloadDto.class, new SuperAppWidgetPayloadDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageBlockDto.class, new SuperAppUniversalWidgetImageBlockDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetImageSubIconDto.class, new SuperAppUniversalWidgetImageSubIconDto.Deserializer()).registerTypeAdapter(SuperAppWidgetDeliveryClubStateDto.class, new SuperAppWidgetDeliveryClubStateDto.Deserializer()).registerTypeAdapter(SuperAppWidgetVkTaxiStateDto.class, new SuperAppWidgetVkTaxiStateDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetFooterDto.class, new SuperAppUniversalWidgetFooterDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowLeftDto.class, new SuperAppUniversalWidgetTypeInformerRowLeftDto.Deserializer()).registerTypeAdapter(SuperAppUniversalWidgetTypeInformerRowRightDto.class, new SuperAppUniversalWidgetTypeInformerRowRightDto.Deserializer()).registerTypeAdapter(SuperAppWidgetHorizontalButtonScrollOneOfDto.class, new SuperAppWidgetHorizontalButtonScrollOneOfDto.Deserializer()).registerTypeAdapter(SuperAppWidgetOnboardingPanelActionDto.class, new SuperAppWidgetOnboardingPanelActionDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseQueueEventDto.class, new SuperAppShowcaseQueueEventDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemPayloadDto.class, new SuperAppShowcaseItemPayloadDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileBackgroundDto.class, new SuperAppShowcaseTileBackgroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseTileForegroundDto.class, new SuperAppShowcaseTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseBadgeDto.class, new SuperAppShowcaseBadgeDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionScrollItemDto.class, new SuperAppShowcaseSectionScrollItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSubscribeTileForegroundDto.class, new SuperAppShowcaseSubscribeTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarketTileForegroundDto.class, new SuperAppShowcaseMarketTileForegroundDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionGridItemDto.class, new SuperAppShowcaseSectionGridItemDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentDto.class, new SuperAppShowcaseHalfTileContentDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseHalfTileContentRegularIconDto.class, new SuperAppShowcaseHalfTileContentRegularIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseSectionVideoBannerBottomDto.class, new SuperAppShowcaseSectionVideoBannerBottomDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuItemIconDto.class, new SuperAppShowcaseServicesMenuItemIconDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseServicesMenuBadgeDto.class, new SuperAppShowcaseServicesMenuBadgeDto.Deserializer()).registerTypeAdapter(AtumAnyViewDto.class, new AtumAnyViewDto.Deserializer()).registerTypeAdapter(AtumAnyActionDto.class, new AtumAnyActionDto.Deserializer()).registerTypeAdapter(AtumVkuiButtonAccessoryDto.class, new AtumVkuiButtonAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiAvatarContentDto.class, new AtumVkuiAvatarContentDto.Deserializer()).registerTypeAdapter(AtumVkuiBadgeContainerBottomRightDto.class, new AtumVkuiBadgeContainerBottomRightDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyImageDto.class, new AtumVkuiAnyImageDto.Deserializer()).registerTypeAdapter(AtumVkuiPictureContentDto.class, new AtumVkuiPictureContentDto.Deserializer()).registerTypeAdapter(AtumVkuiAnyBadgeDto.class, new AtumVkuiAnyBadgeDto.Deserializer()).registerTypeAdapter(AtumVkuiSnackbarAccessoryDto.class, new AtumVkuiSnackbarAccessoryDto.Deserializer()).registerTypeAdapter(AtumVkuiHeaderRightContentDto.class, new AtumVkuiHeaderRightContentDto.Deserializer()).registerTypeAdapter(AtumVkuiRemoteImageViewPlaceholderDto.class, new AtumVkuiRemoteImageViewPlaceholderDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseItemInnerDto.class, new SuperAppShowcaseItemInnerDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseConfigurationDto.class, new SuperAppShowcaseConfigurationDto.Deserializer()).registerTypeAdapter(SuperAppShowcaseMarkBadgeAsClickedDataDto.class, new SuperAppShowcaseMarkBadgeAsClickedDataDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(true)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 6:
                return new kui();
            case 7:
                return rl3.y0(new String[]{a0a.d.concat("/settings?act=transfers"), a0a.d.concat("/settings?act=request_history"), a0a.d.concat("/narrative")});
            case 8:
                return vdw.a;
            case 9:
                return new ImCoroutinesEventObserverComponentImpl.a();
            case 10:
                return gig.a;
            case 11:
                VKApplication.a aVar = VKApplication.c;
                try {
                    OfflineAudioComponent offlineAudioComponent = (OfflineAudioComponent) m7m.e().a(fpf0.a(OfflineAudioComponent.class));
                    k840.a.l = new p7k0(offlineAudioComponent.Ib());
                    offlineAudioComponent.I().o();
                    u2b0 r = ((AudioModelsComponent) m7m.e().a(fpf0.a(AudioModelsComponent.class))).r();
                    s450 s450Var = k840.a.c;
                    if (s450Var == null) {
                        s450Var = null;
                    }
                    s450Var.getClass();
                    r.P0(new q450(), true);
                    c63 c63Var = c63.a;
                    c63.a(new r450(s450Var));
                    r5v0 r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.a.a.b0(n450.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n8r(new p450(r, s450Var), i));
                    s750 s750Var = k840.a.e;
                    if (s750Var == null) {
                        s750Var = null;
                    }
                    k840.a.f = new com.vk.music.player.d(r, s750Var);
                    ?? r2 = k840.d;
                    (r2 != 0 ? r2 : null).getClass();
                    k840.e = new sgl(PlayerService.class);
                    asu0.a.getClass();
                    asu0.o().schedule(new dte0(z ? 1 : 0), 20L, TimeUnit.SECONDS);
                    k840.a.d().b0();
                    return s3q0.a;
                } catch (Throwable th) {
                    ArrayList<String> arrayList = jzw.a;
                    jzw.a.add(ms9.b("Task initMusic failed: ", th));
                    throw th;
                }
            case 12:
                return o25.a().c();
            case 13:
                VideoSearchFiltersComponent.Companion.getClass();
                return VideoSearchFiltersComponent.Companion.a();
            case 14:
                return asu0.c;
            case 15:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                nsw ud = ((VoipCallComponent) ((k7m) m7m.f(cVar)).a(fpf0.a(VoipCallComponent.class))).ud();
                psw e3 = ((VoipCallComponent) ((k7m) m7m.f(cVar)).a(fpf0.a(VoipCallComponent.class))).e3();
                com.vk.voip.ui.c.i1.dispose();
                io.reactivex.rxjava3.internal.operators.observable.m1 m1Var = com.vk.voip.ui.c.u.d;
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                m1Var.getClass();
                com.vk.voip.ui.c.i1 = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(m1Var, qVar, io.reactivex.rxjava3.internal.functions.b.a), null, new ow4(L.a, 12), new pmp0(9));
                com.vk.voip.ui.c.p.getClass();
                Context context = e43.a;
                return new com.vk.voip.ui.notifications.incoming.d(context != null ? context : null).a(new d.a(com.vk.voip.ui.c.s0.c(), new a7p0(8), new qmj0(8), new pdh0(8), ud, e3, new z24(cVar, 7)), com.vk.voip.ui.c.o);
            default:
                return new iit();
        }
    }

    public /* synthetic */ t03(VKApplication vKApplication) {
        this.b = 11;
    }
}
