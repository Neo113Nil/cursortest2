package xsna;

import com.ironsource.C4504q2;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;

/* compiled from: FriendsLoadCmd.kt */
/* loaded from: classes2.dex */
public final class ars extends le6<xpp<Collection<? extends qtd0>>> {
    public final int b;
    public final Source c;

    /* compiled from: FriendsLoadCmd.kt */
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

    public ars() {
        this(0, 7, null);
    }

    @Override // xsna.le6
    public final xpp<Collection<? extends qtd0>> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i != 2) {
            if (i == 3) {
                return g(w2wVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        xpp<Collection<qtd0>> f = f(w2wVar);
        boolean d = f.d();
        if (d) {
            return g(w2wVar);
        }
        if (d) {
            throw new NoWhenBranchMatchedException();
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ars)) {
            return false;
        }
        ars arsVar = (ars) obj;
        return this.b == arsVar.b && this.c == arsVar.c;
    }

    public final xpp<Collection<qtd0>> f(w2w w2wVar) {
        x1r0 d = w2wVar.I0().d();
        Long m = d.m();
        long j = w2wVar.getConfig().m;
        Collection<Long> t = d.t(3);
        ArrayList arrayList = new ArrayList(c5g.u(t, 10));
        Iterator<T> it = t.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        wpp wppVar = (wpp) w2wVar.L0(this, new b1r0(arrayList, Source.CACHE));
        long f1 = w2wVar.f1();
        if (m == null) {
            return new xpp<>();
        }
        return new xpp<>(wppVar.c.values(), f1 - m.longValue() > j || !wppVar.b.isEmpty());
    }

    public final xpp<Collection<qtd0>> g(w2w w2wVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            vua0.c("FriendsLoadCmd");
            ij20.a aVar = new ij20.a();
            aVar.d = bz2.m();
            aVar.c = "friends.get";
            aVar.b(C4504q2.u, "hints");
            aVar.b("fields", ky2.b);
            aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(i).toString());
            Integer num = 5000;
            aVar.f.put("count", num.toString());
            aVar.i = false;
            List list = (List) bz2.f(new ij20(aVar), brs.b);
            arrayList.addAll(list);
            if (list.size() < 5000) {
                long f1 = w2wVar.f1();
                Map<Long, User> map = (Map) new i1r0(w2wVar.f1(), arrayList).o(w2wVar);
                w2wVar.I0().d().o(f1);
                w2wVar.S0().M(null, map);
                return f(w2wVar);
            }
            i += 5000;
        }
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + io.reactivex.rxjava3.internal.operators.mixed.k.c(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "FriendsLoadCmd(limit=" + this.b + ", source=" + this.c + ", awaitNetwork=false)";
    }

    public ars(int i, int i2, Source source) {
        i = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        source = (i2 & 2) != 0 ? Source.CACHE : source;
        this.b = i;
        this.c = source;
    }
}
