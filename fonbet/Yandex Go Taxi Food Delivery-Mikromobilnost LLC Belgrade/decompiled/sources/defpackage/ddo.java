package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class ddo extends jdo {
    public final ArrayList d;
    public final String e;
    public final List f;
    public final List g;

    public ddo(ArrayList arrayList, String str) {
        super(str);
        this.d = arrayList;
        this.e = str;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jdo) it.next()).c());
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            w511.x("Empty collection can't be reduced.");
            throw null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = a.m0((List) it2.next(), (List) next);
        }
        this.f = (List) next;
        ArrayList arrayList3 = this.d;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((jdo) it3.next()).b());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            w511.x("Empty collection can't be reduced.");
            throw null;
        }
        Object next2 = it4.next();
        while (it4.hasNext()) {
            next2 = a.m0((List) it4.next(), (List) next2);
        }
        this.g = (List) next2;
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        ArrayList arrayList = new ArrayList();
        boolean y = evu0.y(this.e, "://", false);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            jdo jdoVar = (jdo) it.next();
            Object b = mdoVar.b(jdoVar);
            arrayList.add((y && (b instanceof jdc)) ? "%23".concat(evu0.N(MoneyInputEditView.DEFAULT_VALUE, 8, Integer.toHexString(((jdc) b).a)).toUpperCase(Locale.ROOT)) : b.toString());
            d(jdoVar.b);
        }
        return a.X(arrayList, "", null, null, null, 62);
    }

    @Override // defpackage.jdo
    public final List b() {
        return this.g;
    }

    @Override // defpackage.jdo
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddo)) {
            return false;
        }
        ddo ddoVar = (ddo) obj;
        return this.d.equals(ddoVar.d) && jl40.l(this.e, ddoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.X(this.d, "", null, null, null, 62);
    }
}
