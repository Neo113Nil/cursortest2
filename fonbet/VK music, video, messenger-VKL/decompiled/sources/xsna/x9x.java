package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: IntegerValue.kt */
/* loaded from: classes8.dex */
public final class x9x implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public Integer b;

    public x9x(Expression<Long> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(x9x.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        y9x y9xVar = (y9x) BuiltInParserKt.getBuiltInParserComponent().I9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        y9xVar.getClass();
        return y9x.a(builtInParsingContext, this);
    }
}
