package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.x6;
import org.json.JSONObject;

/* compiled from: DivMatchParentSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class y6 implements JSONSerializable, JsonTemplate<w6> {
    public final Field<ca> a;
    public final Field<ca> b;
    public final Field<Expression<Double>> c;

    public y6(Field<ca> field, Field<ca> field2, Field<Expression<Double>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((x6.b) BuiltInParserKt.getBuiltInParserComponent().W4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
