package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ColorValue.kt */
/* loaded from: classes8.dex */
public final class o8g implements JSONSerializable, Hashable {
    public final Expression<Integer> a;
    public Integer b;

    public o8g(Expression<Integer> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(o8g.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        p8g p8gVar = (p8g) BuiltInParserKt.getBuiltInParserComponent().m.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        p8gVar.getClass();
        return p8g.a(builtInParsingContext, this);
    }
}
