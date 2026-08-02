package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FollowersRepository.kt */
/* loaded from: classes15.dex */
public final class l4s extends rb {
    public final ArrayList h;

    /* compiled from: FollowersRepository.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UsersUserFullDto, UserProfile> {
        @Override // xsna.izs
        public final UserProfile invoke(UsersUserFullDto usersUserFullDto) {
            ((j2r0) this.receiver).getClass();
            return j2r0.a(usersUserFullDto);
        }
    }

    public l4s(UserId userId, String str, ots otsVar, u1r0 u1r0Var) {
        super(userId, str, otsVar, u1r0Var);
        this.h = new ckq0(userId).a();
    }

    @Override // xsna.rb
    public final io.reactivex.rxjava3.core.x<jks> a(int i, boolean z) {
        UserId userId = this.a;
        if (fkq0.c(userId)) {
            return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(yfb.x(this.c.p(30, this.b, Integer.valueOf(i), this.a, this.h)), 7), new j7(new nvg(this, 22), 23));
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(b4q.b(userId, "userId isn't real: ")));
        return io.reactivex.rxjava3.core.x.k(jks.d);
    }
}
