package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValue.kt */
/* loaded from: classes8.dex */
public final class xin implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public final kqn b;
    public final Expression<String> c;
    public Integer d;

    public xin(Expression expression, Expression expression2, kqn kqnVar) {
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
        int hashCode = this.a.hashCode() + fpf0.a(xin.class).hashCode();
        kqn kqnVar = this.b;
        int hashCode2 = this.c.hashCode() + hashCode + (kqnVar != null ? kqnVar.hash() : 0);
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((yin) BuiltInParserKt.getBuiltInParserComponent().i0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
