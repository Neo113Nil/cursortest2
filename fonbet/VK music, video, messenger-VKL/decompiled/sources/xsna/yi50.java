package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MutualFriendsRepository.kt */
/* loaded from: classes15.dex */
public final class yi50 extends rb {
    public final UserId h;
    public final ArrayList i;
    public final io.reactivex.rxjava3.subjects.g<List<UserId>> j;

    public yi50(UserId userId, UserId userId2, String str, ots otsVar, u1r0 u1r0Var) {
        super(userId2, str, otsVar, u1r0Var);
        UsersFieldsDto usersFieldsDto;
        this.h = userId;
        ArrayList a = new ckq0(userId2).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            UsersFieldsDto[] values = UsersFieldsDto.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    usersFieldsDto = null;
                    break;
                }
                usersFieldsDto = values[i];
                if (epx.f(usersFieldsDto.i(), str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (usersFieldsDto != null) {
                arrayList.add(usersFieldsDto);
            }
        }
        this.i = arrayList;
        this.j = io.reactivex.rxjava3.subjects.g.O0(1);
    }

    @Override // xsna.rb
    public final io.reactivex.rxjava3.core.x<jks> a(int i, boolean z) {
        UserId userId = this.h;
        boolean c = fkq0.c(userId);
        UserId userId2 = this.a;
        if (c && fkq0.c(userId2)) {
            io.reactivex.rxjava3.subjects.g<List<UserId>> gVar = this.j;
            io.reactivex.rxjava3.core.x oVar = z ? new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(nts.r(this.c, userId, userId2, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))), new s440(new yte(gVar, 8), 5)) : gVar.K();
            asu0.a.getClass();
            return new io.reactivex.rxjava3.internal.operators.single.r(oVar.q(asu0.r()), new com.vk.movika.sdk.base.flow.binding.c(new hbe(this, i, 3), 26));
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("userId isn't real, userId: " + userId2 + ", sourceUserId: " + userId));
        return io.reactivex.rxjava3.core.x.k(jks.d);
    }
}
