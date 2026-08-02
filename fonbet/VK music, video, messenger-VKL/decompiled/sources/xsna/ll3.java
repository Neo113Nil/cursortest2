package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArrayVariable.kt */
/* loaded from: classes8.dex */
public final class ll3 implements JSONSerializable, Hashable {
    public final String a;
    public final Expression<JSONArray> b;
    public Integer c;

    public ll3(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(ll3.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ml3 ml3Var = (ml3) BuiltInParserKt.getBuiltInParserComponent().d.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ml3Var.getClass();
        return ml3.b(builtInParsingContext, this);
    }
}
