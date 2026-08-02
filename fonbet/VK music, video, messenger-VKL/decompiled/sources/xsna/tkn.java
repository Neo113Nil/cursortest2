package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksTemplate.kt */
/* loaded from: classes8.dex */
public final class tkn implements JSONSerializable, JsonTemplate<pkn> {
    public final Field<List<com.yandex.div2.h0>> a;
    public final Field<List<com.yandex.div2.h0>> b;

    public tkn(Field<List<com.yandex.div2.h0>> field, Field<List<com.yandex.div2.h0>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        rkn rknVar = (rkn) BuiltInParserKt.getBuiltInParserComponent().T2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        rknVar.getClass();
        JSONObject jSONObject = new JSONObject();
        com.yandex.div2.fe feVar = rknVar.a;
        JsonFieldParser.writeListField(builtInParsingContext, jSONObject, "on_fail_actions", this.a, feVar.l1);
        JsonFieldParser.writeListField(builtInParsingContext, jSONObject, "on_success_actions", this.b, feVar.l1);
        return jSONObject;
    }
}
