package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionSetVariable.kt */
/* loaded from: classes8.dex */
public final class wjn implements JSONSerializable, Hashable {
    public final kqn a;
    public final Expression<String> b;
    public Integer c;

    public wjn(kqn kqnVar, Expression<String> expression) {
        this.a = kqnVar;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hash() + fpf0.a(wjn.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((xjn) BuiltInParserKt.getBuiltInParserComponent().J0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
