package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ta;
import org.json.JSONObject;

/* compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
/* loaded from: classes8.dex */
public final class ua implements JSONSerializable, JsonTemplate<sa> {
    public final Field<s4> a;
    public final Field<Expression<Long>> b;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 5L, null, 2, null);
        Expression.Companion.constant$default(companion, 10L, null, 2, null);
    }

    public ua(Field<s4> field, Field<Expression<Long>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ta.b) BuiltInParserKt.getBuiltInParserComponent().x7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
