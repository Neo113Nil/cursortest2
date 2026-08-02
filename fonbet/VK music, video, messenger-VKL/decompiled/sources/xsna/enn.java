package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class enn implements JSONSerializable, JsonTemplate<ann> {
    public final Field<com.yandex.div2.s4> a;

    public enn(Field<com.yandex.div2.s4> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((cnn) BuiltInParserKt.getBuiltInParserComponent().Z4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
