package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: IntegerValueTemplate.kt */
/* loaded from: classes8.dex */
public final class bax implements JSONSerializable, JsonTemplate<x9x> {
    public final Field<Expression<Long>> a;

    public bax(Field<Expression<Long>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z9x z9xVar = (z9x) BuiltInParserKt.getBuiltInParserComponent().J9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        z9xVar.getClass();
        return z9x.a(builtInParsingContext, this);
    }
}
