package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboard.kt */
/* loaded from: classes8.dex */
public final class nin implements JSONSerializable, Hashable {
    public final oin a;
    public Integer b;

    public nin(oin oinVar) {
        this.a = oinVar;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.a.hash() + fpf0.a(nin.class).hashCode();
        this.b = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((tin) BuiltInParserKt.getBuiltInParserComponent().f0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
