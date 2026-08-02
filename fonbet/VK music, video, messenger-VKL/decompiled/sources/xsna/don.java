package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskTemplate.kt */
/* loaded from: classes8.dex */
public final class don implements JSONSerializable, JsonTemplate<znn> {
    public final Field<String> a;

    public don(Field<String> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        bon bonVar = (bon) BuiltInParserKt.getBuiltInParserComponent().L5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bonVar.getClass();
        return bon.a(builtInParsingContext, this);
    }
}
