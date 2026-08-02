package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class e7l implements c4x {
    public final Expression a;
    public final z3l b;
    public final z3l c;
    public Integer d;

    static {
        Double valueOf = Double.valueOf(50.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
    }

    public e7l(z3l z3lVar, z3l z3lVar2, Expression expression) {
        this.a = expression;
        this.b = z3lVar;
        this.c = z3lVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((f7l) ft6.b.H6.getValue()).b(ft6.a, this);
    }
}
