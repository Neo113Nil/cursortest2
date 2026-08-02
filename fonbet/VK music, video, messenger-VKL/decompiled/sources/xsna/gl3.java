package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArrayValue.kt */
/* loaded from: classes8.dex */
public final class gl3 implements JSONSerializable, Hashable {
    public final Expression<JSONArray> a;
    public Integer b;

    public gl3(Expression<JSONArray> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(gl3.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        hl3 hl3Var = (hl3) BuiltInParserKt.getBuiltInParserComponent().a.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        hl3Var.getClass();
        return hl3.a(builtInParsingContext, this);
    }
}
