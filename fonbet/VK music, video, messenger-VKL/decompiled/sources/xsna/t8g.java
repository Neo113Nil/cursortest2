package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ColorVariable.kt */
/* loaded from: classes8.dex */
public final class t8g implements JSONSerializable, Hashable {
    public final String a;
    public final Expression<Integer> b;
    public Integer c;

    public t8g(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(t8g.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        u8g u8gVar = (u8g) BuiltInParserKt.getBuiltInParserComponent().p.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        u8gVar.getClass();
        return u8g.b(builtInParsingContext, this);
    }
}
