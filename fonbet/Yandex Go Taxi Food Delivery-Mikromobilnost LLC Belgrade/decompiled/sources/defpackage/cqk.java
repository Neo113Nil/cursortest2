package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cqk implements c4x {
    public final Expression a;
    public Integer b;

    public cqk(Expression expression) {
        this.a = expression;
    }

    public final boolean a(cqk cqkVar, rvo rvoVar, rvo rvoVar2) {
        return cqkVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) cqkVar.a.a(rvoVar2)).longValue();
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(cqk.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        dqk dqkVar = (dqk) ft6.b.v3.getValue();
        lb7 lb7Var = ft6.a;
        dqkVar.getClass();
        return dqk.d(lb7Var, this);
    }
}
