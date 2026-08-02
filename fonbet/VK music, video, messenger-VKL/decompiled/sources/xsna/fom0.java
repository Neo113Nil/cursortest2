package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StrVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class fom0 implements JSONSerializable, JsonTemplate<bom0> {
    public final Field<String> a;
    public final Field<Expression<String>> b;

    public fom0(Field<String> field, Field<Expression<String>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        dom0 dom0Var = (dom0) BuiltInParserKt.getBuiltInParserComponent().ha.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        dom0Var.getClass();
        return dom0.b(builtInParsingContext, this);
    }
}
