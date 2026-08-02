package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.List;

/* compiled from: ShortVideoFields.kt */
/* loaded from: classes18.dex */
public final class wfj0 {
    public static final List<String> a;
    public static final List<String> b;
    public static final List<String> c;

    static {
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.PHOTO_BASE;
        String i = usersFieldsDto.i();
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.FRIEND_STATUS;
        String i2 = usersFieldsDto2.i();
        String i3 = BaseUserGroupFieldsDto.VIDEO_FILES.i();
        String i4 = BaseUserGroupFieldsDto.MEMBERS_COUNT.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto = BaseUserGroupFieldsDto.DOMAIN;
        String i5 = baseUserGroupFieldsDto.i();
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.VERIFIED;
        String i6 = usersFieldsDto3.i();
        UsersFieldsDto usersFieldsDto4 = UsersFieldsDto.IMAGE_STATUS;
        String i7 = usersFieldsDto4.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto2 = BaseUserGroupFieldsDto.IS_NFT;
        String i8 = baseUserGroupFieldsDto2.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto3 = BaseUserGroupFieldsDto.IS_NFT_PHOTO;
        String i9 = baseUserGroupFieldsDto3.i();
        GroupsFieldsDto groupsFieldsDto = GroupsFieldsDto.URL;
        String k = groupsFieldsDto.k();
        String k2 = GroupsFieldsDto.FRIENDS.k();
        GroupsFieldsDto groupsFieldsDto2 = GroupsFieldsDto.VIDEO_LIVES_DATA;
        String k3 = groupsFieldsDto2.k();
        GroupsFieldsDto groupsFieldsDto3 = GroupsFieldsDto.TRUST_MARK;
        a = e43.l(i, i2, i3, i4, i5, i6, i7, i8, i9, k, k2, k3, groupsFieldsDto3.k());
        UsersFieldsDto usersFieldsDto5 = UsersFieldsDto.FOLLOWERS_COUNT;
        String i10 = usersFieldsDto5.i();
        GroupsFieldsDto groupsFieldsDto4 = GroupsFieldsDto.MEMBERS_COUNT;
        String k4 = groupsFieldsDto4.k();
        String i11 = baseUserGroupFieldsDto2.i();
        String i12 = baseUserGroupFieldsDto3.i();
        String i13 = usersFieldsDto.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto4 = BaseUserGroupFieldsDto.FIRST_NAME;
        String i14 = baseUserGroupFieldsDto4.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto5 = BaseUserGroupFieldsDto.LAST_NAME;
        String i15 = baseUserGroupFieldsDto5.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto6 = BaseUserGroupFieldsDto.NAME;
        String i16 = baseUserGroupFieldsDto6.i();
        String i17 = baseUserGroupFieldsDto.i();
        String i18 = usersFieldsDto2.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto7 = BaseUserGroupFieldsDto.MEMBER_STATUS;
        String i19 = baseUserGroupFieldsDto7.i();
        String i20 = usersFieldsDto3.i();
        UsersFieldsDto usersFieldsDto6 = UsersFieldsDto.TRENDING;
        String i21 = usersFieldsDto6.i();
        String i22 = usersFieldsDto4.i();
        UsersFieldsDto usersFieldsDto7 = UsersFieldsDto.OWNER_STATE;
        String i23 = usersFieldsDto7.i();
        BaseUserGroupFieldsDto baseUserGroupFieldsDto8 = BaseUserGroupFieldsDto.DEACTIVATED;
        String i24 = baseUserGroupFieldsDto8.i();
        GroupsFieldsDto groupsFieldsDto5 = GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS;
        b = e43.l(i10, k4, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, groupsFieldsDto5.k(), groupsFieldsDto.k(), groupsFieldsDto2.k(), groupsFieldsDto3.k());
        c = e43.l(BaseUserGroupFieldsDto.ACTION_BUTTON.i(), BaseUserGroupFieldsDto.IS_CLOSED.i(), BaseUserGroupFieldsDto.CAN_SEND_FRIEND_REQUEST.i(), BaseUserGroupFieldsDto.SEX.i(), baseUserGroupFieldsDto4.i(), baseUserGroupFieldsDto5.i(), baseUserGroupFieldsDto.i(), usersFieldsDto.i(), baseUserGroupFieldsDto6.i(), usersFieldsDto2.i(), BaseUserGroupFieldsDto.IS_MEMBER.i(), baseUserGroupFieldsDto7.i(), UsersFieldsDto.IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED.i(), usersFieldsDto3.i(), usersFieldsDto6.i(), usersFieldsDto4.i(), baseUserGroupFieldsDto2.i(), baseUserGroupFieldsDto3.i(), usersFieldsDto7.i(), baseUserGroupFieldsDto8.i(), usersFieldsDto5.i(), groupsFieldsDto4.k(), groupsFieldsDto5.k(), "has_market_items", groupsFieldsDto.k(), groupsFieldsDto3.k());
    }

    public static List a() {
        return c;
    }
}
