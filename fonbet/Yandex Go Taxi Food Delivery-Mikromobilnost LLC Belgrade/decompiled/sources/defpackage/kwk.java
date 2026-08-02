package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kwk implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final String d;
    public Integer e;

    static {
        new kvo(Boolean.FALSE);
    }

    public kwk(Expression expression, Expression expression2, Expression expression3, String str) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = str;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        lwk lwkVar = (lwk) ft6.b.I4.getValue();
        lb7 lb7Var = ft6.a;
        lwkVar.getClass();
        return lwk.d(lb7Var, this);
    }
}
