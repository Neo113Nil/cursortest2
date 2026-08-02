package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.ButtonDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.ButtonFooterDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutOrderStatusDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$DirectionSelectorScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$NumericInputScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$ReturnTripToggleScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$StopSelectorScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.DirectionDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.NotificationDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.PaymentMethodsInfoDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.PriceInfoDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.RequiredPropertyInfoDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.RouteDisplayDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$EddystoneSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$IBeaconSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$UrlSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultListItemDto$BusNearbySearchListItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultListItemDto$RailwayScheduleSearchListItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.StopDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.a0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.d;
import com.yandex.go.masstransit.sdk.client_api.data.dto.h;
import com.yandex.go.masstransit.sdk.client_api.data.dto.h0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.i;
import com.yandex.go.masstransit.sdk.client_api.data.dto.y;
import com.yandex.go.masstransit.sdk.client_api.model.trip.CheckoutStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class m2c {
    public static afp0 a(CheckoutScreenStateDto checkoutScreenStateDto) {
        wz6 wz6Var;
        String str;
        char c;
        Object obj;
        ArrayList arrayList;
        String str2 = checkoutScreenStateDto.a;
        Integer num = checkoutScreenStateDto.b;
        List list = checkoutScreenStateDto.c;
        char c2 = '\n';
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                String str3 = str2;
                NotificationDto notificationDto = checkoutScreenStateDto.d;
                cg60 cg60Var = notificationDto != null ? new cg60(notificationDto.a, notificationDto.b, notificationDto.c) : null;
                String str4 = checkoutScreenStateDto.e;
                RouteDisplayDataDto routeDisplayDataDto = checkoutScreenStateDto.f;
                y3l0 y3l0Var = routeDisplayDataDto != null ? new y3l0(routeDisplayDataDto.a, routeDisplayDataDto.b, routeDisplayDataDto.c) : null;
                ButtonFooterDto buttonFooterDto = checkoutScreenStateDto.g;
                if (buttonFooterDto != null) {
                    ButtonDto buttonDto = buttonFooterDto.a;
                    wz6Var = new wz6(buttonDto != null ? new bjb(buttonDto.a) : null);
                } else {
                    wz6Var = null;
                }
                FormattedText formattedText = checkoutScreenStateDto.h;
                PriceInfoDto priceInfoDto = checkoutScreenStateDto.i;
                rze0 rze0Var = priceInfoDto != null ? new rze0(priceInfoDto.a, priceInfoDto.b, priceInfoDto.c) : null;
                PaymentMethodsInfoDto paymentMethodsInfoDto = checkoutScreenStateDto.j;
                return new afp0(str3, num, arrayList2, cg60Var, str4, y3l0Var, wz6Var, formattedText, rze0Var, new bba0(paymentMethodsInfoDto.a, paymentMethodsInfoDto.b));
            }
            i iVar = (i) it.next();
            if (iVar instanceof CheckoutScreenElementDto$NumericInputScreenElementDto) {
                CheckoutScreenElementDto$NumericInputScreenElementDto checkoutScreenElementDto$NumericInputScreenElementDto = (CheckoutScreenElementDto$NumericInputScreenElementDto) iVar;
                RequiredPropertyInfoDto requiredPropertyInfoDto = checkoutScreenElementDto$NumericInputScreenElementDto.a;
                obj = new ao60(requiredPropertyInfoDto != null ? new nvo(requiredPropertyInfoDto.a, requiredPropertyInfoDto.b) : null, checkoutScreenElementDto$NumericInputScreenElementDto.b, checkoutScreenElementDto$NumericInputScreenElementDto.c, checkoutScreenElementDto$NumericInputScreenElementDto.d, checkoutScreenElementDto$NumericInputScreenElementDto.e, checkoutScreenElementDto$NumericInputScreenElementDto.f, checkoutScreenElementDto$NumericInputScreenElementDto.g);
                str = str2;
                c = c2;
            } else if (iVar instanceof CheckoutScreenElementDto$StopSelectorScreenElementDto) {
                CheckoutScreenElementDto$StopSelectorScreenElementDto checkoutScreenElementDto$StopSelectorScreenElementDto = (CheckoutScreenElementDto$StopSelectorScreenElementDto) iVar;
                RequiredPropertyInfoDto requiredPropertyInfoDto2 = checkoutScreenElementDto$StopSelectorScreenElementDto.a;
                nvo nvoVar = requiredPropertyInfoDto2 != null ? new nvo(requiredPropertyInfoDto2.a, requiredPropertyInfoDto2.b) : null;
                String str5 = checkoutScreenElementDto$StopSelectorScreenElementDto.b;
                String str6 = checkoutScreenElementDto$StopSelectorScreenElementDto.d;
                Boolean bool = checkoutScreenElementDto$StopSelectorScreenElementDto.e;
                String str7 = checkoutScreenElementDto$StopSelectorScreenElementDto.f;
                StopDto stopDto = checkoutScreenElementDto$StopSelectorScreenElementDto.g;
                dfu0 dfu0Var = stopDto != null ? new dfu0(stopDto.a, stopDto.b, stopDto.c, stopDto.d) : null;
                List<StopDto> list2 = checkoutScreenElementDto$StopSelectorScreenElementDto.h;
                ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                for (StopDto stopDto2 : list2) {
                    arrayList3.add(new dfu0(stopDto2.a, stopDto2.b, stopDto2.c, stopDto2.d));
                    str2 = str2;
                }
                str = str2;
                obj = new dhu0(nvoVar, str5, str6, bool, str7, dfu0Var, arrayList3);
                c = '\n';
            } else {
                str = str2;
                if (iVar instanceof CheckoutScreenElementDto$DirectionSelectorScreenElementDto) {
                    CheckoutScreenElementDto$DirectionSelectorScreenElementDto checkoutScreenElementDto$DirectionSelectorScreenElementDto = (CheckoutScreenElementDto$DirectionSelectorScreenElementDto) iVar;
                    RequiredPropertyInfoDto requiredPropertyInfoDto3 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.a;
                    nvo nvoVar2 = requiredPropertyInfoDto3 != null ? new nvo(requiredPropertyInfoDto3.a, requiredPropertyInfoDto3.b) : null;
                    List list3 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.b;
                    if (list3 != null) {
                        List<DirectionDto> list4 = list3;
                        c = '\n';
                        ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
                        for (DirectionDto directionDto : list4) {
                            arrayList4.add(new flj(directionDto.a, directionDto.b));
                        }
                        arrayList = arrayList4;
                    } else {
                        c = '\n';
                        arrayList = null;
                    }
                    String str8 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.c;
                    String str9 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.d;
                    String str10 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.e;
                    String str11 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.f;
                    Boolean bool2 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.g;
                    DirectionDto directionDto2 = checkoutScreenElementDto$DirectionSelectorScreenElementDto.h;
                    obj = new llj(nvoVar2, arrayList, str8, str9, str10, str11, bool2, directionDto2 != null ? new flj(directionDto2.a, directionDto2.b) : null);
                } else {
                    c = '\n';
                    if (iVar instanceof CheckoutScreenElementDto$ReturnTripToggleScreenElementDto) {
                        CheckoutScreenElementDto$ReturnTripToggleScreenElementDto checkoutScreenElementDto$ReturnTripToggleScreenElementDto = (CheckoutScreenElementDto$ReturnTripToggleScreenElementDto) iVar;
                        RequiredPropertyInfoDto requiredPropertyInfoDto4 = checkoutScreenElementDto$ReturnTripToggleScreenElementDto.a;
                        obj = new f2k0(requiredPropertyInfoDto4 != null ? new nvo(requiredPropertyInfoDto4.a, requiredPropertyInfoDto4.b) : null, checkoutScreenElementDto$ReturnTripToggleScreenElementDto.c, Boolean.valueOf(checkoutScreenElementDto$ReturnTripToggleScreenElementDto.d));
                    } else if (jl40.l(iVar, d.INSTANCE)) {
                        obj = p2u.a;
                    } else {
                        if (!jl40.l(iVar, h.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        obj = d521.a;
                    }
                }
            }
            arrayList2.add(obj);
            c2 = c;
            str2 = str;
        }
    }

    public static uvp0 b(a0 a0Var) {
        if (a0Var instanceof SearchDataItemDto$UrlSearchDataDto) {
            return new ftp0(((SearchDataItemDto$UrlSearchDataDto) a0Var).a);
        }
        if (a0Var instanceof SearchDataItemDto$IBeaconSearchDataDto) {
            SearchDataItemDto$IBeaconSearchDataDto searchDataItemDto$IBeaconSearchDataDto = (SearchDataItemDto$IBeaconSearchDataDto) a0Var;
            return new p2v(searchDataItemDto$IBeaconSearchDataDto.a, searchDataItemDto$IBeaconSearchDataDto.b, searchDataItemDto$IBeaconSearchDataDto.c);
        }
        if (a0Var instanceof SearchDataItemDto$EddystoneSearchDataDto) {
            SearchDataItemDto$EddystoneSearchDataDto searchDataItemDto$EddystoneSearchDataDto = (SearchDataItemDto$EddystoneSearchDataDto) a0Var;
            return new fkn(searchDataItemDto$EddystoneSearchDataDto.a, searchDataItemDto$EddystoneSearchDataDto.b);
        }
        if (jl40.l(a0Var, y.INSTANCE)) {
            return p421.a;
        }
        w511.b();
        return null;
    }

    public static jup0 c(SearchResultItemDto searchResultItemDto) {
        h0 h0Var = searchResultItemDto.a;
        String str = searchResultItemDto.d;
        Map map = searchResultItemDto.b;
        a0 a0Var = searchResultItemDto.c;
        if (!(h0Var instanceof SearchResultListItemDto$BusNearbySearchListItemDto)) {
            return h0Var instanceof SearchResultListItemDto$RailwayScheduleSearchListItemDto ? new h6i0(map, str, b(a0Var), 0) : new h6i0(map, str, b(a0Var), 1);
        }
        SearchResultListItemDto$BusNearbySearchListItemDto searchResultListItemDto$BusNearbySearchListItemDto = (SearchResultListItemDto$BusNearbySearchListItemDto) h0Var;
        String str2 = searchResultListItemDto$BusNearbySearchListItemDto.b;
        if (str2 == null) {
            str2 = "";
        }
        return new ov6(str2, searchResultListItemDto$BusNearbySearchListItemDto.c, searchResultListItemDto$BusNearbySearchListItemDto.d, searchResultListItemDto$BusNearbySearchListItemDto.e, searchResultItemDto.b, searchResultItemDto.d, b(a0Var));
    }

    public static CheckoutStatus d(CheckoutOrderStatusDto checkoutOrderStatusDto) {
        int i = l2c.a[checkoutOrderStatusDto.ordinal()];
        if (i == 1) {
            return CheckoutStatus.Failure;
        }
        if (i == 2) {
            return CheckoutStatus.Success;
        }
        if (i == 3) {
            return CheckoutStatus.Processing;
        }
        w511.b();
        return null;
    }
}
