package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.he;
import org.json.JSONObject;

/* compiled from: OffsetDestinationTemplate.kt */
/* loaded from: classes8.dex */
public final class ie implements JSONSerializable, JsonTemplate<ge> {
    public final Field<Expression<Long>> a;

    public ie(Field<Expression<Long>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        he.b bVar = (he.b) BuiltInParserKt.getBuiltInParserComponent().V9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return he.b.b(builtInParsingContext, this);
    }
}
