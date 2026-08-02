package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPoint.kt */
/* loaded from: classes8.dex */
public final class jon implements JSONSerializable, Hashable {
    public final com.yandex.div2.s3 a;
    public final com.yandex.div2.s3 b;
    public Integer c;

    public jon(com.yandex.div2.s3 s3Var, com.yandex.div2.s3 s3Var2) {
        this.a = s3Var;
        this.b = s3Var2;
    }

    public final boolean a(jon jonVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return jonVar != null && this.a.a(jonVar.a, expressionResolver, expressionResolver2) && this.b.a(jonVar.b, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.b.hash() + this.a.hash() + fpf0.a(jon.class).hashCode();
        this.c = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        kon konVar = (kon) BuiltInParserKt.getBuiltInParserComponent().W5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        konVar.getClass();
        JSONObject jSONObject = new JSONObject();
        com.yandex.div2.fe feVar = konVar.a;
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "x", this.a, feVar.M2);
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "y", this.b, feVar.M2);
        return jSONObject;
    }
}
