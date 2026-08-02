package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: BlacklistInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class fe7 implements ee7 {
    public final ofy0 a;

    public fe7(ofy0 ofy0Var) {
        this.a = ofy0Var;
    }

    @Override // xsna.ee7
    public final io.reactivex.rxjava3.core.a a(UserId userId) {
        return rsg0.Z(yfb.x(new es().j(userId, null)));
    }

    @Override // xsna.ee7
    public final io.reactivex.rxjava3.core.q<u06> b(int i, int i2) {
        tfx tfxVar = new tfx("account.getBanned", new zq(0), new com.vk.movika.sdk.android.defaultplayer.interactive.c(1));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
        tfxVar.f(i2, 0, 200, "count");
        dz2 x = yfb.x(tfxVar);
        List list = (List) this.a.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
        x.G("fields", arrayList);
        return rsg0.T(x).U(new com.vk.movika.sdk.base.hooks.k(new he7(i, i2), 5));
    }

    @Override // xsna.ee7
    public final io.reactivex.rxjava3.core.a c(UserId userId) {
        return rsg0.Z(yfb.x(new es().l(userId)));
    }
}
