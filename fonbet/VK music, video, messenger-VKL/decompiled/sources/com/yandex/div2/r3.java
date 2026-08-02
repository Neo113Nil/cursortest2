package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.q3;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
/* loaded from: classes8.dex */
public final class r3 implements JSONSerializable, JsonTemplate<p3> {
    public final Field<s4> a;

    static {
        Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null);
    }

    public r3(Field<s4> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((q3.b) BuiltInParserKt.getBuiltInParserComponent().K2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
