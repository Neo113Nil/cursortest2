package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: NumberValueTemplate.kt */
/* loaded from: classes8.dex */
public final class on70 implements JSONSerializable, JsonTemplate<kn70> {
    public final Field<Expression<Double>> a;

    public on70(Field<Expression<Double>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        mn70 mn70Var = (mn70) BuiltInParserKt.getBuiltInParserComponent().P9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        mn70Var.getClass();
        return mn70.a(builtInParsingContext, this);
    }
}
