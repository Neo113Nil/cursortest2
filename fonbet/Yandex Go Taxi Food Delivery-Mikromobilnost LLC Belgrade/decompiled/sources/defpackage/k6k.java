package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k6k implements c4x {
    public final List a;
    public final List b;
    public final Expression c;
    public Integer d;

    public k6k(List list, List list2, Expression expression) {
        this.a = list;
        this.b = list2;
        this.c = expression;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0044, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(k6k k6kVar, rvo rvoVar, rvo rvoVar2) {
        if (k6kVar == null) {
            return false;
        }
        List list = k6kVar.a;
        List list2 = this.a;
        if (list2 != null) {
            if (list != null && list2.size() == list.size()) {
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    if (!((v3k) obj).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                        break;
                    }
                    i = i2;
                }
                List list3 = k6kVar.b;
                List list4 = this.b;
                if (list4 != null) {
                    if (list3 != null && list4.size() == list3.size()) {
                        int i3 = 0;
                        for (Object obj2 : list4) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            if (!((v3k) obj2).a((v3k) list3.get(i3), rvoVar, rvoVar2)) {
                                break;
                            }
                            i3 = i4;
                        }
                        if (jl40.l(this.c.a(rvoVar), k6kVar.c.a(rvoVar2))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public final int b() {
        int i;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(k6k.class).hashCode();
        int i2 = 0;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List list2 = this.b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((v3k) it2.next()).b();
            }
        }
        int hashCode2 = this.c.hashCode() + i3 + i2;
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((l6k) ft6.b.o0.getValue()).b(ft6.a, this);
    }
}
