package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.mza;

/* compiled from: ChannelGetPinnedMessagesCmd.kt */
/* loaded from: classes2.dex */
public final class oza extends le6<List<? extends Msg>> {
    public final long b;
    public final Source c;
    public final boolean d;

    /* compiled from: ChannelGetPinnedMessagesCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public oza(long j, Source source, boolean z) {
        this.b = j;
        this.c = source;
        this.d = z;
    }

    @Override // xsna.le6
    public final List<? extends Msg> e(w2w w2wVar) {
        List<Msg> f;
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            f = f(w2wVar);
        } else if (i == 2) {
            xgl0 I0 = w2wVar.I0();
            uib a2 = w2wVar.I0().a();
            long j = this.b;
            bdb c = a2.c(j);
            if (c != null) {
                if (c.s == (ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j())) {
                    f = f(w2wVar);
                }
            }
            List<Msg> f2 = f(w2wVar);
            List<Msg> g = g(w2wVar);
            List<Msg> list = f2;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).d));
            }
            Set S0 = j5g.S0(arrayList);
            List<Msg> list2 = g;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Msg) it2.next()).d));
            }
            LinkedHashSet E0 = j5g.E0(S0, j5g.S0(arrayList2));
            r3b y = w2wVar.I0().y();
            Iterator it3 = E0.iterator();
            while (it3.hasNext()) {
                y.E(((Number) it3.next()).intValue(), j, false);
            }
            xgl0 I02 = w2wVar.I0();
            w2wVar.I0().a().O(ad0.B(I02.a().B(j)) ? I02.system().r(j) : I02.system().j(), j);
            f = g;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = g(w2wVar);
        }
        L.n(c(), new vq6(2, this, f));
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oza)) {
            return false;
        }
        oza ozaVar = (oza) obj;
        return this.b == ozaVar.b && this.c == ozaVar.c && this.d == ozaVar.d;
    }

    public final List<Msg> f(w2w w2wVar) {
        return j5g.O0(w2wVar.I0().y().b.c.c(this.b));
    }

    public final List<Msg> g(w2w w2wVar) {
        long j = this.b;
        mza.a aVar = (mza.a) fo50.v(new mza(j, this.d), w2wVar, "ChannelGetPinnedMessagesApiCmd", 2);
        List<Msg> list = (List) new v3b(j, aVar.a, false).o(w2wVar);
        ProfilesSimpleInfo profilesSimpleInfo = aVar.b;
        if (profilesSimpleInfo.Gb()) {
            new h1e0(profilesSimpleInfo, w2wVar.f1(), true).o(w2wVar);
        }
        return list;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelGetPinnedMessagesCmd(channelId=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
