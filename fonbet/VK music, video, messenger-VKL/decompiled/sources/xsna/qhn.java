package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValueTemplate.kt */
/* loaded from: classes8.dex */
public final class qhn implements JSONSerializable, JsonTemplate<mhn> {
    public final Field<Expression<Long>> a;
    public final Field<oqn> b;
    public final Field<Expression<String>> c;

    public qhn(Field<Expression<Long>> field, Field<oqn> field2, Field<Expression<String>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ohn) BuiltInParserKt.getBuiltInParserComponent().R.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
