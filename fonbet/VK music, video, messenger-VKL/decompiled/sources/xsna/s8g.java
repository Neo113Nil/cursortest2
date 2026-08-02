package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ColorValueTemplate.kt */
/* loaded from: classes8.dex */
public final class s8g implements JSONSerializable, JsonTemplate<o8g> {
    public final Field<Expression<Integer>> a;

    public s8g(Field<Expression<Integer>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        q8g q8gVar = (q8g) BuiltInParserKt.getBuiltInParserComponent().n.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        q8gVar.getClass();
        return q8g.a(builtInParsingContext, this);
    }
}
