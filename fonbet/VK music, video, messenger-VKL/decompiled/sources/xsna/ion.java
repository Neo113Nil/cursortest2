package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageTemplate.kt */
/* loaded from: classes8.dex */
public final class ion implements JSONSerializable, JsonTemplate<eon> {
    public final Field<Expression<Double>> a;

    public ion(Field<Expression<Double>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        gon gonVar = (gon) BuiltInParserKt.getBuiltInParserComponent().R5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        gonVar.getClass();
        return gon.a(builtInParsingContext, this);
    }
}
