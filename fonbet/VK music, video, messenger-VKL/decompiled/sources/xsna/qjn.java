package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipTemplate.kt */
/* loaded from: classes8.dex */
public final class qjn implements JSONSerializable, JsonTemplate<mjn> {
    public final Field<Expression<String>> a;

    public qjn(Field<Expression<String>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ojn ojnVar = (ojn) BuiltInParserKt.getBuiltInParserComponent().s0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ojnVar.getClass();
        return ojn.a(builtInParsingContext, this);
    }
}
