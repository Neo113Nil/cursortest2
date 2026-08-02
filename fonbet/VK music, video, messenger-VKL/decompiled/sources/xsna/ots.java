package xsna;

import com.vk.api.generated.friends.dto.FriendsGetInterestingRequestsFieldsDto;
import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.mts;

/* compiled from: FriendsService.kt */
/* loaded from: classes2.dex */
public final class ots implements nts {
    @Override // xsna.mts
    public final ufx m(UserId userId, FriendsGetOrderDto friendsGetOrderDto, Integer num, Integer num2, Integer num3, List list, String str, List list2) {
        return mts.a.a(userId, friendsGetOrderDto, num, num2, num3, list, str, list2);
    }

    public final tfx t(List list, Integer num, Integer num2, Integer num3, String str) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("friends.getInterestingRequests", new uq(13), new br(18));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfxVar.f(num2.intValue(), 0, 100, "count");
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 255, 4);
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((FriendsGetInterestingRequestsFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "pinned_request_id", num3.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }
}
