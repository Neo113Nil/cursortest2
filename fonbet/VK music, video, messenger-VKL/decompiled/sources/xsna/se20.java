package xsna;

import com.vk.api.generated.messages.dto.MessagesCountersDto;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import java.util.List;

/* compiled from: MessagesGetCountersApiCmd.kt */
/* loaded from: classes2.dex */
public final class se20 extends nx2<ai30> {
    public static final List<MessagesCountersFilterDto> c = e43.l(MessagesCountersFilterDto.MESSAGES, MessagesCountersFilterDto.MESSAGES_UNREAD_UNMUTED, MessagesCountersFilterDto.MESSAGE_REQUESTS, MessagesCountersFilterDto.BUSINESS_NOTIFY, MessagesCountersFilterDto.BUSINESS_NOTIFY_ALL, MessagesCountersFilterDto.MESSAGES_ARCHIVE, MessagesCountersFilterDto.MESSAGES_ARCHIVE_UNREAD, MessagesCountersFilterDto.MESSAGES_ARCHIVE_UNREAD_UNMUTED, MessagesCountersFilterDto.MESSAGES_ARCHIVE_MENTIONS_COUNT);
    public final boolean b;

    public se20(boolean z) {
        a1w a1wVar = q1w.a;
        cau0 cau0Var = (a1wVar == null ? null : a1wVar).r().h;
        this.b = z;
    }

    @Override // xsna.nx2
    public final ai30 f(l7r0 l7r0Var) {
        MessagesCountersDto messagesCountersDto = (MessagesCountersDto) bz2.l(sg20.d(new vg20(), c, null, Boolean.FALSE, 10), this.b);
        Integer j = messagesCountersDto.j();
        int intValue = j != null ? j.intValue() : 0;
        Integer u = messagesCountersDto.u();
        int intValue2 = u != null ? u.intValue() : 0;
        Integer i = messagesCountersDto.i();
        int intValue3 = i != null ? i.intValue() : 0;
        Integer e = messagesCountersDto.e();
        int intValue4 = e != null ? e.intValue() : 0;
        Integer d = messagesCountersDto.d();
        int intValue5 = d != null ? d.intValue() : 0;
        Integer k = messagesCountersDto.k();
        int intValue6 = k != null ? k.intValue() : 0;
        Integer n = messagesCountersDto.n();
        int intValue7 = n != null ? n.intValue() : 0;
        Integer o = messagesCountersDto.o();
        int intValue8 = o != null ? o.intValue() : 0;
        Integer l = messagesCountersDto.l();
        return new ai30(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, intValue8, l != null ? l.intValue() : 0);
    }
}
