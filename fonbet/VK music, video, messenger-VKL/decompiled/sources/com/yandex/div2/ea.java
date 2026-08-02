package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.da;
import org.json.JSONObject;

/* compiled from: DivSlideTransitionTemplate.kt */
/* loaded from: classes8.dex */
public final class ea implements JSONSerializable, JsonTemplate<DivSlideTransition> {
    public final Field<u3> a;
    public final Field<Expression<Long>> b;
    public final Field<Expression<DivSlideTransition.Edge>> c;
    public final Field<Expression<DivAnimationInterpolator>> d;
    public final Field<Expression<Long>> e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSlideTransition.Edge.BOTTOM, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public ea(Field<u3> field, Field<Expression<Long>> field2, Field<Expression<DivSlideTransition.Edge>> field3, Field<Expression<DivAnimationInterpolator>> field4, Field<Expression<Long>> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((da.d) BuiltInParserKt.getBuiltInParserComponent().c7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
