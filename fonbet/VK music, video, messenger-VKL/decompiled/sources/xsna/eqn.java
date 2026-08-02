package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivTooltipModeNonModal.kt */
/* loaded from: classes8.dex */
public final class eqn implements JSONSerializable, Hashable {
    public Integer a;

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(eqn.class).hashCode();
        this.a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        fqn fqnVar = (fqn) BuiltInParserKt.getBuiltInParserComponent().P8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        fqnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "non_modal");
        return jSONObject;
    }
}
