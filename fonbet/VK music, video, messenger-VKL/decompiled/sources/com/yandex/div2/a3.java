package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.z2;
import org.json.JSONObject;

/* compiled from: DivCornersRadiusTemplate.kt */
/* loaded from: classes8.dex */
public final class a3 implements JSONSerializable, JsonTemplate<y2> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<Long>> b;
    public final Field<Expression<Long>> c;
    public final Field<Expression<Long>> d;

    public a3(Field<Expression<Long>> field, Field<Expression<Long>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z2.b bVar = (z2.b) BuiltInParserKt.getBuiltInParserComponent().t2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return z2.b.a(builtInParsingContext, this);
    }
}
