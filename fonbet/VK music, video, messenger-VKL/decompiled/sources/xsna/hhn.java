package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStop.kt */
/* loaded from: classes8.dex */
public final class hhn implements JSONSerializable, Hashable {
    public final String a;
    public Integer b;

    public hhn(String str) {
        this.a = str;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(hhn.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ihn ihnVar = (ihn) BuiltInParserKt.getBuiltInParserComponent().N.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ihnVar.getClass();
        return ihn.a(builtInParsingContext, this);
    }
}
