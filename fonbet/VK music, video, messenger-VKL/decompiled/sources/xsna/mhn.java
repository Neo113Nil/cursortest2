package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValue.kt */
/* loaded from: classes8.dex */
public final class mhn implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final kqn b;
    public final Expression<String> c;
    public Integer d;

    public mhn(Expression expression, Expression expression2, kqn kqnVar) {
        this.a = expression;
        this.b = kqnVar;
        this.c = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(mhn.class).hashCode();
        Expression<Long> expression = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hash() + hashCode + (expression != null ? expression.hashCode() : 0);
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((nhn) BuiltInParserKt.getBuiltInParserComponent().Q.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
