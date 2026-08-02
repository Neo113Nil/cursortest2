package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StrValueTemplate.kt */
/* loaded from: classes8.dex */
public final class aom0 implements JSONSerializable, JsonTemplate<wnm0> {
    public final Field<Expression<String>> a;

    public aom0(Field<Expression<String>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ynm0 ynm0Var = (ynm0) BuiltInParserKt.getBuiltInParserComponent().ea.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ynm0Var.getClass();
        return ynm0.a(builtInParsingContext, this);
    }
}
