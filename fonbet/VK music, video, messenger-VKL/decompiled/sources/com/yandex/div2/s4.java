package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.r4;
import org.json.JSONObject;

/* compiled from: DivFixedSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class s4 implements JSONSerializable, JsonTemplate<q4> {
    public final Field<Expression<DivSizeUnit>> a;
    public final Field<Expression<Long>> b;

    static {
        Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);
    }

    public s4(Field<Expression<DivSizeUnit>> field, Field<Expression<Long>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        r4.c cVar = (r4.c) BuiltInParserKt.getBuiltInParserComponent().x3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return r4.c.b(builtInParsingContext, this);
    }
}
