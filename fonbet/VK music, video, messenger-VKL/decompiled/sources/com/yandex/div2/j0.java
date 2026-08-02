package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionTimer;
import com.yandex.div2.i0;
import org.json.JSONObject;

/* compiled from: DivActionTimerTemplate.kt */
/* loaded from: classes8.dex */
public final class j0 implements JSONSerializable, JsonTemplate<DivActionTimer> {
    public final Field<Expression<DivActionTimer.Action>> a;
    public final Field<Expression<String>> b;

    public j0(Field<Expression<DivActionTimer.Action>> field, Field<Expression<String>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        i0.c cVar = (i0.c) BuiltInParserKt.getBuiltInParserComponent().Z0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return i0.c.b(builtInParsingContext, this);
    }
}
