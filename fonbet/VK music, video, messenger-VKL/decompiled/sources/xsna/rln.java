package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* compiled from: DivFunctionArgument.kt */
/* loaded from: classes8.dex */
public final class rln implements JSONSerializable, Hashable {
    public final String a;
    public final DivEvaluableType b;
    public Integer c;

    public rln(String str, DivEvaluableType divEvaluableType) {
        this.a = str;
        this.b = divEvaluableType;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(rln.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        sln slnVar = (sln) BuiltInParserKt.getBuiltInParserComponent().F3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        slnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "name", this.a);
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", this.b, (izs<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
