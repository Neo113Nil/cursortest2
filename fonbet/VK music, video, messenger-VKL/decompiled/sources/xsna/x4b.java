package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.commands.messages.MsgHistoryCreator;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.exceptions.ApiChannelNotFoundException;
import com.vk.im.engine.models.Order;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelMsgHistoryGetCmd.kt */
/* loaded from: classes2.dex */
public final class x4b extends le6<gj30> {
    public final Peer b;
    public final de c;
    public final boolean d;
    public final int e;
    public final Source f;
    public final Order g;
    public final boolean h;
    public final f9w i;

    /* compiled from: ChannelMsgHistoryGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public x4b(Peer peer, de deVar, boolean z, int i, Source source, int i2) {
        Order order = Order.ASC;
        boolean z2 = (i2 & 64) == 0;
        this.b = peer;
        this.c = deVar;
        this.d = z;
        this.e = i;
        this.f = source;
        this.g = order;
        this.h = z2;
        this.i = e9w.b("ImChannelMsgHistory");
    }

    @Override // xsna.le6
    public final gj30 e(w2w w2wVar) {
        Channel channel;
        boolean z = false;
        boolean z2 = true;
        try {
            channel = i(w2wVar);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (!(cause instanceof ApiChannelNotFoundException) && !(cause instanceof ApiAccessDeniedException)) {
                throw th;
            }
            gj30 gj30Var = new gj30(0);
            gj30Var.c = true;
            gj30Var.e = true;
            channel = null;
        }
        if (channel == null) {
            gj30 gj30Var2 = new gj30(0);
            gj30Var2.c = true;
            gj30Var2.e = true;
            return gj30Var2;
        }
        ChannelBanInfo channelBanInfo = channel.C;
        if (channelBanInfo != null && channelBanInfo.f) {
            return new gj30(0);
        }
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i == 1) {
            return g(w2wVar, channel);
        }
        if (i == 2) {
            return h(w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        gj30 g = g(w2wVar, channel);
        de deVar = this.c;
        if (deVar instanceof wj30) {
            z = dk30.c(g, (wj30) deVar);
        } else if (deVar instanceof tj30) {
            boolean m = g.m();
            boolean z3 = g.p() || g.o();
            if (!m && z3) {
                z = true;
            }
        } else if (deVar instanceof vj30) {
            z = dk30.b(g, (vj30) deVar);
        } else if (deVar instanceof rj30) {
            z = dk30.a(g, (rj30) deVar);
        } else {
            if (!(deVar instanceof sj30)) {
                throw new NoWhenBranchMatchedException();
            }
            Peer peer = this.b;
            Channel channel2 = (Channel) ((wpp) w2wVar.J0(this, new gfb(Collections.singletonList(peer), Source.ACTUAL, z2, 8)).await()).c.get(Long.valueOf(peer.d));
            if (channel2 != null) {
                boolean Ab = channel2.Ab();
                int i2 = channel2.i;
                if (Ab) {
                    z = dk30.a(g, new rj30(MsgIdType.CNV_ID, i2));
                } else {
                    if (Ab) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = dk30.c(g, uj30.d);
                }
            }
        }
        return z ? g : h(w2wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4b)) {
            return false;
        }
        x4b x4bVar = (x4b) obj;
        return epx.f(this.b, x4bVar.b) && epx.f(this.c, x4bVar.c) && this.d == x4bVar.d && this.e == x4bVar.e && this.f == x4bVar.f && this.g == x4bVar.g && this.h == x4bVar.h;
    }

    public final qfu f(w2w w2wVar) {
        xgl0 I0 = w2wVar.I0();
        boolean z = this.d;
        return new qfu(z ? I0.e() : I0.y(), new rri(w2wVar, z), new eyf(), w2wVar.I0(), new MsgHistoryCreator(this.i), new nh3(4, this, w2wVar), w2wVar.getExperiments());
    }

    public final gj30 g(w2w w2wVar, Channel channel) {
        gj30 a2 = f(w2wVar).a(this.b, this.c, this.e, this.g);
        for (Msg msg : a2.k()) {
            if (msg instanceof MsgFromChannel) {
                ((MsgFromChannel) msg).K = channel.C != null;
            }
        }
        return a2;
    }

    public final gj30 h(w2w w2wVar) {
        boolean z = this.d;
        String str = z ? "postponed" : null;
        qfu f = f(w2wVar);
        y4b y4bVar = new y4b(w2wVar, z);
        quf0 quf0Var = new quf0(w2wVar, str, this.h);
        xgl0 I0 = w2wVar.I0();
        return new svf0(f, y4bVar, quf0Var, z ? I0.e() : I0.y(), new tuf0(w2wVar, z)).c(this.b, this.c, this.e, this.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(shy.a(this.e, qoy.b((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d), 31), 31, this.f)) * 31);
    }

    public final Channel i(w2w w2wVar) {
        Peer peer = this.b;
        List singletonList = Collections.singletonList(peer);
        Source source = Source.CACHE;
        boolean z = false;
        int i = 12;
        wpp wppVar = (wpp) w2wVar.L0(this, new gfb(singletonList, source, z, i));
        Channel channel = (Channel) wppVar.c.get(Long.valueOf(peer.b));
        if (channel != null) {
            return channel;
        }
        if (this.f == source) {
            return null;
        }
        wpp wppVar2 = (wpp) w2wVar.J0(this, new gfb(Collections.singletonList(peer), Source.NETWORK, z, i)).await();
        return (Channel) wppVar2.c.get(Long.valueOf(peer.b));
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgHistoryGetCmd(peer=");
        sb.append(this.b);
        sb.append(", mode=");
        sb.append(this.c);
        sb.append(", isPostponed=");
        sb.append(this.d);
        sb.append(", limit=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", orderBy=");
        sb.append(this.g);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
