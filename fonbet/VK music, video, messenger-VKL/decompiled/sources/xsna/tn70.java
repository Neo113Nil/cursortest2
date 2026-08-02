package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: NumberVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class tn70 implements JSONSerializable, JsonTemplate<pn70> {
    public final Field<String> a;
    public final Field<Expression<Double>> b;

    public tn70(Field<String> field, Field<Expression<Double>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        rn70 rn70Var = (rn70) BuiltInParserKt.getBuiltInParserComponent().S9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        rn70Var.getClass();
        return rn70.b(builtInParsingContext, this);
    }
}
