package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class iol implements c4x {
    public final Expression a;
    public final Expression b;
    public final hol c;
    public final Expression d;
    public Integer e;

    public iol(Expression expression, Expression expression2, hol holVar, Expression expression3) {
        this.a = expression;
        this.b = expression2;
        this.c = holVar;
        this.d = expression3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((kol) ft6.b.I9.getValue()).b(ft6.a, this);
    }
}
