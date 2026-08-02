package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderTemplate.kt */
/* loaded from: classes8.dex */
public final class zmn implements JSONSerializable, JsonTemplate<vmn> {
    public final Field<String> a;
    public final Field<String> b;

    public zmn(Field<String> field, Field<String> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        xmn xmnVar = (xmn) BuiltInParserKt.getBuiltInParserComponent().N4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        xmnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "height_variable_name", this.a);
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "width_variable_name", this.b);
        return jSONObject;
    }
}
