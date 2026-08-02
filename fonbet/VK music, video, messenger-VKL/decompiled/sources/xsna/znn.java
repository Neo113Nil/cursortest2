package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMask.kt */
/* loaded from: classes8.dex */
public final class znn implements JSONSerializable, Hashable, qmn {
    public final String a;
    public Integer b;

    public znn(String str) {
        this.a = str;
    }

    @Override // xsna.qmn
    public final String a() {
        return this.a;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(znn.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        aon aonVar = (aon) BuiltInParserKt.getBuiltInParserComponent().K5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aonVar.getClass();
        return aon.a(builtInParsingContext, this);
    }
}
