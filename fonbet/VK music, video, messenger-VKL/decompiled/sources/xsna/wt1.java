package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mts;

/* compiled from: AllFriendsRepository.kt */
/* loaded from: classes15.dex */
public final class wt1 extends rb {
    public final zi50 h;
    public final ArrayList i;

    /* compiled from: AllFriendsRepository.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UsersUserFullDto, UserProfile> {
        @Override // xsna.izs
        public final UserProfile invoke(UsersUserFullDto usersUserFullDto) {
            ((j2r0) this.receiver).getClass();
            return j2r0.a(usersUserFullDto);
        }
    }

    public wt1(UserId userId, String str, ots otsVar, u1r0 u1r0Var, zi50 zi50Var) {
        super(userId, str, otsVar, u1r0Var);
        UsersFieldsDto usersFieldsDto;
        this.h = zi50Var;
        ArrayList a2 = new ckq0(userId).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a2.iterator();
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
    }

    @Override // xsna.rb
    public final io.reactivex.rxjava3.core.x<jks> a(int i, boolean z) {
        UserId userId = this.a;
        if (fkq0.c(userId)) {
            return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(mts.a.b(this.c, this.a, null, null, 30, Integer.valueOf(i), this.i, this.b, null, 710))), new l7(new sa(this, 2), 3));
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(b4q.b(userId, "userId isn't real: ")));
        return io.reactivex.rxjava3.core.x.k(jks.d);
    }
}
