package xsna;

import com.ironsource.C4504q2;
import com.vk.api.generated.friends.dto.FriendsGetFiltersDto;
import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: FriendsService.kt */
/* loaded from: classes6.dex */
public interface mts {

    /* compiled from: FriendsService.kt */
    public static final class a {
        public static ufx a(UserId userId, FriendsGetOrderDto friendsGetOrderDto, Integer num, Integer num2, Integer num3, List list, String str, List list2) {
            ArrayList arrayList;
            ufx ufxVar = new ufx("friends.get", new qr(15), new rr(17));
            if (userId != null) {
                ufx.m(ufxVar, "user_id", userId, 1L, 8);
            }
            if (friendsGetOrderDto != null) {
                ufx.n(ufxVar, C4504q2.u, friendsGetOrderDto.i(), 0, 12);
            }
            if (num != null) {
                ufx.k(ufxVar, "list_id", num.intValue(), 0, 8);
            }
            if (num2 != null) {
                ufx.k(ufxVar, "count", num2.intValue(), 0, 8);
            }
            if (num3 != null) {
                ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 8);
            }
            ArrayList arrayList2 = null;
            if (list != null) {
                List list3 = list;
                arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UsersFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ufxVar.h("fields", arrayList);
            }
            if (str != null) {
                ufx.n(ufxVar, "ref", str, 255, 4);
            }
            if (list2 != null) {
                List list4 = list2;
                arrayList2 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((FriendsGetFiltersDto) it2.next()).i());
                }
            }
            if (arrayList2 != null) {
                ufxVar.h("filters", arrayList2);
            }
            return ufxVar;
        }

        public static /* synthetic */ xy2 b(mts mtsVar, UserId userId, FriendsGetOrderDto friendsGetOrderDto, Integer num, Integer num2, Integer num3, List list, String str, List list2, int i) {
            if ((i & 1) != 0) {
                userId = null;
            }
            if ((i & 2) != 0) {
                friendsGetOrderDto = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            if ((i & 16) != 0) {
                num3 = null;
            }
            if ((i & 256) != 0) {
                str = null;
            }
            if ((i & 512) != 0) {
                list2 = null;
            }
            return mtsVar.m(userId, friendsGetOrderDto, num, num2, num3, list, str, list2);
        }
    }

    ufx m(UserId userId, FriendsGetOrderDto friendsGetOrderDto, Integer num, Integer num2, Integer num3, List list, String str, List list2);
}
