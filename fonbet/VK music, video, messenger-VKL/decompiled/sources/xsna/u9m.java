package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationStyleAppearanceDto;
import com.vk.api.generated.messages.dto.MessagesGetAppearancesResponseDto;
import com.vk.im.engine.models.dialogs.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.x9m;

/* compiled from: DialogAppearanceLoadByIdsApiCmd.kt */
/* loaded from: classes2.dex */
public final class u9m extends nx2<xpp<List<? extends x9m>>> {
    public final List<String> b;
    public final boolean c;

    public u9m(List<String> list, boolean z) {
        this.b = list;
        this.c = z;
    }

    @Override // xsna.nx2
    public final xpp<List<? extends x9m>> f(l7r0 l7r0Var) {
        tfx tfxVar = new tfx("messages.getAppearances", new s11(16), new to(20));
        List<String> list = this.b;
        if (list != null) {
            tfxVar.i("appearance_ids", list);
        }
        List<MessagesConversationStyleAppearanceDto> d = ((MessagesGetAppearancesResponseDto) bz2.l(tfxVar, this.c)).d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (!brm0.s(c.g.c.a, ((MessagesConversationStyleAppearanceDto) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return new xpp<>(arrayList2, false);
            }
            MessagesConversationStyleAppearanceDto messagesConversationStyleAppearanceDto = (MessagesConversationStyleAppearanceDto) it.next();
            String id = messagesConversationStyleAppearanceDto.getId();
            Boolean i = messagesConversationStyleAppearanceDto.i();
            if (i != null) {
                z = i.booleanValue();
            }
            arrayList2.add(new x9m(id, messagesConversationStyleAppearanceDto.g(), new x9m.a(messagesConversationStyleAppearanceDto.e().d(), messagesConversationStyleAppearanceDto.e().g(), messagesConversationStyleAppearanceDto.e().k(), messagesConversationStyleAppearanceDto.e().j(), messagesConversationStyleAppearanceDto.e().i(), messagesConversationStyleAppearanceDto.e().f(), new x9m.a.C3987a(messagesConversationStyleAppearanceDto.e().e().e(), messagesConversationStyleAppearanceDto.e().e().d())), new x9m.a(messagesConversationStyleAppearanceDto.d().d(), messagesConversationStyleAppearanceDto.d().g(), messagesConversationStyleAppearanceDto.d().k(), messagesConversationStyleAppearanceDto.d().j(), messagesConversationStyleAppearanceDto.d().i(), messagesConversationStyleAppearanceDto.d().f(), new x9m.a.C3987a(messagesConversationStyleAppearanceDto.d().e().e(), messagesConversationStyleAppearanceDto.d().e().d())), z, messagesConversationStyleAppearanceDto.f()));
        }
    }
}
