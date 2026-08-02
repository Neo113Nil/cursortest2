package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.CancelType;
import com.yandex.delivery.mapper.model.Font;
import com.yandex.delivery.mapper.model.LocalIconName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;
import ru.yandex.taxi.logistics.sdk.dashboard.core.SectionDomainStyle;
import ru.yandex.taxi.logistics.sdk.dashboard.model.widget.SpacerModel;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.state.CouponSize;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ConfirmationWindowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.StoragePeriodOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionEditOrderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenChatDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionPerformerCallDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CommunicationMethodDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MessengerParametersDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancelinfo.Responses$DeliveryCancelInfoResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryeditoptions.Responses$DeliveryOptionsResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.CancelInfoActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardChooseProfileResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardContentResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.MissionResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.AIChatDynamicTextItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentOptionsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.StickyWidgetAIChatDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.StickyWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.StickyWidgetReferenceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ChooseProfileScreenActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ExistingProfileDescriptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ExistingProfileDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ProfileCreationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ProfileDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ProfileSelectionSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.AddressButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.AdsBannerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.AdsBannerSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.BannerCarouselDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.CollapseButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.DiscountCouponDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.DiscountCouponTrailItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.HeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.HeaderSubtitleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.HeaderTrailElementDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.MainHeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.MainHeaderV2Dto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.MiddleElementDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.PromoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.ScrollableRowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.ScrollableRowTileDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SpacerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SpannableGridDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SpannableGridTileDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.StyledTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TrailAddressButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TrailButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TrailElementDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.UrbanAdsSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.WidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionDescriptionBlockDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionDescriptionItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressBlockDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.AiSmartCameraDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.ArBoxesSmartCameraDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.ArSmartCameraBoxSizeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormDefaultsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormDescriptorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormModalViewDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormOverrideDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.MapObjectsDescriptorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.ModalViewOverCameraDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.ModalViewOverMapDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.ModalViewPopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.OfferDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.RoutePointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.SendEventPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.SmartCameraTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.V2FormResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.PartialAddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormEventTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointsIntervalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers.FormLayoutModifierDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers.FormLayoutModifierReplaceWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers.FormOverrideModifierDescriptorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions.DeliveryResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.LottieAnimationDto;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class mw7 implements kwj0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mw7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [u3b1] */
    /* JADX WARN: Type inference failed for: r20v2 */
    private final Object b(Object obj) {
        sq4 sq4Var;
        qfc qfcVar;
        qfc qfcVar2;
        DeliveryResponseDto.BannersDto bannersDto;
        Iterator it;
        v4v v4vVar;
        uq4 uq4Var;
        v4v v4vVar2;
        wq4 wq4Var;
        v4v lvi0Var;
        qfc qfcVar3;
        btf0 btf0Var = (btf0) this.b;
        btf0Var.getClass();
        DeliveryResponseDto.BannersDto banners = ((DeliveryResponseDto) obj).getBanners();
        if (banners == null) {
            return new zrf0(EmptyList.a, false);
        }
        List<BannerDto> bannerList = banners.getBannerList();
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(bannerList, 10));
        Iterator it2 = bannerList.iterator();
        while (it2.hasNext()) {
            BannerDto bannerDto = (BannerDto) it2.next();
            String id = bannerDto.getId();
            int duration = bannerDto.getDuration();
            BannerDto.ActionDto action = bannerDto.getAction();
            if (action == null) {
                sq4Var = null;
            } else if (action instanceof BannerDto.ActionDto.Action_DeeplinkActionDto) {
                sq4Var = new qq4(((BannerDto.ActionDto.Action_DeeplinkActionDto) action).b.getDeeplink());
            } else {
                if (!(action instanceof BannerDto.ActionDto.Unknown_ActionDto)) {
                    w511.b();
                    return null;
                }
                sq4Var = rq4.a;
            }
            BannerDto.LayoutDto layout = bannerDto.getLayout();
            vdc vdcVar = btf0Var.b;
            String title = layout.getTitle();
            String subtitle = layout.getSubtitle();
            ColorDto titleColor = layout.getTitleColor();
            if (titleColor != null) {
                vdcVar.getClass();
                qfcVar = vdc.a(titleColor);
            } else {
                qfcVar = null;
            }
            ColorDto subtitleColor = layout.getSubtitleColor();
            if (subtitleColor != null) {
                vdcVar.getClass();
                qfcVar2 = vdc.a(subtitleColor);
            } else {
                qfcVar2 = null;
            }
            BannerDto.LayoutDto.AdvertisementTagDto advertisementTag = layout.getAdvertisementTag();
            if (advertisementTag != null) {
                v4vVar = null;
                String text = advertisementTag.getText();
                ColorDto textColor = advertisementTag.getTextColor();
                if (textColor != null) {
                    vdcVar.getClass();
                    qfcVar3 = vdc.a(textColor);
                } else {
                    qfcVar3 = null;
                }
                ColorDto backgroundColor = advertisementTag.getBackgroundColor();
                vdcVar.getClass();
                qfc a = vdc.a(backgroundColor);
                List<BannerDto.LayoutDto.AdvertisementTagDto.InfoDto> info = advertisementTag.getInfo();
                bannersDto = banners;
                it = it2;
                ArrayList arrayList2 = new ArrayList(tcc.n(info, i));
                for (Iterator it3 = info.iterator(); it3.hasNext(); it3 = it3) {
                    BannerDto.LayoutDto.AdvertisementTagDto.InfoDto infoDto = (BannerDto.LayoutDto.AdvertisementTagDto.InfoDto) it3.next();
                    arrayList2.add(new tq4(infoDto.getTitle(), infoDto.getSubtitle()));
                }
                uq4Var = new uq4(text, qfcVar3, a, arrayList2);
            } else {
                bannersDto = banners;
                it = it2;
                v4vVar = null;
                uq4Var = null;
            }
            BannerDto.LayoutDto.TrailIconDto trailIcon = layout.getTrailIcon();
            if (trailIcon != null) {
                la01 la01Var = btf0Var.c;
                la01Var.getClass();
                if (trailIcon instanceof BannerDto.LayoutDto.TrailIconDto.TrailIcon_LottieAnimationDto) {
                    LottieAnimationDto.SourceDto source = ((BannerDto.LayoutDto.TrailIconDto.TrailIcon_LottieAnimationDto) trailIcon).b.getSource();
                    if (source instanceof LottieAnimationDto.SourceDto.Source_RemoteDto) {
                        lvi0Var = new uvi0(((LottieAnimationDto.SourceDto.Source_RemoteDto) source).b.getUrl());
                        v4vVar2 = lvi0Var;
                    } else {
                        if (!(source instanceof LottieAnimationDto.SourceDto.Source_LocalDto) && !(source instanceof LottieAnimationDto.SourceDto.Unknown_SourceDto)) {
                            w511.b();
                            return v4vVar;
                        }
                        lvi0Var = v4vVar;
                        v4vVar2 = lvi0Var;
                    }
                } else {
                    if (trailIcon instanceof BannerDto.LayoutDto.TrailIconDto.TrailIcon_StaticImageDto) {
                        String imageTag = ((BannerDto.LayoutDto.TrailIconDto.TrailIcon_StaticImageDto) trailIcon).b.getImageTag();
                        if (imageTag != null) {
                            lvi0Var = new lvi0(la01Var.a.a(imageTag), null, null, null, null, 62);
                            v4vVar2 = lvi0Var;
                        }
                    } else if (!(trailIcon instanceof BannerDto.LayoutDto.TrailIconDto.Unknown_TrailIconDto)) {
                        w511.b();
                        return v4vVar;
                    }
                    lvi0Var = v4vVar;
                    v4vVar2 = lvi0Var;
                }
            } else {
                v4vVar2 = v4vVar;
            }
            BackgroundDto background = layout.getBackground();
            vq4 vq4Var = new vq4(title, subtitle, qfcVar, qfcVar2, uq4Var, v4vVar2, background != null ? btf0Var.a.b(background) : v4vVar);
            BannerDto.ShowPolicyDto showPolicy = bannerDto.getShowPolicy();
            if (showPolicy == null) {
                wq4Var = new wq4(0);
            } else {
                Integer maxShowCount = showPolicy.getMaxShowCount();
                int intValue = maxShowCount != null ? maxShowCount.intValue() : Integer.MAX_VALUE;
                Integer maxWidgetUsageCount = showPolicy.getMaxWidgetUsageCount();
                int intValue2 = maxWidgetUsageCount != null ? maxWidgetUsageCount.intValue() : Integer.MAX_VALUE;
                Integer maxDailyShowCount = showPolicy.getMaxDailyShowCount();
                wq4Var = new wq4(intValue, intValue2, maxDailyShowCount != null ? maxDailyShowCount.intValue() : Integer.MAX_VALUE);
            }
            arrayList.add(new xq4(id, duration, sq4Var, vq4Var, wq4Var));
            banners = bannersDto;
            it2 = it;
            i = 10;
        }
        return new zrf0(arrayList, banners.getAutoscrollEnabled());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0dba  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object[], s151[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
    @Override // defpackage.kwj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        CancelType cancelType;
        nr nrVar;
        int i;
        Iterator it;
        Object obj2;
        ExistingProfileDto existingProfileDto;
        rdf0 rdf0Var;
        hhg hhgVar;
        hhg ghgVar;
        qfc qfcVar;
        afu0 afu0Var;
        FormattedText formattedText;
        ArrayList arrayList;
        SectionDomainStyle sectionDomainStyle;
        DashboardContentResponseDto dashboardContentResponseDto;
        Iterator it2;
        SectionDto sectionDto;
        Object obj3;
        uc1 uc1Var;
        Object qc1Var;
        CouponSize couponSize;
        qfc qfcVar2;
        qfc qfcVar3;
        r0b1 r0b1Var;
        ArrayList arrayList2;
        r0b1 r0b1Var2;
        uq0 uq0Var;
        ArrayList arrayList3;
        rry0 rry0Var;
        lrb1 lrb1Var;
        qfc qfcVar4;
        qfc qfcVar5;
        awo awoVar;
        Responses$DeliveryOptionsResponseDto.DeliveryOptionsDto deliveryOptions;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        FormOverrideDto formOverrideDto;
        ArrayList arrayList7;
        ThemeStyle themeStyle;
        poq0 poq0Var;
        l4s l4sVar;
        ArrayList arrayList8;
        v4s v4sVar;
        FormEventType formEventType;
        Iterator it3;
        Iterator it4;
        FormOverrideDto formOverrideDto2;
        h5s e5sVar;
        xys0 xys0Var;
        xys0 uys0Var;
        ip00 ip00Var;
        ArrayList arrayList9;
        Iterator it5;
        FormOverrideDto formOverrideDto3;
        sbv sbvVar;
        w4v w4vVar;
        int i2 = this.a;
        ?? r4 = EmptyList.a;
        int i3 = 10;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                Responses$DeliveryCancelInfoResponseDto responses$DeliveryCancelInfoResponseDto = (Responses$DeliveryCancelInfoResponseDto) obj;
                ywh ywhVar = (ywh) obj4;
                int i4 = xwh.a[responses$DeliveryCancelInfoResponseDto.getCancelType().ordinal()];
                if (i4 == 1) {
                    cancelType = CancelType.FREE;
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    cancelType = CancelType.PAID;
                }
                CancelType cancelType2 = cancelType;
                AttributedTextDto title = responses$DeliveryCancelInfoResponseDto.getTitle();
                FormattedText b = title != null ? gd3.b(title) : null;
                AttributedTextDto subtitle = responses$DeliveryCancelInfoResponseDto.getSubtitle();
                FormattedText b2 = subtitle != null ? gd3.b(subtitle) : null;
                List<CancelInfoActionDto> contentActions = responses$DeliveryCancelInfoResponseDto.getContentActions();
                List<CancelInfoActionDto> list = r4;
                if (contentActions != null) {
                    list = contentActions;
                }
                ow owVar = ywhVar.a;
                ArrayList arrayList10 = new ArrayList();
                for (CancelInfoActionDto cancelInfoActionDto : list) {
                    if (cancelInfoActionDto instanceof CancelInfoActionDto.CancelInfoAction_EditOrderDto) {
                        ActionEditOrderDto actionEditOrderDto = ((CancelInfoActionDto.CancelInfoAction_EditOrderDto) cancelInfoActionDto).b;
                        nrVar = new rn(actionEditOrderDto.getTitle(), actionEditOrderDto.getBadgeText(), actionEditOrderDto.getImageTag());
                    } else if (cancelInfoActionDto instanceof CancelInfoActionDto.CancelInfoAction_OpenChatDto) {
                        ActionOpenChatDto actionOpenChatDto = ((CancelInfoActionDto.CancelInfoAction_OpenChatDto) cancelInfoActionDto).b;
                        String title2 = actionOpenChatDto.getTitle();
                        String imageTag = actionOpenChatDto.getImageTag();
                        a320 a320Var = (a320) owVar.e.get();
                        MessengerParametersDto messengerParams = actionOpenChatDto.getMessengerParams();
                        a320Var.getClass();
                        nrVar = new un(title2, a320.a(messengerParams), imageTag, actionOpenChatDto.getMetricaLabel());
                    } else if (cancelInfoActionDto instanceof CancelInfoActionDto.CancelInfoAction_OpenFormDto) {
                        nrVar = ow.a(((CancelInfoActionDto.CancelInfoAction_OpenFormDto) cancelInfoActionDto).b);
                    } else if (cancelInfoActionDto instanceof CancelInfoActionDto.CancelInfoAction_PerformerCallDto) {
                        ActionPerformerCallDto actionPerformerCallDto = ((CancelInfoActionDto.CancelInfoAction_PerformerCallDto) cancelInfoActionDto).b;
                        String title3 = actionPerformerCallDto.getTitle();
                        rsc rscVar = owVar.b;
                        CommunicationMethodDto communicationMethod = actionPerformerCallDto.getCommunicationMethod();
                        rscVar.getClass();
                        nrVar = new zn(title3, rsc.a(communicationMethod), actionPerformerCallDto.getMetricaLabel());
                    } else {
                        if (!(cancelInfoActionDto instanceof CancelInfoActionDto.Unknown_CancelInfoActionDto)) {
                            w511.b();
                            return null;
                        }
                        nrVar = null;
                    }
                    if (nrVar != null) {
                        arrayList10.add(nrVar);
                    }
                }
                FormattedText b3 = gd3.b(responses$DeliveryCancelInfoResponseDto.getCancelButton().getTitle());
                AttributedTextDto price = responses$DeliveryCancelInfoResponseDto.getCancelButton().getPrice();
                return new bxh(cancelType2, b, b2, arrayList10, new zwh(b3, price != null ? gd3.b(price) : null), new axh(gd3.b(responses$DeliveryCancelInfoResponseDto.getDismissButton().getTitle())));
            case 1:
                DashboardChooseProfileResponseDto dashboardChooseProfileResponseDto = (DashboardChooseProfileResponseDto) obj;
                bsb bsbVar = (bsb) obj4;
                v0q0 v0q0Var = new v0q0(Collections.singletonList(new xxi(dashboardChooseProfileResponseDto.getTitle(), dashboardChooseProfileResponseDto.getDescription())));
                List<ProfileSelectionSectionDto> sections = dashboardChooseProfileResponseDto.getSections();
                ArrayList arrayList11 = new ArrayList();
                Iterator it6 = sections.iterator();
                while (it6.hasNext()) {
                    ProfileSelectionSectionDto profileSelectionSectionDto = (ProfileSelectionSectionDto) it6.next();
                    int i5 = 0;
                    List singletonList = Collections.singletonList(new zau(new pau(new rry0(profileSelectionSectionDto.getTitle(), Font.HEADER, i5, 12), (w4v) null, 6), null, false, null, null));
                    List<ProfileDto> profiles = profileSelectionSectionDto.getProfiles();
                    ArrayList arrayList12 = new ArrayList();
                    int i6 = 0;
                    for (Object obj5 : profiles) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            scc.m();
                            throw null;
                        }
                        ProfileDto profileDto = (ProfileDto) obj5;
                        int i8 = i6 == scc.f(profileSelectionSectionDto.getProfiles()) ? 1 : i5;
                        if (profileDto instanceof ProfileDto.Profile_ExistingProfileDto) {
                            ExistingProfileDto existingProfileDto2 = ((ProfileDto.Profile_ExistingProfileDto) profileDto).b;
                            String title4 = existingProfileDto2.getTitle();
                            ExistingProfileDescriptionDto description = existingProfileDto2.getDescription();
                            if (description != null) {
                                String text = description.getText();
                                ColorDto textColor = description.getTextColor();
                                if (textColor != null) {
                                    String colorDay = textColor.getColorDay();
                                    String colorNight = textColor.getColorNight();
                                    Double alphaDay = textColor.getAlphaDay();
                                    i = i5;
                                    existingProfileDto = existingProfileDto2;
                                    Float valueOf = alphaDay != null ? Float.valueOf((float) alphaDay.doubleValue()) : null;
                                    Double alphaNight = textColor.getAlphaNight();
                                    qfcVar = new qfc(colorDay, colorNight, null, valueOf, alphaNight != null ? Float.valueOf((float) alphaNight.doubleValue()) : null);
                                } else {
                                    i = i5;
                                    existingProfileDto = existingProfileDto2;
                                    qfcVar = null;
                                }
                                rdf0Var = new rdf0(text, qfcVar);
                            } else {
                                i = i5;
                                existingProfileDto = existingProfileDto2;
                                rdf0Var = null;
                            }
                            IconDto icon = existingProfileDto.getIcon();
                            w4v a = icon != null ? bsbVar.a.a(icon) : null;
                            String corpClientId = existingProfileDto.getCorpClientId();
                            boolean isEnabled = existingProfileDto.isEnabled();
                            ChooseProfileScreenActionDto action = existingProfileDto.getAction();
                            String corpClientId2 = existingProfileDto.getCorpClientId();
                            if (action instanceof ChooseProfileScreenActionDto.ChooseProfileScreenAction_SwitchProfileActionDto) {
                                hhgVar = new ehg(corpClientId2);
                            } else if (action instanceof ChooseProfileScreenActionDto.ChooseProfileScreenAction_WebViewActionDto) {
                                ghgVar = new ghg(((ChooseProfileScreenActionDto.ChooseProfileScreenAction_WebViewActionDto) action).b.getUrl());
                                PaymentOptionsDto paymentOptions = existingProfileDto.getPaymentOptions();
                                it = it6;
                                obj2 = new sdf0(title4, rdf0Var, a, corpClientId, ghgVar, isEnabled, paymentOptions == null ? kfa0.a(paymentOptions) : null);
                                SpacerModel spacerModel = obj2 != null ? new SpacerModel(i8 != 0 ? SpacerModel.Size.XL : SpacerModel.Size.S, false, null, null, 14) : null;
                                ?? r0 = new s151[2];
                                r0[i] = obj2;
                                r0[1] = spacerModel;
                                ycc.r(j73.A(r0), arrayList12);
                                i5 = i;
                                it6 = it;
                                i6 = i7;
                            } else {
                                if (!(action instanceof ChooseProfileScreenActionDto.Unknown_ChooseProfileScreenActionDto)) {
                                    w511.b();
                                    return null;
                                }
                                hhgVar = xgg.a;
                            }
                            ghgVar = hhgVar;
                            PaymentOptionsDto paymentOptions2 = existingProfileDto.getPaymentOptions();
                            it = it6;
                            obj2 = new sdf0(title4, rdf0Var, a, corpClientId, ghgVar, isEnabled, paymentOptions2 == null ? kfa0.a(paymentOptions2) : null);
                            if (obj2 != null) {
                            }
                            ?? r02 = new s151[2];
                            r02[i] = obj2;
                            r02[1] = spacerModel;
                            ycc.r(j73.A(r02), arrayList12);
                            i5 = i;
                            it6 = it;
                            i6 = i7;
                        } else {
                            i = i5;
                            if (profileDto instanceof ProfileDto.Profile_ProfileCreationDto) {
                                ProfileCreationDto profileCreationDto = ((ProfileDto.Profile_ProfileCreationDto) profileDto).b;
                                ButtonDto button = profileCreationDto.getButton();
                                String title5 = button.getTitle();
                                String url = button.getUrl();
                                it = it6;
                                obj2 = new qdf0(profileCreationDto.getTitle(), new k17(title5, url), new ghg(url), profileCreationDto.getEnabled());
                            } else {
                                it = it6;
                                if (!(profileDto instanceof ProfileDto.Unknown_ProfileDto)) {
                                    w511.b();
                                    return null;
                                }
                                obj2 = null;
                            }
                            if (obj2 != null) {
                            }
                            ?? r022 = new s151[2];
                            r022[i] = obj2;
                            r022[1] = spacerModel;
                            ycc.r(j73.A(r022), arrayList12);
                            i5 = i;
                            it6 = it;
                            i6 = i7;
                        }
                    }
                    ycc.r(a.m0(arrayList12, singletonList), arrayList11);
                    it6 = it6;
                }
                return new oig(scc.g(v0q0Var, new v0q0(arrayList11)), r4, null, null);
            case 2:
                DashboardContentResponseDto dashboardContentResponseDto2 = (DashboardContentResponseDto) obj;
                j5i j5iVar = (j5i) obj4;
                jhg jhgVar = j5iVar.b;
                m4v m4vVar = j5iVar.a;
                List<SectionDto> sections2 = dashboardContentResponseDto2.getSections();
                int i9 = 10;
                ArrayList arrayList13 = new ArrayList(tcc.n(sections2, 10));
                Iterator it7 = sections2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        DashboardContentResponseDto dashboardContentResponseDto3 = dashboardContentResponseDto2;
                        List<StickyWidgetDto> stickyWidgets = dashboardContentResponseDto3.getStickyWidgets();
                        if (stickyWidgets != null) {
                            List<StickyWidgetDto> list2 = stickyWidgets;
                            r4 = new ArrayList(tcc.n(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                StickyWidgetReferenceDto widget = ((StickyWidgetDto) it8.next()).getWidget();
                                if (widget instanceof StickyWidgetReferenceDto.StickyWidgetReference_AiChatDto) {
                                    StickyWidgetAIChatDto stickyWidgetAIChatDto = ((StickyWidgetReferenceDto.StickyWidgetReference_AiChatDto) widget).b;
                                    gd3 gd3Var = j5iVar.f;
                                    AttributedTextDto text2 = stickyWidgetAIChatDto.getText();
                                    if (text2 != null) {
                                        gd3Var.getClass();
                                        formattedText = gd3.b(text2);
                                    } else {
                                        formattedText = null;
                                    }
                                    List<AIChatDynamicTextItemDto> dynamicText = stickyWidgetAIChatDto.getDynamicText();
                                    if (dynamicText != null) {
                                        List<AIChatDynamicTextItemDto> list3 = dynamicText;
                                        ArrayList arrayList14 = new ArrayList(tcc.n(list3, 10));
                                        for (AIChatDynamicTextItemDto aIChatDynamicTextItemDto : list3) {
                                            int displayTimeMs = aIChatDynamicTextItemDto.getDisplayTimeMs();
                                            AttributedTextDto dynamicText2 = aIChatDynamicTextItemDto.getDynamicText();
                                            gd3Var.getClass();
                                            arrayList14.add(new o(displayTimeMs, gd3.b(dynamicText2)));
                                        }
                                        arrayList = arrayList14;
                                    } else {
                                        arrayList = null;
                                    }
                                    hhg a2 = jhgVar.a(stickyWidgetAIChatDto.getAction());
                                    IconDto leadImage = stickyWidgetAIChatDto.getLeadImage();
                                    w4v a3 = leadImage != null ? m4vVar.a(leadImage) : null;
                                    IconDto trailImage = stickyWidgetAIChatDto.getTrailImage();
                                    afu0Var = new nn1(formattedText, arrayList, a2, a3, trailImage != null ? m4vVar.a(trailImage) : null, stickyWidgetAIChatDto.getMetricaLabel(), stickyWidgetAIChatDto.getMeta());
                                } else if (widget instanceof StickyWidgetReferenceDto.Unknown_StickyWidgetReferenceDto) {
                                    afu0Var = o501.c;
                                } else {
                                    w511.b();
                                }
                                r4.add(new yeu0(afu0Var));
                            }
                        }
                        return new oig(arrayList13, r4, dashboardContentResponseDto3.getMeta(), dashboardContentResponseDto3.getMetricaLabel());
                    }
                    SectionDto sectionDto2 = (SectionDto) it7.next();
                    List<WidgetDto> widgets = sectionDto2.getWidgets();
                    ArrayList arrayList15 = new ArrayList(tcc.n(widgets, i9));
                    Iterator it9 = widgets.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            WidgetDto widgetDto = (WidgetDto) it9.next();
                            bh4 bh4Var = j5iVar.d;
                            vdc vdcVar = j5iVar.c;
                            if (widgetDto instanceof WidgetDto.Widget_HeaderDto) {
                                HeaderDto headerDto = ((WidgetDto.Widget_HeaderDto) widgetDto).b;
                                String leadText = headerDto.getLeadText();
                                StyledTextDto styledLeadText = headerDto.getStyledLeadText();
                                StyledTextDto leadSubtitle = headerDto.getLeadSubtitle();
                                IconDto leadIcon = headerDto.getLeadIcon();
                                if (styledLeadText != null) {
                                    rry0Var = j5iVar.b(styledLeadText);
                                    dashboardContentResponseDto = dashboardContentResponseDto2;
                                    it2 = it7;
                                    sectionDto = sectionDto2;
                                } else {
                                    dashboardContentResponseDto = dashboardContentResponseDto2;
                                    it2 = it7;
                                    sectionDto = sectionDto2;
                                    rry0Var = new rry0(leadText, Font.MEDIUM, 20, 8);
                                }
                                pau pauVar = new pau(rry0Var, leadSubtitle != null ? j5iVar.b(leadSubtitle) : null, leadIcon != null ? m4vVar.a(leadIcon) : null);
                                IconDto trailIcon = headerDto.getTrailIcon();
                                ActionDto trailAction = headerDto.getTrailAction();
                                HeaderTrailElementDto trailElement = headerDto.getTrailElement();
                                if (trailIcon != null && trailAction != null) {
                                    lrb1Var = new i4v(jhgVar.a(trailAction), m4vVar.a(trailIcon));
                                } else if (trailElement instanceof HeaderTrailElementDto.HeaderTrailElement_ButtonDto) {
                                    TrailButtonDto trailButtonDto = ((HeaderTrailElementDto.HeaderTrailElement_ButtonDto) trailElement).b;
                                    String text3 = trailButtonDto.getText();
                                    hhg a4 = jhgVar.a(trailButtonDto.getAction());
                                    ColorDto textColor2 = trailButtonDto.getTextColor();
                                    if (textColor2 != null) {
                                        vdcVar.getClass();
                                        qfcVar4 = vdc.a(textColor2);
                                    } else {
                                        qfcVar4 = null;
                                    }
                                    ColorDto color = trailButtonDto.getColor();
                                    if (color != null) {
                                        vdcVar.getClass();
                                        qfcVar5 = vdc.a(color);
                                    } else {
                                        qfcVar5 = null;
                                    }
                                    lrb1Var = new z901(text3, a4, qfcVar4, qfcVar5, trailButtonDto.getMeta(), trailButtonDto.getMetricaLabel());
                                } else if (trailElement instanceof HeaderTrailElementDto.HeaderTrailElement_CollapseButtonDto) {
                                    CollapseButtonDto collapseButtonDto = ((HeaderTrailElementDto.HeaderTrailElement_CollapseButtonDto) trailElement).b;
                                    lrb1Var = new zac(collapseButtonDto.getCollapseTitle(), collapseButtonDto.getExpandTitle(), collapseButtonDto.getTargetId());
                                } else {
                                    lrb1Var = null;
                                }
                                obj3 = new zau(pauVar, lrb1Var != null ? new ocu(lrb1Var, 2) : null, headerDto.getShowWhenSectionCollapsed(), headerDto.getMeta(), headerDto.getMetricaLabel());
                            } else {
                                dashboardContentResponseDto = dashboardContentResponseDto2;
                                it2 = it7;
                                sectionDto = sectionDto2;
                                if (widgetDto instanceof WidgetDto.Widget_MainHeaderDto) {
                                    MainHeaderDto mainHeaderDto = ((WidgetDto.Widget_MainHeaderDto) widgetDto).b;
                                    pau f = j5iVar.f(mainHeaderDto.getLeadText(), mainHeaderDto.getStyledLeadText(), mainHeaderDto.getLeadIcon());
                                    AddressButtonDto addressButton = mainHeaderDto.getAddressButton();
                                    if (addressButton != null) {
                                        String text4 = addressButton.getText();
                                        hhg a5 = jhgVar.a(addressButton.getAction());
                                        TrailAddressButtonDto trailButton = addressButton.getTrailButton();
                                        uq0Var = new uq0(text4, a5, trailButton != null ? new y901(jhgVar.a(trailButton.getAction()), trailButton.getMetricaLabel(), trailButton.getMeta()) : null, addressButton.getShowWhenSectionCollapsed(), addressButton.getMeta(), addressButton.getMetricaLabel());
                                    } else {
                                        uq0Var = null;
                                    }
                                    TrailElementDto trailElement2 = mainHeaderDto.getTrailElement();
                                    lrb1 e = trailElement2 != null ? j5iVar.e(trailElement2) : null;
                                    Object meta = mainHeaderDto.getMeta();
                                    String metricaLabel = mainHeaderDto.getMetricaLabel();
                                    List<MiddleElementDto> middleElements = mainHeaderDto.getMiddleElements();
                                    if (middleElements != null) {
                                        ArrayList arrayList16 = new ArrayList();
                                        Iterator it10 = middleElements.iterator();
                                        while (it10.hasNext()) {
                                            qqn a6 = j5i.a((MiddleElementDto) it10.next());
                                            if (a6 != null) {
                                                arrayList16.add(a6);
                                            }
                                        }
                                        arrayList3 = arrayList16;
                                    } else {
                                        arrayList3 = null;
                                    }
                                    obj3 = new i500(f, e, arrayList3, uq0Var, null, mainHeaderDto.getShowWhenSectionCollapsed(), meta, metricaLabel, 16);
                                } else {
                                    if (widgetDto instanceof WidgetDto.Widget_MainHeaderV2Dto) {
                                        MainHeaderV2Dto mainHeaderV2Dto = ((WidgetDto.Widget_MainHeaderV2Dto) widgetDto).b;
                                        pau f2 = j5iVar.f(mainHeaderV2Dto.getLeadText(), mainHeaderV2Dto.getStyledLeadText(), mainHeaderV2Dto.getLeadIcon());
                                        HeaderSubtitleDto subtitle2 = mainHeaderV2Dto.getSubtitle();
                                        if (subtitle2 != null) {
                                            if (subtitle2 instanceof HeaderSubtitleDto.HeaderSubtitle_AddressDto) {
                                                r0b1Var2 = ccu.a;
                                            } else if (subtitle2 instanceof HeaderSubtitleDto.Unknown_HeaderSubtitleDto) {
                                                r0b1Var2 = dcu.a;
                                            } else {
                                                w511.b();
                                            }
                                            r0b1Var = r0b1Var2;
                                        } else {
                                            r0b1Var = null;
                                        }
                                        TrailElementDto trailElement3 = mainHeaderV2Dto.getTrailElement();
                                        lrb1 e2 = trailElement3 != null ? j5iVar.e(trailElement3) : null;
                                        Object meta2 = mainHeaderV2Dto.getMeta();
                                        String metricaLabel2 = mainHeaderV2Dto.getMetricaLabel();
                                        List<MiddleElementDto> middleElements2 = mainHeaderV2Dto.getMiddleElements();
                                        if (middleElements2 != null) {
                                            ArrayList arrayList17 = new ArrayList();
                                            Iterator it11 = middleElements2.iterator();
                                            while (it11.hasNext()) {
                                                qqn a7 = j5i.a((MiddleElementDto) it11.next());
                                                if (a7 != null) {
                                                    arrayList17.add(a7);
                                                }
                                            }
                                            arrayList2 = arrayList17;
                                        } else {
                                            arrayList2 = null;
                                        }
                                        obj3 = new i500(f2, e2, arrayList2, null, r0b1Var, mainHeaderV2Dto.getShowWhenSectionCollapsed(), meta2, metricaLabel2, 8);
                                    } else if (widgetDto instanceof WidgetDto.Widget_PromoDto) {
                                        PromoDto promoDto = ((WidgetDto.Widget_PromoDto) widgetDto).b;
                                        rry0 b4 = j5iVar.b(promoDto.getTitle());
                                        StyledTextDto subtitle3 = promoDto.getSubtitle();
                                        rry0 b5 = subtitle3 != null ? j5iVar.b(subtitle3) : null;
                                        ColorDto textColor3 = promoDto.getTextColor();
                                        if (textColor3 != null) {
                                            vdcVar.getClass();
                                            qfcVar2 = vdc.a(textColor3);
                                        } else {
                                            qfcVar2 = null;
                                        }
                                        ColorDto subtitleColor = promoDto.getSubtitleColor();
                                        if (subtitleColor != null) {
                                            vdcVar.getClass();
                                            qfcVar3 = vdc.a(subtitleColor);
                                        } else {
                                            qfcVar3 = null;
                                        }
                                        BackgroundDto background = promoDto.getBackground();
                                        u3b1 b6 = background != null ? bh4Var.b(background) : null;
                                        hhg a8 = jhgVar.a(promoDto.getAction());
                                        IconDto leadIcon2 = promoDto.getLeadIcon();
                                        w4v a9 = leadIcon2 != null ? m4vVar.a(leadIcon2) : null;
                                        TrailElementDto trailElement4 = promoDto.getTrailElement();
                                        qc1Var = new iof0(b4, b5, qfcVar2, qfcVar3, a8, promoDto.getNew(), a9, trailElement4 != null ? j5iVar.e(trailElement4) : null, b6, promoDto.getShowWhenSectionCollapsed(), promoDto.getMeta(), promoDto.getMetricaLabel());
                                    } else if (widgetDto instanceof WidgetDto.Widget_ScrollableRowDto) {
                                        ScrollableRowDto scrollableRowDto = ((WidgetDto.Widget_ScrollableRowDto) widgetDto).b;
                                        List<ScrollableRowTileDto> tiles = scrollableRowDto.getTiles();
                                        ArrayList arrayList18 = new ArrayList(tcc.n(tiles, 10));
                                        for (ScrollableRowTileDto scrollableRowTileDto : tiles) {
                                            arrayList18.add(new skp0(j5iVar.c(scrollableRowTileDto.getTile()), scrollableRowTileDto.getWidth(), scrollableRowTileDto.getHeight()));
                                        }
                                        obj3 = new pkp0(arrayList18, scrollableRowDto.getColumns(), scrollableRowDto.getShowWhenSectionCollapsed(), scrollableRowDto.getMeta(), scrollableRowDto.getMetricaLabel());
                                    } else if (widgetDto instanceof WidgetDto.Widget_SpacerDto) {
                                        SpacerDto spacerDto = ((WidgetDto.Widget_SpacerDto) widgetDto).b;
                                        obj3 = new SpacerModel(null, spacerDto.getShowWhenSectionCollapsed(), spacerDto.getMeta(), spacerDto.getMetricaLabel(), 1);
                                    } else if (widgetDto instanceof WidgetDto.Widget_SpannableGridDto) {
                                        SpannableGridDto spannableGridDto = ((WidgetDto.Widget_SpannableGridDto) widgetDto).b;
                                        List<SpannableGridTileDto> tiles2 = spannableGridDto.getTiles();
                                        ArrayList arrayList19 = new ArrayList(tcc.n(tiles2, 10));
                                        for (SpannableGridTileDto spannableGridTileDto : tiles2) {
                                            arrayList19.add(new nmt0(j5iVar.c(spannableGridTileDto.getTile()), spannableGridTileDto.getColumn(), spannableGridTileDto.getRow(), spannableGridTileDto.getWidth(), spannableGridTileDto.getHeight()));
                                        }
                                        obj3 = new kmt0(arrayList19, spannableGridDto.getColumns(), spannableGridDto.getShowWhenSectionCollapsed(), spannableGridDto.getMeta(), spannableGridDto.getMetricaLabel());
                                    } else if (widgetDto instanceof WidgetDto.Widget_AddressButtonDto) {
                                        AddressButtonDto addressButtonDto = ((WidgetDto.Widget_AddressButtonDto) widgetDto).b;
                                        String text5 = addressButtonDto.getText();
                                        hhg a10 = jhgVar.a(addressButtonDto.getAction());
                                        TrailAddressButtonDto trailButton2 = addressButtonDto.getTrailButton();
                                        obj3 = new uq0(text5, a10, trailButton2 != null ? new y901(jhgVar.a(trailButton2.getAction()), trailButton2.getMetricaLabel(), trailButton2.getMeta()) : null, addressButtonDto.getShowWhenSectionCollapsed(), addressButtonDto.getMeta(), addressButtonDto.getMetricaLabel());
                                    } else if (widgetDto instanceof WidgetDto.Widget_DiscountShowcaseDto) {
                                        List<DiscountCouponDto> coupons = ((WidgetDto.Widget_DiscountShowcaseDto) widgetDto).b.getCoupons();
                                        ArrayList arrayList20 = new ArrayList(tcc.n(coupons, 10));
                                        for (DiscountCouponDto discountCouponDto : coupons) {
                                            StyledTextDto title6 = discountCouponDto.getTitle();
                                            rry0 b7 = title6 != null ? j5iVar.b(title6) : null;
                                            StyledTextDto discount = discountCouponDto.getDiscount();
                                            rry0 b8 = discount != null ? j5iVar.b(discount) : null;
                                            StyledTextDto subtitle4 = discountCouponDto.getSubtitle();
                                            rry0 b9 = subtitle4 != null ? j5iVar.b(subtitle4) : null;
                                            ActionDto action2 = discountCouponDto.getAction();
                                            hhg a11 = action2 != null ? jhgVar.a(action2) : null;
                                            IconDto companyIcon = discountCouponDto.getCompanyIcon();
                                            w4v a12 = companyIcon != null ? m4vVar.a(companyIcon) : null;
                                            StyledTextDto companyName = discountCouponDto.getCompanyName();
                                            rry0 b10 = companyName != null ? j5iVar.b(companyName) : null;
                                            BackgroundDto background2 = discountCouponDto.getBackground();
                                            u3b1 b11 = background2 != null ? bh4Var.b(background2) : null;
                                            int i10 = i5i.c[discountCouponDto.getCouponSize().ordinal()];
                                            if (i10 == 1) {
                                                couponSize = CouponSize.S;
                                            } else if (i10 == 2) {
                                                couponSize = CouponSize.M;
                                            } else {
                                                w511.b();
                                            }
                                            CouponSize couponSize2 = couponSize;
                                            boolean showWhenSectionCollapsed = discountCouponDto.getShowWhenSectionCollapsed();
                                            DiscountCouponTrailItemDto trailItem = discountCouponDto.getTrailItem();
                                            arrayList20.add(new eoj(b7, b8, b9, a11, a12, b10, b11, couponSize2, showWhenSectionCollapsed, trailItem instanceof DiscountCouponTrailItemDto.DiscountCouponTrailItem_MissionProgressDto ? new goj(j5iVar.e.a(((DiscountCouponTrailItemDto.DiscountCouponTrailItem_MissionProgressDto) trailItem).b.getItem())) : null, discountCouponDto.getMetricaLabel(), discountCouponDto.getMeta()));
                                        }
                                        qc1Var = new soj(arrayList20);
                                    } else if (widgetDto instanceof WidgetDto.Widget_BannerCarouselDto) {
                                        BannerCarouselDto bannerCarouselDto = ((WidgetDto.Widget_BannerCarouselDto) widgetDto).b;
                                        qc1Var = new gs4(bannerCarouselDto.getMeta(), bannerCarouselDto.getMetricaLabel());
                                    } else if (widgetDto instanceof WidgetDto.Widget_AdsBannerDto) {
                                        AdsBannerDto adsBannerDto = ((WidgetDto.Widget_AdsBannerDto) widgetDto).b;
                                        AdsBannerSettingsDto adsBannerSettings = adsBannerDto.getAdsBannerSettings();
                                        if (adsBannerSettings instanceof AdsBannerSettingsDto.AdsBannerSettings_UrbanAdsDto) {
                                            UrbanAdsSettingsDto urbanAdsSettingsDto = ((AdsBannerSettingsDto.AdsBannerSettings_UrbanAdsDto) adsBannerSettings).b;
                                            String page = urbanAdsSettingsDto.getPage();
                                            UrbanAdsSettingsDto.OverridesDto overrides = urbanAdsSettingsDto.getOverrides();
                                            uc1Var = new tc1(page, overrides != null ? new sc1(overrides.getPath(), overrides.getExperiments()) : null);
                                        } else if (adsBannerSettings instanceof AdsBannerSettingsDto.Unknown_AdsBannerSettingsDto) {
                                            uc1Var = rc1.a;
                                        } else {
                                            w511.b();
                                        }
                                        qc1Var = new qc1(adsBannerDto.getShowWhenSectionCollapsed(), uc1Var, adsBannerDto.getMetricaLabel(), adsBannerDto.getMeta());
                                    } else if (widgetDto instanceof WidgetDto.Widget_RestoreOrderDto) {
                                        obj3 = e221.a;
                                    } else if (widgetDto instanceof WidgetDto.Widget_FlexDto) {
                                        obj3 = e221.a;
                                    } else if (widgetDto instanceof WidgetDto.Widget_MainHeaderV3Dto) {
                                        obj3 = e221.a;
                                    } else if (widgetDto instanceof WidgetDto.Unknown_WidgetDto) {
                                        obj3 = e221.a;
                                    } else {
                                        w511.b();
                                    }
                                    arrayList15.add(qc1Var);
                                    dashboardContentResponseDto2 = dashboardContentResponseDto;
                                    it7 = it2;
                                    sectionDto2 = sectionDto;
                                }
                            }
                            qc1Var = obj3;
                            arrayList15.add(qc1Var);
                            dashboardContentResponseDto2 = dashboardContentResponseDto;
                            it7 = it2;
                            sectionDto2 = sectionDto;
                        } else {
                            DashboardContentResponseDto dashboardContentResponseDto4 = dashboardContentResponseDto2;
                            Iterator it12 = it7;
                            SectionDto sectionDto3 = sectionDto2;
                            String title7 = sectionDto3.getTitle();
                            Object meta3 = sectionDto3.getMeta();
                            String metricaLabel3 = sectionDto2.getMetricaLabel();
                            String id = sectionDto2.getId();
                            boolean collapsed = sectionDto2.getCollapsed();
                            SectionDto.StyleDto style = sectionDto2.getStyle();
                            int i11 = style == null ? -1 : i5i.a[style.ordinal()];
                            if (i11 != -1) {
                                if (i11 == 1) {
                                    sectionDomainStyle = SectionDomainStyle.DARK;
                                    arrayList13.add(new v0q0(arrayList15, title7, meta3, id, collapsed, metricaLabel3, sectionDomainStyle));
                                    i9 = 10;
                                    dashboardContentResponseDto2 = dashboardContentResponseDto4;
                                    it7 = it12;
                                } else if (i11 != 2) {
                                    w511.b();
                                }
                            }
                            sectionDomainStyle = SectionDomainStyle.DEFAULT;
                            arrayList13.add(new v0q0(arrayList15, title7, meta3, id, collapsed, metricaLabel3, sectionDomainStyle));
                            i9 = 10;
                            dashboardContentResponseDto2 = dashboardContentResponseDto4;
                            it7 = it12;
                        }
                    }
                }
                return null;
            case 3:
                Responses$DeliveryOptionsResponseDto responses$DeliveryOptionsResponseDto = (Responses$DeliveryOptionsResponseDto) obj;
                gwo gwoVar = (gwo) obj4;
                gwoVar.getClass();
                Responses$DeliveryOptionsResponseDto.ActionDto action3 = responses$DeliveryOptionsResponseDto.getAction();
                if (action3 != null) {
                    if (action3 instanceof Responses$DeliveryOptionsResponseDto.ActionDto.Action_ConfirmationWindowDto) {
                        ConfirmationWindowDto confirmationWindowDto = ((Responses$DeliveryOptionsResponseDto.ActionDto.Action_ConfirmationWindowDto) action3).b;
                        awoVar = new awo(gwoVar.a(confirmationWindowDto.getMainWindow()), gwoVar.a(confirmationWindowDto.getAlertWindow()));
                        deliveryOptions = responses$DeliveryOptionsResponseDto.getDeliveryOptions();
                        if (!(deliveryOptions instanceof Responses$DeliveryOptionsResponseDto.DeliveryOptionsDto.DeliveryOptions_StorageOptionsDto)) {
                            List<StoragePeriodOptionDto> options = ((Responses$DeliveryOptionsResponseDto.DeliveryOptionsDto.DeliveryOptions_StorageOptionsDto) deliveryOptions).b.getOptions();
                            arrayList4 = new ArrayList(tcc.n(options, 10));
                            Iterator it13 = options.iterator();
                            while (it13.hasNext()) {
                                arrayList4.add(new efi(((StoragePeriodOptionDto) it13.next()).getExpirationDate()));
                            }
                        } else {
                            if (!(deliveryOptions instanceof Responses$DeliveryOptionsResponseDto.DeliveryOptionsDto.Unknown_DeliveryOptionsDto)) {
                                w511.b();
                                return null;
                            }
                            arrayList4 = null;
                        }
                        return new dwo(awoVar, arrayList4);
                    }
                    if (!(action3 instanceof Responses$DeliveryOptionsResponseDto.ActionDto.Unknown_ActionDto)) {
                        w511.b();
                        return null;
                    }
                }
                awoVar = null;
                deliveryOptions = responses$DeliveryOptionsResponseDto.getDeliveryOptions();
                if (!(deliveryOptions instanceof Responses$DeliveryOptionsResponseDto.DeliveryOptionsDto.DeliveryOptions_StorageOptionsDto)) {
                }
                return new dwo(awoVar, arrayList4);
            case 4:
                y5s y5sVar = (y5s) obj4;
                y5sVar.getClass();
                List<FormDescriptorDto> descriptors = ((V2FormResponseDto) obj).getDescriptors();
                ArrayList arrayList21 = new ArrayList(tcc.n(descriptors, 10));
                Iterator it14 = descriptors.iterator();
                while (it14.hasNext()) {
                    FormDescriptorDto formDescriptorDto = (FormDescriptorDto) it14.next();
                    Object match = formDescriptorDto.getMatch();
                    FormOverrideDto override = formDescriptorDto.getOverride();
                    o4s o4sVar = y5sVar.a;
                    OfferDto offer = override.getOffer();
                    sr60 sr60Var = offer != null ? new sr60(offer.getOfferId(), offer.getTtl()) : null;
                    List<OfferDto> offers = override.getOffers();
                    if (offers != null) {
                        List<OfferDto> list4 = offers;
                        ArrayList arrayList22 = new ArrayList(tcc.n(list4, i3));
                        for (OfferDto offerDto : list4) {
                            arrayList22.add(new sr60(offerDto.getOfferId(), offerDto.getTtl()));
                        }
                        arrayList5 = arrayList22;
                    } else {
                        arrayList5 = null;
                    }
                    t3s a13 = y5sVar.a(override.getLayout());
                    AddressDetailsLayoutDto addressDetailsLayout = override.getAddressDetailsLayout();
                    at0 b12 = addressDetailsLayout != null ? ((pv8) o4sVar).b(addressDetailsLayout) : null;
                    List<FormModalViewDto> modals = override.getModals();
                    if (modals != null) {
                        ArrayList arrayList23 = new ArrayList();
                        Iterator it15 = modals.iterator();
                        while (it15.hasNext()) {
                            FormModalViewDto formModalViewDto = (FormModalViewDto) it15.next();
                            if (formModalViewDto instanceof FormModalViewDto.FormModalView_PopupDto) {
                                ModalViewPopupDto modalViewPopupDto = ((FormModalViewDto.FormModalView_PopupDto) formModalViewDto).b;
                                t3s a14 = y5sVar.a(modalViewPopupDto.getLayout());
                                if (a14 != null) {
                                    e5sVar = new g5s(modalViewPopupDto.getId(), a14);
                                    it3 = it14;
                                    it4 = it15;
                                    formOverrideDto2 = override;
                                    if (e5sVar == null) {
                                        arrayList23.add(e5sVar);
                                    }
                                    it14 = it3;
                                    it15 = it4;
                                    override = formOverrideDto2;
                                    i3 = 10;
                                }
                                it3 = it14;
                                it4 = it15;
                                formOverrideDto2 = override;
                            } else if (formModalViewDto instanceof FormModalViewDto.FormModalView_OverMapDto) {
                                ModalViewOverMapDto modalViewOverMapDto = ((FormModalViewDto.FormModalView_OverMapDto) formModalViewDto).b;
                                t3s a15 = y5sVar.a(modalViewOverMapDto.getLayout());
                                if (a15 != null) {
                                    String id2 = modalViewOverMapDto.getId();
                                    MapObjectsDescriptorDto mapObjectsDescriptor = modalViewOverMapDto.getMapObjectsDescriptor();
                                    if (mapObjectsDescriptor instanceof MapObjectsDescriptorDto.MapObjectsDescriptor_RoutePointsDto) {
                                        List<RoutePointDto> points = ((MapObjectsDescriptorDto.MapObjectsDescriptor_RoutePointsDto) mapObjectsDescriptor).b.getPoints();
                                        if (points != null) {
                                            List<RoutePointDto> list5 = points;
                                            it3 = it14;
                                            arrayList9 = new ArrayList(tcc.n(list5, i3));
                                            Iterator it16 = list5.iterator();
                                            while (it16.hasNext()) {
                                                RoutePointDto routePointDto = (RoutePointDto) it16.next();
                                                int index = routePointDto.getIndex();
                                                ImageDto pinIcon = routePointDto.getPinIcon();
                                                Iterator it17 = it16;
                                                if (pinIcon != null) {
                                                    it5 = it15;
                                                    formOverrideDto3 = override;
                                                    sbvVar = new sbv(pinIcon.getImageTag(), pinIcon.getUrl(), pinIcon.getTintColor());
                                                } else {
                                                    it5 = it15;
                                                    formOverrideDto3 = override;
                                                    sbvVar = null;
                                                }
                                                arrayList9.add(new g7l0(index, sbvVar));
                                                it16 = it17;
                                                it15 = it5;
                                                override = formOverrideDto3;
                                            }
                                        } else {
                                            it3 = it14;
                                            arrayList9 = null;
                                        }
                                        it4 = it15;
                                        formOverrideDto2 = override;
                                        ip00Var = new gp00(arrayList9);
                                    } else {
                                        it3 = it14;
                                        it4 = it15;
                                        formOverrideDto2 = override;
                                        if (!(mapObjectsDescriptor instanceof MapObjectsDescriptorDto.Unknown_MapObjectsDescriptorDto)) {
                                            w511.b();
                                            return null;
                                        }
                                        ip00Var = hp00.a;
                                    }
                                    e5sVar = new f5s(id2, a15, ip00Var);
                                    if (e5sVar == null) {
                                    }
                                    it14 = it3;
                                    it15 = it4;
                                    override = formOverrideDto2;
                                    i3 = 10;
                                }
                                it3 = it14;
                                it4 = it15;
                                formOverrideDto2 = override;
                            } else {
                                it3 = it14;
                                it4 = it15;
                                formOverrideDto2 = override;
                                if (formModalViewDto instanceof FormModalViewDto.FormModalView_OverCameraDto) {
                                    ModalViewOverCameraDto modalViewOverCameraDto = ((FormModalViewDto.FormModalView_OverCameraDto) formModalViewDto).b;
                                    t3s a16 = y5sVar.a(modalViewOverCameraDto.getLayout());
                                    if (a16 != null) {
                                        String id3 = modalViewOverCameraDto.getId();
                                        SmartCameraTypeDto initialType = modalViewOverCameraDto.getInitialType();
                                        gd3 gd3Var2 = y5sVar.c;
                                        if (initialType instanceof SmartCameraTypeDto.SmartCameraType_ArBoxesSmartCameraDto) {
                                            ArBoxesSmartCameraDto arBoxesSmartCameraDto = ((SmartCameraTypeDto.SmartCameraType_ArBoxesSmartCameraDto) initialType).b;
                                            AttributedTextDto screenTitle = arBoxesSmartCameraDto.getScreenTitle();
                                            gd3Var2.getClass();
                                            FormattedText b13 = gd3.b(screenTitle);
                                            String surfaceScanText = arBoxesSmartCameraDto.getSurfaceScanText();
                                            List<ArSmartCameraBoxSizeDto> boxSizes = arBoxesSmartCameraDto.getBoxSizes();
                                            ArrayList arrayList24 = new ArrayList(tcc.n(boxSizes, 10));
                                            Iterator it18 = boxSizes.iterator();
                                            while (it18.hasNext()) {
                                                ArSmartCameraBoxSizeDto arSmartCameraBoxSizeDto = (ArSmartCameraBoxSizeDto) it18.next();
                                                arrayList24.add(new u33(arSmartCameraBoxSizeDto.getId(), arSmartCameraBoxSizeDto.getHeightCm(), arSmartCameraBoxSizeDto.getWidthCm(), arSmartCameraBoxSizeDto.getDepthCm()));
                                                it18 = it18;
                                                arBoxesSmartCameraDto = arBoxesSmartCameraDto;
                                            }
                                            ArBoxesSmartCameraDto arBoxesSmartCameraDto2 = arBoxesSmartCameraDto;
                                            xys0Var = new vys0(b13, surfaceScanText, arrayList24, arBoxesSmartCameraDto2.getFormStateBoxSizeKey(), new x2s(arBoxesSmartCameraDto2.getMetricaLabel(), null));
                                        } else if (initialType instanceof SmartCameraTypeDto.SmartCameraType_AiSmartCameraDto) {
                                            AiSmartCameraDto aiSmartCameraDto = ((SmartCameraTypeDto.SmartCameraType_AiSmartCameraDto) initialType).b;
                                            AttributedTextDto screenTitle2 = aiSmartCameraDto.getScreenTitle();
                                            gd3Var2.getClass();
                                            FormattedText b14 = gd3.b(screenTitle2);
                                            AttributedTextDto photoButtonHintText = aiSmartCameraDto.getPhotoButtonHintText();
                                            uys0Var = new uys0(b14, photoButtonHintText != null ? gd3.b(photoButtonHintText) : null, aiSmartCameraDto.getPhotoLinkFormStateKey(), aiSmartCameraDto.getAsyncAction().getTaskId(), aiSmartCameraDto.getAsyncAction().getFormStateValue(), aiSmartCameraDto.getAsyncAction().getTaskParams(), new x2s(aiSmartCameraDto.getMetricaLabel(), aiSmartCameraDto.getMeta()));
                                            e5sVar = new e5s(id3, a16, uys0Var);
                                        } else {
                                            if (!(initialType instanceof SmartCameraTypeDto.Unknown_SmartCameraTypeDto)) {
                                                w511.b();
                                                return null;
                                            }
                                            xys0Var = wys0.a;
                                        }
                                        uys0Var = xys0Var;
                                        e5sVar = new e5s(id3, a16, uys0Var);
                                    }
                                } else if (!(formModalViewDto instanceof FormModalViewDto.Unknown_FormModalViewDto)) {
                                    w511.b();
                                    return null;
                                }
                                if (e5sVar == null) {
                                }
                                it14 = it3;
                                it15 = it4;
                                override = formOverrideDto2;
                                i3 = 10;
                            }
                            e5sVar = null;
                            if (e5sVar == null) {
                            }
                            it14 = it3;
                            it15 = it4;
                            override = formOverrideDto2;
                            i3 = 10;
                        }
                        arrayList6 = arrayList23;
                    } else {
                        arrayList6 = r4;
                    }
                    Iterator it19 = it14;
                    FormOverrideDto formOverrideDto4 = override;
                    List<PartialAddressDetailsLayoutDto> partialAddressDetailsLayouts = formOverrideDto4.getPartialAddressDetailsLayouts();
                    if (partialAddressDetailsLayouts != null) {
                        List<PartialAddressDetailsLayoutDto> list6 = partialAddressDetailsLayouts;
                        ArrayList arrayList25 = new ArrayList(tcc.n(list6, 10));
                        for (PartialAddressDetailsLayoutDto partialAddressDetailsLayoutDto : list6) {
                            AddressDetailsLayoutDto layout = partialAddressDetailsLayoutDto.getLayout();
                            RoutePointsIntervalDto routePointsInterval = partialAddressDetailsLayoutDto.getRoutePointsInterval();
                            arrayList25.add(new qg90(((pv8) o4sVar).b(layout), new g8l0(routePointsInterval.getFirstIndex(), routePointsInterval.getLastIndex())));
                        }
                        formOverrideDto = formOverrideDto4;
                        arrayList7 = arrayList25;
                    } else {
                        formOverrideDto = formOverrideDto4;
                        arrayList7 = null;
                    }
                    FormOverrideDto.FormThemeDto formTheme = formOverrideDto.getFormTheme();
                    int i12 = formTheme == null ? -1 : x5s.a[formTheme.ordinal()];
                    if (i12 == -1) {
                        themeStyle = ThemeStyle.DEFAULT;
                    } else if (i12 == 1) {
                        themeStyle = ThemeStyle.ULTIMA;
                    } else {
                        if (i12 != 2) {
                            w511.b();
                            return null;
                        }
                        themeStyle = ThemeStyle.DEFAULT;
                    }
                    ThemeStyle themeStyle2 = themeStyle;
                    String metricaLabel4 = formOverrideDto.getMetricaLabel();
                    Object meta4 = formOverrideDto.getMeta();
                    SendEventPayloadDto sendEventPayload = formOverrideDto.getSendEventPayload();
                    if (sendEventPayload != null) {
                        List<FormEventTypeDto> availableEvents = sendEventPayload.getAvailableEvents();
                        ArrayList arrayList26 = new ArrayList(tcc.n(availableEvents, 10));
                        Iterator it20 = availableEvents.iterator();
                        while (it20.hasNext()) {
                            int i13 = x5s.b[((FormEventTypeDto) it20.next()).ordinal()];
                            if (i13 == 1) {
                                formEventType = FormEventType.CLOSED;
                            } else {
                                if (i13 != 2) {
                                    w511.b();
                                    return null;
                                }
                                formEventType = FormEventType.APP_ENTERED_BACKGROUND;
                            }
                            arrayList26.add(formEventType);
                        }
                        poq0Var = new poq0(arrayList26, sendEventPayload.getMeta());
                    } else {
                        poq0Var = null;
                    }
                    FormDefaultsDto defaults = formOverrideDto.getDefaults();
                    if (defaults != null) {
                        Object options2 = defaults.getOptions();
                        Map map = options2 instanceof Map ? (Map) options2 : null;
                        if (map == null) {
                            map = b.f();
                        }
                        l4sVar = new l4s(map);
                    } else {
                        l4sVar = new l4s(b.f());
                    }
                    l4s l4sVar2 = l4sVar;
                    List<FormOverrideModifierDescriptorDto> modifiers = formOverrideDto.getModifiers();
                    if (modifiers != null) {
                        List<FormOverrideModifierDescriptorDto> list7 = modifiers;
                        ArrayList arrayList27 = new ArrayList(tcc.n(list7, 10));
                        for (FormOverrideModifierDescriptorDto formOverrideModifierDescriptorDto : list7) {
                            Object match2 = formOverrideModifierDescriptorDto.getMatch();
                            List<FormLayoutModifierDto> modifiers2 = formOverrideModifierDescriptorDto.getModifiers();
                            ArrayList arrayList28 = new ArrayList();
                            for (FormLayoutModifierDto formLayoutModifierDto : modifiers2) {
                                if (formLayoutModifierDto instanceof FormLayoutModifierDto.FormLayoutModifier_ReplaceWidgetDto) {
                                    FormLayoutModifierReplaceWidgetDto formLayoutModifierReplaceWidgetDto = ((FormLayoutModifierDto.FormLayoutModifier_ReplaceWidgetDto) formLayoutModifierDto).b;
                                    v4sVar = new v4s(formLayoutModifierReplaceWidgetDto.getWidgetId(), ((pv8) o4sVar).i(formLayoutModifierReplaceWidgetDto.getReplacement()));
                                } else {
                                    if (!(formLayoutModifierDto instanceof FormLayoutModifierDto.Unknown_FormLayoutModifierDto)) {
                                        w511.b();
                                        return null;
                                    }
                                    v4sVar = null;
                                }
                                if (v4sVar != null) {
                                    arrayList28.add(v4sVar);
                                }
                            }
                            arrayList27.add(new n5s(arrayList28, match2));
                        }
                        arrayList8 = arrayList27;
                    } else {
                        arrayList8 = r4;
                    }
                    arrayList21.add(new m4s(match, new l5s(sr60Var, arrayList5, a13, b12, arrayList6, arrayList7, themeStyle2, metricaLabel4, meta4, poq0Var, l4sVar2, arrayList8)));
                    it14 = it19;
                    i3 = 10;
                }
                return new n4s(vng.I(), arrayList21);
            case 5:
                return b(obj);
            default:
                MissionResponseDto missionResponseDto = (MissionResponseDto) obj;
                tj20 tj20Var = (tj20) obj4;
                tj20Var.getClass();
                MissionProgressBlockDto progress = missionResponseDto.getProgress();
                ck20 ck20Var = new ck20(tj20Var.c.b(progress.getBackground()), tj20Var.a(progress.getProgress()), progress.getTitle(), progress.getSubtitle());
                MissionDescriptionBlockDto description2 = missionResponseDto.getDescription();
                m4v m4vVar2 = tj20Var.a;
                String title8 = description2.getTitle();
                String subtitle5 = description2.getSubtitle();
                List<MissionDescriptionItemDto> description3 = description2.getDescription();
                ArrayList arrayList29 = new ArrayList(tcc.n(description3, 10));
                for (MissionDescriptionItemDto missionDescriptionItemDto : description3) {
                    String content = missionDescriptionItemDto.getContent();
                    IconDto leadIcon3 = missionDescriptionItemDto.getLeadIcon();
                    if (leadIcon3 != null) {
                        w4vVar = m4vVar2.a(leadIcon3);
                        if (w4vVar instanceof h3z) {
                            if (((h3z) w4vVar).a != LocalIconName.UNKNOWN_ICON_NAME) {
                            }
                        }
                        arrayList29.add(new gj20(content, w4vVar, missionDescriptionItemDto.getDeeplink()));
                    }
                    w4vVar = null;
                    arrayList29.add(new gj20(content, w4vVar, missionDescriptionItemDto.getDeeplink()));
                }
                IconDto trailIcon2 = description2.getTrailIcon();
                ej20 ej20Var = new ej20(title8, subtitle5, arrayList29, trailIcon2 != null ? m4vVar2.a(trailIcon2) : null);
                ButtonDto button2 = missionResponseDto.getButton();
                return new lj20(ck20Var, ej20Var, new l17(button2.getTitle(), button2.getUrl()));
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, (ywh) obj, ywh.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto;)Lru/yandex/taxi/logistics/sdk/tracking/domain/impl/models/DeliveryCancelInfoModel;", 0);
            case 1:
                return new FunctionReferenceImpl(1, (bsb) obj, bsb.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardChooseProfileResponseDto;)Lru/yandex/taxi/logistics/sdk/dashboard/core/DashboardDomainModel;", 0);
            case 2:
                return new FunctionReferenceImpl(1, (j5i) obj, j5i.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentResponseDto;)Lru/yandex/taxi/logistics/sdk/dashboard/core/DashboardDomainModel;", 0);
            case 3:
                return new FunctionReferenceImpl(1, (gwo) obj, gwo.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto;)Lru/yandex/taxi/logistics/sdk/tracking/impl/extend_expiration_date/data/ExtendExpirationDateModel;", 0);
            case 4:
                return new FunctionReferenceImpl(1, (y5s) obj, y5s.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormResponseDto;)Lru/yandex/logistics/sdk/cargo_form/core/api/models/FormDescriptorsState;", 0);
            case 5:
                return new FunctionReferenceImpl(1, (btf0) obj, btf0.class, "mapFromDto", "mapFromDto(Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto;)Lru/yandex/taxi/logistics/sdk/promotions/api/PromotionBannersInfo;", 0);
            default:
                return new FunctionReferenceImpl(1, (tj20) obj, tj20.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/MissionResponseDto;)Lru/yandex/taxi/logistics/sdk/mission_details/data/MissionDetailsModel;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
