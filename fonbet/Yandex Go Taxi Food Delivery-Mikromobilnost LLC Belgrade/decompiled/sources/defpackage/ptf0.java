package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ptf0 implements c4x {
    public final Expression a;
    public final String b;
    public final String c;
    public final List d;
    public final DivEvaluableType e;
    public Integer f;

    public ptf0(Expression expression, String str, String str2, List list, DivEvaluableType divEvaluableType) {
        this.a = expression;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = divEvaluableType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r1 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ptf0 ptf0Var, rvo rvoVar, rvo rvoVar2) {
        if (ptf0Var != null && jl40.l(this.a.a(rvoVar), ptf0Var.a.a(rvoVar2)) && jl40.l(this.b, ptf0Var.b) && this.c.equals(ptf0Var.c)) {
            List list = ptf0Var.d;
            List list2 = this.d;
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
                    if (this.e == ptf0Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(ptf0.class).hashCode();
        int i = 0;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        }
        int hashCode2 = this.e.hashCode() + hashCode + i;
        this.f = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((stf0) ft6.b.ya.getValue()).b(ft6.a, this);
    }
}
