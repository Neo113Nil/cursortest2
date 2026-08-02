package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.List;

/* compiled from: ShortVideoFields.kt */
/* loaded from: classes17.dex */
public final class xfj0 {
    public static final List<String> a;
    public static final List<String> b;

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
        a = e43.l(i, i2, i3, i4, i5, i6, i7, i8, i9, groupsFieldsDto.k(), GroupsFieldsDto.FRIENDS.k(), GroupsFieldsDto.VIDEO_LIVES_DATA.k(), GroupsFieldsDto.TRUST_MARK.k());
        b = e43.l(UsersFieldsDto.FOLLOWERS_COUNT.i(), GroupsFieldsDto.MEMBERS_COUNT.k(), baseUserGroupFieldsDto2.i(), baseUserGroupFieldsDto3.i(), baseUserGroupFieldsDto.i(), usersFieldsDto.i(), BaseUserGroupFieldsDto.FIRST_NAME.i(), BaseUserGroupFieldsDto.LAST_NAME.i(), BaseUserGroupFieldsDto.NAME.i(), usersFieldsDto2.i(), BaseUserGroupFieldsDto.MEMBER_STATUS.i(), usersFieldsDto3.i(), UsersFieldsDto.TRENDING.i(), usersFieldsDto4.i(), UsersFieldsDto.OWNER_STATE.i(), BaseUserGroupFieldsDto.DEACTIVATED.i(), GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS.k(), groupsFieldsDto.k());
    }
}
