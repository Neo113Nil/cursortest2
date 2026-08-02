package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsAddressTimetableDayDto;
import com.vk.api.generated.groups.dto.GroupsAddressTimetableDto;
import com.vk.api.generated.groups.dto.GroupsAddressWorkInfoStatusDto;
import com.vk.api.generated.groups.dto.GroupsOpenStatusDto;
import com.vk.api.generated.market.dto.MarketDeliveryPointDto;
import com.vk.api.generated.market.dto.MarketDeliveryPointPlacemarkDto;
import com.vk.api.generated.market.dto.MarketDeliveryPointWithGroupDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.List;
import kotlin.collections.builders.MapBuilder;

/* compiled from: DeliveryPointFromDtoMapper.kt */
/* loaded from: classes18.dex */
public final class jwl implements f0p0 {
    public final ne6 a = new ne6();

    public static DeliveryPoint.Address c(GroupsAddressDto groupsAddressDto) {
        Float n = groupsAddressDto.n();
        if (n == null) {
            return null;
        }
        double floatValue = n.floatValue();
        if (groupsAddressDto.o() == null) {
            return null;
        }
        Coordinates coordinates = new Coordinates(floatValue, r3.floatValue());
        String e = groupsAddressDto.e();
        if (e == null) {
            return null;
        }
        return new DeliveryPoint.Address(e, coordinates.b, coordinates.c, groupsAddressDto.d());
    }

    public static String d(int i) {
        int i2 = i / 60;
        Object a = i2 < 10 ? lhg.a(i2, "0") : Integer.valueOf(i2);
        int i3 = i % 60;
        Object a2 = i3 < 10 ? lhg.a(i3, "0") : Integer.valueOf(i3);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(':');
        sb.append(a2);
        return sb.toString();
    }

    public static DeliveryPoint.WeekDayTimetable e(GroupsAddressTimetableDayDto groupsAddressTimetableDayDto) {
        int intValue;
        int intValue2;
        String d = d(groupsAddressTimetableDayDto.g());
        String d2 = d(groupsAddressTimetableDayDto.f());
        Integer d3 = groupsAddressTimetableDayDto.d();
        Integer e = groupsAddressTimetableDayDto.e();
        DeliveryPoint.TimetableBreak timetableBreak = null;
        if (d3 != null && e != null && (intValue = e.intValue()) != (intValue2 = d3.intValue())) {
            timetableBreak = new DeliveryPoint.TimetableBreak(d(intValue2), d(intValue));
        }
        return new DeliveryPoint.WeekDayTimetable(d, d2, timetableBreak);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r0 != null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DeliveryPoint.WorkingInfo f(GroupsAddressDto groupsAddressDto) {
        DeliveryPoint.OpenStatus openStatus;
        MapBuilder mapBuilder;
        DeliveryPoint.WorkInfoStatus workInfoStatus;
        String i;
        DeliveryPoint.OpenStatus.Status status;
        GroupsOpenStatusDto.StyleDto f;
        GroupsOpenStatusDto B = groupsAddressDto.B();
        String i2 = (B == null || (f = B.f()) == null) ? null : f.i();
        GroupsOpenStatusDto B2 = groupsAddressDto.B();
        String d = B2 != null ? B2.d() : null;
        if (i2 == null || d == null) {
            openStatus = null;
        } else {
            DeliveryPoint.OpenStatus.Status.a aVar = DeliveryPoint.OpenStatus.Status.Companion;
            String n = cqm0.n(i2);
            aVar.getClass();
            try {
                status = DeliveryPoint.OpenStatus.Status.valueOf(n);
            } catch (Throwable unused) {
                status = DeliveryPoint.OpenStatus.Status.UNKNOWN;
            }
            GroupsOpenStatusDto B3 = groupsAddressDto.B();
            openStatus = new DeliveryPoint.OpenStatus(status, d, B3 != null ? B3.e() : null);
        }
        GroupsAddressTimetableDto F = groupsAddressDto.F();
        if (F != null) {
            MapBuilder mapBuilder2 = new MapBuilder();
            DeliveryPoint.WeekDay weekDay = DeliveryPoint.WeekDay.MONDAY;
            GroupsAddressTimetableDayDto e = F.e();
            mapBuilder2.put(weekDay, e != null ? e(e) : null);
            DeliveryPoint.WeekDay weekDay2 = DeliveryPoint.WeekDay.TUESDAY;
            GroupsAddressTimetableDayDto j = F.j();
            mapBuilder2.put(weekDay2, j != null ? e(j) : null);
            DeliveryPoint.WeekDay weekDay3 = DeliveryPoint.WeekDay.WEDNESDAY;
            GroupsAddressTimetableDayDto k = F.k();
            mapBuilder2.put(weekDay3, k != null ? e(k) : null);
            DeliveryPoint.WeekDay weekDay4 = DeliveryPoint.WeekDay.THURSDAY;
            GroupsAddressTimetableDayDto i3 = F.i();
            mapBuilder2.put(weekDay4, i3 != null ? e(i3) : null);
            DeliveryPoint.WeekDay weekDay5 = DeliveryPoint.WeekDay.FRIDAY;
            GroupsAddressTimetableDayDto d2 = F.d();
            mapBuilder2.put(weekDay5, d2 != null ? e(d2) : null);
            DeliveryPoint.WeekDay weekDay6 = DeliveryPoint.WeekDay.SATURDAY;
            GroupsAddressTimetableDayDto f2 = F.f();
            mapBuilder2.put(weekDay6, f2 != null ? e(f2) : null);
            DeliveryPoint.WeekDay weekDay7 = DeliveryPoint.WeekDay.SUNDAY;
            GroupsAddressTimetableDayDto g = F.g();
            mapBuilder2.put(weekDay7, g != null ? e(g) : null);
            mapBuilder = mapBuilder2.h();
        }
        mapBuilder = null;
        GroupsAddressWorkInfoStatusDto K = groupsAddressDto.K();
        if (K == null || (i = K.i()) == null) {
            workInfoStatus = null;
        } else {
            DeliveryPoint.WorkInfoStatus.a aVar2 = DeliveryPoint.WorkInfoStatus.Companion;
            String n2 = cqm0.n(i);
            aVar2.getClass();
            try {
                workInfoStatus = DeliveryPoint.WorkInfoStatus.valueOf(n2);
            } catch (Throwable unused2) {
                workInfoStatus = DeliveryPoint.WorkInfoStatus.NO_INFO;
            }
        }
        return new DeliveryPoint.WorkingInfo(openStatus, workInfoStatus, mapBuilder != null ? new bpw(mapBuilder) : null);
    }

    @Override // xsna.f0p0
    public final DeliveryPoint a(MarketDeliveryPointDto marketDeliveryPointDto) {
        DeliveryPoint.Address c = c(marketDeliveryPointDto.d());
        if (c == null) {
            return null;
        }
        DeliveryPoint.Service.a aVar = DeliveryPoint.Service.Companion;
        int g = marketDeliveryPointDto.g();
        aVar.getClass();
        return new DeliveryPoint(marketDeliveryPointDto.getId(), null, marketDeliveryPointDto.f(), DeliveryPoint.Service.a.a(g), marketDeliveryPointDto.e(), c, f(marketDeliveryPointDto.d()), new DeliveryPoint.PlaceMark(marketDeliveryPointDto.e(), null, null));
    }

    public final DeliveryPoint b(MarketDeliveryPointWithGroupDto marketDeliveryPointWithGroupDto) {
        DeliveryPoint.PlaceMark placeMark;
        DeliveryPoint.Address c = c(marketDeliveryPointWithGroupDto.d());
        Image image = null;
        if (c == null) {
            return null;
        }
        DeliveryPoint.Service.a aVar = DeliveryPoint.Service.Companion;
        int j = marketDeliveryPointWithGroupDto.j();
        aVar.getClass();
        DeliveryPoint.Service a = DeliveryPoint.Service.a.a(j);
        int id = marketDeliveryPointWithGroupDto.getId();
        UserId g = marketDeliveryPointWithGroupDto.g();
        String f = marketDeliveryPointWithGroupDto.f();
        String e = marketDeliveryPointWithGroupDto.e();
        DeliveryPoint.WorkingInfo f2 = f(marketDeliveryPointWithGroupDto.d());
        MarketDeliveryPointPlacemarkDto i = marketDeliveryPointWithGroupDto.i();
        String e2 = marketDeliveryPointWithGroupDto.e();
        if (i != null) {
            String title = i.getTitle();
            if (title != null) {
                e2 = title;
            }
            String d = i.d();
            List<BaseImageDto> e3 = i.e();
            if (e3 != null) {
                this.a.getClass();
                image = ne6.a(e3);
            }
            placeMark = new DeliveryPoint.PlaceMark(e2, d, image);
        } else {
            placeMark = new DeliveryPoint.PlaceMark(e2, null, null);
        }
        return new DeliveryPoint(id, g, f, a, e, c, f2, placeMark);
    }
}
