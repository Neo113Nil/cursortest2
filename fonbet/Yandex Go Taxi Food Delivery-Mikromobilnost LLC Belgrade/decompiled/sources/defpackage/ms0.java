package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.config.MapConfig$MapStyle$MapTheme;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.AddressDetailsConfigDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.CommentPopupDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.DeliveryOrderFormAddressDetailsDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.PhoneSelectionScreenConfigDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.PhotocommentsConfigDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.PointConfigDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.SelectContactButtonConfigDto;

/* loaded from: classes5.dex */
public final class ms0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static ks0 a(DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto) {
        ?? r3;
        MapConfig$MapStyle$MapTheme mapConfig$MapStyle$MapTheme;
        mmc mmcVar;
        List<DeliveryOrderFormAddressDetailsDto.MatchesDto> matches = deliveryOrderFormAddressDetailsDto.getMatches();
        jg00 jg00Var = null;
        if (matches != null) {
            List<DeliveryOrderFormAddressDetailsDto.MatchesDto> list = matches;
            r3 = new ArrayList(tcc.n(list, 10));
            for (DeliveryOrderFormAddressDetailsDto.MatchesDto matchesDto : list) {
                List<String> modes = matchesDto.getModes();
                AddressDetailsConfigDto config = matchesDto.getConfig();
                kud0 b = b(config.getSource(), deliveryOrderFormAddressDetailsDto);
                kud0 b2 = b(config.getDestination(), deliveryOrderFormAddressDetailsDto);
                PhotocommentsConfigDto photocomments = config.getPhotocomments();
                qkb0 qkb0Var = photocomments != null ? new qkb0(photocomments.getMaxPhotoWidth(), photocomments.getMaxPhotoHeight(), photocomments.getMaxPointPhotocomments()) : null;
                CommentPopupDto commentPopup = config.getCommentPopup();
                if (commentPopup != null) {
                    String d = ba91.d(deliveryOrderFormAddressDetailsDto, commentPopup.getTitleKey());
                    String d2 = ba91.d(deliveryOrderFormAddressDetailsDto, commentPopup.getContinueButtonTextKey());
                    String d3 = ba91.d(deliveryOrderFormAddressDetailsDto, commentPopup.getCancelButtonTextKey());
                    String messageKey = commentPopup.getMessageKey();
                    mmcVar = new mmc(d, messageKey != null ? ba91.d(deliveryOrderFormAddressDetailsDto, messageKey) : null, d2, d3);
                } else {
                    mmcVar = null;
                }
                String d4 = ba91.d(deliveryOrderFormAddressDetailsDto, config.getButtonTextKey());
                Boolean enableDeleteDestination = config.getEnableDeleteDestination();
                r3.add(new p610(modes, new gs0(b, b2, qkb0Var, mmcVar, d4, enableDeleteDestination != null ? enableDeleteDestination.booleanValue() : false)));
            }
        } else {
            r3 = EmptyList.a;
        }
        DeliveryOrderFormAddressDetailsDto.MapConfigDto mapConfig = deliveryOrderFormAddressDetailsDto.getMapConfig();
        if (mapConfig != null) {
            List<String> modes2 = mapConfig.getModes();
            List<DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto> styles = mapConfig.getStyles();
            ArrayList arrayList = new ArrayList(tcc.n(styles, 10));
            for (DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto stylesDto : styles) {
                int i = ls0.a[stylesDto.getTheme().ordinal()];
                if (i == 1) {
                    mapConfig$MapStyle$MapTheme = MapConfig$MapStyle$MapTheme.DARK;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    mapConfig$MapStyle$MapTheme = MapConfig$MapStyle$MapTheme.LIGHT;
                }
                arrayList.add(new ig00(mapConfig$MapStyle$MapTheme, stylesDto.getValue()));
            }
            jg00Var = new jg00(modes2, arrayList, mapConfig.getZoom());
        }
        return new ks0(r3, jg00Var);
    }

    public static kud0 b(PointConfigDto pointConfigDto, DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto) {
        String d = ba91.d(deliveryOrderFormAddressDetailsDto, pointConfigDto.getPorchKey());
        String d2 = ba91.d(deliveryOrderFormAddressDetailsDto, pointConfigDto.getApartmentKey());
        String d3 = ba91.d(deliveryOrderFormAddressDetailsDto, pointConfigDto.getFloorKey());
        String d4 = ba91.d(deliveryOrderFormAddressDetailsDto, pointConfigDto.getDoorphoneKey());
        String d5 = ba91.d(deliveryOrderFormAddressDetailsDto, pointConfigDto.getCommentKey());
        String d6 = ba91.d(deliveryOrderFormAddressDetailsDto, pointConfigDto.getContactKey());
        Boolean shouldHidePhoneSelection = pointConfigDto.getShouldHidePhoneSelection();
        boolean booleanValue = shouldHidePhoneSelection != null ? shouldHidePhoneSelection.booleanValue() : false;
        boolean shouldHideDetaisScreen = pointConfigDto.getShouldHideDetaisScreen();
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfig = pointConfigDto.getPhoneSelectionScreenConfig();
        String d7 = ba91.d(deliveryOrderFormAddressDetailsDto, phoneSelectionScreenConfig.getReadContactsPermissionKey());
        String d8 = ba91.d(deliveryOrderFormAddressDetailsDto, phoneSelectionScreenConfig.getTitleKey());
        String descriptionKey = phoneSelectionScreenConfig.getDescriptionKey();
        String d9 = descriptionKey != null ? ba91.d(deliveryOrderFormAddressDetailsDto, descriptionKey) : null;
        String userContactNameKey = phoneSelectionScreenConfig.getUserContactNameKey();
        String d10 = userContactNameKey != null ? ba91.d(deliveryOrderFormAddressDetailsDto, userContactNameKey) : null;
        String emptyContactTitleKey = phoneSelectionScreenConfig.getEmptyContactTitleKey();
        String d11 = emptyContactTitleKey != null ? ba91.d(deliveryOrderFormAddressDetailsDto, emptyContactTitleKey) : null;
        String emptyContactSubtitleKey = phoneSelectionScreenConfig.getEmptyContactSubtitleKey();
        xfb0 xfb0Var = new xfb0(d7, d8, d9, d10, d11, emptyContactSubtitleKey != null ? ba91.d(deliveryOrderFormAddressDetailsDto, emptyContactSubtitleKey) : null);
        Boolean isContactBoundToPoint = pointConfigDto.isContactBoundToPoint();
        boolean booleanValue2 = isContactBoundToPoint != null ? isContactBoundToPoint.booleanValue() : false;
        SelectContactButtonConfigDto selectContactButtonConfig = pointConfigDto.getSelectContactButtonConfig();
        return new kud0(d, d2, d3, d4, d5, d6, booleanValue, shouldHideDetaisScreen, xfb0Var, booleanValue2, selectContactButtonConfig != null ? new xaq0(ba91.d(deliveryOrderFormAddressDetailsDto, selectContactButtonConfig.getTitleKey())) : null);
    }
}
