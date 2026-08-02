package xsna;

import android.content.Context;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.r7h0;
import xsna.u7h0;

/* compiled from: ScheduledCallsMapper.kt */
/* loaded from: classes7.dex */
public final class h7h0 {
    public final s6h0 a;
    public final z5h0 b;
    public final Context c;

    public h7h0(s6h0 s6h0Var, z5h0 z5h0Var, Context context) {
        this.a = s6h0Var;
        this.b = z5h0Var;
        this.c = context;
    }

    public final u7h0.a a(r7h0.a aVar) {
        String string;
        Object obj;
        CallsUserId callsUserId = aVar.b;
        List<GroupsGroupFullDto> list = aVar.c;
        boolean z = !list.isEmpty();
        Context context = this.c;
        if (callsUserId == null) {
            string = context.getString(R.string.voip_history_past_calls_header_filter_all);
        } else if ((callsUserId instanceof CallsUserId.VkUserId) && com.vk.voip.userid.a.a(callsUserId)) {
            UserId a = fkq0.a(((CallsUserId.VkUserId) callsUserId).b);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((GroupsGroupFullDto) obj).P0(), a)) {
                    break;
                }
            }
            GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
            string = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
            if (string == null) {
                string = "";
            }
        } else {
            string = context.getString(R.string.voip_history_past_calls_header_filter_personal);
        }
        return new u7h0.a(z, callsUserId, string);
    }
}
