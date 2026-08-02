package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.v8;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
/* loaded from: classes8.dex */
public final class w8 implements JSONSerializable, JsonTemplate<DivRadialGradientRelativeRadius> {
    public final Field<Expression<DivRadialGradientRelativeRadius.Value>> a;

    public w8(Field<Expression<DivRadialGradientRelativeRadius.Value>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        v8.c cVar = (v8.c) BuiltInParserKt.getBuiltInParserComponent().m6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return v8.c.a(builtInParsingContext, this);
    }
}
