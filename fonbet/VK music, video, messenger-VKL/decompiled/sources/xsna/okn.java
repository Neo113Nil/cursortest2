package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskTemplate.kt */
/* loaded from: classes8.dex */
public final class okn implements JSONSerializable, JsonTemplate<kkn> {
    public final Field<Expression<String>> a;
    public final Field<String> b;

    public okn(Field<Expression<String>> field, Field<String> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        mkn mknVar = (mkn) BuiltInParserKt.getBuiltInParserComponent().z2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        mknVar.getClass();
        return mkn.b(builtInParsingContext, this);
    }
}
