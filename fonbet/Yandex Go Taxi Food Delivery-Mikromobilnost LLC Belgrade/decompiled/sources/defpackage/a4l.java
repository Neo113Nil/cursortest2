package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a4l implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public a4l(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        b4l b4lVar = (b4l) ft6.b.a6.getValue();
        lb7 lb7Var = ft6.a;
        b4lVar.getClass();
        return b4l.d(lb7Var, this);
    }
}
