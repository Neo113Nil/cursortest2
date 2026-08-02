package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivShapeDrawableTemplate.kt */
/* loaded from: classes8.dex */
public final class zon implements JSONSerializable, JsonTemplate<von> {
    public final Field<Expression<Integer>> a;
    public final Field<com.yandex.div2.u9> b;
    public final Field<com.yandex.div2.cb> c;

    public zon(Field<Expression<Integer>> field, Field<com.yandex.div2.u9> field2, Field<com.yandex.div2.cb> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((xon) BuiltInParserKt.getBuiltInParserComponent().Q6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
