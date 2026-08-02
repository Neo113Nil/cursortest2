package xsna;

import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;

/* compiled from: SubscriptionsItemGroupFullToGroupMapper.kt */
/* loaded from: classes3.dex */
public final class f0n0 {

    /* compiled from: SubscriptionsItemGroupFullToGroupMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UsersSubscriptionsItemDto.GroupsGroupFullDto.LeaveModeDto.values().length];
            try {
                iArr[UsersSubscriptionsItemDto.GroupsGroupFullDto.LeaveModeDto.ADMIN_LEAVE_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UsersSubscriptionsItemDto.GroupsGroupFullDto.LeaveModeDto.ADMIN_LEAVE_OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
