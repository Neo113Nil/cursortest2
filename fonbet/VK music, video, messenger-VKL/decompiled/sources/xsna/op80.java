package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.Collections;
import xsna.hd6;
import xsna.r1r0;

/* compiled from: OnlyCounterLoadingFriendsPresenter.kt */
/* loaded from: classes7.dex */
public final class op80 extends hd6 {
    public final UserId e;
    public final bpn0 f;

    public op80(FriendsFragment friendsFragment, UserId userId) {
        super(friendsFragment);
        this.e = userId;
        this.f = new bpn0(new ig(24));
    }

    @Override // xsna.hd6
    public final void g() {
        this.d.b(rsg0.y0(yfb.x(r1r0.a.b((t1r0) this.f.getValue(), Collections.singletonList(this.e), Collections.singletonList(UsersFieldsDto.COUNTERS), null, null, 58)), null, null, 3).subscribe(new jsv(new bbw(this, 17), 10), new w250(new np80(1, this.b, hd6.a.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), 5)));
    }
}
