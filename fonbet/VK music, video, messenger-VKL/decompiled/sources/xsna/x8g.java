package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ColorVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class x8g implements JSONSerializable, JsonTemplate<t8g> {
    public final Field<String> a;
    public final Field<Expression<Integer>> b;

    public x8g(Field<String> field, Field<Expression<Integer>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        v8g v8gVar = (v8g) BuiltInParserKt.getBuiltInParserComponent().q.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        v8gVar.getClass();
        return v8g.b(builtInParsingContext, this);
    }
}
