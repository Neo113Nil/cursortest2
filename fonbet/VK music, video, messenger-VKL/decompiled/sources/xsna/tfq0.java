package xsna;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: UrlVariableTemplate.kt */
/* loaded from: classes8.dex */
public final class tfq0 implements JSONSerializable, JsonTemplate<pfq0> {
    public final Field<String> a;
    public final Field<Expression<Uri>> b;

    public tfq0(Field<String> field, Field<Expression<Uri>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        rfq0 rfq0Var = (rfq0) BuiltInParserKt.getBuiltInParserComponent().na.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        rfq0Var.getClass();
        return rfq0.b(builtInParsingContext, this);
    }
}
