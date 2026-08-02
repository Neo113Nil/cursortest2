package xsna;

import com.ironsource.C4243ba;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Copyright;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.r1r0;
import xsna.vf3;
import xsna.wqu;

/* compiled from: CopyrightInfoRequest.kt */
/* loaded from: classes4.dex */
public final class otj extends awi<yqt> {
    public final UserId s;
    public final UserId t;
    public final Copyright.Type u;
    public final w1r0 v = new w1r0();
    public final zqu w = new zqu();

    /* compiled from: CopyrightInfoRequest.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Copyright.Type.values().length];
            try {
                iArr[Copyright.Type.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Copyright.Type.VK_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public otj(UserId userId, UserId userId2, Copyright.Type type) {
        this.s = userId;
        this.t = userId2;
        this.u = type;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        zqu zquVar;
        Pair pair;
        int i;
        Pair pair2;
        GroupsGroupFullDto groupsGroupFullDto;
        String str;
        GroupsGroupFullDto groupsGroupFullDto2;
        UserId userId = this.s;
        long j = userId.b;
        w1r0 w1r0Var = this.v;
        zqu zquVar2 = this.w;
        if (j < 0) {
            List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) yfb.x(wqu.a.b(zquVar2, Collections.singletonList(new UserId(-userId.b)), null, null, 6)).f(l7r0Var)).d();
            if (d == null || (groupsGroupFullDto2 = (GroupsGroupFullDto) j5g.Y(d)) == null || (str = groupsGroupFullDto2.y1()) == null) {
                str = "";
            }
            pair = new Pair(str, 0);
            zquVar = zquVar2;
        } else {
            zquVar = zquVar2;
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.Y((List) yfb.x(r1r0.a.b(w1r0Var, Collections.singletonList(userId), Collections.singletonList(UsersFieldsDto.SEX), null, null, 58)).f(l7r0Var));
            String a2 = rq.a(usersUserFullDto, new StringBuilder(), ' ');
            BaseSexDto L2 = usersUserFullDto.L2();
            pair = new Pair(a2, Integer.valueOf(L2 != null ? L2.i() : 0));
        }
        String str2 = (String) pair.d();
        int intValue = ((Number) pair.g()).intValue();
        int i2 = a.$EnumSwitchMapping$0[this.u.ordinal()];
        UserId userId2 = this.t;
        if (i2 == 1 || i2 == 2) {
            i = intValue;
            AppsAppDto appsAppDto = (AppsAppDto) j5g.Y(((AppsGetResponseDto) yfb.x(vf3.a.b(null, null, Integer.valueOf((int) userId2.b), null, null)).f(l7r0Var)).d());
            String title = appsAppDto.getTitle();
            new re3();
            pair2 = new Pair(title, re3.b(appsAppDto));
        } else {
            long j2 = userId2.b;
            if (j2 < 0) {
                List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) yfb.x(wqu.a.b(zquVar, Collections.singletonList(fkq0.e(userId2)), null, null, 6)).f(l7r0Var)).d();
                pair2 = new Pair((d2 == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d2)) == null) ? null : groupsGroupFullDto.y1(), null);
                i = intValue;
            } else if (j2 > 0) {
                i = intValue;
                pair2 = new Pair(rq.a((UsersUserFullDto) j5g.Y((List) yfb.x(r1r0.a.b(w1r0Var, Collections.singletonList(userId2), null, C4243ba.n, null, 54)).f(l7r0Var)), new StringBuilder(), ' '), null);
            } else {
                i = intValue;
                pair2 = new Pair("", null);
            }
        }
        return new yqt(str2, i, (String) pair2.d(), (ApiApplication) pair2.g());
    }
}
