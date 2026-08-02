package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.lists.ListDataSet;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: PagedMutualFriendsDataProvider.kt */
/* loaded from: classes15.dex */
public final class pa90 extends yi6 {
    public final UserId g;
    public final UserId h;
    public final ArrayList i;
    public final Object j;
    public final io.reactivex.rxjava3.subjects.g<List<UserId>> k;

    public pa90(UserId userId, UserId userId2, ListDataSet listDataSet) {
        super(listDataSet);
        UsersFieldsDto usersFieldsDto;
        this.g = userId;
        this.h = userId2;
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
        this.i = arrayList;
        this.j = msy.a(LazyThreadSafetyMode.NONE, new uz(24));
        this.k = io.reactivex.rxjava3.subjects.g.O0(1);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yi6
    public final void b() {
        UserId userId = this.g;
        boolean c = fkq0.c(userId);
        UserId userId2 = this.h;
        if (c && fkq0.c(userId2)) {
            this.c = rsg0.T(yfb.x(nts.r((nts) this.j.getValue(), userId, userId2, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))).subscribe(new pd40(new f410(this, 18), 6));
            return;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("userId isn't real, targetUserId: " + userId2 + ", sourceUserId: " + userId));
        EmptyList emptyList = EmptyList.b;
        io.reactivex.rxjava3.subjects.g<List<UserId>> gVar = this.k;
        gVar.onNext(emptyList);
        gVar.onComplete();
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VkPaginationList<RequestUserProfile>> ui(int i, com.vk.lists.c cVar) {
        asu0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.o0(this.k.a0(asu0.r()), new v34(new gh40(this, cVar, i, 1), 21));
    }
}
