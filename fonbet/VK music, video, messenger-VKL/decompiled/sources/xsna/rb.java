package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: AbsFriendsAndFollowersTabRepository.kt */
/* loaded from: classes15.dex */
public abstract class rb {
    public final UserId a;
    public final String b;
    public final ots c;
    public final u1r0 d;
    public final j2r0 e = new j2r0();
    public final bpn0 f = new bpn0(new jb(0));
    public final List<UsersFieldsDto> g = e43.l(UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.FIRST_NAME_GEN, UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.COUNTERS, UsersFieldsDto.SEX);

    public rb(UserId userId, String str, ots otsVar, u1r0 u1r0Var) {
        this.a = userId;
        this.b = str;
        this.c = otsVar;
        this.d = u1r0Var;
    }

    public abstract io.reactivex.rxjava3.core.x<jks> a(int i, boolean z);
}
