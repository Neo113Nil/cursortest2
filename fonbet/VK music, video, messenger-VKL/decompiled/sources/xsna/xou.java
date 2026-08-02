package xsna;

import com.vk.api.generated.groups.dto.GroupsAddressTimetableDayDto;
import com.vk.dto.profile.Timetable;

/* compiled from: GroupsAddressTimetableDtoToTimetableMapper.kt */
/* loaded from: classes3.dex */
public final class xou {
    public static Timetable.WorkTime a(GroupsAddressTimetableDayDto groupsAddressTimetableDayDto) {
        int g = groupsAddressTimetableDayDto.g();
        int f = groupsAddressTimetableDayDto.f();
        Integer e = groupsAddressTimetableDayDto.e();
        int intValue = e != null ? e.intValue() : -1;
        Integer d = groupsAddressTimetableDayDto.d();
        return new Timetable.WorkTime(g, f, intValue, d != null ? d.intValue() : -1);
    }
}
