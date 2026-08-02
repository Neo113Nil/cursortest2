package defpackage;

import com.yandex.delivery.mapper.model.OrderDetailsFormFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormCommonInputLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormContactInputLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormRoutePointFieldLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.DetailFormRoutePointLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.PhoneSelectionScreenConfigDto;

/* loaded from: classes5.dex */
public final class ac80 {
    public static bfe0 a(DetailFormRoutePointFieldLayoutDto detailFormRoutePointFieldLayoutDto) {
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.Unknown_DetailFormRoutePointFieldLayoutDto) {
            return afe0.a;
        }
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_AddressDto) {
            OrderDetailsFormFieldType orderDetailsFormFieldType = OrderDetailsFormFieldType.ADDRESS;
            DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_AddressDto) detailFormRoutePointFieldLayoutDto).b;
            Boolean isLocked = detailFormCommonInputLayoutDto.isLocked();
            return new xee0(orderDetailsFormFieldType, isLocked != null ? isLocked.booleanValue() : false, detailFormCommonInputLayoutDto.getPlaceholder(), detailFormCommonInputLayoutDto.getCurrentValue(), detailFormCommonInputLayoutDto.getEditFieldName());
        }
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_ApartmentDto) {
            OrderDetailsFormFieldType orderDetailsFormFieldType2 = OrderDetailsFormFieldType.APARTMENT;
            DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto2 = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_ApartmentDto) detailFormRoutePointFieldLayoutDto).b;
            Boolean isLocked2 = detailFormCommonInputLayoutDto2.isLocked();
            return new xee0(orderDetailsFormFieldType2, isLocked2 != null ? isLocked2.booleanValue() : false, detailFormCommonInputLayoutDto2.getPlaceholder(), detailFormCommonInputLayoutDto2.getCurrentValue(), detailFormCommonInputLayoutDto2.getEditFieldName());
        }
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_CommentDto) {
            OrderDetailsFormFieldType orderDetailsFormFieldType3 = OrderDetailsFormFieldType.COMMENT;
            DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto3 = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_CommentDto) detailFormRoutePointFieldLayoutDto).b;
            Boolean isLocked3 = detailFormCommonInputLayoutDto3.isLocked();
            return new xee0(orderDetailsFormFieldType3, isLocked3 != null ? isLocked3.booleanValue() : false, detailFormCommonInputLayoutDto3.getPlaceholder(), detailFormCommonInputLayoutDto3.getCurrentValue(), detailFormCommonInputLayoutDto3.getEditFieldName());
        }
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_DoorPhoneDto) {
            OrderDetailsFormFieldType orderDetailsFormFieldType4 = OrderDetailsFormFieldType.DOOR_PHONE;
            DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto4 = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_DoorPhoneDto) detailFormRoutePointFieldLayoutDto).b;
            Boolean isLocked4 = detailFormCommonInputLayoutDto4.isLocked();
            return new xee0(orderDetailsFormFieldType4, isLocked4 != null ? isLocked4.booleanValue() : false, detailFormCommonInputLayoutDto4.getPlaceholder(), detailFormCommonInputLayoutDto4.getCurrentValue(), detailFormCommonInputLayoutDto4.getEditFieldName());
        }
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_EntranceDto) {
            OrderDetailsFormFieldType orderDetailsFormFieldType5 = OrderDetailsFormFieldType.ENTRANCE;
            DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto5 = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_EntranceDto) detailFormRoutePointFieldLayoutDto).b;
            Boolean isLocked5 = detailFormCommonInputLayoutDto5.isLocked();
            return new xee0(orderDetailsFormFieldType5, isLocked5 != null ? isLocked5.booleanValue() : false, detailFormCommonInputLayoutDto5.getPlaceholder(), detailFormCommonInputLayoutDto5.getCurrentValue(), detailFormCommonInputLayoutDto5.getEditFieldName());
        }
        if (detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_FloorDto) {
            OrderDetailsFormFieldType orderDetailsFormFieldType6 = OrderDetailsFormFieldType.FLOOR;
            DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto6 = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_FloorDto) detailFormRoutePointFieldLayoutDto).b;
            Boolean isLocked6 = detailFormCommonInputLayoutDto6.isLocked();
            return new xee0(orderDetailsFormFieldType6, isLocked6 != null ? isLocked6.booleanValue() : false, detailFormCommonInputLayoutDto6.getPlaceholder(), detailFormCommonInputLayoutDto6.getCurrentValue(), detailFormCommonInputLayoutDto6.getEditFieldName());
        }
        if (!(detailFormRoutePointFieldLayoutDto instanceof DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_ContactDto)) {
            w511.b();
            return null;
        }
        OrderDetailsFormFieldType orderDetailsFormFieldType7 = OrderDetailsFormFieldType.CONTACT;
        DetailFormContactInputLayoutDto detailFormContactInputLayoutDto = ((DetailFormRoutePointFieldLayoutDto.DetailFormRoutePointFieldLayout_ContactDto) detailFormRoutePointFieldLayoutDto).b;
        String title = detailFormContactInputLayoutDto.getTitle();
        Boolean isLocked7 = detailFormContactInputLayoutDto.isLocked();
        boolean booleanValue = isLocked7 != null ? isLocked7.booleanValue() : false;
        PhoneSelectionScreenConfigDto selectionScreen = detailFormContactInputLayoutDto.getSelectionScreen();
        return new zee0(orderDetailsFormFieldType7, title, booleanValue, selectionScreen != null ? new yee0(selectionScreen.getTitle(), selectionScreen.getDescription(), selectionScreen.getSelfContactTitle(), selectionScreen.getBlankContactTitle(), selectionScreen.getBlankContactSubtitle(), selectionScreen.getReadContactsPermissionRequest(), selectionScreen.getButtonTitle()) : null, detailFormContactInputLayoutDto.getCurrentValue(), detailFormContactInputLayoutDto.getEditFieldName(), detailFormContactInputLayoutDto.getSelectContactButtonTitle());
    }

    public static cfe0 b(DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto) {
        String icon = detailFormRoutePointLayoutDto.getIcon();
        List<DetailFormRoutePointFieldLayoutDto> fields = detailFormRoutePointLayoutDto.getFields();
        ArrayList arrayList = new ArrayList(tcc.n(fields, 10));
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            arrayList.add(a((DetailFormRoutePointFieldLayoutDto) it.next()));
        }
        return new cfe0(icon, detailFormRoutePointLayoutDto.getMetricaLabel(), arrayList);
    }
}
