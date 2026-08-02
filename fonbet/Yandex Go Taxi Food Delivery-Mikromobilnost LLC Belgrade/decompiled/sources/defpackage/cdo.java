package defpackage;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cdo extends jdo {
    public final klz0 d;
    public final ArrayList e;
    public final String f;
    public final List g;
    public final List h;

    public cdo(klz0 klz0Var, ArrayList arrayList, String str) {
        super(str);
        Object next;
        this.d = klz0Var;
        this.e = arrayList;
        this.f = str;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jdo) it.next()).c());
        }
        Iterator it2 = arrayList2.iterator();
        Object obj = null;
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = a.m0((List) it2.next(), (List) next);
            }
        } else {
            next = null;
        }
        List list = (List) next;
        List list2 = EmptyList.a;
        this.g = list == null ? list2 : list;
        ArrayList arrayList3 = this.e;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((jdo) it3.next()).b());
        }
        Iterator it4 = arrayList4.iterator();
        if (it4.hasNext()) {
            obj = it4.next();
            while (it4.hasNext()) {
                obj = a.m0((List) it4.next(), (List) obj);
            }
        }
        List list3 = (List) obj;
        this.h = list3 != null ? list3 : list2;
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        EvaluableType evaluableType;
        cxq0 cxq0Var = mdoVar.a;
        String str = this.d.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            jdo jdoVar = (jdo) it.next();
            arrayList.add(mdoVar.b(jdoVar));
            d(jdoVar.b);
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (next instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (next instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (next instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (next instanceof com.yandex.div.evaluable.types.a) {
                evaluableType = EvaluableType.DATETIME;
            } else if (next instanceof jdc) {
                evaluableType = EvaluableType.COLOR;
            } else if (next instanceof rg21) {
                evaluableType = EvaluableType.URL;
            } else if (next instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(next instanceof JSONArray)) {
                    if (next == null) {
                        kbs.n("Unable to find type for null", null);
                        return null;
                    }
                    kbs.n(qv10.n(next, "Unable to find type for "), null);
                    return null;
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            c h = ((nms) ((gp50) cxq0Var.w).b).h(str, arrayList2);
            d(h.f());
            return h.e(cxq0Var, this, mdo.a(h, arrayList));
        } catch (EvaluableException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            b.g(str, arrayList, message, e);
            throw null;
        }
    }

    @Override // defpackage.jdo
    public final List b() {
        return this.h;
    }

    @Override // defpackage.jdo
    public final List c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdo)) {
            return false;
        }
        cdo cdoVar = (cdo) obj;
        return this.d.equals(cdoVar.d) && this.e.equals(cdoVar.e) && jl40.l(this.f, cdoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ly3.b(this.d.a.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        ArrayList arrayList = this.e;
        return a.P(arrayList) + '.' + this.d.a + '(' + (arrayList.size() > 1 ? a.X(arrayList.subList(1, arrayList.size()), ",", null, null, null, 62) : "") + ')';
    }
}
