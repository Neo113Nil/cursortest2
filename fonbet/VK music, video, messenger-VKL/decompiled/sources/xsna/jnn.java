package xsna;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundTemplate.kt */
/* loaded from: classes8.dex */
public final class jnn implements JSONSerializable, JsonTemplate<fnn> {
    public final Field<Expression<Uri>> a;
    public final Field<com.yandex.div2.d> b;

    public jnn(Field<Expression<Uri>> field, Field<com.yandex.div2.d> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((hnn) BuiltInParserKt.getBuiltInParserComponent().c5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
