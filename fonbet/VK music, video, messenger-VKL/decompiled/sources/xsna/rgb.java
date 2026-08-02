package xsna;

import com.vk.channels.api.ChannelFilter;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.sgb;

/* compiled from: ChannelsListLoaderFactoryImpl.kt */
/* loaded from: classes.dex */
public final class rgb implements qgb {
    public final fuz a;
    public final suf0 b;
    public final bib c;
    public final d1w d;
    public final uvf0 e;
    public final f9w f;
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);

    public rgb(fuz fuzVar, suf0 suf0Var, bib bibVar, d1w d1wVar, uvf0 uvf0Var, f9w f9wVar) {
        this.a = fuzVar;
        this.b = suf0Var;
        this.c = bibVar;
        this.d = d1wVar;
        this.e = uvf0Var;
        this.f = f9wVar;
    }

    @Override // xsna.qgb
    public final sgb a(ChannelFilter channelFilter, rfb rfbVar, rfb rfbVar2) {
        return new sgb(new sgb.a(rfbVar, rfbVar2, this.c, this.e), this.d, new px0(this, 13), new com.vk.movika.sdk.base.ui.t(this, 17), this.f, channelFilter);
    }
}
