package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class luk implements c4x {
    public final Expression a;
    public Integer b;

    public luk(Expression expression) {
        this.a = expression;
    }

    public final boolean a(luk lukVar, rvo rvoVar, rvo rvoVar2) {
        return lukVar != null && ((Number) this.a.a(rvoVar)).intValue() == ((Number) lukVar.a.a(rvoVar2)).intValue();
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(luk.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        yvk yvkVar = (yvk) ft6.b.U4.getValue();
        lb7 lb7Var = ft6.a;
        yvkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.h(lb7Var, jSONObject, "color", this.a, b.a);
        return jSONObject;
    }
}
