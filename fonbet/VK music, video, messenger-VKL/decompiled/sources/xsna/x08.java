package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: BoolVariable.kt */
/* loaded from: classes8.dex */
public final class x08 implements JSONSerializable, Hashable {
    public final String a;
    public final Expression<Boolean> b;
    public Integer c;

    public x08(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(x08.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        y08 y08Var = (y08) BuiltInParserKt.getBuiltInParserComponent().j.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        y08Var.getClass();
        return y08.b(builtInParsingContext, this);
    }
}
