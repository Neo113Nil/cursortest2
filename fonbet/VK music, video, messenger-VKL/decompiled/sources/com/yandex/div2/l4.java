package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.k4;
import org.json.JSONObject;

/* compiled from: DivFixedCountTemplate.kt */
/* loaded from: classes8.dex */
public final class l4 implements JSONSerializable, JsonTemplate<j4> {
    public final Field<Expression<Long>> a;

    public l4(Field<Expression<Long>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        k4.b bVar = (k4.b) BuiltInParserKt.getBuiltInParserComponent().o3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return k4.b.b(builtInParsingContext, this);
    }
}
