package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ObsceneTextFilter;
import java.util.Collections;
import java.util.List;
import xsna.s1r0;
import xsna.xqu;

/* compiled from: StoryEditorUtilsImpl.kt */
/* loaded from: classes16.dex */
public final class c2m0 implements b2m0 {
    public static final List<UsersFieldsDto> b = e43.l(UsersFieldsDto.FIRST_NAME_GEN, UsersFieldsDto.LAST_NAME_GEN, UsersFieldsDto.VERIFIED, UsersFieldsDto.IS_VERIFIED, UsersFieldsDto.OAUTH_VERIFICATION);
    public static final List<GroupsFieldsDto> c = e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.VERIFIED);
    public final gpj0 a;

    public c2m0(gpj0 gpj0Var) {
        this.a = gpj0Var;
    }

    @Override // xsna.b2m0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(UserId userId) {
        if (fkq0.b(userId)) {
            return rsg0.T(yfb.x(xqu.a.a(null, Collections.singletonList(fkq0.a(userId)), (4 & 2) != 0 ? null : c))).U(new a840(new hwi0(8), 10));
        }
        List singletonList = Collections.singletonList(userId);
        if ((58 & 1) != 0) {
            singletonList = null;
        }
        return rsg0.T(yfb.x(s1r0.a.b(singletonList, null, (58 & 4) != 0 ? null : b, null, null))).U(new p5w(new tml0(2), 21));
    }

    @Override // xsna.b2m0
    public final ObsceneTextFilter b() {
        return this.a.b();
    }

    @Override // xsna.b2m0
    public final String c() {
        return this.a.a();
    }
}
