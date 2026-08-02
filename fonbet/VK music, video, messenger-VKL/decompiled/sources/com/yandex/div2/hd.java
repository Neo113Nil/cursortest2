package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.id;
import com.yandex.div2.x7;
import org.json.JSONObject;
import xsna.eon;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivTransform.kt */
/* loaded from: classes8.dex */
public final class hd implements JSONSerializable, Hashable {
    public static final x7.b e;
    public static final x7.b f;
    public final x7 a;
    public final x7 b;
    public final Expression<Double> c;
    public Integer d;

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(50.0d);
        e = new x7.b(new eon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        f = new x7.b(new eon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
    }

    public hd(x7 x7Var, x7 x7Var2, Expression<Double> expression) {
        this.a = x7Var;
        this.b = x7Var2;
        this.c = expression;
    }

    public final boolean a(hd hdVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (hdVar != null && this.a.a(hdVar.a, expressionResolver, expressionResolver2) && this.b.a(hdVar.b, expressionResolver, expressionResolver2)) {
            Expression<Double> expression = this.c;
            Double evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Double> expression2 = hdVar.c;
            if (epx.c(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.b.hash() + this.a.hash() + fpf0.a(hd.class).hashCode();
        Expression<Double> expression = this.c;
        int hashCode = hash + (expression != null ? expression.hashCode() : 0);
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((id.a) BuiltInParserKt.getBuiltInParserComponent().Y8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public hd() {
        this(e, f, null);
    }
}
