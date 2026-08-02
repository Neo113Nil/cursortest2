package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.a7;
import com.yandex.div2.b3;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivNumberAnimatorTemplate.kt */
/* loaded from: classes8.dex */
public final class b7 implements JSONSerializable, JsonTemplate<z6> {
    public final Field<List<h0>> a;
    public final Field<Expression<DivAnimationDirection>> b;
    public final Field<Expression<Long>> c;
    public final Field<List<h0>> d;
    public final Field<Expression<Double>> e;
    public final Field<String> f;
    public final Field<Expression<DivAnimationInterpolator>> g;
    public final Field<f3> h;
    public final Field<Expression<Long>> i;
    public final Field<Expression<Double>> j;
    public final Field<String> k;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        new b3.a(new j4(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public b7(Field<List<h0>> field, Field<Expression<DivAnimationDirection>> field2, Field<Expression<Long>> field3, Field<List<h0>> field4, Field<Expression<Double>> field5, Field<String> field6, Field<Expression<DivAnimationInterpolator>> field7, Field<f3> field8, Field<Expression<Long>> field9, Field<Expression<Double>> field10, Field<String> field11) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
        this.h = field8;
        this.i = field9;
        this.j = field10;
        this.k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((a7.d) BuiltInParserKt.getBuiltInParserComponent().f5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
