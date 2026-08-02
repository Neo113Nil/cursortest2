package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivWrapContentSize.kt */
/* loaded from: classes8.dex */
public final class krn implements JSONSerializable, Hashable {
    public final Expression<Boolean> a;
    public final com.yandex.div2.aa b;
    public final com.yandex.div2.aa c;
    public Integer d;

    public krn() {
        this(null, null, null);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(krn.class).hashCode();
        Expression<Boolean> expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        com.yandex.div2.aa aaVar = this.b;
        int hash = hashCode2 + (aaVar != null ? aaVar.hash() : 0);
        com.yandex.div2.aa aaVar2 = this.c;
        int hash2 = hash + (aaVar2 != null ? aaVar2.hash() : 0);
        this.d = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((lrn) BuiltInParserKt.getBuiltInParserComponent().w9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public krn(Expression<Boolean> expression, com.yandex.div2.aa aaVar, com.yandex.div2.aa aaVar2) {
        this.a = expression;
        this.b = aaVar;
        this.c = aaVar2;
    }
}
