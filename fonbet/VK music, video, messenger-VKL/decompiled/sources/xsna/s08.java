package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: BoolValue.kt */
/* loaded from: classes8.dex */
public final class s08 implements JSONSerializable, Hashable {
    public final Expression<Boolean> a;
    public Integer b;

    public s08(Expression<Boolean> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(s08.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        t08 t08Var = (t08) BuiltInParserKt.getBuiltInParserComponent().g.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        t08Var.getClass();
        return t08.a(builtInParsingContext, this);
    }
}
