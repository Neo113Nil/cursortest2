package xsna;

import com.vk.channels.api.ChannelFilter;

/* compiled from: ChannelsMetaInteractor.kt */
/* loaded from: classes2.dex */
public final class jhb {
    public final w2w a;

    public jhb(w2w w2wVar) {
        this.a = w2wVar;
    }

    public final void a(bdb bdbVar) {
        this.a.I0().u(new ihb(bdbVar.l ? ChannelFilter.ARCHIVED : !bdbVar.m ? ChannelFilter.SUGGESTED : ChannelFilter.ALL, bdbVar, this, 0));
    }
}
