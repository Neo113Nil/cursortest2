package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DictVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class cxm implements JSONSerializable, JsonTemplate<ywm> {
    public final Field<String> a;
    public final Field<Expression<JSONObject>> b;

    public cxm(Field<String> field, Field<Expression<JSONObject>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        axm axmVar = (axm) BuiltInParserKt.getBuiltInParserComponent().C.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        axmVar.getClass();
        return axm.b(builtInParsingContext, this);
    }
}
