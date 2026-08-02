package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import kotlin.collections.builders.ListBuilder;
import xsna.u8m;

/* compiled from: ChannelsListActionsProvider.kt */
/* loaded from: classes16.dex */
public final class agb {
    public static ListBuilder a(Channel channel, boolean z, boolean z2, boolean z3) {
        boolean z4 = channel.p;
        ListBuilder e = e43.e();
        p4g.a(u8m.d0.b, e, channel.k > 0);
        p4g.a(z ? com.vk.im.engine.models.im_item.b.f(channel.P) : pli.j(channel.s) ? u8m.u0.b : u8m.m0.b, e, z2);
        e.add(u8m.c.b);
        p4g.a(channel.K ? u8m.s0.b : u8m.z.b, e, z3);
        p4g.a(u8m.o.b, e, channel.u == AdminLevel.NONE && channel.z == ChannelType.COMMUNITY_CHANNEL);
        if (channel.Db(qni0.a())) {
            e.add(u8m.g0.b);
        } else {
            e.add(u8m.f0.b);
        }
        p4g.a(u8m.c0.b, e, !z4);
        g2v.c().getClass();
        p4g.a(u8m.s.b, e, false);
        return e.g();
    }
}
