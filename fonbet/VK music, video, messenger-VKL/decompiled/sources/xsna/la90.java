package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mts;

/* compiled from: PagedAllFriendsDataProvider.kt */
/* loaded from: classes15.dex */
public final class la90 extends yi6 {
    public final UserId g;
    public final String h;
    public final Object i;
    public final ArrayList j;

    /* compiled from: PagedAllFriendsDataProvider.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UsersUserFullDto, UserProfile> {
        @Override // xsna.izs
        public final UserProfile invoke(UsersUserFullDto usersUserFullDto) {
            ((j2r0) this.receiver).getClass();
            return j2r0.a(usersUserFullDto);
        }
    }

    public la90(UserId userId, String str, ListDataSet listDataSet) {
        super(listDataSet);
        UsersFieldsDto usersFieldsDto;
        this.g = userId;
        this.h = str;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new ia90(0));
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
        this.j = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VkPaginationList<RequestUserProfile>> ui(int i, com.vk.lists.c cVar) {
        UserId userId = this.g;
        if (!fkq0.c(userId)) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(b4q.b(userId, "userId isn't real: ")));
            return io.reactivex.rxjava3.core.q.T(new VkPaginationList(null, 0, false, 0, 15, null));
        }
        int k = cVar.k();
        return new io.reactivex.rxjava3.internal.operators.observable.o0(rsg0.T(yfb.x(mts.a.b((nts) this.i.getValue(), this.g, null, null, Integer.valueOf(k), Integer.valueOf(i), this.j, this.h, null, 710))), new xx40(new ja90(this, i, 0), 3));
    }
}
