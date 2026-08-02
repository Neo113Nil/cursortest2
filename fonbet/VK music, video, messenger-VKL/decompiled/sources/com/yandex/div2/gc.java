package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.fc;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorderTemplate.kt */
/* loaded from: classes8.dex */
public final class gc implements JSONSerializable, JsonTemplate<ec> {
    public final Field<Expression<Long>> a;
    public final Field<cb> b;

    public gc(Field<Expression<Long>> field, Field<cb> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        fc.b bVar = (fc.b) BuiltInParserKt.getBuiltInParserComponent().h8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "corner_radius", this.a);
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "stroke", this.b, bVar.a.J7);
        return jSONObject;
    }
}
