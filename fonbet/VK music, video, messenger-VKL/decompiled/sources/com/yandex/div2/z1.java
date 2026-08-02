package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.y1;
import org.json.JSONObject;

/* compiled from: DivChangeBoundsTransitionTemplate.kt */
/* loaded from: classes8.dex */
public final class z1 implements JSONSerializable, JsonTemplate<x1> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<DivAnimationInterpolator>> b;
    public final Field<Expression<Long>> c;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public z1(Field<Expression<Long>> field, Field<Expression<DivAnimationInterpolator>> field2, Field<Expression<Long>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        y1.c cVar = (y1.c) BuiltInParserKt.getBuiltInParserComponent().P1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return y1.c.b(builtInParsingContext, this);
    }
}
