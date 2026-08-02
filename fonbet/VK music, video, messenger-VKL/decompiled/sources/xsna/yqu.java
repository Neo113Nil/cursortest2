package xsna;

import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: GroupsService.kt */
/* loaded from: classes11.dex */
public interface yqu extends wqu {

    /* compiled from: GroupsService.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static ufx a(UserId userId, UserId userId2) {
            ufx ufxVar = new ufx("groups.isMember", new s11(12), new to(16));
            ufx.m(ufxVar, "group_id", userId, 1L, 8);
            if (userId2 != null) {
                ufx.m(ufxVar, "user_id", userId2, 0L, 8);
            }
            return ufxVar;
        }

        public static ufx b(String str, String str2, String str3, String str4, UserId userId, String str5, String str6, String str7) {
            ufx ufxVar = new ufx("groups.join", new io.reactivex.rxjava3.processors.b(18), new io.reactivex.rxjava3.subjects.c(22));
            ufx.m(ufxVar, "group_id", userId, 1L, 8);
            if (str != null) {
                ufx.n(ufxVar, "not_sure", str, 0, 12);
            }
            if (str2 != null) {
                ufx.n(ufxVar, "source", str2, 0, 12);
            }
            if (str3 != null) {
                ufx.n(ufxVar, "track_code", str3, 0, 12);
            }
            if (str4 != null) {
                ufx.n(ufxVar, "invite_code", str4, 0, 12);
            }
            if (str5 != null) {
                ufx.n(ufxVar, "source_ui", str5, 0, 12);
            }
            if (str6 != null) {
                ufx.n(ufxVar, "ad_attribution", str6, 0, 12);
            }
            if (str7 != null) {
                ufx.n(ufxVar, "full_source", str7, 0, 12);
            }
            return ufxVar;
        }

        public static /* synthetic */ xy2 c(yqu yquVar, UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
            UserId userId2;
            String str8;
            String str9;
            String str10;
            String str11;
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 64) != 0) {
                str5 = null;
            }
            if ((i & 128) != 0) {
                str6 = null;
            }
            if ((i & 256) != 0) {
                String str12 = str4;
                userId2 = userId;
                str8 = str;
                str9 = str2;
                str10 = str3;
                str11 = str12;
                str7 = null;
            } else {
                String str13 = str4;
                userId2 = userId;
                str8 = str;
                str9 = str2;
                str10 = str3;
                str11 = str13;
            }
            return yquVar.l(str8, str9, str10, str11, userId2, str5, str6, str7);
        }

        public static ufx d(UserId userId, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto, String str, String str2, String str3) {
            ufx ufxVar = new ufx("groups.leave", new p11(16), new rf3(13));
            ufx.m(ufxVar, "group_id", userId, 1L, 8);
            if (groupsLeaveLeaveModeDto != null) {
                ufx.n(ufxVar, "leave_mode", groupsLeaveLeaveModeDto.i(), 0, 12);
            }
            if (str != null) {
                ufx.n(ufxVar, "source", str, 0, 12);
            }
            if (str2 != null) {
                ufx.n(ufxVar, "track_code", str2, 0, 12);
            }
            if (str3 != null) {
                ufx.n(ufxVar, "source_ui", str3, 0, 12);
            }
            return ufxVar;
        }

        public static /* synthetic */ xy2 e(yqu yquVar, UserId userId, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto, String str, String str2, String str3, int i) {
            if ((i & 2) != 0) {
                groupsLeaveLeaveModeDto = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            return yquVar.d(userId, groupsLeaveLeaveModeDto, str, str2, str3);
        }
    }

    ufx d(UserId userId, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto, String str, String str2, String str3);

    ufx l(String str, String str2, String str3, String str4, UserId userId, String str5, String str6, String str7);
}
