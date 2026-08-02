package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivInfinityCount.kt */
/* loaded from: classes8.dex */
public final class wln implements JSONSerializable, Hashable {
    public Integer a;

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(wln.class).hashCode();
        this.a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        xln xlnVar = (xln) BuiltInParserKt.getBuiltInParserComponent().g4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        xlnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "infinity");
        return jSONObject;
    }
}
