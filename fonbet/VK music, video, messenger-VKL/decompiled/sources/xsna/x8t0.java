package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.video.dto.VideoSetNotificationsStatusStatusDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.yqu;

/* compiled from: VideoProfileRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class x8t0 implements v8t0 {
    public static final List<UsersFieldsDto> f;
    public static final List<GroupsFieldsDto> g;
    public static final List<UsersFieldsDto> h;
    public static final List<GroupsFieldsDto> i;
    public static final List<GroupsFieldsDto> j;
    public final u1r0 a;
    public final zqu b;
    public final es c;
    public final uft0 d;
    public final ots e;

    /* compiled from: VideoProfileRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.SCREEN_NAME;
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.VERIFIED;
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.COUNTERS;
        UsersFieldsDto usersFieldsDto4 = UsersFieldsDto.COMMON_COUNT;
        UsersFieldsDto usersFieldsDto5 = UsersFieldsDto.ABOUT;
        UsersFieldsDto usersFieldsDto6 = UsersFieldsDto.FRIEND_STATUS;
        UsersFieldsDto usersFieldsDto7 = UsersFieldsDto.FOLLOWERS_COUNT;
        UsersFieldsDto usersFieldsDto8 = UsersFieldsDto.PHOTO_AVG_COLOR;
        UsersFieldsDto usersFieldsDto9 = UsersFieldsDto.PHOTO_BASE;
        f = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto3, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8, usersFieldsDto9);
        GroupsFieldsDto groupsFieldsDto = GroupsFieldsDto.SCREEN_NAME;
        GroupsFieldsDto groupsFieldsDto2 = GroupsFieldsDto.VERIFIED;
        GroupsFieldsDto groupsFieldsDto3 = GroupsFieldsDto.COUNTERS;
        GroupsFieldsDto groupsFieldsDto4 = GroupsFieldsDto.DESCRIPTION;
        GroupsFieldsDto groupsFieldsDto5 = GroupsFieldsDto.MEMBER_STATUS;
        GroupsFieldsDto groupsFieldsDto6 = GroupsFieldsDto.LEAVE_MODE;
        GroupsFieldsDto groupsFieldsDto7 = GroupsFieldsDto.MEMBERS_COUNT;
        GroupsFieldsDto groupsFieldsDto8 = GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS;
        GroupsFieldsDto groupsFieldsDto9 = GroupsFieldsDto.PHOTO_AVG_COLOR;
        GroupsFieldsDto groupsFieldsDto10 = GroupsFieldsDto.COVER;
        GroupsFieldsDto groupsFieldsDto11 = GroupsFieldsDto.VIDEO_COVER;
        GroupsFieldsDto groupsFieldsDto12 = GroupsFieldsDto.STRIKES_RESTRICTIONS;
        GroupsFieldsDto groupsFieldsDto13 = GroupsFieldsDto.PHOTO_BASE;
        g = e43.l(groupsFieldsDto, groupsFieldsDto2, groupsFieldsDto3, groupsFieldsDto4, groupsFieldsDto5, groupsFieldsDto6, groupsFieldsDto7, groupsFieldsDto8, groupsFieldsDto9, groupsFieldsDto10, groupsFieldsDto11, groupsFieldsDto12, groupsFieldsDto13, GroupsFieldsDto.CREATE_DATE, GroupsFieldsDto.DONUT, GroupsFieldsDto.CAN_UPLOAD_STORY, GroupsFieldsDto.CAN_UPLOAD_CLIP);
        h = e43.l(usersFieldsDto, usersFieldsDto9);
        i = e43.l(groupsFieldsDto, groupsFieldsDto12, groupsFieldsDto13);
        j = e43.l(GroupsFieldsDto.VIDEO_CHANNEL_DATA, GroupsFieldsDto.HAS_PHOTO);
    }

    public x8t0(u1r0 u1r0Var, zqu zquVar, es esVar, uft0 uft0Var, ots otsVar) {
        this.a = u1r0Var;
        this.b = zquVar;
        this.c = esVar;
        this.d = uft0Var;
        this.e = otsVar;
    }

    @Override // xsna.v8t0
    public final io.reactivex.rxjava3.internal.operators.single.s a(UserId userId, VideoNotificationsStatus videoNotificationsStatus) {
        tfx n;
        int i2 = a.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()];
        uft0 uft0Var = this.d;
        if (i2 == 1) {
            n = uft0Var.n(userId, VideoSetNotificationsStatusStatusDto.ALL);
        } else if (i2 == 2) {
            n = uft0Var.n(userId, VideoSetNotificationsStatusStatusDto.PREFERRED);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n = uft0Var.n(userId, VideoSetNotificationsStatusStatusDto.NONE);
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(rsg0.w0(yfb.x(n)), new vvi0(new w8t0(0, userId, videoNotificationsStatus), 7));
    }

    @Override // xsna.v8t0
    public final io.reactivex.rxjava3.internal.operators.single.y b(UserId userId) {
        return rsg0.w0(yfb.x(xqu.h(this.b, userId, Collections.singletonList(GroupsFilterDto.EDITOR), i, null, 999, 40))).l(new l340(new udk0(7), 20));
    }

    @Override // xsna.v8t0
    public final io.reactivex.rxjava3.internal.operators.single.s c() {
        return new io.reactivex.rxjava3.internal.operators.single.s(rsg0.w0(yfb.x(this.c.m(null))), new hl30(new n0m0(12), 19));
    }

    @Override // xsna.v8t0
    public final io.reactivex.rxjava3.internal.operators.single.s d(UserId userId) {
        if (fkq0.d(userId)) {
            return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(nts.d(this.e, userId, null, Boolean.TRUE, null, null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE))), new o7y(new njs(userId, this), 27)), new i3u(new yml0(10), 21));
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(yqu.a.c(this.b, fkq0.a(userId), null, "VIDEO_CHANNEL", null, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE))), new nzs0(new dmu(userId, 1), 1)), new uq80(new fuh0(7), 8));
    }

    @Override // xsna.v8t0
    public final io.reactivex.rxjava3.internal.operators.single.s e(UserId userId, AdminLeaveAction adminLeaveAction, String str, String str2) {
        if (fkq0.d(userId)) {
            return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(nts.g(this.e, userId, null, null, null, null, 30))), new fv70(new sys0(userId, 1), 29)), new xul0(new i0r(28), 4));
        }
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(yqu.a.e(this.b, fkq0.a(userId), adminLeaveAction != null ? adminLeaveAction.i() : null, str2, str, null, 112))).l(new ct(new j6e0(20), 28)), new cp50(new eus0(userId, 1), 23)), new cxd0(new wep0(5), 13));
    }

    @Override // xsna.v8t0
    public final io.reactivex.rxjava3.internal.operators.single.s g(UserId userId) {
        xy2 o;
        o = this.b.o(fkq0.e(userId), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
        return new io.reactivex.rxjava3.internal.operators.single.s(rsg0.w0(yfb.x(o)), new dnz(new c220(27), 25));
    }
}
