package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m8k implements c4x {
    public final Expression a;
    public final l8k b;
    public Integer c;

    public m8k(Expression expression, l8k l8kVar) {
        this.a = expression;
        this.b = l8kVar;
    }

    public final boolean a(m8k m8kVar, rvo rvoVar, rvo rvoVar2) {
        if (m8kVar != null && jl40.l(this.a.a(rvoVar), m8kVar.a.a(rvoVar2))) {
            l8k l8kVar = m8kVar.b;
            l8k l8kVar2 = this.b;
            if (l8kVar == null) {
                l8kVar2.getClass();
            } else {
                Expression expression = l8kVar2.a;
                Long l = expression != null ? (Long) expression.a(rvoVar) : null;
                Expression expression2 = l8kVar.a;
                if (jl40.l(l, expression2 != null ? (Long) expression2.a(rvoVar2) : null) && ((Number) l8kVar2.b.a(rvoVar)).longValue() == ((Number) l8kVar.b.a(rvoVar2)).longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(m8k.class).hashCode();
        l8k l8kVar = this.b;
        Integer num2 = l8kVar.c;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int hashCode2 = qoi0.a(l8k.class).hashCode();
            Expression expression = l8kVar.a;
            int hashCode3 = hashCode2 + (expression != null ? expression.hashCode() : 0) + l8kVar.b.hashCode();
            l8kVar.c = Integer.valueOf(hashCode3);
            i = hashCode3;
        }
        int i2 = i + hashCode;
        this.c = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((n8k) ft6.b.G0.getValue()).b(ft6.a, this);
    }
}
