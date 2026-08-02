package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.n;
import org.json.JSONObject;

/* compiled from: DivActionScrollByTemplate.kt */
/* loaded from: classes8.dex */
public final class o implements JSONSerializable, JsonTemplate<DivActionScrollBy> {
    public final Field<Expression<Boolean>> a;
    public final Field<Expression<String>> b;
    public final Field<Expression<Long>> c;
    public final Field<Expression<Long>> d;
    public final Field<Expression<DivActionScrollBy.Overflow>> e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivActionScrollBy.Overflow.CLAMP, null, 2, null);
    }

    public o(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4, Field<Expression<DivActionScrollBy.Overflow>> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        n.c cVar = (n.c) BuiltInParserKt.getBuiltInParserComponent().v0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return n.c.b(builtInParsingContext, this);
    }
}
