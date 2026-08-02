package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopTemplate.kt */
/* loaded from: classes8.dex */
public final class lhn implements JSONSerializable, JsonTemplate<hhn> {
    public final Field<String> a;

    public lhn(Field<String> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        jhn jhnVar = (jhn) BuiltInParserKt.getBuiltInParserComponent().O.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        jhnVar.getClass();
        return jhn.a(builtInParsingContext, this);
    }
}
