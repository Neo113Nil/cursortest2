package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardTemplate.kt */
/* loaded from: classes8.dex */
public final class win implements JSONSerializable, JsonTemplate<nin> {
    public final Field<sin> a;

    public win(Field<sin> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((uin) BuiltInParserKt.getBuiltInParserComponent().g0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
