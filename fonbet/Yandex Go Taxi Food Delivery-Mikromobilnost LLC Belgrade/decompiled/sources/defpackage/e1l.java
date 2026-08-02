package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e1l implements c4x {
    public static final kvo h = ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
    public static final kvo i;
    public static final kvo j;
    public static final kvo k;
    public static final kvo l;
    public static final kvo m;
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public Integer g;

    static {
        Double valueOf = Double.valueOf(1.0d);
        i = ngd0.m(valueOf);
        j = ngd0.m(valueOf);
        k = ngd0.m(valueOf);
        l = ngd0.m(valueOf);
        m = ngd0.m(Boolean.FALSE);
    }

    public e1l() {
        this(h, i, j, k, l, m);
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        f1l f1lVar = (f1l) ft6.b.y5.getValue();
        lb7 lb7Var = ft6.a;
        f1lVar.getClass();
        return f1l.d(lb7Var, this);
    }

    public e1l(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
    }
}
