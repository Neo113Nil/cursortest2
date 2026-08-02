package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: HintsGetCmd.kt */
/* loaded from: classes2.dex */
public final class f7v extends le6<List<? extends qtd0>> {
    public final int b;
    public final Source c;

    /* compiled from: HintsGetCmd.kt */
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

    public f7v(int i, Source source) {
        this.b = i;
        this.c = source;
    }

    @Override // xsna.le6
    public final List<? extends qtd0> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        int i2 = this.b;
        if (i == 2) {
            return w2wVar.f1() - w2wVar.I0().v().l() > w2wVar.getConfig().n ? j5g.H0((List) w2wVar.L0(this, new wmm()), i2) : f(w2wVar);
        }
        if (i == 3) {
            return j5g.H0((List) w2wVar.L0(this, new wmm()), i2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7v)) {
            return false;
        }
        f7v f7vVar = (f7v) obj;
        return this.b == f7vVar.b && this.c == f7vVar.c;
    }

    public final List<qtd0> f(w2w w2wVar) {
        czh0 v = w2wVar.I0().v();
        Peer.Type type = Peer.Type.USER;
        int i = this.b;
        HashMap a2 = v.a(type, i * 2);
        if (a2.isEmpty()) {
            return EmptyList.b;
        }
        Set keySet = a2.keySet();
        ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        List<qtd0> A = rli0.A(rli0.y(new qli0(rli0.j(new i5g(((wpp) w2wVar.L0(this, new b1r0(arrayList, this.c, true, null))).c.values()), new wr0(21)), new g7v(a2)), i));
        w2wVar.e1(this, new o680(A));
        return A;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return io.reactivex.rxjava3.internal.operators.mixed.k.c(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "HintsGetCmd(limit=" + this.b + ", source=" + this.c + ", changerTag=null)";
    }
}
