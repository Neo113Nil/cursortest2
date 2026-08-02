package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: NumberValue.kt */
/* loaded from: classes8.dex */
public final class kn70 implements JSONSerializable, Hashable {
    public final Expression<Double> a;
    public Integer b;

    public kn70(Expression<Double> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(kn70.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ln70 ln70Var = (ln70) BuiltInParserKt.getBuiltInParserComponent().O9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ln70Var.getClass();
        return ln70.a(builtInParsingContext, this);
    }
}
