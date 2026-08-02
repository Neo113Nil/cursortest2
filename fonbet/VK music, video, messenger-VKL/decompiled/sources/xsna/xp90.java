package xsna;

import com.vk.api.generated.calls.dto.CallsGetGroupHistoryFilterDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryFilterDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PastCallsRepository.kt */
/* loaded from: classes7.dex */
public final class xp90 {
    public static final List<UsersFieldsDto> b;
    public final rd9 a;

    static {
        List<UsersFieldsDto> l = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.SEX, UsersFieldsDto.ONLINE, UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
        b = l;
        List<UsersFieldsDto> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
    }

    public xp90(vg20 vg20Var, rd9 rd9Var) {
        this.a = rd9Var;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.f0 a(xp90 xp90Var, CallsGetHistoryFilterDto callsGetHistoryFilterDto, int i) {
        if ((i & 2) != 0) {
            callsGetHistoryFilterDto = null;
        }
        return rsg0.w0(yfb.x(xp90Var.a.d(null, callsGetHistoryFilterDto, b)));
    }

    public final io.reactivex.rxjava3.core.x<CallsGetHistoryResponseDto> b(Long l, CallsUserId callsUserId, CallsGetGroupHistoryFilterDto callsGetGroupHistoryFilterDto) {
        ArrayList arrayList;
        UserId b2 = com.vk.voip.userid.a.b(callsUserId);
        if (b2 == null) {
            return io.reactivex.rxjava3.core.x.k(new CallsGetHistoryResponseDto(EmptyList.b, false, null, null, null, null, 60, null));
        }
        this.a.getClass();
        tfx tfxVar = new tfx("calls.getGroupHistory", new ar(5), new br(9));
        tfx.n(tfxVar, "group_id", b2, 0L, -1L, 4);
        tfxVar.f(20, 1, 50, "count");
        if (l != null) {
            tfx.m(tfxVar, "pagination_marker", l.longValue(), 1L, 8);
        }
        if (callsGetGroupHistoryFilterDto != null) {
            tfx.o(tfxVar, "filter", callsGetGroupHistoryFilterDto.i(), 0, 0, 12);
        }
        List<UsersFieldsDto> list = b;
        if (list != null) {
            List<UsersFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return rsg0.w0(yfb.x(tfxVar));
    }
}
