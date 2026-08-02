package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.m2;
import org.json.JSONObject;

/* compiled from: DivCloudBackgroundTemplate.kt */
/* loaded from: classes8.dex */
public final class n2 implements JSONSerializable, JsonTemplate<l2> {
    public final Field<Expression<Integer>> a;
    public final Field<Expression<Long>> b;
    public final Field<a4> c;

    public n2(Field<Expression<Integer>> field, Field<Expression<Long>> field2, Field<a4> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((m2.b) BuiltInParserKt.getBuiltInParserComponent().b2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
