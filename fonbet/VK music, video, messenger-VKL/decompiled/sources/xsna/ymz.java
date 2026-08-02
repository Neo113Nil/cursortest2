package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.toggle.features.ComFeatures;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.wqu;

/* compiled from: LiveUsersController.java */
/* loaded from: classes3.dex */
public final class ymz {
    public static volatile ymz a;

    /* compiled from: LiveUsersController.java */
    public class a implements io.reactivex.rxjava3.functions.l<List<UserProfile>, io.reactivex.rxjava3.core.t<UserProfile>> {
        @Override // io.reactivex.rxjava3.functions.l
        public final io.reactivex.rxjava3.core.t<UserProfile> apply(List<UserProfile> list) throws Throwable {
            return io.reactivex.rxjava3.core.q.T(list.get(0));
        }
    }

    public static boolean a(Group group) {
        int i = group.C;
        return (i == 1 || i == 4 || i == 3) ? false : true;
    }

    public static boolean b(UserProfile userProfile) {
        int i = userProfile.v;
        if (i == 3 || i == 1) {
            return false;
        }
        return !o25.a().a(userProfile.c);
    }

    public static ymz c() {
        if (a == null) {
            synchronized (ymz.class) {
                try {
                    if (a == null) {
                        a = new ymz();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 d(UserId userId) {
        ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            return rsg0.y0(new rpu(userId), null, null, 3);
        }
        fz2 y = yfb.y(wqu.a.a(null, Collections.singletonList(fkq0.a(userId)), Arrays.asList(GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.START_DATE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.BAN_INFO, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.ENABLED_FEATURES)), new xmz(0));
        ahn.D(y);
        return rsg0.y0(y, null, null, 3);
    }

    public static io.reactivex.rxjava3.core.q e(UserId userId) {
        return rsg0.y0(new z0r0(Collections.singletonList(userId), new String[]{"can_send_friend_request,sex,first_name", "last_name", "photo_base", "name", "friend_status", "is_video_live_notifications_blocked", "blacklisted", "blacklisted_by_me"}), null, null, 3).L(new a(), false);
    }
}
