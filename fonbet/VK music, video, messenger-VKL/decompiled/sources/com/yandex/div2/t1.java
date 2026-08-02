package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.s1;
import org.json.JSONObject;

/* compiled from: DivBlurTemplate.kt */
/* loaded from: classes8.dex */
public final class t1 implements JSONSerializable, JsonTemplate<r1> {
    public final Field<Expression<Long>> a;

    public t1(Field<Expression<Long>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        s1.b bVar = (s1.b) BuiltInParserKt.getBuiltInParserComponent().J1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return s1.b.b(builtInParsingContext, this);
    }
}
