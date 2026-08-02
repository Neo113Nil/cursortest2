package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: IntegerVariable.kt */
/* loaded from: classes8.dex */
public final class cax implements JSONSerializable, Hashable {
    public final String a;
    public final Expression<Long> b;
    public Integer c;

    public cax(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(cax.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        dax daxVar = (dax) BuiltInParserKt.getBuiltInParserComponent().L9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        daxVar.getClass();
        return dax.b(builtInParsingContext, this);
    }
}
