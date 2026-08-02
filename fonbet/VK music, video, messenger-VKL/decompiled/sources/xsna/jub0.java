package xsna;

import com.vk.api.generated.polls.dto.PollsGetVotersAgeDto;
import com.vk.api.generated.polls.dto.PollsGetVotersSexDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PollsService.kt */
/* loaded from: classes2.dex */
public interface jub0 {
    static xy2 a(kub0 kub0Var, int i, UserId userId, Boolean bool, int i2) {
        if ((i2 & 4) != 0) {
            bool = null;
        }
        kub0Var.getClass();
        tfx tfxVar = new tfx("polls.getById", new cr(23), new hub0(0));
        tfx.l(tfxVar, "poll_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (bool != null) {
            tfxVar.j("is_board", bool.booleanValue());
        }
        tfxVar.j("extended", true);
        tfxVar.f(3, 0, 100, "friends_count");
        return tfxVar;
    }

    default tfx b(int i, List list, UserId userId, Boolean bool, Integer num, Integer num2, List list2, PollsGetVotersAgeDto pollsGetVotersAgeDto, PollsGetVotersSexDto pollsGetVotersSexDto, Integer num3) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("polls.getVoters", new alb0(1), new gr(29));
        tfx.l(tfxVar, "poll_id", i, 0, 0, 8);
        tfxVar.i("answer_ids", list);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfxVar.j("friends_only", bool.booleanValue());
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfx.l(tfxVar, "count", num2.intValue(), 0, 0, 8);
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (pollsGetVotersAgeDto != null) {
            tfx.l(tfxVar, "age", pollsGetVotersAgeDto.i(), 0, 0, 12);
        }
        if (pollsGetVotersSexDto != null) {
            tfx.l(tfxVar, "sex", pollsGetVotersSexDto.i(), 0, 0, 12);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "city", num3.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }
}
