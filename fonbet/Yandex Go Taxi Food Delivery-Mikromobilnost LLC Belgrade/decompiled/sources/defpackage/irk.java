package defpackage;

import com.yandex.div2.DivEvaluableType;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class irk implements c4x {
    public final List a;
    public final String b;
    public final String c;
    public final DivEvaluableType d;
    public Integer e;

    public irk(List list, String str, String str2, DivEvaluableType divEvaluableType) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = divEvaluableType;
    }

    public final boolean a(irk irkVar) {
        if (irkVar != null) {
            List list = irkVar.a;
            List list2 = this.a;
            if (list2.size() == list.size()) {
                Iterator it = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (!jl40.l(this.b, irkVar.b) || !jl40.l(this.c, irkVar.c) || this.d != irkVar.d) {
                            break;
                        }
                        return true;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    jrk jrkVar = (jrk) list.get(i);
                    jrk jrkVar2 = (jrk) next;
                    if (jrkVar != null) {
                        if (!jl40.l(jrkVar2.a, jrkVar.a) || jrkVar2.b != jrkVar.b) {
                            break;
                        }
                        i = i2;
                    } else {
                        jrkVar2.getClass();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(irk.class).hashCode();
        int i2 = 0;
        for (jrk jrkVar : this.a) {
            Integer num2 = jrkVar.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = jrkVar.b.hashCode() + jrkVar.a.hashCode() + qoi0.a(jrk.class).hashCode();
                jrkVar.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
            i2 += i;
        }
        int hashCode3 = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + i2;
        this.e = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((nrk) ft6.b.T3.getValue()).b(ft6.a, this);
    }
}
