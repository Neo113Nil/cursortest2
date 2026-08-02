package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTrigger$Mode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lll implements c4x {
    public final List a;
    public final Expression b;
    public final Expression c;
    public Integer d;

    static {
        new kvo(DivTrigger$Mode.ON_CONDITION);
    }

    public lll(List list, Expression expression, Expression expression2) {
        this.a = list;
        this.b = expression;
        this.c = expression2;
    }

    public final boolean a(lll lllVar, rvo rvoVar, rvo rvoVar2) {
        if (lllVar == null) {
            return false;
        }
        List list = lllVar.a;
        List list2 = this.a;
        if (list2.size() == list.size()) {
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (((Boolean) this.b.a(rvoVar)).booleanValue() != ((Boolean) lllVar.b.a(rvoVar2)).booleanValue() || this.c.a(rvoVar) != lllVar.c.a(rvoVar2)) {
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
                if (!((v3k) next).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(lll.class).hashCode();
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((v3k) it.next()).b();
        }
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + i;
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((mll) ft6.b.z9.getValue()).b(ft6.a, this);
    }
}
