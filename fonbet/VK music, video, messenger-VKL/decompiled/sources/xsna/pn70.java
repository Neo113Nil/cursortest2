package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: NumberVariable.kt */
/* loaded from: classes8.dex */
public final class pn70 implements JSONSerializable, Hashable {
    public final String a;
    public final Expression<Double> b;
    public Integer c;

    public pn70(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(pn70.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        qn70 qn70Var = (qn70) BuiltInParserKt.getBuiltInParserComponent().R9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        qn70Var.getClass();
        return qn70.b(builtInParsingContext, this);
    }
}
