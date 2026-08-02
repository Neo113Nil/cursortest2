package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.user.deactivation.Deactivation;
import java.util.List;

/* compiled from: ClipsProfileInfoRepository.kt */
/* loaded from: classes17.dex */
public final class gxe {
    public static final List<UsersFieldsDto> d = e43.l(UsersFieldsDto.SCREEN_NAME, UsersFieldsDto.VERIFIED, UsersFieldsDto.COUNTERS, UsersFieldsDto.CLIPS_COUNT, UsersFieldsDto.FOLLOWERS_COUNT, UsersFieldsDto.COMMON_COUNT, UsersFieldsDto.DESCRIPTION, UsersFieldsDto.ABOUT, UsersFieldsDto.STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.PHOTO_BASE);
    public static final List<GroupsFieldsDto> e = e43.l(GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.COUNTERS, GroupsFieldsDto.CLIPS_COUNT, GroupsFieldsDto.DESCRIPTION, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.DEACTIVATED, GroupsFieldsDto.DEACTIVATED_TYPE, GroupsFieldsDto.DEACTIVATED_MESSAGE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.URL);
    public final rhh0 a;
    public final w1r0 b;
    public final aru c;

    /* compiled from: ClipsProfileInfoRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Deactivation.Reason.values().length];
            try {
                iArr[Deactivation.Reason.Banned.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Deactivation.Reason.Deleted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gxe(rhh0 rhh0Var) {
        w1r0 w1r0Var = new w1r0();
        aru aruVar = new aru();
        this.a = rhh0Var;
        this.b = w1r0Var;
        this.c = aruVar;
    }
}
