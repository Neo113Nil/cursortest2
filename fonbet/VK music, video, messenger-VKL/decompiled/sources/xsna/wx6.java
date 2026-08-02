package xsna;

import com.vk.api.generated.messages.dto.MessagesGetConversationsFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.Collections;

/* compiled from: BestFriendsGetApiRequest.kt */
/* loaded from: classes4.dex */
public final class wx6 extends awi<kqs> {
    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        xy2 n;
        jgz jgzVar = new jgz(10);
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.PHOTO_BASE;
        io.reactivex.rxjava3.internal.operators.observable.l2 l0 = rsg0.l0(yfb.x(jgz.h(jgzVar, Collections.singletonList(usersFieldsDto), 10)), null, 3);
        io.reactivex.rxjava3.internal.operators.observable.l2 l02 = rsg0.l0(yfb.z(pyh0.c(new qyh0(), null, 10, Collections.singletonList(usersFieldsDto.i()), 43), new cj1(4)), null, 3);
        n = new vg20().n((r19 & 1) != 0 ? null : null, 10, (r19 & 4) != 0 ? null : MessagesGetConversationsFilterDto.CHATS, (r19 & 8) != 0 ? null : Boolean.TRUE, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : null, (r19 & 8192) != 0 ? null : 2);
        return (kqs) io.reactivex.rxjava3.core.q.J0(l0, l02, rsg0.l0(yfb.x(n), null, 3).L(new com.vk.movika.sdk.base.ui.j(new r9(this, 5), 6), false), new r41(new ux6(0), 8)).a();
    }
}
