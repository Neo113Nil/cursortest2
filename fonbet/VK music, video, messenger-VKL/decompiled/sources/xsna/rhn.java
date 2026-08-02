package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValue.kt */
/* loaded from: classes8.dex */
public final class rhn implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final Expression<String> b;
    public Integer c;

    public rhn(Expression<Long> expression, Expression<String> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(rhn.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        shn shnVar = (shn) BuiltInParserKt.getBuiltInParserComponent().T.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        shnVar.getClass();
        return shn.b(builtInParsingContext, this);
    }
}
