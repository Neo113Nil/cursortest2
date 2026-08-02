package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: PagedOnlineFriendsDataProvider.kt */
/* loaded from: classes15.dex */
public final class ra90 extends yi6 {
    public final UserId g;
    public final ArrayList h;
    public final Object i;
    public final io.reactivex.rxjava3.subjects.g<List<UserId>> j;

    public ra90(UserId userId, ListDataSet listDataSet) {
        super(listDataSet);
        UsersFieldsDto usersFieldsDto;
        this.g = userId;
        ArrayList a = new ckq0(userId).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            UsersFieldsDto[] values = UsersFieldsDto.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    usersFieldsDto = null;
                    break;
                }
                usersFieldsDto = values[i];
                if (epx.f(usersFieldsDto.i(), str)) {
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
        this.i = msy.a(LazyThreadSafetyMode.NONE, new l9(22));
        this.j = io.reactivex.rxjava3.subjects.g.O0(1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yi6
    public final void b() {
        UserId userId = this.g;
        if (fkq0.c(userId)) {
            this.c = rsg0.T(yfb.x(((nts) this.i.getValue()).j(userId))).subscribe(new xk30(new d2y(this, 15), 11));
            return;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(b4q.b(userId, "userId isn't real: ")));
        EmptyList emptyList = EmptyList.b;
        io.reactivex.rxjava3.subjects.g<List<UserId>> gVar = this.j;
        gVar.onNext(emptyList);
        gVar.onComplete();
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VkPaginationList<RequestUserProfile>> ui(int i, com.vk.lists.c cVar) {
        asu0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.o0(this.j.a0(asu0.r()), new zj0(new qa90(this, cVar, i), 20));
    }
}
