package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivLayoutProvider.kt */
/* loaded from: classes8.dex */
public final class vmn implements JSONSerializable, Hashable {
    public final String a;
    public final String b;
    public Integer c;

    public vmn() {
        this(null, null);
    }

    public final boolean a(vmn vmnVar) {
        return vmnVar != null && epx.f(this.a, vmnVar.a) && epx.f(this.b, vmnVar.b);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(vmn.class).hashCode();
        String str = this.a;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.c = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        wmn wmnVar = (wmn) BuiltInParserKt.getBuiltInParserComponent().M4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        wmnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "height_variable_name", this.a);
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "width_variable_name", this.b);
        return jSONObject;
    }

    public vmn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
