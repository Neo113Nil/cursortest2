package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.List;

/* compiled from: ClipsOwnerGridBatchRequest.kt */
/* loaded from: classes17.dex */
public final class aoe {
    public static final List<UsersFieldsDto> a = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.COUNTERS, UsersFieldsDto.FIRST_NAME_INS, UsersFieldsDto.LAST_NAME_INS, UsersFieldsDto.SCREEN_NAME, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.ABOUT, UsersFieldsDto.IS_NFT, UsersFieldsDto.VERIFIED);
    public static final List<GroupsFieldsDto> b = e43.l(GroupsFieldsDto.CLIPS_COUNT, GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.COUNTERS, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.DESCRIPTION, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.URL);
    public static final List<String> c = e43.l("verified", "member_status", "photo_base", "friend_status", "first_name_gen", "image_status", "url");
    public static final List<String> d = e43.l("video_files", "is_friend", "friend_status", "member_status", "is_member", "is_closed", "screen_name", "verified", "image_status", "photo_base", "is_nft", "url");
}
