package xsna;

import com.vk.channels.api.ChannelFilter;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cfb;

/* compiled from: ChannelsHistoryGetCmd.kt */
/* loaded from: classes2.dex */
public final class vfb extends xl6<qfb> {
    public final ufb b;
    public lw8 c;
    public gvf0 d;

    /* compiled from: ChannelsHistoryGetCmd.kt */
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

    public vfb(ufb ufbVar) {
        this.b = ufbVar;
    }

    @Override // xsna.m2w
    public final String a() {
        return a.$EnumSwitchMapping$0[this.b.d.ordinal()] == 1 ? "im-channels-history-get-cached" : "im-channels-history-get-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        lw8 lw8Var;
        lw8 lw8Var2 = new lw8(w2wVar);
        this.c = lw8Var2;
        this.d = new gvf0(w2wVar, lw8Var2);
        ufb ufbVar = this.b;
        int i = a.$EnumSwitchMapping$0[ufbVar.d.ordinal()];
        if (i == 1) {
            lw8 lw8Var3 = this.c;
            lw8Var = lw8Var3 != null ? lw8Var3 : null;
            return (qfb) lw8Var.a.I0().c(new mu1(2, lw8Var, ufbVar));
        }
        if (i == 2) {
            return f();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        lw8 lw8Var4 = this.c;
        lw8Var = lw8Var4 != null ? lw8Var4 : null;
        qfb qfbVar = (qfb) lw8Var.a.I0().c(new mu1(2, lw8Var, ufbVar));
        return ((qfbVar.size() > ufbVar.c || !qfbVar.b) && !qfbVar.m()) ? qfbVar : f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfb) && epx.f(this.b, ((vfb) obj).b);
    }

    public final qfb f() {
        gvf0 gvf0Var = this.d;
        Object obj = null;
        final gvf0 gvf0Var2 = gvf0Var == null ? null : gvf0Var;
        w2w w2wVar = gvf0Var2.a;
        w2wVar.c1(true, LongPollType.CHANNELS);
        final ufb ufbVar = this.b;
        int i = ufbVar.c;
        aeb aebVar = ufbVar.a;
        int max = Math.max(2, i);
        final cfb.b bVar = (cfb.b) fo50.v(new cfb(aebVar, ufbVar.b, max, ufbVar.e), gvf0Var2.a, "RemoteEngineChannelsProvider.ChannelsGetApiCmd", 2);
        final List<eeb> list = bVar.a;
        final ProfilesSimpleInfo profilesSimpleInfo = bVar.b;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                vcb vcbVar = ((eeb) obj).a.d;
                do {
                    Object next = it.next();
                    vcb vcbVar2 = ((eeb) next).a.d;
                    if (vcbVar.compareTo(vcbVar2) > 0) {
                        obj = next;
                        vcbVar = vcbVar2;
                    }
                } while (it.hasNext());
            }
        }
        eeb eebVar = (eeb) obj;
        vcb vcbVar3 = eebVar != null ? eebVar.a.d : vcb.d;
        final vcb k = pli.k(aebVar);
        final boolean equals = k.b.equals(vjm.m);
        final boolean z = list.size() < max;
        final vcb vcbVar4 = vcbVar3;
        w2wVar.I0().u(new izs() { // from class: xsna.fvf0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                xgl0 xgl0Var = (xgl0) obj2;
                ufb ufbVar2 = ufbVar;
                ChannelFilter channelFilter = ufbVar2.b;
                List list2 = list;
                com.vk.im.engine.internal.merge.channels.a aVar = new com.vk.im.engine.internal.merge.channels.a(list2, channelFilter, k, vcbVar4, equals, z);
                w2w w2wVar2 = gvf0Var2.a;
                List list3 = (List) aVar.o(w2wVar2);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (list3.contains(Long.valueOf(((eeb) obj3).a.a))) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    eeb eebVar2 = (eeb) it2.next();
                    Msg msg = eebVar2.b;
                    List singletonList = msg == null ? EmptyList.b : Collections.singletonList(msg);
                    int i2 = msg != null ? msg.d : Integer.MAX_VALUE;
                    boolean z2 = msg == null;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    new ChannelMsgHistoryFromServerMergeTask(Peer.a.b(eebVar2.a.a), i2, singletonList, ChannelMsgHistoryFromServerMergeTask.HistorySource.API, false, z2, true, 400).o(w2wVar2);
                }
                ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
                if (profilesSimpleInfo2.Gb()) {
                    xuo0.a.getClass();
                    new h1e0(profilesSimpleInfo2, xuo0.a(), true).o(w2wVar2);
                }
                if (ufbVar2.b == ChannelFilter.SUGGESTED) {
                    xgl0Var.a().i(Collections.singletonList(new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.SUGGESTED, bVar.c, xgl0Var.system().j())));
                }
                return s3q0.a;
            }
        });
        if (!ufbVar.f) {
            return new qfb(EmptyList.b, jgp.b, true, false, false, false);
        }
        lw8 lw8Var = gvf0Var2.b;
        return (qfb) lw8Var.a.I0().c(new mu1(2, lw8Var, ufbVar));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelsHistoryGetCmd(args=" + this.b + ')';
    }
}
