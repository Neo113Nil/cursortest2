package xsna;

import com.vk.api.generated.messages.dto.MessagesChannelsCounterDto;
import com.vk.api.generated.messages.dto.MessagesCountersDto;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import java.util.Collections;

/* compiled from: ChannelsGetCountersApiCmd.kt */
/* loaded from: classes2.dex */
public final class ifb extends nx2<oeb> {
    public ifb() {
        a1w a1wVar = q1w.a;
        cau0 cau0Var = (a1wVar == null ? null : a1wVar).r().h;
    }

    @Override // xsna.nx2
    public final oeb f(l7r0 l7r0Var) {
        MessagesChannelsCounterDto f = ((MessagesCountersDto) bz2.l(sg20.d(new vg20(), Collections.singletonList(MessagesCountersFilterDto.CHANNELS), null, null, 14), false)).f();
        if (f != null) {
            return new oeb(f.e(), f.f(), f.d());
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
