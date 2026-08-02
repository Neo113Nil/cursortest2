package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivShapeDrawable.kt */
/* loaded from: classes8.dex */
public final class von implements JSONSerializable, Hashable {
    public final Expression<Integer> a;
    public final com.yandex.div2.q9 b;
    public final com.yandex.div2.va c;
    public Integer d;

    public von(Expression<Integer> expression, com.yandex.div2.q9 q9Var, com.yandex.div2.va vaVar) {
        this.a = expression;
        this.b = q9Var;
        this.c = vaVar;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.b.hash() + this.a.hashCode() + fpf0.a(von.class).hashCode();
        com.yandex.div2.va vaVar = this.c;
        int hash2 = hash + (vaVar != null ? vaVar.hash() : 0);
        this.d = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((won) BuiltInParserKt.getBuiltInParserComponent().P6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
