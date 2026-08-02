package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.z3;
import org.json.JSONObject;

/* compiled from: DivEdgeInsetsTemplate.kt */
/* loaded from: classes8.dex */
public final class a4 implements JSONSerializable, JsonTemplate<y3> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<Long>> b;
    public final Field<Expression<Long>> c;
    public final Field<Expression<Long>> d;
    public final Field<Expression<Long>> e;
    public final Field<Expression<Long>> f;
    public final Field<Expression<DivSizeUnit>> g;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
    }

    public a4(Field<Expression<Long>> field, Field<Expression<Long>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4, Field<Expression<Long>> field5, Field<Expression<Long>> field6, Field<Expression<DivSizeUnit>> field7) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z3.c cVar = (z3.c) BuiltInParserKt.getBuiltInParserComponent().Z2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return z3.c.a(builtInParsingContext, this);
    }
}
