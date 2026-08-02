package xsna;

import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListInvitationStatusDto;

/* compiled from: FriendModelConverter.kt */
/* loaded from: classes14.dex */
public final class kis {

    /* compiled from: FriendModelConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGetFriendsInvitationListInvitationStatusDto.values().length];
            try {
                iArr[GroupsGetFriendsInvitationListInvitationStatusDto.INVITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGetFriendsInvitationListInvitationStatusDto.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsGetFriendsInvitationListInvitationStatusDto.NOT_INVITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
