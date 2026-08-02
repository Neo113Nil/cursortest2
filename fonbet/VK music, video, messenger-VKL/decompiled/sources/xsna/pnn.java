package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivPageSize.kt */
/* loaded from: classes8.dex */
public final class pnn implements JSONSerializable, Hashable {
    public final com.yandex.div2.u7 a;
    public Integer b;

    public pnn(com.yandex.div2.u7 u7Var) {
        this.a = u7Var;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.a.hash() + fpf0.a(pnn.class).hashCode();
        this.b = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((qnn) BuiltInParserKt.getBuiltInParserComponent().k5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
