package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValue.kt */
/* loaded from: classes8.dex */
public final class rjn implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final Expression<String> b;
    public final kqn c;
    public Integer d;

    public rjn(Expression<Long> expression, Expression<String> expression2, kqn kqnVar) {
        this.a = expression;
        this.b = expression2;
        this.c = kqnVar;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.c.hash() + this.b.hashCode() + this.a.hashCode() + fpf0.a(rjn.class).hashCode();
        this.d = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((sjn) BuiltInParserKt.getBuiltInParserComponent().G0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
