package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j1l implements c4x {
    public static final kvo g = ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
    public static final kvo h;
    public static final kvo i;
    public static final kvo j;
    public static final kvo k;
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public Integer f;

    static {
        Double valueOf = Double.valueOf(1.0d);
        h = ngd0.m(valueOf);
        i = ngd0.m(valueOf);
        j = ngd0.m(valueOf);
        k = ngd0.m(valueOf);
    }

    public j1l() {
        this(g, h, i, j, k);
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        k1l k1lVar = (k1l) ft6.b.B5.getValue();
        lb7 lb7Var = ft6.a;
        k1lVar.getClass();
        return k1l.d(lb7Var, this);
    }

    public j1l(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
    }
}
