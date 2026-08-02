package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentTemplate.kt */
/* loaded from: classes8.dex */
public final class vln implements JSONSerializable, JsonTemplate<rln> {
    public final Field<String> a;
    public final Field<DivEvaluableType> b;

    public vln(Field<String> field, Field<DivEvaluableType> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        tln tlnVar = (tln) BuiltInParserKt.getBuiltInParserComponent().G3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        tlnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "name", this.a);
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "type", this.b, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
