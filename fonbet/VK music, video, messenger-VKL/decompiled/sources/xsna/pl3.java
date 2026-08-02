package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArrayVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class pl3 implements JSONSerializable, JsonTemplate<ll3> {
    public final Field<String> a;
    public final Field<Expression<JSONArray>> b;

    public pl3(Field<String> field, Field<Expression<JSONArray>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        nl3 nl3Var = (nl3) BuiltInParserKt.getBuiltInParserComponent().e.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        nl3Var.getClass();
        return nl3.b(builtInParsingContext, this);
    }
}
