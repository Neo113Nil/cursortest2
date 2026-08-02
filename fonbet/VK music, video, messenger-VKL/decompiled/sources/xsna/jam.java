package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: DialogBackgroundGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class jam extends le6<List<? extends xpp<DialogBackground>>> {
    public final List<String> b;
    public final Source c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* compiled from: DialogBackgroundGetByIdCmd.kt */
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

    public jam(List<String> list, Source source, boolean z, boolean z2, boolean z3) {
        this.b = list;
        this.c = source;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // xsna.le6
    public final List<? extends xpp<DialogBackground>> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        kam kamVar = kam.a;
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = this.e;
            boolean z2 = this.f;
            List<String> list = this.b;
            kamVar.a(w2wVar, list, list, this.d, z, z2);
            return f(w2wVar);
        }
        List<String> list2 = this.b;
        Set S0 = j5g.S0(list2);
        ram m = w2wVar.I0().m();
        ArrayList d = m.d(list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (!hpo0.e((lam) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lam) it.next()).a);
        }
        if (m.i() && arrayList2.isEmpty()) {
            return f(w2wVar);
        }
        boolean i2 = m.i();
        boolean z3 = this.d;
        if (i2 && !arrayList2.isEmpty()) {
            kamVar.a(w2wVar, EmptyList.b, arrayList2, z3, this.e, this.f);
            return f(w2wVar);
        }
        if (S0.contains(c.h.c.a) && S0.size() == 1) {
            return f(w2wVar);
        }
        boolean z4 = this.e;
        boolean z5 = this.f;
        List<String> list3 = this.b;
        kamVar.a(w2wVar, list3, list3, z3, z4, z5);
        return f(w2wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jam)) {
            return false;
        }
        jam jamVar = (jam) obj;
        return epx.f(this.b, jamVar.b) && this.c == jamVar.c && this.d == jamVar.d && this.e == jamVar.e && this.f == jamVar.f;
    }

    public final ArrayList f(w2w w2wVar) {
        ArrayList d = w2wVar.I0().m().d(this.b);
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(new xpp(hpo0.j((lam) it.next()), false));
        }
        return arrayList;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBackgroundGetByIdCmd(ids=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", shouldLoadBackgroundFiles=");
        sb.append(this.e);
        sb.append(", shouldAwaitResult=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
