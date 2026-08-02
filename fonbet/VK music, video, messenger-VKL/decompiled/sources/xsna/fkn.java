package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipTemplate.kt */
/* loaded from: classes8.dex */
public final class fkn implements JSONSerializable, JsonTemplate<bkn> {
    public final Field<Expression<String>> a;
    public final Field<Expression<Boolean>> b;

    public fkn(Field<Expression<String>> field, Field<Expression<Boolean>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        dkn dknVar = (dkn) BuiltInParserKt.getBuiltInParserComponent().N0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        dknVar.getClass();
        return dkn.b(builtInParsingContext, this);
    }
}
