package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPointTemplate.kt */
/* loaded from: classes8.dex */
public final class non implements JSONSerializable, JsonTemplate<jon> {
    public final Field<com.yandex.div2.u3> a;
    public final Field<com.yandex.div2.u3> b;

    public non(Field<com.yandex.div2.u3> field, Field<com.yandex.div2.u3> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        lon lonVar = (lon) BuiltInParserKt.getBuiltInParserComponent().X5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        lonVar.getClass();
        JSONObject jSONObject = new JSONObject();
        com.yandex.div2.fe feVar = lonVar.a;
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "x", this.a, feVar.N2);
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "y", this.b, feVar.N2);
        return jSONObject;
    }
}
