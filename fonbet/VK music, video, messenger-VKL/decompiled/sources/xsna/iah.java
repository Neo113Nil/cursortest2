package xsna;

import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.domain.User;

/* compiled from: CommunityMembersInteractor.kt */
/* loaded from: classes5.dex */
public final class iah {

    /* compiled from: CommunityMembersInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityMembersFilter.values().length];
            try {
                iArr[CommunityMembersFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityMembersFilter.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityMembersFilter.UNSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityMembersFilter.DONUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final User a(GroupsUserXtrRoleDto groupsUserXtrRoleDto) {
        VisibleStatus visibleStatus;
        UserId D0 = groupsUserXtrRoleDto.D0();
        String G = groupsUserXtrRoleDto.G();
        if (G == null) {
            G = "";
        }
        String H0 = groupsUserXtrRoleDto.H0();
        if (H0 == null) {
            H0 = "";
        }
        String t1 = groupsUserXtrRoleDto.t1();
        Boolean U1 = groupsUserXtrRoleDto.U1();
        UsersOnlineInfoDto d1 = groupsUserXtrRoleDto.d1();
        if (d1 != null) {
            long intValue = d1.e() != null ? r2.intValue() : 0L;
            Boolean j = d1.j();
            boolean booleanValue = j != null ? j.booleanValue() : false;
            Integer d = d1.d();
            visibleStatus = new VisibleStatus(intValue, booleanValue, d != null ? d.intValue() : 0, epx.f(d1.i(), Boolean.TRUE) ? Platform.MOBILE : Platform.WEB);
        } else {
            visibleStatus = null;
        }
        return new User(D0, G, H0, t1, visibleStatus, U1);
    }
}
