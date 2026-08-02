package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.b3;
import com.yandex.div2.u0;
import java.util.List;
import org.json.JSONObject;
import xsna.wln;

/* compiled from: DivAnimationTemplate.kt */
/* loaded from: classes8.dex */
public final class v0 implements JSONSerializable, JsonTemplate<DivAnimation> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<Double>> b;
    public final Field<Expression<DivAnimationInterpolator>> c;
    public final Field<List<v0>> d;
    public final Field<Expression<DivAnimation.Name>> e;
    public final Field<f3> f;
    public final Field<Expression<Long>> g;
    public final Field<Expression<Double>> h;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 300L, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        new b3.b(new wln());
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public v0(Field<Expression<Long>> field, Field<Expression<Double>> field2, Field<Expression<DivAnimationInterpolator>> field3, Field<List<v0>> field4, Field<Expression<DivAnimation.Name>> field5, Field<f3> field6, Field<Expression<Long>> field7, Field<Expression<Double>> field8) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
        this.h = field8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u0.d) BuiltInParserKt.getBuiltInParserComponent().r1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
