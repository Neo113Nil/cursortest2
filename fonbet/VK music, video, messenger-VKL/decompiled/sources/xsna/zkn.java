package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivExtension.kt */
/* loaded from: classes8.dex */
public final class zkn implements JSONSerializable, Hashable {
    public final String a;
    public final JSONObject b;
    public Integer c;

    public zkn(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    public final boolean a(zkn zknVar) {
        return zknVar != null && epx.f(this.a, zknVar.a) && epx.f(this.b, zknVar.b);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(zkn.class).hashCode();
        JSONObject jSONObject = this.b;
        int hashCode2 = hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        aln alnVar = (aln) BuiltInParserKt.getBuiltInParserComponent().b3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        alnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "id", this.a);
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "params", this.b);
        return jSONObject;
    }
}
