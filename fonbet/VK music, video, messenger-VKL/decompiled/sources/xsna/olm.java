package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationStyleDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationStylesResponseDto;
import com.vk.im.engine.models.dialogs.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DialogThemesLoadApiCmd.kt */
/* loaded from: classes2.dex */
public final class olm extends nx2<List<? extends xkm>> {
    public final boolean b;
    public final List<String> c;
    public final Long d;

    public olm() {
        throw null;
    }

    public olm(boolean z, List list, Long l, int i) {
        list = (i & 2) != 0 ? null : list;
        l = (i & 4) != 0 ? null : l;
        this.b = z;
        this.c = list;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olm)) {
            return false;
        }
        olm olmVar = (olm) obj;
        return this.b == olmVar.b && epx.f(this.c, olmVar.c) && epx.f(this.d, olmVar.d);
    }

    @Override // xsna.nx2
    public final List<? extends xkm> f(l7r0 l7r0Var) {
        Long l = this.d;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        tfx tfxVar = new tfx("messages.getConversationStyles", new tq(19), new uq(20));
        List<String> list = this.c;
        if (list != null) {
            tfxVar.i("style_ids", list);
        }
        tfxVar.j("show_hidden", true);
        if (valueOf != null) {
            tfx.l(tfxVar, "update_time", valueOf.intValue(), 0, 0, 8);
        }
        List<MessagesConversationStyleDto> d = ((MessagesGetConversationStylesResponseDto) bz2.l(tfxVar, this.b)).d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (!brm0.s(c.g.c.a, ((MessagesConversationStyleDto) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MessagesConversationStyleDto messagesConversationStyleDto = (MessagesConversationStyleDto) it.next();
            String id = messagesConversationStyleDto.getId();
            long g = messagesConversationStyleDto.g();
            int f = messagesConversationStyleDto.f();
            String d2 = messagesConversationStyleDto.d();
            String e = messagesConversationStyleDto.e();
            Boolean i = messagesConversationStyleDto.i();
            arrayList2.add(new xkm(f, g, id, d2, e, i != null ? i.booleanValue() : false));
        }
        return arrayList2;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        List<String> list = this.c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.d;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemesLoadApiCmd(isAwaitNetwork=");
        sb.append(this.b);
        sb.append(", styleIds=");
        sb.append(this.c);
        sb.append(", updateTime=");
        return iq.b(sb, this.d, ')');
    }
}
