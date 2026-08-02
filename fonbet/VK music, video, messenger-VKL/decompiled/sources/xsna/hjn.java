package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionFocusElement.kt */
/* loaded from: classes8.dex */
public final class hjn implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public Integer b;

    public hjn(Expression<String> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(hjn.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ijn ijnVar = (ijn) BuiltInParserKt.getBuiltInParserComponent().o0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ijnVar.getClass();
        return ijn.a(builtInParsingContext, this);
    }
}
