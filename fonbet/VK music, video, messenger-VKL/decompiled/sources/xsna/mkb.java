package xsna;

import com.vk.channels.api.ChannelFilter;
import com.vk.dto.common.Source;

/* compiled from: ChannelsSuggestedDataSourceImpl.kt */
/* loaded from: classes.dex */
public final class mkb {
    public final Object a;

    public sfb a(int i) {
        return (sfb) vdg0.c(((a1w) this.a).n(this, new tfb(new ufb(null, ChannelFilter.SUGGESTED, i, Source.CACHE, false, 113))));
    }

    public sfb b(aeb aebVar, int i) {
        a1w a1wVar = (a1w) this.a;
        if (aebVar.c()) {
            vdg0.c(a1wVar.n(this, new xhc(ChannelFilter.SUGGESTED)));
        }
        return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(aebVar, ChannelFilter.SUGGESTED, i, Source.NETWORK, false, 112))));
    }
}
