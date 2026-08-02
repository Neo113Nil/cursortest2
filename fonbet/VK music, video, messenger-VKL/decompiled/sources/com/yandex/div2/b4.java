package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.c4;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fpf0;

/* compiled from: DivFadeTransition.kt */
/* loaded from: classes8.dex */
public final class b4 implements JSONSerializable, Hashable {
    public static final Expression<Double> f;
    public static final Expression<Long> g;
    public static final Expression<DivAnimationInterpolator> h;
    public static final Expression<Long> i;
    public final Expression<Double> a;
    public final Expression<Long> b;
    public final Expression<DivAnimationInterpolator> c;
    public final Expression<Long> d;
    public Integer e;

    static {
        Expression.Companion companion = Expression.Companion;
        f = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public b4(Expression<Double> expression, Expression<Long> expression2, Expression<DivAnimationInterpolator> expression3, Expression<Long> expression4) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
    }

    public final boolean a(b4 b4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return b4Var != null && this.a.evaluate(expressionResolver).doubleValue() == b4Var.a.evaluate(expressionResolver2).doubleValue() && this.b.evaluate(expressionResolver).longValue() == b4Var.b.evaluate(expressionResolver2).longValue() && this.c.evaluate(expressionResolver) == b4Var.c.evaluate(expressionResolver2) && this.d.evaluate(expressionResolver).longValue() == b4Var.d.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(b4.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        c4.b bVar = (c4.b) BuiltInParserKt.getBuiltInParserComponent().e3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return c4.b.b(builtInParsingContext, this);
    }

    public b4() {
        this(f, g, h, i);
    }
}
