package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundTemplate.kt */
/* loaded from: classes8.dex */
public final class fpn implements JSONSerializable, JsonTemplate<bpn> {
    public final Field<Expression<Integer>> a;

    public fpn(Field<Expression<Integer>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        dpn dpnVar = (dpn) BuiltInParserKt.getBuiltInParserComponent().o7.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        dpnVar.getClass();
        return dpn.b(builtInParsingContext, this);
    }
}
