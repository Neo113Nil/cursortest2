package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltip.kt */
/* loaded from: classes8.dex */
public final class bkn implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public final Expression<Boolean> b;
    public Integer c;

    public bkn(Expression<String> expression, Expression<Boolean> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(bkn.class).hashCode();
        Expression<Boolean> expression = this.b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ckn cknVar = (ckn) BuiltInParserKt.getBuiltInParserComponent().M0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cknVar.getClass();
        return ckn.b(builtInParsingContext, this);
    }
}
