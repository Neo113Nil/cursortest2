package xsna;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ContentUrlTemplate.kt */
/* loaded from: classes8.dex */
public final class slj implements JSONSerializable, JsonTemplate<olj> {
    public final Field<Expression<Uri>> a;

    public slj(Field<Expression<Uri>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        qlj qljVar = (qlj) BuiltInParserKt.getBuiltInParserComponent().w.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        qljVar.getClass();
        return qlj.a(builtInParsingContext, this);
    }
}
