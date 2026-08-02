package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.c;
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
/* loaded from: classes8.dex */
public final class d implements JSONSerializable, JsonTemplate<b> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<Long>> b;
    public final Field<Expression<Long>> c;
    public final Field<Expression<Long>> d;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public d(Field<Expression<Long>> field, Field<Expression<Long>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        c.b bVar = (c.b) BuiltInParserKt.getBuiltInParserComponent().F.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return c.b.a(builtInParsingContext, this);
    }
}
