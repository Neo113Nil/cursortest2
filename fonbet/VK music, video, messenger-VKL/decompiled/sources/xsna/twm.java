package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DictValue.kt */
/* loaded from: classes8.dex */
public final class twm implements JSONSerializable, Hashable {
    public final Expression<JSONObject> a;
    public Integer b;

    public twm(Expression<JSONObject> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(twm.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        uwm uwmVar = (uwm) BuiltInParserKt.getBuiltInParserComponent().y.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        uwmVar.getClass();
        return uwm.a(builtInParsingContext, this);
    }
}
