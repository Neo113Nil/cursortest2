package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSize.kt */
/* loaded from: classes8.dex */
public final class ann implements JSONSerializable, Hashable {
    public final com.yandex.div2.q4 a;
    public Integer b;

    public ann(com.yandex.div2.q4 q4Var) {
        this.a = q4Var;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.a.hash() + fpf0.a(ann.class).hashCode();
        this.b = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((bnn) BuiltInParserKt.getBuiltInParserComponent().Y4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
