package xsna;

import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelFilter;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.bh3;
import xsna.eh3;
import xsna.fi3;
import xsna.ogb;
import xsna.u8m;

/* compiled from: ArchiveChannelsFeature.kt */
/* loaded from: classes15.dex */
public final class zg3 extends di6<hh3, eh3, gh3, bh3> {
    public final ah3 h;
    public final boolean i;
    public final ogb j;

    public zg3(qgb qgbVar, ah3 ah3Var, gi3 gi3Var, ui3 ui3Var, boolean z) {
        super(new hh3(EmptySet.b, Collections.singletonList(fi3.c.b)));
        this.h = ah3Var;
        this.i = z;
        sgb a = qgbVar.a(ChannelFilter.ARCHIVED, gi3Var, ui3Var);
        this.j = a;
        q(new m7(this, 4));
        io.reactivex.rxjava3.internal.operators.observable.y yVar = a.i;
        EmptyList emptyList = EmptyList.b;
        i(yVar.j0(new ogb.a(emptyList, jgp.b, new ProfilesInfo(), emptyList, 0, true, false), new q7(new vg3(this, 0), 3)).U(new s7(new r7(this, 4), 1)), io.reactivex.rxjava3.internal.functions.a.e, new f60(this, 2));
    }

    @Override // xsna.di6
    public final void d(eh3 eh3Var) {
        eh3 eh3Var2 = eh3Var;
        boolean z = eh3Var2 instanceof eh3.b;
        ogb ogbVar = this.j;
        if (z) {
            ogbVar.d();
            return;
        }
        if (eh3Var2 instanceof eh3.c) {
            ogbVar.d();
            return;
        }
        if (eh3Var2 instanceof eh3.e) {
            m(new bh3.a(((eh3.e) eh3Var2).b));
            return;
        }
        if (eh3Var2 instanceof eh3.f) {
            final long j = ((eh3.f) eh3Var2).b;
            final g60 g60Var = new g60(this, 4);
            di6.l(this, ogbVar.e().K().l(new pm0(new gt(1), 3)), new io.reactivex.rxjava3.functions.f() { // from class: xsna.ug3
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    Object obj2;
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (((Channel) obj2).b == j) {
                                break;
                            }
                        }
                    }
                    Channel channel = (Channel) obj2;
                    if (channel == null) {
                        return;
                    }
                    g60.this.invoke(channel);
                }
            }, 1);
            return;
        }
        boolean z2 = eh3Var2 instanceof eh3.d;
        ah3 ah3Var = this.h;
        if (!z2) {
            if (eh3Var2 instanceof eh3.g) {
                ((eh3.g) eh3Var2).getClass();
                q(new wg3(this, 0L, 0));
                return;
            } else if (eh3Var2 instanceof eh3.h) {
                ah3Var.d(((eh3.h) eh3Var2).b);
                return;
            } else {
                if (!(eh3Var2 instanceof eh3.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                q(new v7(6));
                ((cew) ah3Var.c).getClass();
                cew.h().edit().putBoolean("pref_archive_channels_banner_hidden", true).apply();
                return;
            }
        }
        eh3.d dVar = (eh3.d) eh3Var2;
        long j2 = dVar.b;
        u8m u8mVar = dVar.c;
        if (epx.f(u8mVar, u8m.d0.b)) {
            ((a1w) ah3Var.b).D(ah3Var, new l1b(j2));
            return;
        }
        if (epx.f(u8mVar, u8m.t0.b)) {
            ah3Var.d(j2);
            return;
        }
        if (epx.f(u8mVar, u8m.c0.b)) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            ((a1w) ah3Var.b).D(ah3Var, new z0b(Peer.a.b(j2)));
        } else if (epx.f(u8mVar, u8m.s.b)) {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            ((a1w) ah3Var.b).D(ah3Var, new pxa(Peer.a.b(j2)));
        }
    }

    @Override // xsna.di6, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.j.destroy();
    }
}
