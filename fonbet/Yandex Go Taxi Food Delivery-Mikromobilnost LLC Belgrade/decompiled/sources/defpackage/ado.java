package defpackage;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.IntegerOverflow;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ado extends jdo {
    public final klz0 d;
    public final ArrayList e;
    public final String f;
    public final List g;
    public final List h;

    public ado(klz0 klz0Var, ArrayList arrayList, String str) {
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
        List list3 = jdo.c.contains(this.d.a) ? arrayList3 : list2;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((jdo) it3.next()).b());
        }
        Iterator it4 = a.m0(Collections.singletonList(list3), arrayList4).iterator();
        if (it4.hasNext()) {
            obj = it4.next();
            while (it4.hasNext()) {
                obj = a.m0((List) it4.next(), (List) obj);
            }
        }
        List list4 = (List) obj;
        this.h = list4 != null ? list4 : list2;
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
            c i = ((nms) ((gp50) cxq0Var.w).b).i(str, arrayList2);
            d(i.f());
            try {
                return i.e(cxq0Var, this, mdo.a(i, arrayList));
            } catch (IntegerOverflow unused) {
                throw new IntegerOverflow(b.a(i.c(), arrayList));
            }
        } catch (EvaluableException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            b.f(str, message, arrayList);
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
        if (!(obj instanceof ado)) {
            return false;
        }
        ado adoVar = (ado) obj;
        return this.d.equals(adoVar.d) && this.e.equals(adoVar.e) && jl40.l(this.f, adoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ly3.b(this.d.a.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return this.d.a + '(' + a.X(this.e, ",", null, null, null, 62) + ')';
    }
}
