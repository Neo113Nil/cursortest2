package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class akn implements JSONSerializable, JsonTemplate<wjn> {
    public final Field<oqn> a;
    public final Field<Expression<String>> b;

    public akn(Field<oqn> field, Field<Expression<String>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((yjn) BuiltInParserKt.getBuiltInParserComponent().K0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
