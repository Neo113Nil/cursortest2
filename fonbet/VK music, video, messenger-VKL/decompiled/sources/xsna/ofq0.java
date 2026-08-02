package xsna;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: UrlValueTemplate.kt */
/* loaded from: classes8.dex */
public final class ofq0 implements JSONSerializable, JsonTemplate<kfq0> {
    public final Field<Expression<Uri>> a;

    public ofq0(Field<Expression<Uri>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        mfq0 mfq0Var = (mfq0) BuiltInParserKt.getBuiltInParserComponent().ka.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        mfq0Var.getClass();
        return mfq0.a(builtInParsingContext, this);
    }
}
