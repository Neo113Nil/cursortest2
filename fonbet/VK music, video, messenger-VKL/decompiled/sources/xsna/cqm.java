package xsna;

import com.vk.api.generated.messages.dto.MessagesCountersDto;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import com.vk.api.generated.messages.dto.MessagesFoldersCounterItemDto;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.credentials.UserCredentials;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DialogsFoldersCountersGetCmd.kt */
/* loaded from: classes2.dex */
public final class cqm extends xl6<xpp<Map<Integer, ? extends spm>>> {
    public final Source b;

    public cqm(Source source) {
        this.b = source;
    }

    @Override // xsna.m2w
    public final String a() {
        return this.b == Source.CACHE ? "im-dialog-folder-common" : "im-dialog-folders-network-download";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        if (this.b == Source.CACHE) {
            return (xpp) w2wVar.I0().c(new wzf(w2wVar, 9));
        }
        w2wVar.c1(true, LongPollType.MESSAGES);
        Integer f = w2wVar.I0().b().c().f();
        int a = cq.a(w2wVar);
        if (f != null && f.intValue() == a) {
            return (xpp) w2wVar.I0().c(new wzf(w2wVar, 9));
        }
        vg20 vg20Var = new vg20();
        List singletonList = Collections.singletonList(MessagesCountersFilterDto.MESSAGES_FOLDERS);
        UserCredentials W0 = w2wVar.W0();
        List<MessagesFoldersCounterItemDto> p = ((MessagesCountersDto) bz2.c(bz2.n(sg20.d(vg20Var, singletonList, W0 != null ? new UserId(W0.g()) : null, null, 12), bz2.a), "DialogsFoldersCountersGetCmd.messagesGetCounters")).p();
        if (p == null) {
            throw new RuntimeException("no folders counters found but requested");
        }
        List<MessagesFoldersCounterItemDto> list = p;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MessagesFoldersCounterItemDto messagesFoldersCounterItemDto : list) {
            arrayList.add(new spm(messagesFoldersCounterItemDto.d(), messagesFoldersCounterItemDto.f(), messagesFoldersCounterItemDto.e() - messagesFoldersCounterItemDto.f()));
        }
        new dqm(arrayList).o(w2wVar);
        return (xpp) w2wVar.I0().c(new wzf(w2wVar, 9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqm) && this.b == ((cqm) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsFoldersCountersGetCmd(source=" + this.b + ')';
    }
}
