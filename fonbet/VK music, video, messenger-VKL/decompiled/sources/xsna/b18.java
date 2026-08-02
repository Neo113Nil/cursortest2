package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: BoolVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class b18 implements JSONSerializable, JsonTemplate<x08> {
    public final Field<String> a;
    public final Field<Expression<Boolean>> b;

    public b18(Field<String> field, Field<Expression<Boolean>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z08 z08Var = (z08) BuiltInParserKt.getBuiltInParserComponent().k.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        z08Var.getClass();
        return z08.b(builtInParsingContext, this);
    }
}
