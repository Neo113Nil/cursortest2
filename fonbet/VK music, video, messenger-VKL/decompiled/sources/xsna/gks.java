package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.eks;
import xsna.oks;
import xsna.r1r0;

/* compiled from: FriendsAndFollowersFeature.kt */
/* loaded from: classes15.dex */
public final class gks extends wk50<tls, xks, eks, oks> {
    public final sks f;
    public final f4z g;

    public gks(sks sksVar, rks rksVar, eks.a aVar) {
        super(aVar, rksVar);
        this.f = sksVar;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(xks xksVar, eks eksVar) {
        eks eksVar2 = eksVar;
        if (eksVar2 instanceof eks.a) {
            eks.a aVar = (eks.a) eksVar2;
            T(new oks.a(aVar.b, aVar.c));
            sks sksVar = this.f;
            a7f0.a.f(this, rsg0.w0(yfb.x(r1r0.a.b(sksVar.a, Collections.singletonList(sksVar.b), Collections.singletonList(UsersFieldsDto.COUNTERS), null, null, 58))).l(new aa6(new leq(5), 21)), new o1e(this, 25), null, 5);
            return;
        }
        if (eksVar2 instanceof eks.b) {
            T(new oks.d(((eks.b) eksVar2).b));
        } else {
            if (!(eksVar2 instanceof eks.c)) {
                throw new NoWhenBranchMatchedException();
            }
            eks.c cVar = (eks.c) eksVar2;
            T(new oks.b(cVar.c, cVar.b));
        }
    }
}
