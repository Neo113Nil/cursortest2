package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ke;
import java.util.List;
import org.json.JSONObject;

/* compiled from: PropertyVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class le implements JSONSerializable, JsonTemplate<je> {
    public final Field<Expression<String>> a;
    public final Field<String> b;
    public final Field<String> c;
    public final Field<List<h0>> d;
    public final Field<Expression<DivEvaluableType>> e;

    public le(Field<Expression<String>> field, Field<String> field2, Field<String> field3, Field<List<h0>> field4, Field<Expression<DivEvaluableType>> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ke.c) BuiltInParserKt.getBuiltInParserComponent().Y9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
