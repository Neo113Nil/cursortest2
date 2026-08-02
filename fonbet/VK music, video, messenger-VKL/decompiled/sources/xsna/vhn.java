package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueTemplate.kt */
/* loaded from: classes8.dex */
public final class vhn implements JSONSerializable, JsonTemplate<rhn> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<String>> b;

    public vhn(Field<Expression<Long>> field, Field<Expression<String>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        thn thnVar = (thn) BuiltInParserKt.getBuiltInParserComponent().U.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        thnVar.getClass();
        return thn.b(builtInParsingContext, this);
    }
}
