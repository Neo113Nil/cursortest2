package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: DialogBackgroundGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class iam extends le6<xpp<List<? extends DialogBackground>>> {
    public final Source b;
    public final boolean c;
    public final boolean d = true;
    public final boolean e = true;

    /* compiled from: DialogBackgroundGetAllCmd.kt */
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

    public iam(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }

    public static xpp f(w2w w2wVar) {
        ArrayList b = w2wVar.I0().m().b();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(hpo0.j((lam) it.next()));
        }
        return new xpp(arrayList, false);
    }

    @Override // xsna.le6
    public final xpp<List<? extends DialogBackground>> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        kam kamVar = kam.a;
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = this.c;
            List list = (List) bz2.c(new tam(z), null);
            w2wVar.I0().m().h();
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((uam) it.next()).a);
            }
            kamVar.a(w2wVar, arrayList, arrayList, z, this.d, this.e);
            return f(w2wVar);
        }
        ram m = w2wVar.I0().m();
        List<lam> all = m.getAll();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : all) {
            if (!hpo0.e((lam) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((lam) it2.next()).a);
        }
        if (m.i() && arrayList3.isEmpty()) {
            return f(w2wVar);
        }
        boolean i2 = m.i();
        boolean z2 = this.c;
        if (i2 && !arrayList3.isEmpty()) {
            kamVar.a(w2wVar, EmptyList.b, arrayList3, z2, this.d, this.e);
            return f(w2wVar);
        }
        w2wVar.L0(this, new pam());
        Iterable iterable = (List) f(w2wVar).b;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : iterable) {
            if (!epx.f(((DialogBackground) obj2).b, c.h.c.a)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((DialogBackground) it3.next()).b);
        }
        List list3 = (List) bz2.c(new tam(z2), null);
        w2wVar.I0().m().h();
        m.h();
        List<uam> list4 = list3;
        ArrayList arrayList6 = new ArrayList(c5g.u(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((uam) it4.next()).a);
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            String str = (String) it5.next();
            if (!arrayList6.contains(str)) {
                m.c(str);
            }
        }
        ram m2 = w2wVar.I0().m();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (uam uamVar : list4) {
            String str2 = uamVar.a;
            if (!epx.f(str2, c.h.c.a)) {
                if (!m2.a(uamVar.b, str2)) {
                    arrayList8.add(str2);
                }
                if (!m2.j(str2)) {
                    arrayList7.add(str2);
                }
            }
        }
        kamVar.a(w2wVar, arrayList8, arrayList7, z2, this.d, this.e);
        return f(w2wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iam)) {
            return false;
        }
        iam iamVar = (iam) obj;
        return this.b == iamVar.b && this.c == iamVar.c && this.d == iamVar.d && this.e == iamVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBackgroundGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        sb.append(this.c);
        sb.append(", shouldLoadBackgroundFiles=");
        sb.append(this.d);
        sb.append(", shouldAwaitProcessingBackgroundResult=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
