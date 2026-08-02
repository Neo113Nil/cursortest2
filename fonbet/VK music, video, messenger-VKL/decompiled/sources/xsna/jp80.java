package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OnlineFriendsRepository.kt */
/* loaded from: classes15.dex */
public final class jp80 extends rb {
    public final ArrayList h;
    public final io.reactivex.rxjava3.subjects.g<List<UserId>> i;

    public jp80(UserId userId, String str, ots otsVar, u1r0 u1r0Var) {
        super(userId, str, otsVar, u1r0Var);
        UsersFieldsDto usersFieldsDto;
        ArrayList a = new ckq0(userId).a();
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
        this.h = arrayList;
        this.i = io.reactivex.rxjava3.subjects.g.O0(1);
    }

    @Override // xsna.rb
    public final io.reactivex.rxjava3.core.x<jks> a(int i, boolean z) {
        UserId userId = this.a;
        if (fkq0.c(userId)) {
            io.reactivex.rxjava3.subjects.g<List<UserId>> gVar = this.i;
            return new io.reactivex.rxjava3.internal.operators.single.r((z ? new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(this.c.j(userId))), new rt10(new n9b(gVar, 7), 8)) : gVar.K()).q(asu0.a.c()), new mh40(new uo3(this, i), 3));
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(b4q.b(userId, "userId isn't real: ")));
        return io.reactivex.rxjava3.core.x.k(jks.d);
    }
}
