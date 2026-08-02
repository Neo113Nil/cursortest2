package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DictValueTemplate.kt */
/* loaded from: classes8.dex */
public final class xwm implements JSONSerializable, JsonTemplate<twm> {
    public final Field<Expression<JSONObject>> a;

    public xwm(Field<Expression<JSONObject>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        vwm vwmVar = (vwm) BuiltInParserKt.getBuiltInParserComponent().z.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        vwmVar.getClass();
        return vwm.a(builtInParsingContext, this);
    }
}
