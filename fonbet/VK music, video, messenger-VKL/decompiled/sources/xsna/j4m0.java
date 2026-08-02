package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: StoryGroups.kt */
/* loaded from: classes2.dex */
public final class j4m0 {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final List<GroupsFieldsDto> b;
    public static final List<GroupsFieldsDto> c;

    static {
        GroupsFieldsDto groupsFieldsDto = GroupsFieldsDto.START_DATE;
        GroupsFieldsDto groupsFieldsDto2 = GroupsFieldsDto.MEMBERS_COUNT;
        GroupsFieldsDto groupsFieldsDto3 = GroupsFieldsDto.VERIFIED;
        GroupsFieldsDto groupsFieldsDto4 = GroupsFieldsDto.SCREEN_NAME;
        GroupsFieldsDto groupsFieldsDto5 = GroupsFieldsDto.ACTIVITY;
        GroupsFieldsDto groupsFieldsDto6 = GroupsFieldsDto.TRENDING;
        GroupsFieldsDto groupsFieldsDto7 = GroupsFieldsDto.CAN_UPLOAD_STORY;
        GroupsFieldsDto groupsFieldsDto8 = GroupsFieldsDto.CAN_UPLOAD_CLIP;
        GroupsFieldsDto groupsFieldsDto9 = GroupsFieldsDto.WALL;
        GroupsFieldsDto groupsFieldsDto10 = GroupsFieldsDto.IS_BUSINESS_CATEGORY;
        b = e43.l(groupsFieldsDto, groupsFieldsDto2, groupsFieldsDto3, groupsFieldsDto4, groupsFieldsDto5, groupsFieldsDto6, groupsFieldsDto7, groupsFieldsDto8, groupsFieldsDto9, groupsFieldsDto10);
        c = e43.l(groupsFieldsDto, groupsFieldsDto2, groupsFieldsDto3, groupsFieldsDto4, groupsFieldsDto5, groupsFieldsDto6, groupsFieldsDto7, groupsFieldsDto8, groupsFieldsDto9, groupsFieldsDto10, GroupsFieldsDto.IS_MARKET_ONLINE_BOOKING_SETTING_ENABLED, GroupsFieldsDto.IS_MARKET_MARKET_LINK_ATTACHMENT_ENABLED, GroupsFieldsDto.IS_MARKET_MESSAGE_TO_BC_ATTACHMENT_ENABLED, GroupsFieldsDto.AGE_MARK, GroupsFieldsDto.AGE_LIMITS, GroupsFieldsDto.IS_MARKET_ENABLED, GroupsFieldsDto.IS_BUSINESS);
    }
}
