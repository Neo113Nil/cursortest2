package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StrValue.kt */
/* loaded from: classes8.dex */
public final class wnm0 implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public Integer b;

    public wnm0(Expression<String> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(wnm0.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        xnm0 xnm0Var = (xnm0) BuiltInParserKt.getBuiltInParserComponent().da.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        xnm0Var.getClass();
        return xnm0.a(builtInParsingContext, this);
    }
}
