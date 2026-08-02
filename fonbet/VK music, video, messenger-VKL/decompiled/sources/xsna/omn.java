package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexTemplate.kt */
/* loaded from: classes8.dex */
public final class omn implements JSONSerializable, JsonTemplate<kmn> {
    public final Field<Expression<String>> a;

    public omn(Field<Expression<String>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        mmn mmnVar = (mmn) BuiltInParserKt.getBuiltInParserComponent().n4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        mmnVar.getClass();
        return mmn.a(builtInParsingContext, this);
    }
}
