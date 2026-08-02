package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: BoolValueTemplate.kt */
/* loaded from: classes8.dex */
public final class w08 implements JSONSerializable, JsonTemplate<s08> {
    public final Field<Expression<Boolean>> a;

    public w08(Field<Expression<Boolean>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        u08 u08Var = (u08) BuiltInParserKt.getBuiltInParserComponent().h.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        u08Var.getClass();
        return u08.a(builtInParsingContext, this);
    }
}
