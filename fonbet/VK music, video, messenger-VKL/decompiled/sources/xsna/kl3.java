package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArrayValueTemplate.kt */
/* loaded from: classes8.dex */
public final class kl3 implements JSONSerializable, JsonTemplate<gl3> {
    public final Field<Expression<JSONArray>> a;

    public kl3(Field<Expression<JSONArray>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        il3 il3Var = (il3) BuiltInParserKt.getBuiltInParserComponent().b.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        il3Var.getClass();
        return il3.a(builtInParsingContext, this);
    }
}
