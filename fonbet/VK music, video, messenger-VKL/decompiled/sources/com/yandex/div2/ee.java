package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.de;
import org.json.JSONObject;

/* compiled from: IndexDestinationTemplate.kt */
/* loaded from: classes8.dex */
public final class ee implements JSONSerializable, JsonTemplate<ce> {
    public final Field<Expression<Long>> a;

    public ee(Field<Expression<Long>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        de.b bVar = (de.b) BuiltInParserKt.getBuiltInParserComponent().G9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return de.b.b(builtInParsingContext, this);
    }
}
