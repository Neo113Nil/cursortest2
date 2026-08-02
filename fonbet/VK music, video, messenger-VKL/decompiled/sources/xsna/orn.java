package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class orn implements JSONSerializable, JsonTemplate<krn> {
    public final Field<Expression<Boolean>> a;
    public final Field<com.yandex.div2.ca> b;
    public final Field<com.yandex.div2.ca> c;

    public orn(Field<Expression<Boolean>> field, Field<com.yandex.div2.ca> field2, Field<com.yandex.div2.ca> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((mrn) BuiltInParserKt.getBuiltInParserComponent().x9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
