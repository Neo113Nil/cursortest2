package xsna;

import android.util.ArraySet;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.groups.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GroupsGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class tpu extends le6<wpp<Long, Group>> {
    public final List<Peer> b;
    public final Source c;
    public final boolean d;
    public final Object e;

    /* compiled from: GroupsGetByIdCmd.kt */
    public static final class a {
        public final wpp<Long, Group> a;
        public final wpp<Long, Group> b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(groups=" + this.a + ", changes=" + this.b + ')';
        }

        public a(wpp<Long, Group> wppVar, wpp<Long, Group> wppVar2) {
            this.a = wppVar;
            this.b = wppVar2;
        }

        public /* synthetic */ a(int i) {
            this(new wpp(), new wpp());
        }
    }

    /* compiled from: GroupsGetByIdCmd.kt */
    public static final /* synthetic */ class b {
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

    public /* synthetic */ tpu(List list, Source source, boolean z, int i) {
        this((List<? extends Peer>) list, source, (i & 4) != 0 ? false : z, (Object) null);
    }

    public static a f(List list, w2w w2wVar) {
        xgl0 I0 = w2wVar.I0();
        xuo0.a.getClass();
        long a2 = xuo0.a() - w2wVar.getConfig().y;
        bru n = I0.n();
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).d));
        }
        Map<Long, Group> c = n.c(arrayList);
        ArraySet arraySet = new ArraySet();
        ArraySet arraySet2 = new ArraySet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            long j = ((Peer) it2.next()).d;
            Group group = c.get(Long.valueOf(j));
            if (group == null) {
                arraySet.add(Long.valueOf(j));
            } else if (group.l <= a2) {
                arraySet2.add(Long.valueOf(j));
            }
        }
        wpp wppVar = new wpp(pn00.t(c));
        wppVar.t(arraySet);
        wppVar.s(arraySet2);
        return new a(wppVar, new wpp());
    }

    public static a g(w2w w2wVar, List list, boolean z) {
        if (list.isEmpty()) {
            return new a(0);
        }
        wpp wppVar = new wpp((Map) new kqu((Map) bz2.c(new spu(list, z), "GroupsGetByIdCmd.GroupsGetByIdApiCmd"), w2wVar.f1()).o(w2wVar));
        return new a(wppVar, wppVar);
    }

    @Override // xsna.le6
    public final wpp<Long, Group> e(w2w w2wVar) {
        a f;
        List<Peer> list = this.b;
        if (list.isEmpty()) {
            return new wpp<>();
        }
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i != 1) {
            boolean z = this.d;
            if (i == 2) {
                wpp<Long, Group> wppVar = f(list, w2wVar).a;
                Collection<Long> a2 = wppVar.a();
                ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.a(longValue, Peer.Type.GROUP));
                }
                a g = g(w2wVar, arrayList, z);
                wppVar.m(g.a);
                f = new a(wppVar, g.b);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = g(w2wVar, list, z);
            }
        } else {
            f = f(list, w2wVar);
        }
        wpp<Long, Group> wppVar2 = f.b;
        if (!wppVar2.i()) {
            w2wVar.S0().t(this.e, wppVar2);
        }
        return f.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpu)) {
            return false;
        }
        tpu tpuVar = (tpu) obj;
        return epx.f(this.b, tpuVar.b) && this.c == tpuVar.c && this.d == tpuVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b2 = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b2 + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetByIdCmd(groups=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tpu(List<? extends Peer> list, Source source, boolean z, Object obj) {
        this.b = list;
        this.c = source;
        this.d = z;
        this.e = obj;
        List<? extends Peer> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (Peer peer : list2) {
            peer.getClass();
            if (!peer.Ab(Peer.Type.GROUP)) {
                throw new IllegalArgumentException(("Only groups should be passed to command. Got " + this.b).toString());
            }
        }
    }
}
