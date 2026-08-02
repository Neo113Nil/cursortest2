package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.h7;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivPageTransformationOverlap.kt */
/* loaded from: classes8.dex */
public final class g7 implements JSONSerializable, Hashable {
    public static final Expression<DivAnimationInterpolator> h;
    public static final Expression<Double> i;
    public static final Expression<Double> j;
    public static final Expression<Double> k;
    public static final Expression<Double> l;
    public static final Expression<Boolean> m;
    public final Expression<DivAnimationInterpolator> a;
    public final Expression<Double> b;
    public final Expression<Double> c;
    public final Expression<Double> d;
    public final Expression<Double> e;
    public final Expression<Boolean> f;
    public Integer g;

    static {
        Expression.Companion companion = Expression.Companion;
        h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        i = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        j = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        k = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        l = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        m = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
    }

    public g7(Expression<DivAnimationInterpolator> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5, Expression<Boolean> expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(g7.class).hashCode();
        this.g = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        h7.b bVar = (h7.b) BuiltInParserKt.getBuiltInParserComponent().n5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return h7.b.b(builtInParsingContext, this);
    }

    public g7() {
        this(h, i, j, k, l, m);
    }
}
