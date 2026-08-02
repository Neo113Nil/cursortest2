package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.k7;
import org.json.JSONObject;

/* compiled from: DivPageTransformationSlideTemplate.kt */
/* loaded from: classes8.dex */
public final class l7 implements JSONSerializable, JsonTemplate<j7> {
    public final Field<Expression<DivAnimationInterpolator>> a;
    public final Field<Expression<Double>> b;
    public final Field<Expression<Double>> c;
    public final Field<Expression<Double>> d;
    public final Field<Expression<Double>> e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
    }

    public l7(Field<Expression<DivAnimationInterpolator>> field, Field<Expression<Double>> field2, Field<Expression<Double>> field3, Field<Expression<Double>> field4, Field<Expression<Double>> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        k7.c cVar = (k7.c) BuiltInParserKt.getBuiltInParserComponent().r5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return k7.c.b(builtInParsingContext, this);
    }
}
