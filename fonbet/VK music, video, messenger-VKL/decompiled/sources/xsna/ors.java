package xsna;

import com.vk.api.generated.friends.dto.FriendsRecBlockButtonActionDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockButtonActionTypeDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockButtonDto;
import com.vk.dto.user.ProfileActionButton;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FriendsRecBlockButtonDtoToProfileActionButtonMapper.kt */
/* loaded from: classes3.dex */
public final class ors {

    /* compiled from: FriendsRecBlockButtonDtoToProfileActionButtonMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsRecBlockButtonActionTypeDto.values().length];
            try {
                iArr[FriendsRecBlockButtonActionTypeDto.ADD_FRIEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsRecBlockButtonActionTypeDto.DELETE_FRIEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ProfileActionButton a(FriendsRecBlockButtonDto friendsRecBlockButtonDto) {
        ProfileActionButton.Type type;
        ProfileActionButton.ActionType actionType;
        String type2 = friendsRecBlockButtonDto.getType();
        if (type2 == null || (type = ProfileActionButton.Type.valueOf(type2.toUpperCase(Locale.ROOT))) == null) {
            type = ProfileActionButton.Type.ADD;
        }
        String e = friendsRecBlockButtonDto.e();
        ProfileActionButton.Action action = null;
        ProfileActionButton.Icon valueOf = e != null ? ProfileActionButton.Icon.valueOf(e.toUpperCase(Locale.ROOT)) : null;
        FriendsRecBlockButtonActionDto d = friendsRecBlockButtonDto.d();
        if (d != null) {
            int i = a.$EnumSwitchMapping$0[d.d().ordinal()];
            if (i == 1) {
                actionType = ProfileActionButton.ActionType.ADD_FRIEND;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                actionType = ProfileActionButton.ActionType.DELETE_FRIEND;
            }
            action = new ProfileActionButton.Action(actionType, d.getUserId());
        }
        return new ProfileActionButton(type, valueOf, action);
    }
}
