package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.tc;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskSolidTemplate.kt */
/* loaded from: classes8.dex */
public final class uc implements JSONSerializable, JsonTemplate<sc> {
    public final Field<Expression<Integer>> a;
    public final Field<Expression<Boolean>> b;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public uc(Field<Expression<Integer>> field, Field<Expression<Boolean>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        tc.b bVar = (tc.b) BuiltInParserKt.getBuiltInParserComponent().p8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return tc.b.b(builtInParsingContext, this);
    }
}
