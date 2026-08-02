package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivExtensionTemplate.kt */
/* loaded from: classes8.dex */
public final class dln implements JSONSerializable, JsonTemplate<zkn> {
    public final Field<String> a;
    public final Field<JSONObject> b;

    public dln(Field<String> field, Field<JSONObject> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        bln blnVar = (bln) BuiltInParserKt.getBuiltInParserComponent().c3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        blnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "id", this.a);
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "params", this.b);
        return jSONObject;
    }
}
