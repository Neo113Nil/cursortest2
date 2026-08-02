package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: IntegerVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class gax implements JSONSerializable, JsonTemplate<cax> {
    public final Field<String> a;
    public final Field<Expression<Long>> b;

    public gax(Field<String> field, Field<Expression<Long>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        eax eaxVar = (eax) BuiltInParserKt.getBuiltInParserComponent().M9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        eaxVar.getClass();
        return eax.b(builtInParsingContext, this);
    }
}
