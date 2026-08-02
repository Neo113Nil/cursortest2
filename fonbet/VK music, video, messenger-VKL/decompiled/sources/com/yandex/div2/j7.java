package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.k7;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivPageTransformationSlide.kt */
/* loaded from: classes8.dex */
public final class j7 implements JSONSerializable, Hashable {
    public static final Expression<DivAnimationInterpolator> g;
    public static final Expression<Double> h;
    public static final Expression<Double> i;
    public static final Expression<Double> j;
    public static final Expression<Double> k;
    public final Expression<DivAnimationInterpolator> a;
    public final Expression<Double> b;
    public final Expression<Double> c;
    public final Expression<Double> d;
    public final Expression<Double> e;
    public Integer f;

    static {
        Expression.Companion companion = Expression.Companion;
        g = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        h = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        i = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        j = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        k = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
    }

    public j7(Expression<DivAnimationInterpolator> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(j7.class).hashCode();
        this.f = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        k7.b bVar = (k7.b) BuiltInParserKt.getBuiltInParserComponent().q5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return k7.b.b(builtInParsingContext, this);
    }

    public j7() {
        this(g, h, i, j, k);
    }
}
