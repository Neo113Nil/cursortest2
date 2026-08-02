package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivPageSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class tnn implements JSONSerializable, JsonTemplate<pnn> {
    public final Field<com.yandex.div2.w7> a;

    public tnn(Field<com.yandex.div2.w7> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((rnn) BuiltInParserKt.getBuiltInParserComponent().l5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
