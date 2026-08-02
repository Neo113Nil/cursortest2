package xsna;

import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogAppearanceGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class s9m extends le6<List<? extends x9m>> {
    public final Source b;
    public final boolean c;

    /* compiled from: DialogAppearanceGetAllCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.ACTUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s9m(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }

    @Override // xsna.le6
    public final List<? extends x9m> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        boolean z = this.c;
        if (i != 1) {
            if (i == 2) {
                return w2wVar.I0().t().b();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) bz2.c(new v9m(z), null);
            w2wVar.I0().t().i();
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((w9m) it.next()).a);
            }
            d370.D(w2wVar, arrayList, z);
            return w2wVar.I0().t().b();
        }
        z9m t = w2wVar.I0().t();
        if (t.f()) {
            return w2wVar.I0().t().b();
        }
        List list3 = (List) bz2.c(new v9m(z), null);
        w2wVar.I0().t().i();
        List<x9m> all = t.getAll();
        List list4 = list3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((w9m) it2.next()).a);
        }
        for (x9m x9mVar : all) {
            if (!linkedHashSet.contains(x9mVar.a)) {
                t.c(x9mVar.a);
            }
        }
        List A = rli0.A(new ulp0(rli0.l(new i5g(list4), new yad(w2wVar.I0().t(), 19)), new sm(19)));
        List list5 = A.isEmpty() ? null : A;
        if (list5 != null) {
            d370.D(w2wVar, list5, z);
        }
        return w2wVar.I0().t().b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9m)) {
            return false;
        }
        s9m s9mVar = (s9m) obj;
        return this.b == s9mVar.b && this.c == s9mVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAppearanceGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
