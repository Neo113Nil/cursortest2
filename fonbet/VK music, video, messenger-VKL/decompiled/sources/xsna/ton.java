package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterTemplate.kt */
/* loaded from: classes8.dex */
public final class ton implements JSONSerializable, JsonTemplate<pon> {
    public final Field<Expression<Double>> a;

    public ton(Field<Expression<Double>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ron ronVar = (ron) BuiltInParserKt.getBuiltInParserComponent().j6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ronVar.getClass();
        return ron.a(builtInParsingContext, this);
    }
}
