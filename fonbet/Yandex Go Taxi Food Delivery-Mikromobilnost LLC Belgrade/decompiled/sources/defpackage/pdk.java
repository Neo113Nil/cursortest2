package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pdk implements c4x {
    public static final kvo k;
    public static final okk l;
    public static final kvo m;
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final List d;
    public final Expression e;
    public final pkk f;
    public final Expression g;
    public final Expression h;
    public Integer i;
    public Integer j;

    static {
        ngd0.m(300L);
        k = ngd0.m(DivAnimationInterpolator.SPRING);
        l = new okk(new duk());
        m = ngd0.m(0L);
    }

    public pdk(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, pkk pkkVar, Expression expression5, Expression expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = list;
        this.e = expression4;
        this.f = pkkVar;
        this.g = expression5;
        this.h = expression6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        if (r2 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(pdk pdkVar, rvo rvoVar, rvo rvoVar2) {
        if (pdkVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) pdkVar.a.a(rvoVar2)).longValue()) {
            Expression expression = this.b;
            Double d = expression != null ? (Double) expression.a(rvoVar) : null;
            Expression expression2 = pdkVar.b;
            if (jl40.i(d, expression2 != null ? (Double) expression2.a(rvoVar2) : null) && this.c.a(rvoVar) == pdkVar.c.a(rvoVar2)) {
                List list = pdkVar.d;
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
                            if (!((pdk) obj).a((pdk) list.get(i), rvoVar, rvoVar2)) {
                                break;
                            }
                            i = i2;
                        }
                        if (this.e.a(rvoVar) == pdkVar.e.a(rvoVar2) && this.f.a(pdkVar.f, rvoVar, rvoVar2) && ((Number) this.g.a(rvoVar)).longValue() == ((Number) pdkVar.g.a(rvoVar2)).longValue()) {
                            Expression expression3 = this.h;
                            Double d2 = expression3 != null ? (Double) expression3.a(rvoVar) : null;
                            Expression expression4 = pdkVar.h;
                            if (jl40.i(d2, expression4 != null ? (Double) expression4.a(rvoVar2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.i;
        int i = 0;
        if (num2 != null) {
            hashCode = num2.intValue();
        } else {
            int hashCode2 = this.a.hashCode() + qoi0.a(pdk.class).hashCode();
            Expression expression = this.b;
            int hashCode3 = this.g.hashCode() + this.f.b() + this.e.hashCode() + this.c.hashCode() + hashCode2 + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.h;
            hashCode = (expression2 != null ? expression2.hashCode() : 0) + hashCode3;
            this.i = Integer.valueOf(hashCode);
        }
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((pdk) it.next()).b();
            }
        }
        int i2 = hashCode + i;
        this.j = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((sdk) ft6.b.z1.getValue()).b(ft6.a, this);
    }

    public /* synthetic */ pdk(kvo kvoVar, kvo kvoVar2, kvo kvoVar3, kvo kvoVar4) {
        this(kvoVar, kvoVar2, k, null, kvoVar3, l, m, kvoVar4);
    }
}
