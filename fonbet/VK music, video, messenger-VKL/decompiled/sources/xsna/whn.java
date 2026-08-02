package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValue.kt */
/* loaded from: classes8.dex */
public final class whn implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final kqn b;
    public final Expression<String> c;
    public Integer d;

    public whn(Expression expression, Expression expression2, kqn kqnVar) {
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
        int hashCode = this.c.hashCode() + this.b.hash() + this.a.hashCode() + fpf0.a(whn.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((xhn) BuiltInParserKt.getBuiltInParserComponent().W.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
